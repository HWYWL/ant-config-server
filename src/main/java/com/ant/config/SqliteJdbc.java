package com.ant.config;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.ioc.annotation.Order;
import com.blade.mvc.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.stream.Collectors;

@Order(1)
@Bean
public class SqliteJdbc implements BeanProcessor {
    protected static final Logger log = LoggerFactory.getLogger(SqliteJdbc.class);

    public static final String DB_NAME = "ant.db";
    public static String DB_PATH;
    public static String DB_SRC;

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            log.error("load sqlite driver error", e);
        }
    }

    @Override
    public void processor(Blade blade) {
        try {

            DB_PATH = Const.CLASSPATH + File.separatorChar + DB_NAME;
            DB_SRC = "jdbc:sqlite://" + DB_PATH;

            DB_PATH = System.getProperty("user.dir") + "/" + DB_NAME;
            DB_SRC = "jdbc:sqlite://" + DB_PATH;

            log.info("load sqlite database path [{}]", DB_PATH);
            log.info("load sqlite database src [{}]", DB_SRC);

            Connection con       = DriverManager.getConnection(DB_SRC);
            Statement statement = con.createStatement();
            ResultSet rs        = statement.executeQuery("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='t_config_service'");
            int        count     = rs.getInt(1);
            if (count == 0) {
                String            cp  = SqliteJdbc.class.getClassLoader().getResource("").getPath();
                InputStreamReader isr = new InputStreamReader(new FileInputStream(cp + "schema.sql"), "UTF-8");

                String sql = new BufferedReader(isr).lines().collect(Collectors.joining("\n"));
                int    r   = statement.executeUpdate(sql);
                log.info("initialize import database - {}", r);
            }
            rs.close();
            statement.close();
            con.close();
            log.info("database path is: {}", DB_PATH);
        } catch (Exception e) {
            log.error("initialize database fail", e);
        }
    }

    @Override
    public void preHandle(Blade blade) {

    }
}

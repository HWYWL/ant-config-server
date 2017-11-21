package com.ant;

import com.blade.Blade;
import lombok.extern.slf4j.Slf4j;

/**
 * 系统app
 * auth：HWY
 * date：2017年11月4日
 */
@Slf4j
public class Application {
    public static void main( String[] args ) {
        Blade.me().start(Application.class);
    }
}

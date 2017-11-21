package com.ant.config;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.ioc.annotation.Order;

/**
 * 系统配置
 * Created by hwy on 2017/11/4.
 */
@Order(2)
@Bean
public class AntConfigServer implements BeanProcessor {

    @Override
    public void processor(Blade blade) {

    }

    @Override
    public void preHandle(Blade blade) {

    }
}

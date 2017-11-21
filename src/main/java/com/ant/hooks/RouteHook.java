package com.ant.hooks;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.hook.Signature;
import com.blade.mvc.hook.WebHook;
import com.blade.mvc.http.Request;
import com.blade.mvc.http.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 拦截请求的方法和路由地址
 * Created by HWY on 2017/11/4.
 */
@Bean
public class RouteHook implements WebHook{
    private static final Logger log = LoggerFactory.getLogger(RouteHook.class);

    @Override
    public boolean before(Signature signature) {
        Request request = signature.request();

        String ip  = request.address();
        String  url     = request.url();
        log.info("来源：{}\t{}\t{}", ip, request.method(), url);

        return true;
    }

    @Override
    public boolean after(Signature signature) {
        return true;
    }
}

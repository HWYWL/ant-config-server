package com.ant.controller;

import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.Request;

/**
 * 配置列表路由
 * @author YI
 * @date 2017-12-19 16:12:22
 */
@Path
public class ConfigListController {

    /**
     * 添加配置
     * @param request
     * @return
     */
    @Route("/page/news/newsAdd.html")
    public String newsAdd(Request request){
        request.attribute("name", "懿");

        return "page/news/newsAdd.html";
    }
}

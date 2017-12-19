package com.ant.controller;

import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.Request;
import com.blade.mvc.http.Response;

/**
 * 主页列表
 * @author YI
 * @date 2017-12-19 16:12:22
 */
@Path
public class IndexController {

    /**
     * 主页
     * @param request
     * @param response
     * @return
     */
    @Route(value = {"/", "index.html"})
    public String index(Request request, Response response){
        request.attribute("name", "懿");
        request.attribute("main", "main.html");

        return "index.html";
    }

    /**
     * 主页面
     * @param request
     * @param response
     * @return
     */
    @Route("/page/main.html")
    public String pageMin(Request request, Response response){
        request.attribute("name", "懿");

        return "page/main.html";
    }

    /**
     * 配置列表
     * @param request
     * @param response
     * @return
     */
    @Route("/page/news/newsList.html")
    public String news(Request request, Response response){
        request.attribute("name", "懿");

        return "page/news/newsList.html";
    }

    /**
     * 项目链接
     * @param request
     * @param response
     * @return
     */
    @Route(value = {"/page/links/linksList.html"})
    public String links(Request request, Response response){
        request.attribute("name", "懿");

        return "page/links/linksList.html";
    }

    /**
     * 系统参数
     * @param request
     * @param response
     * @return
     */
    @Route(value = {"/page/systemParameter/systemParameter.html"})
    public String systemParameter(Request request, Response response){
        request.attribute("name", "懿");

        return "page/systemParameter/systemParameter.html";
    }

    /**
     * 关于
     * @param request
     * @param response
     * @return
     */
    @Route(value = {"/page/404.html"})
    public String about(Request request, Response response){
        request.attribute("name", "懿");

        return "page/404.html";
    }
}

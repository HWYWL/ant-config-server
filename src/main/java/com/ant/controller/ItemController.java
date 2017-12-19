package com.ant.controller;

import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.Request;

/**
 * 项目链接路由
 * @author YI
 * @date 2017-12-19 16:30:04
 */
@Path
public class ItemController {

    /**
     * 添加项目链接
     * @param request
     * @return
     */
    @Route("/page/links/linksAdd.html")
    public String linksAdd(Request request){
        request.attribute("name", "懿");

        return "page/links/linksAdd.html";
    }
}

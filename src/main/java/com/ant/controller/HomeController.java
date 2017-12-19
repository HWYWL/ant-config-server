package com.ant.controller;

import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.Request;

/**
 * 主页对应的子页路由
 * @author YI
 * @date 2017-12-19 16:12:22
 */
@Path("/page")
public class HomeController {

    /**
     * 新增留言
     * @param request
     * @return
     */
    @Route("/message/message.html")
    public String message(Request request){
        request.attribute("name", "懿");

        return "page/message/message.html";
    }

    /**
     * 用户数
     * @param request
     * @return
     */
    @Route("/user/allUsers.html")
    public String user(Request request){
        request.attribute("name", "懿");

        return "page/user/allUsers.html";
    }

    /**
     * 添加用户
     * @param request
     * @return
     */
    @Route("/user/addUser.html")
    public String addUser(Request request){
        request.attribute("name", "懿");

        return "page/user/addUser.html";
    }

    /**
     * 图片数量
     * @param request
     * @return
     */
    @Route("/img/images.html")
    public String images(Request request){
        request.attribute("name", "懿");

        return "page/img/images.html";
    }
}

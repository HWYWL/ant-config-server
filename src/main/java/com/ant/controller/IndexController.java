package com.ant.controller;

import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.Route;

/**
 * 控制器
 * Created by hwy on 2017年11月21日09:12:28.
 */
@Path
public class IndexController {

    @Route("/")
    public String index(){
        return "index.html";
    }
}

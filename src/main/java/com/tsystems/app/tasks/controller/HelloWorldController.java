package com.tsystems.app.tasks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ksenia on 25.09.2017.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello-world")
    public String getHelloWorld() {
        return "hello-world";
    }

    @RequestMapping("/index")
    public String getIndex() {
        return "index";
    }
}

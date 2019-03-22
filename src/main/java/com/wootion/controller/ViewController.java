package com.wootion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

/**
 * 视图Controller
 * @author Chencheng
 * @create 2017-12-13 20:44
 **/
@Controller
@RequestMapping("/user")
public class ViewController {

    private Logger logger = Logger.getLogger("ViewController");

    public void test(){}

}

package com.springboot.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


/**
 * Created by hp on 2019-3-31.
 */
@Controller
public class SpringBootController {
    @RequestMapping("/")
    @ResponseBody
    public String getName(){
        return "zhangs211www233";
    }

    //集成Thymeleaf模板引擎html
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(ModelMap map){
        map.put("name","zhangsiangs");
        return "testThymeleaf";
    }
    //集成Thymeleaf模板引擎ftl
    @RequestMapping("/testFreeMarker")
    public String testFreeMarker(Map<String, String> map){
        map.put("hello","集成了FreeMarker模板引擎");
        return "hello";
    }
    @RequestMapping("/exception")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }
}

package com.springboot.test.Exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
//通过使用@ControllerAdvice定义统一的异常处理类
@ControllerAdvice
class GlobalExceptionHandler {
    //@ExceptionHandler用来定义针对的异常类型
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) 
    		throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "异常咯...");
        mav.setViewName("error");
        return mav;
    }
}
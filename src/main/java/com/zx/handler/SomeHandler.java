package com.zx.handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SomeHandler implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        //设置响应中的模型
        //相当于request.setAttribute("message","Hello SpringMMVC!")
        mv.addObject("message","Hello SpringMVC!");
        //设置响应视图
        mv.setViewName("welcome");//通过视图解析器自动加上前缀和后缀
        return mv;
    }
}

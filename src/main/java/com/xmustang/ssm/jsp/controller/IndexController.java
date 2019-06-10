package com.xmustang.ssm.jsp.controller;

import com.xmustang.ssm.rest.service.ICacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @Title: IndexController
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/2 14:30
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    private String appName;

    public String getAppName() {
        return appName;
    }

    @Value("#{prop.appName}")
    public void setAppName(String appName) {
        this.appName = appName;
    }

    @RequestMapping(value = {"", "/index"})
    public ModelAndView dicts() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("appName", getAppName());
        mv.addObject("now", new Date());
        return mv;
    }

}

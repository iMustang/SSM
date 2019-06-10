package com.xmustang.ssm.rest.controller;

import com.xmustang.ssm.rest.service.ICacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Title: CacheController
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/6 15:45
 */
@Controller
@RequestMapping("/cache")
public class CacheController {
    @Autowired
    private ICacheService cacheService;

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Object getCacheByKey(@PathVariable("id") String key) {
        return cacheService.getCacheByKey(key);
    }
}

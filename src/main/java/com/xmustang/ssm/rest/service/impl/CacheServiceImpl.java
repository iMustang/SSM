package com.xmustang.ssm.rest.service.impl;


import com.xmustang.ssm.rest.mapper.CacheMapper;
import com.xmustang.ssm.rest.model.Cache;
import com.xmustang.ssm.rest.service.ICacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

/**
 * @Title: CacheServiceImpl
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/6 15:46
 */
@Service
public class CacheServiceImpl implements ICacheService {
    @Autowired
    private CacheMapper cacheMapper;
    @Autowired
    private CacheManager cacheManager;

    @Override
    public Cache getCacheByKey(String key) {
        org.springframework.cache.Cache cacheDemo1 = cacheManager.getCache("cacheDemo");
        org.springframework.cache.Cache.ValueWrapper valueWrapper = cacheDemo1.get("1");
        Cache cache = cacheMapper.selectByPrimaryKey(key);
        return cache;
    }
}

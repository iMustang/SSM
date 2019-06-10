package com.xmustang.ssm.rest.service;

import com.xmustang.ssm.rest.model.Cache;
import org.springframework.cache.annotation.Cacheable;

/**
 * @Title: ICacheService
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/6 15:45
 */
public interface ICacheService {
	@Cacheable("cacheDemo")
	Cache getCacheByKey(String key);
}

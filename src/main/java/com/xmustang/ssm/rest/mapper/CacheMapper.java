package com.xmustang.ssm.rest.mapper;

import com.xmustang.ssm.rest.model.Cache;

/**
 * @Title: CacheMapper
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/6 15:47
 */
public interface CacheMapper {
    Cache selectByPrimaryKey(String key);
}

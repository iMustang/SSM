package com.xmustang.ssm.rest.model;

/**
 * @Title: Cache
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/6 15:49
 */
public class Cache {
    private Integer id;
    private String name;
    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

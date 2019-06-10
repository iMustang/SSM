package com.xmustang.ssm.jsp.mapper;

import com.xmustang.ssm.jsp.model.SysDict;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author liuzh
 */
public interface DictMapper {

    /**
     * 根据主键查询
     */
    SysDict selectByPrimaryKey(Long id);

    /**
     * 条件查询
     */
    List<SysDict> selectBySysDict(SysDict sysDict, RowBounds rowBounds);

    /**
     * 新增
     */
    int insert(SysDict sysDict);

    /**
     * 根据主键更新
     */
    int updateById(SysDict sysDict);

    /**
     * 根据主键删除
     */
    int deleteById(Long id);
}

package com.uzipi.dao;

import com.uzipi.entity.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan  // 允许 Spring 扫描该 Mapper
public interface UserMapper {
    // 删除指定 key 的记录
    int deleteByPrimaryKey(Integer userId);

    // 插入一条记录（完整记录）
    int insert(User record);

    // 插入一条记录（对象中有值时写入字段，没有值的置空）
    int insertSelective(User record);

    // 查询指定 key 的记录
    User selectByPrimaryKey(Integer userId);

    // 将对象中的内容更新入库（对象中有值时更新字段，没有值的属性不修改）
    int updateByPrimaryKeySelective(User record);

    // 将对象中的内容更新入库（全属性）
    int updateByPrimaryKey(User record);
}
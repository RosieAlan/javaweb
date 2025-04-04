package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {


    @Select("select id,name,create_time,update_time from dept")
    public List<Dept> findAll();

    @Delete("delete from dept where id = #{id}")
    void deletebyId(Integer id);

    @Insert("insert into dept(name,create_time,update_time) values(#{name},#{createTime},#{updateTime})")
    void add(Dept dept);

    @Select("select id,name,create_time,update_time from dept where id = #{id}")
    Dept getById(Integer id);

    void update(Dept dept);
}

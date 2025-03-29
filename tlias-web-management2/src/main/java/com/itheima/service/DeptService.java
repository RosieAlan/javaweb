package com.itheima.service;

import com.itheima.pojo.Dept;

import java.util.List;

public interface DeptService {

    /**
     * 查询部门列表
     */
    public List<Dept> list() throws Exception;

    void deletebyId(Integer id);

    void add(Dept dept);

    Dept getById(Integer id);

    void update(Dept dept);
}

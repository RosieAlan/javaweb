package com.itheima.service.impl;

import com.itheima.mapper.DeptMapper;
import com.itheima.pojo.Dept;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    public List<Dept> list() throws Exception {
        return deptMapper.findAll();
    }

    @Override
    public void deletebyId(Integer id) {
        deptMapper.deletebyId(id);
    }
    @Override
    public void add(Dept dept) {
         dept.setCreateTime(LocalDateTime.now());
         dept.setUpdateTime(LocalDateTime.now());
         deptMapper.add(dept);
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }
}

package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门管理Controller
 */
@RestController
public class DeptController {
    @Autowired
    private DeptServiceImpl deptService ;

    @GetMapping("/depts") //限定当前请求的请求方式为GET
    public Result list() throws Exception {
        List<Dept> deptList = deptService.list();
        System.out.println("deptList = " + deptList);
        return Result.success(deptList);
    }
}

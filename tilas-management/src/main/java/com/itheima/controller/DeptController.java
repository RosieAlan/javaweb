package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.serviece.impl.DeptServiceImpl;
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
        //1. 调用service, 获取处理完毕的数据
        List<Dept> deptList = deptService.list();
        System.out.println("deptList = " + deptList);
        //2. 响应数据(json格式) ---> 如果需要响应json数据, 可以直接return.(springboot会自动将对象-->json)
        return Result.success(deptList);
    }
}

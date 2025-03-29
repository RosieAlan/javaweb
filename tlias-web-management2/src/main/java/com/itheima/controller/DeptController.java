package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.impl.DeptServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {
    @Autowired
    private DeptServiceImpl deptService ;

    @GetMapping//限定当前请求的请求方式为GET
    public Result list() throws Exception {
        List<Dept> deptList = deptService.list();
     log.info("deptList = " + deptList);
        return Result.success(deptList);
    }

    @DeleteMapping
    public Result delete(Integer id){
        log.info("根据ID删除部门: " + id);
        deptService.deletebyId(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门: " + dept);
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据ID修改部门: " + id);
        Dept dept = deptService.getById(id);
        System.out.println("dept = " + dept);
        return Result.success(dept);
    }

    @PutMapping
    public Result update(@RequestBody Dept dept){
        log.info("修改部门: " + dept);
        deptService.update(dept);
        return Result.success();
    }
}

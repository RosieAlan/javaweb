package com.itheima.springbootwebquickstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")//将来访问这个url就会调用hello方法
    public String hello(String name){
        System.out.println("hello1111,"+name);
        return "hello11,"+name;
    }
}

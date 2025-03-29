package com.itheima.test;

import itehwima.UserService;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    public  void testGetAge() {
       int age = new UserService().getAge("110101199001011234");
       System.out.println(age);
    }

    @Test
    public  void testGetGender() {
        String gender =new UserService().getGender("110101199001011234");
        System.out.println(gender);
    }
}

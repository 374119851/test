package com.test.demo.agency;


import com.test.demo.service.UserService;
import com.test.demo.service.UserServiceImpl;

public class UserServiceProxyTest  {
    public static void main(String[] args) {
        UserService userService = new UserServiceProxy(new UserServiceImpl());
        userService.saveUser();
    }

}
package com.test.demo.agency;

import com.test.demo.service.UserService;

public class UserServiceProxy implements UserService{
    private UserService userService;

    public UserServiceProxy(UserService userService) {
        super();
        this.userService = userService;
    }
    public void open(){
        System.out.println("打开数据库并连接");
    }
    public  void  close(){
        System.out.println("关闭连接");
    }

    public void saveUser() {
        this.open();
        userService.saveUser();
        this.close();

    }
}

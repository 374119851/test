package com.test.demo.dao.impl;

import com.test.demo.dao.IAcountDao;

public class AcountDaoImpl implements IAcountDao {
    public void add(String name) {
        System.out.println(name+"添加成功");
    }

    public void delete(Integer uid) {
        System.out.println(uid+"删除成功");
    }
}

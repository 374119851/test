package com.test.demo.dymProxy;

import com.test.demo.dao.IAcountDao;
import com.test.demo.dao.impl.AcountDaoImpl;
import junit.framework.TestCase;

public class DymProxyTest extends TestCase {
    public static void main(String[] args) {
        IAcountDao acountDao = (IAcountDao) new DymProxy().newInstance(new AcountDaoImpl());
        acountDao.add("小米");
        acountDao.delete(1);
    }
}
package com.ylj.demo;

import com.ylj.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("context 启动成功");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }

}

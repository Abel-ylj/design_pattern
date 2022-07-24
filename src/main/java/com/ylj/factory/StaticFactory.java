package com.ylj.factory;

import com.ylj.dao.UserDao;
import com.ylj.dao.impl.UserDaoImpl;

public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

}

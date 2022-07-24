package com.ylj.factory;

import com.ylj.dao.UserDao;
import com.ylj.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}

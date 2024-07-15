package com.sprigngmysql.springmysql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl {

    @Autowired
    Dao dao;

    public User saveUser(User user){
        return dao.save(user);
    }

    public List<User> fetchAll(){
        return dao.findAll();
    }



}

package com.example.jdbc;

import com.example.common.dto.UserDto;
import com.example.dao.entity.User;
import com.example.dao.entity.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JdbcTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping(value = "/hello")
    public String index (){
        String sql = "select id from user ";
        String ID = (String)jdbcTemplate.queryForObject(sql,new Object[]{},String.class);
        return ID;
    }

    @GetMapping(value = "/mp")
    public List<User> mpTest (){
        List<User> userList = userDao.selectList(null);
        return userList;
    }


}

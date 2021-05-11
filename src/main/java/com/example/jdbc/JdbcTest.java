package com.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcTest {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping(value = "/hello")
    public String index (){
        String sql = "select id from user ";
        String ID = (String)jdbcTemplate.queryForObject(sql,new Object[]{},String.class);
        return ID;
    }
}

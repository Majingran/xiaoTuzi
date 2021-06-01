package com.example.jdbc;

import com.example.dao.entity.User;
import com.example.dao.entity.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("com/rabbit/user")
@RestController
@CrossOrigin
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

    @GetMapping(value = "/login")
    public Map<String,Object> mpTest (){
//        List<User> userList = userDao.selectList(null);
//        return userList;
        User user = new User();
        user.setID("1111");
        List<User> userList = new ArrayList<>();
        userList.add(user);


        System.out.println(userList);

        HashMap<String,Object> returnMap = new HashMap<>();
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("token","admin-token");
        returnMap.put("data",dataMap);
        returnMap.put("code",20000);

        return returnMap;

    }

    @GetMapping(value = "info")
    public Map<String,Object> userInfo(){
        HashMap<String,Object> returnMap = new HashMap<>();
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("token","admin-token");
//            roles: ['admin'],
//            introduction: 'I am a super administrator',
//            avatar: '',
//            name: 'Super Admin'
        String [] roles = {"admin"};
        String introduction = "I am a super administrator";
        String avatar = "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";
        String name = "Super Admin";
        dataMap.put("roles",roles);
        dataMap.put("introduction",introduction);
        dataMap.put("avatar",avatar);
        dataMap.put("name",name);
        returnMap.put("data",dataMap);
        returnMap.put("code",20000);
        return returnMap;
    }

  @PostMapping(value = "logout")
    public Map<String,Object> logout(){
        HashMap<String,Object> returnMap = new HashMap<>();
        returnMap.put("data","success");
        returnMap.put("code",20000);
        return returnMap;
    }

}

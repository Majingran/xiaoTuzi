package com.example.jdbc;

import com.example.dao.entity.User;
import com.example.dao.entity.UserDao;
import com.example.jdbc.model.UserParam;
import com.example.jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.annotation.Validated;
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

    @Autowired
    private UserService userService;

//    @Autowired
//    private AuthenticationManager authenticationManager;

    @GetMapping(value = "/hello")
    public String index() {
        String sql = "select id from user ";
        String ID = (String) jdbcTemplate.queryForObject(sql, new Object[]{}, String.class);
        return ID;
    }

    @PostMapping(value = "/login")
    public Map<String, Object> login(@RequestBody @Validated LoginParam param) {
//        List<User> userList = userDao.selectList(null);
//        return userList;

//        //spring security 认证
//        Authentication token = new UsernamePasswordAuthenticationToken(param.getUsername(),param.getPassword());
//        //校验token
//        Authentication authentication = authenticationManager.authenticate(token);
//        //保存到上下文中
//        SecurityContextHolder.getContext().setAuthentication(authentication);

        HashMap<String, Object> returnMap = new HashMap<>();
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("user",userService.login(param));
        dataMap.put("token", "admin-token");
        returnMap.put("data", dataMap);
        returnMap.put("code", 20000);

        return returnMap;

    }

    @GetMapping(value = "info")
    public Map<String, Object> userInfo() {
        HashMap<String, Object> returnMap = new HashMap<>();
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("token", "admin-token");
//            roles: ['admin'],
//            introduction: 'I am a super administrator',
//            avatar: '',9
//            name: 'Super Admin'
        String[] roles = {"admin"};
        String introduction = "I am a super administrator";
        String avatar = "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";
        String name = "Super Admin";
        dataMap.put("roles", roles);
        dataMap.put("introduction", introduction);
        dataMap.put("avatar", avatar);
        dataMap.put("name", name);
        returnMap.put("data", dataMap);
        returnMap.put("code", 20000);
        return returnMap;
    }

    @PostMapping(value = "logout")
    public Map<String, Object> logout() {
        HashMap<String, Object> returnMap = new HashMap<>();
        returnMap.put("data", "success");
        returnMap.put("code", 20000);
        return returnMap;
    }

    @PostMapping(value = "createUser")
    public Map createUser(@RequestBody @Validated(UserParam.CreateUser.class) UserParam param) {
        HashMap<String, Object> returnMap = new HashMap<>();
        userService.createUser(param);
        returnMap.put("data", "success");
        returnMap.put("code", 20000);
        return returnMap;
    }

}

package com.example.business.controller;


import com.example.common.dto.UserDto;
import com.example.utils.RedisUtils;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Api(value = "测试测试", description = "测试~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
@Controller
public class indexController {

    private final Logger logger = LoggerFactory.getLogger(indexController.class);

    @Autowired
    private RedisUtils redisUtils;

//    @ResponseBody
//    @RequestMapping()
//    public String sayHello() {
//        return "/index.html";
//    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(@Validated @RequestBody UserDto userDto, HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        String sessionId = "";
        try {
//            httpSession.setAttribute("'test",new Date());
            //session 保持登录状态
            Cookie[] cookies = request.getCookies();
            if (cookies != null && cookies.length > 0) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().contains("JSESSIONID")) {
                        System.out.println(cookie.getName() + "=" + cookie.getValue());
                    }
                }
            }
            Object value = session.getAttribute("username");
            if (value == null) {
                System.out.println("用户不存在");
                session.setAttribute("username", "{username: '" + userDto.getUserName() + "', age: 28}");
            } else {
                System.out.println("用户存在");
            }
//            request.getSession("username");


            sessionId = session.getId();
            Cookie cookie = new Cookie("JSESSIONID", sessionId);
            cookie.setPath(request.getContextPath());
            response.addCookie(cookie);

            HttpSession session1 = request.getSession();
            session1.setAttribute("username","Mr_ma");


            //redis 放入数据
            redisUtils.set("redisTemplate", "这是一支兔子");
            String redisValue = redisUtils.get("redisTemplate").toString();
            logger.info("redisValue=" + redisValue);
            logger.info("读取redis成功");
//            logger.info(value.toString());
            return sessionId;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionId;
    }

}

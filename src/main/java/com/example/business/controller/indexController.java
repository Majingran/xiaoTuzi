package com.example.business.controller;


import com.example.utils.RedisUtil;
import com.sun.deploy.net.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class indexController {

    private final Logger logger = LoggerFactory.getLogger(indexController.class);

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/")
//    @ResponseBody
    public String sayHello() {
        return "/index.html";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public void test(@RequestParam("username") String username, HttpServletRequest request, HttpSession session, HttpServletResponse response) {
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
                session.setAttribute("username", "{username: '" + username + "', age: 28}");
            } else {
                System.out.println("用户存在");
            }
//            request.getSession("username");


            String sessionId = session.getId();
            Cookie cookie = new Cookie("JSESSIONID", sessionId);
            cookie.setPath(request.getContextPath());
            response.addCookie(cookie);

            HttpSession session1 = request.getSession();
            session1.setAttribute("username","Mr_ma");


            //redis 放入数据
            redisUtil.set("redisTemplate", "这是一支兔子", 2);
            String redisValue = redisUtil.get("redisTemplate", 2).toString();
            logger.info("redisValue=" + redisValue);
            logger.info("读取redis成功");
//            logger.info(value.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

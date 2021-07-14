package com.example.jdbc;

import com.example.jdbc.service.UserService;
import com.example.jdbc.serviceimpl.UserServiceImpl;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
public class LoginFilter extends OncePerRequestFilter {

    @Autowired
    private JwtManager jwtManager;

    @Autowired
    private UserServiceImpl userService;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        logger.info("----------------------loginFilter---------------");
        Claims claims = jwtManager.parse(request.getHeader("Authroization"));
        if(!StringUtils.isEmpty(claims)){
            String username = claims.getSubject();
            UserDetails user = userService.loadUserByUsername(username);
            Authentication authentication = new UsernamePasswordAuthenticationToken(user,user.getPassword(),user.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        filterChain.doFilter(request,response);
    }
}

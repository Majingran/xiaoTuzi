package com.example.jdbc;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {

    /**
     * @Description:根据用户名获取用户对象
     * @Author: Mr_ma
     * @Date: 2021-6-30 23:25
     * @param null:
     * @return: null
     *
     **/
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}

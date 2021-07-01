package com.example.jdbc;

import com.example.jdbc.model.entity.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class UserDetail extends User {

    private UserEntity userEntity;

    public UserDetail (UserEntity userEntity, Collection<? extends GrantedAuthority> authorities){
        // 必须调用父类的构造方法，初始化用户名、密码、权限
        super(userEntity.getUsername(), userEntity.getPassword(), authorities);
        this.userEntity = userEntity;
    }
}

package com.example.jdbc.serviceimpl;

import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.jdbc.JwtManager;
import com.example.jdbc.LoginParam;
import com.example.jdbc.UserDetail;
import com.example.jdbc.model.UserParam;
import com.example.jdbc.model.entity.UserEntity;
import com.example.jdbc.model.mapper.UserMapper;
import com.example.jdbc.model.vo.UserVO;
import com.example.jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService, UserDetailsService {
    @Autowired
    private JwtManager jwtManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = baseMapper.selectByUsername(username);
        if (StringUtils.isEmpty(username)){
            throw new UsernameNotFoundException("数据库中没有此用户！");
        }

        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        return new UserDetail(user,authorities);
    }

    @Override
    public UserVO login(LoginParam param) {
        UserEntity user = baseMapper.selectByUsername(param.getUsername());

        if(StringUtils.isEmpty(user)){
            throw new ApiException("账号密码错误");
        }

        UserVO userVO = new UserVO();
        userVO.setId(user.getId());
        userVO.setUsername(user.getUsername());
        userVO.setToken(jwtManager.generate((user.getUsername())));
        userVO.setResourceIds(new HashSet<>());
        return userVO;
    }

    @Override
    public void createUser(UserParam param) {
        UserEntity user = new UserEntity();
        // 密码默认为12345
        user.setUsername(param.getUsername());
        user.setPassword(passwordEncoder.encode("12345"));
        save(user);
    }


}

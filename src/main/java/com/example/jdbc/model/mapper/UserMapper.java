package com.example.jdbc.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jdbc.model.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public  interface UserMapper extends BaseMapper<UserEntity>{

    UserEntity selectByUsername(String username);

}

package com.example.jdbc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.jdbc.LoginParam;
import com.example.jdbc.model.UserParam;
import com.example.jdbc.model.entity.UserEntity;
import com.example.jdbc.model.vo.UserVO;

public interface UserService extends IService<UserEntity> {
    /**
     * @Description: 登录
     * @Author: Mr_ma
     * @Date: 2021-7-10 23:40
     * @param user: 用户参数
     * @return: UserVo 登录成功则返回vo对象，失败则抛出异常
     **/
    UserVO login(LoginParam user);

    /**
     * @Description: 新增用户
     * @Author: Mr_ma
     * @Date: 2021-7-10 23:58
     * @param param:
     * @return: null
     **/
    void createUser(UserParam param);
}

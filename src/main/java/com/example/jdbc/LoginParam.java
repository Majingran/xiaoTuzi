package com.example.jdbc;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class LoginParam implements Serializable {


    private static final long serialVersionUID = -2876029053501887011L;

    //用户名
    @NotBlank(message = "用户名不可为空")
    private String username;

    //密码
    @NotBlank(message = "密码不可为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginParam{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

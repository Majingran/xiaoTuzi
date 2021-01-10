package com.example.common.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID = 7090579441425374933L;

    @NotNull(message = "userNmae !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Valitate")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                '}';
    }
}

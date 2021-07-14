package com.example.oidc.handle;

import com.alibaba.fastjson.JSON;
import com.example.common.constant.HttpStatus;
import com.example.common.core.domain.AjaxResult;
import com.example.common.utils.ServletUtils;
import com.example.common.utils.StringUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint, Serializable {


    private static final long serialVersionUID = 3347400011236069959L;

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        int code = HttpStatus.UNAUTHORIZED;
        String msg = StringUtils.format("请求访问：{}，认证失败，无法访问系统资源", httpServletRequest.getRequestURI());
        ServletUtils.renderString(httpServletResponse, JSON.toJSONString(AjaxResult.error(code,msg)));
    }
}

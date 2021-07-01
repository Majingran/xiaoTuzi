package com.example.oidc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth ) throws Exception{
//        auth.inMemoryAuthentication().passwordEncoder(passwordEncoder())
//                .withUser("admin").password(passwordEncoder().encode("123456")).authorities("ADMIN")
//                .and()
//                .withUser("lisi").password(passwordEncoder().encode("123456")).authorities("ORDINARY");
    }


    private PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests()
//                .antMatchers("/","/**","/**","/**").permitAll()
//                .antMatchers("/**")
//                .hasRole("ADMIN");
        //关闭csrf
        http.csrf().disable();
        http.headers().frameOptions().disable();
        //允许跨域访问
        http.cors().and()
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS).permitAll()
                .antMatchers("com/rabbit/user/logout").permitAll();
    }

    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception{
        return super.authenticationManager();
    }



}

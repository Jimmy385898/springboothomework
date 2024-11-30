package com.example.demo.config;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/index")
                .permitAll()
                .antMatchers("/userLogin")
                .permitAll()
                .antMatchers("/Java/1")
                .hasRole("Java")
                .antMatchers("/SpringBoot/1")
                .hasRole("sp");
        http.formLogin()
                .passwordParameter("pwd")
                .usernameParameter("username")
                .loginPage("/userLogin")
                .loginProcessingUrl("/userLogin")
                .successForwardUrl("/index");
        http.logout().logoutSuccessUrl("/index");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("zhangsan")
                .password(new BCryptPasswordEncoder()
                        .encode("123456"))
                .roles("Java");
    }
}

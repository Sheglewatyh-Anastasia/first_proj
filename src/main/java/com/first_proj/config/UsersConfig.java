package com.first_proj.config;

import com.first_proj.dao.UsersDao;
import com.first_proj.dao.UsersDaoH2Impl;
import com.first_proj.dao.UsersDaoStaticDataImpl;
import com.first_proj.service.UsersLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsersConfig {
    @Bean
    public UsersDao usersDaoH2Impl() {
        return new UsersDaoH2Impl();
    }

    @Bean
    public UsersDao usersDaoStaticData() {
        return new UsersDaoStaticDataImpl();
    }

    @Bean
    public UsersLogic usersLogic() {
        return new UsersLogic(usersDaoStaticData());
    }
}

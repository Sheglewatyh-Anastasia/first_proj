package com.first_proj.service;

import com.first_proj.dao.UsersDao;
import com.first_proj.dao.UsersDaoH2Impl;
import com.first_proj.jdo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

public class UsersLogic {

    private static final Logger log = LoggerFactory.getLogger(UsersLogic.class);
    private static final Long COUNTY_LOCATION_TYPE = 1L;

    private UsersDao usersDao;

    public UsersLogic(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @PostConstruct
    public void init() {
        usersDao.createUsersTable();
    }

    public String getCountries() {
        log.info("getCountries has been called");
        List<User> users = usersDao.getUsersByTypeId(COUNTY_LOCATION_TYPE);

        return users.stream()
                .map(User::getUser_name)
                .collect(Collectors.joining(", "));
    }
}

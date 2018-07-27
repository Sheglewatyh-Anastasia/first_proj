package com.first_proj.dao;

import com.first_proj.dao.mapping.UserRowMapper;
import com.first_proj.jdo.User;
import com.first_proj.utils.FileUtils;
import com.first_proj.utils.TestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersDaoStaticDataImpl implements UsersDao {
    private static final Logger log = LoggerFactory.getLogger(UsersDaoStaticDataImpl.class);

    private static final List<String> USER_LIST = Arrays.asList("Indonesia",
          "Dominican Republic", "France", "Ireland", "Scotland", "Thailand");

    @PostConstruct
    public void init() {
        createUsersTable();
    }

    @Override
    @Transactional
    public void createUsersTable() {

    }

    @Override
    @Transactional
    public List<User> getUsers() {
        log.info("calling getUsers");
        return TestUtils.getUsersByNameList(USER_LIST);
    }

    @Override
    @Transactional
    public List<User> getUsersByTypeId(Long typeId) {
        log.info("calling getUsersByTypeId");
        return TestUtils.getUsersByNameList(USER_LIST);
    }
}

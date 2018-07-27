package com.first_proj.dao;

import com.first_proj.dao.mapping.UserRowMapper;
import com.first_proj.jdo.User;
import com.first_proj.utils.FileUtils;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersDaoH2Impl implements UsersDao{
    private static final Logger log = LoggerFactory.getLogger(UsersDaoH2Impl.class);

    private static final String CREATE_USERS_TABLE = FileUtils.loadScriptFromFile("/sql/create/locations.sql");
    private static final String GET_USERS = FileUtils.loadScriptFromFile("/sql/locations/get-locations.sql");
    private static final String GET_USERS_BY_TYPE_ID = FileUtils.loadScriptFromFile("/sql/locations/get-locations-by-typeId.sql");

    @Override
    @Transactional
    public void createUsersTable() {
        jdbcTemplate.execute(CREATE_USERS_TABLE);
    }

    @Autowired
    @Qualifier("targetTemplate")
    JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("namedParameterTargetTemplate")
    NamedParameterJdbcTemplate namedParameterTargetTemplate;

    @Override
    @Transactional
    public List<User> getUsers() {
        log.info("calling getUsers");
        Map<String, Object> params = new HashMap<>();

        return namedParameterTargetTemplate.query(GET_USERS, params, new UserRowMapper());
    }

    @Override
    @Transactional
    public List<User> getUsersByTypeId(Long typeId) {
        log.info("calling getUsers");
        Map<String, Object> params = new HashMap<>();
        params.put("userType", typeId);

        return namedParameterTargetTemplate.query(GET_USERS_BY_TYPE_ID, params, new UserRowMapper());
    }
}

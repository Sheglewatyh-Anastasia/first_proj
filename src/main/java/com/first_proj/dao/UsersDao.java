package com.first_proj.dao;

import com.first_proj.jdo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UsersDao {
    @Transactional
    void createUsersTable();

    @Transactional
    List<User> getUsers();

    @Transactional
    List<User> getUsersByTypeId(Long typeId);
}

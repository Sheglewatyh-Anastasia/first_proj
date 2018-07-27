package com.first_proj.dao.mapping;

import com.first_proj.jdo.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setUser_Id(rs.getLong("user_Id"));
        user.setUser_name(rs.getString("user_name"));
        user.setUser_birthday(rs.getDate("user_birthday"));
        user.setUser_active(rs.getBoolean("user_active"));
        return user;
    }
}

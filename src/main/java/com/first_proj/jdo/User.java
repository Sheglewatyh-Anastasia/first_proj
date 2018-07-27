package com.first_proj.jdo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class User {
    private Long user_id;
    @JsonProperty(value = "name", required = true)
    private String user_name;
    @JsonProperty(value = "typeId", required = true)
    private Date user_birthday;
    @JsonProperty(value = "order", required = true)
    private Boolean user_active;

    public User() {

    }

    public User(String name) {
        this.user_name = name;
    }

    public Long getUser_Id() {
        return user_id;
    }

    public void setUser_Id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public Boolean getUser_active() {
        return user_active;
    }

    public void setUser_active(Boolean user_active) {
        this.user_active = user_active;
    }
}

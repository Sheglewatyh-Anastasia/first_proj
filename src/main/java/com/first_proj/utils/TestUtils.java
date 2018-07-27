package com.first_proj.utils;

import com.first_proj.jdo.User;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class TestUtils {

    public static List<User> getUsersByNameList(List<String> names){
        return names.stream().map(User::new).collect(Collectors.toList());
    }
}

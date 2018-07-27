package com.first_proj.controller;

import com.first_proj.service.UsersLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UsersLogic usersLogic;

    @RequestMapping(value = "/getExpressCountryList",
            method = RequestMethod.GET)
    @ResponseBody
    public String getUsers(HttpServletRequest request,
                               HttpServletResponse response) {
        try {
            log.info("getExpressCountryList has been called");
            return usersLogic.getCountries();
        } catch (Exception e) {
            log.error(e.getMessage());
            return "some error happened";
        }
    }
}

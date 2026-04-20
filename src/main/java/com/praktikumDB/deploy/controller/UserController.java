package com.praktikumDB.deploy.controller;

import com.praktikumDB.deploy.model.User;
import com.praktikumDB.deploy.service.UserService;
import org.aspectj.lang.annotation.DeclareWarning;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


}

package dev.hashnode.merndeveloper.realestate.User.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import dev.hashnode.merndeveloper.realestate.User.service.UserService;

@Controller( value = "/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // @GetMapping("")
    // public List<UserDTO> getAllUsers () {
    //     return userService.getUsers();
    // }
}

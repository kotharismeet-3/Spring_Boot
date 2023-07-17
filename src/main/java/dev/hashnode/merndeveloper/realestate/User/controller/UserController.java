package dev.hashnode.merndeveloper.realestate.User.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import dev.hashnode.merndeveloper.realestate.User.model.User;
import dev.hashnode.merndeveloper.realestate.User.service.UserService;

@Controller( value = "/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers () {
        return userService.getUsers();
    }

    @GetMapping("/userId") 
    public Optional<User> getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @DeleteMapping(path ="{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
    }

    @PutMapping("/userId/deprecated")
    public void updateUserV0(@PathVariable Long UserId, @RequestParam String firstName, @RequestParam String lastName){

    }

    @PutMapping(path = "{userId}")
    public void updateUser(@PathVariable Long UserId, @RequestParam Map<String, String> params){

    }

}

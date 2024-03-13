package com.nttdata.pt1.controller;

import com.nttdata.pt1.model.User;
import com.nttdata.pt1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public User getUserById(@RequestParam String idType, @RequestParam String idNumber){
        return userService.getUserbyId(idNumber);
    }

}

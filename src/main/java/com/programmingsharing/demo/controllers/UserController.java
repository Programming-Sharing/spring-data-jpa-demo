package com.programmingsharing.demo.controllers;

import com.programmingsharing.demo.domains.AddUserRequest;
import com.programmingsharing.demo.domains.UpdateUserRequest;
import com.programmingsharing.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add")
    public ResponseEntity<String> addNewUser(@RequestBody AddUserRequest userInfo) {
        userService.addUser(userInfo);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<String> updateUser(@RequestBody UpdateUserRequest userInfo) {
        try {
            userService.updateUser(userInfo);
        }catch (Exception exception){
            return new ResponseEntity<>("Not success", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}

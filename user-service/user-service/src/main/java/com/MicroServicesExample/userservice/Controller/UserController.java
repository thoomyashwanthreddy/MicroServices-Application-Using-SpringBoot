package com.MicroServicesExample.userservice.Controller;


import com.MicroServicesExample.userservice.Entity.User;
import com.MicroServicesExample.userservice.Service.UserService;
import com.MicroServicesExample.userservice.VO.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside SaveUSer of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUsersWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUsersWithDepartment of UserController");
        return userService.getUsersWithDepartment(userId);
    }
}

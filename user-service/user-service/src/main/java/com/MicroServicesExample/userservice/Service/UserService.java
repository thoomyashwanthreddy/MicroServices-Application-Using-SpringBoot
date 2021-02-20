package com.MicroServicesExample.userservice.Service;

import com.MicroServicesExample.userservice.Entity.User;
import com.MicroServicesExample.userservice.Repository.UserRepository;
import com.MicroServicesExample.userservice.VO.Department;
import com.MicroServicesExample.userservice.VO.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside SaveUSer of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUsersWithDepartment(Long userId) {
        log.info("Inside getUsersWithDepartment of UserService");
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        User user = userRepository.findUserById(userId);
        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getId(),
                Department.class);
        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;

    }
}

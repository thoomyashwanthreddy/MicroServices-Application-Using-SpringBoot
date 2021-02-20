package com.MicroServicesExample.userservice.Repository;

import com.MicroServicesExample.userservice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findUserById(Long userId);
}

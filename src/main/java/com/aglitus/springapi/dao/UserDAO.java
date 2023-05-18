package com.aglitus.springapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aglitus.springapi.pojo.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> { 

    User findByUsername(String username);
    
}
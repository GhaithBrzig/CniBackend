package com.cni.eagleye.dao.repository;

import com.cni.eagleye.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUserName(String userName);
}

package com.ism.ism_karate_junit.service;

import com.ism.ism_karate_junit.entity.User;

import java.util.List;

public interface UserService {
      User saveUser(User user) ;
      User fetchUserById(Long id);
      List<User> findAllUsers();

}

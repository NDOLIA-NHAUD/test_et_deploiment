package com.ism.ism_karate_junit.service;

import com.ism.ism_karate_junit.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;


@Service
public class UserServiceImpl implements UserService {

    List<User> users = new ArrayList<>(
            List.of(new User(1L, "ismrdane", "ismhn@doe.com", "123456"),
                    new User(2L, "Jane", "jane@doe.com", "123456"),
                    new User(3L, "Bob", "bob@doe.com", "123456"))
    );

    /**
     * @param user
     * @return User
     */
    @Override
    public User saveUser(User user) {
        //user.setId(RandomGenerator.getDefault().nextLong());
        //user.setName("ism " + user.getName());
        users.add(user);
        return user;
    }

    /**
     * @param id
     * @return User
     */
    @Override
    public User fetchUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException("User not found"));
    }

    /**
     * @return
     */
    @Override
    public List<User> findAllUsers() {
        return users;
    }
}

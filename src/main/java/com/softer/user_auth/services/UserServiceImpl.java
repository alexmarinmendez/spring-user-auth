package com.softer.user_auth.services;

import com.softer.user_auth.entities.User;
import com.softer.user_auth.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRespository userRespository;

    @Override
    public User save(User user) {
        return userRespository.save(user);
    }

    @Override
    public User validateUser(String email, String password) {
        return userRespository.findByEmailAndPassword(email, password);
    }
}

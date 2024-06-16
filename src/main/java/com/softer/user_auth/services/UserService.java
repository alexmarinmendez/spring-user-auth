package com.softer.user_auth.services;

import com.softer.user_auth.entities.User;

public interface UserService {
    User save(User user);
    User validateUser(String email, String password);
}

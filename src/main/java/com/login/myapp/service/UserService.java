package com.login.myapp.service;

import com.login.myapp.model.User;

public interface UserService {
    User findUserByEmail(String email);

    void saveUser(User user);
}

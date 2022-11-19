package com.example.springbootbook.service;

import com.example.springbootbook.model.User;

public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}

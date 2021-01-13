package com.programmingsharing.demo.services;

import com.programmingsharing.demo.domains.AddUserRequest;
import com.programmingsharing.demo.domains.UpdateUserRequest;
import com.programmingsharing.demo.services.exceptions.DataNotFoundException;

public interface UserService {
    void addUser(AddUserRequest user);

    void  updateUser(UpdateUserRequest user) throws DataNotFoundException;
}

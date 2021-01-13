package com.programmingsharing.demo.services;

import com.programmingsharing.demo.domains.AddUserRequest;
import com.programmingsharing.demo.domains.UpdateUserRequest;
import com.programmingsharing.demo.entities.User;
import com.programmingsharing.demo.repositories.UserRepository;
import com.programmingsharing.demo.services.exceptions.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(AddUserRequest userInfo){
        var userToAdd = new User();
        userToAdd.setFirstName(userInfo.getFirstName());
        userToAdd.setLastName(userInfo.getLastName());
        userRepository.save(userToAdd);
    }

    @Override
    @Transactional
    public void  updateUser(UpdateUserRequest updateUserInfo) throws DataNotFoundException {
        Optional<User> userToUpdate = userRepository.findById(updateUserInfo.getUserId());
        if (userToUpdate.isEmpty()){
            throw new DataNotFoundException("User is not found");
        }
        var existingUser = userToUpdate.get();

        // Updating entity in transactional context. No need to call save method
        existingUser.setFirstName(updateUserInfo.getFirstName());
        existingUser.setLastName(updateUserInfo.getLastName());
        userRepository.save(existingUser);
    }
}

package com.example.andranik.service;

import com.example.andranik.model.Users;
import com.example.andranik.repo.UserRepo;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;
    public List<Users> findAll(){
        return userRepo.findAll();
    }

    public void save(Users users){
        users.setName(users.getName());
        users.setFirstname(users.getFirstname());
        users.setSurname(users.getSurname());
        users.setPassword(users.getPassword());
        userRepo.save(users);
    }
}

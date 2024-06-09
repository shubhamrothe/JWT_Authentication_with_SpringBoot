package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

  private List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User(UUID.randomUUID().toString(), "Rishabh", "rishabh01@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(), "Shubham", "shubham02@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(), "Mahesh", "mahesh03@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(), "Kiran", "kiran04@gmail.com"));
    }

    public List<User> getUsers(){
        return this.list;
    }
}

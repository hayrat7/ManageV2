package com.sid.services;

import com.sid.entities.Role;
import com.sid.entities.User;

import java.util.List;

public interface AccountService {
    User addUser(User user);
    Role addRole(Role role);
    void addRoleToUser(String userName,String roleName);
    User loadUserByName(String userName);
    List<User> users();
}

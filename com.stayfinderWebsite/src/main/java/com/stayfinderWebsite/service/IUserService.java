package com.stayfinderWebsite.service;

import com.stayfinderWebsite.model.Usersubject;

import java.util.List;

public interface IUserService {
    Usersubject registerUser(Usersubject user);
    List<Usersubject> getUsers();
    void deleteUser(String email);
    Usersubject getUser(String email);
}

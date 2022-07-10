package rw.ac.rca.springboot.backend.services;

import rw.ac.rca.springboot.backend.models.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();

    User save(User user);

    User getLoggedInUser();
}

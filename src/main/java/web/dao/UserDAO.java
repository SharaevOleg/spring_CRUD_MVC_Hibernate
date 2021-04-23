package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    User getUserById(Long id);

    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(Long id);

    void editUser(User user);
}

package web.repository;

import web.model.User;

import java.util.List;

public interface UserRepository {
    User getUserById(Long id);

    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(Long id);

    void editUser(User user);
}

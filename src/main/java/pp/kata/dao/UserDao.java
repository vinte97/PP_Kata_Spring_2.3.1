package pp.kata.dao;

import pp.kata.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    User getUserById(Long id);

    User editUser(User user);
}

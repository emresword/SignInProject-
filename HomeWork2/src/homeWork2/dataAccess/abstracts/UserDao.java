package homeWork2.dataAccess.abstracts;

import java.util.List;

import homeWork2.entity.concretes.User;

public interface UserDao {
    void register(User user);
    void delete(User user);
    void update(User user);
    List<User> getAllUsers();
   
}

package homeWork2.business.abstracts;

import homeWork2.entity.concretes.User;

public interface UserService {
    void register(User user);
    void signIn(String email,String password);
}

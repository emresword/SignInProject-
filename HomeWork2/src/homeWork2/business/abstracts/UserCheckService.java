package homeWork2.business.abstracts;

import java.util.List;

import homeWork2.entity.concretes.User;

public interface UserCheckService {
    boolean checkPassword(User user);
    boolean checkEmail(User user);
    boolean checkFirstName(User user);
    boolean checkLastName(User user);
    boolean checkUsedEmail( User user, List<User> users);
	
}

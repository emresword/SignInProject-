package homeWork2;

import homeWork2.business.abstracts.UserService;
import homeWork2.business.concretes.GmailAccountService;
import homeWork2.business.concretes.UserCheckManager;
import homeWork2.business.concretes.UserManager;
import homeWork2.business.concretes.UserSignInManager;
import homeWork2.core.abstracts.ExternalAccountService;
import homeWork2.core.concretes.GmailManager;
import homeWork2.core.concretes.GoogleAccountAdapter;
import homeWork2.dataAccess.abstracts.UserDao;
import homeWork2.dataAccess.concretes.HibarnateUserDao;
import homeWork2.entity.concretes.User;
public class Main {
    public static void main(String[] args) {
    	UserDao userDao=new HibarnateUserDao();
        UserService userService = new UserManager(userDao, 
            new UserSignInManager(userDao), new UserCheckManager(new GmailManager()));

        userService.register(new User("abc", "klmn", "abc@gmail.com", "1234567"));
        userService.register(new User("c", "khbj", "abcd@gmail.com", "1234567"));
        // Do not register the same user again

        userService.signIn("abc@gmail.com", "1234567");
        
        ExternalAccountService externalAccountService=new GoogleAccountAdapter(new GmailAccountService());
        externalAccountService.registerWithExtenalAccount("Emre");
        externalAccountService.logInWithExtenalAccount("Emre");
        
    }
}



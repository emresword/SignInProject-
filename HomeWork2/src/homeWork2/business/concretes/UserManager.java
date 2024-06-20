package homeWork2.business.concretes;

import homeWork2.business.abstracts.UserCheckService;
import homeWork2.business.abstracts.UserService;
import homeWork2.business.abstracts.UserSignInService;
import homeWork2.dataAccess.abstracts.UserDao;
import homeWork2.entity.concretes.User;

public class UserManager implements UserService {
	UserDao userDao;
    UserSignInService userSignInService;
	UserCheckService userCheckService;
 



	public UserManager(UserDao userDao, UserSignInService userSignInService, UserCheckService userCheckService) {
		super();
		this.userDao = userDao;
		this.userSignInService = userSignInService;
		this.userCheckService = userCheckService;
	}


	
	
	@Override
	public void register(User user) {
	  if(userCheckService.checkEmail(user)&&userCheckService.checkFirstName(user)
			&&userCheckService.checkLastName(user)&&userCheckService.checkPassword(user)
			&&userCheckService.checkUsedEmail(user, userDao.getAllUsers())) {
		  userDao.register(user);
			 System.out.println("Register is successfull");
	  }else {
			 System.out.println("it isn't successfull");
		 }
	
	}


	@Override
	public void signIn(String email,String password) {
		userSignInService.signIn(email, password);
	}

}

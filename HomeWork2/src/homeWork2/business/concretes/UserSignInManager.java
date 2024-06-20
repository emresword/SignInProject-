package homeWork2.business.concretes;

import homeWork2.business.abstracts.UserSignInService;
import homeWork2.dataAccess.abstracts.UserDao;
import homeWork2.entity.concretes.User;

public class UserSignInManager implements UserSignInService{
	UserDao userDao;
	

	public UserSignInManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	// In UserSignInManager class



	@Override
	public void signIn(String eposta, String password) {
	    boolean successfulLogin = false;
	    for (User user : userDao.getAllUsers()) {
	        
	        if (user.getParola().equals(password) && user.getEposta().equals(eposta)) {
	            System.out.println("Successfully login");
	            successfulLogin = true;
	            break; // Exit the loop since login is successful
	        }
	    }
	    if (!successfulLogin) {
	        System.out.println("unsuccessful login");
	    }
	}
	
	
	
	//@Override
//	public void signIn(String eposta, String password) {
//	    boolean successfulLogin = false;
//	    for (User user : userDao.getAllUsers()) {
//	        if (user.getParola().equals(password) && user.getEposta().equals(eposta)) {
//	            System.out.println("Successfully login");
//	            successfulLogin = true;
//	            break; // Exit the loop since login is successful
//	        }
//	    }
//	    if (!successfulLogin) {
//	    	 
//	    	 
//	        System.out.println("unsuccessful login");
//	    }
//	}
	



}

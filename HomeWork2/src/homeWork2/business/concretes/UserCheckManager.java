package homeWork2.business.concretes;

import java.util.List;

import homeWork2.business.abstracts.UserCheckService;
import homeWork2.core.abstracts.EmailService;
import homeWork2.entity.concretes.User;

public class UserCheckManager implements UserCheckService {
	
	private EmailService emailService;

	public UserCheckManager(EmailService emailService) {
		super();
		this.emailService = emailService;
	}

	@Override
	public boolean checkPassword(User user) {
		
	    if(user.getParola().length()<6||user.getParola()==null) {
	    	System.out.println("password is null or it's length smaller than 6");
	    	return false;
	    }else {
			return true;
		}
	}

	@Override
	public boolean checkEmail(User user) {
		
		if(emailService.isValidEmail(user.getEposta())) {
			return true;
		}else {
			
			System.out.println("Email is invalid");
			return false;
		}
		
	
	}

	@Override
	public boolean checkFirstName(User user) {
		
		if(user.getUserName().length()<2||user.getParola()==null) {
			System.out.println("Username length's is smaller than 2 or null");
			return false;
		}else {
			return true;
		}
		
		
	}

	@Override
	public boolean checkLastName(User user) {
		
		if(user.getUserSurname().length()<2||user.getParola()==null) {
			System.out.println("Surname length's is smmaller than 2 or null");
			return false;	
		}else {
			return true;
		}
		
	}

	@Override
	public boolean checkUsedEmail(User user, List<User> users) {
	    for (User user2 : users) {
	        if (user.getEposta() != null && user.getEposta().equals(user2.getEposta())) {
	            System.out.println("This email is already used");
	            return false; // Email is already used, no need to continue
	        }
	    }
	  
	    return true; // Email is not used by any user in the list
	}


	

}

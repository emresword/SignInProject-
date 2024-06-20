package homeWork2.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homeWork2.dataAccess.abstracts.UserDao;
import homeWork2.entity.concretes.User;

public class HibarnateUserDao implements UserDao{
	List<User> users=new ArrayList<>();

	@Override
	public void register(User user) {
	    System.out.println("hibarnate ile eklendi " + user.getUserName());
	    users.add(user);
	    
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return users;
	}

}

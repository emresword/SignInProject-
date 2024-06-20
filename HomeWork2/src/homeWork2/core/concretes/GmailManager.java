package homeWork2.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homeWork2.core.abstracts.EmailService;

public class GmailManager implements EmailService{

	@Override
	public boolean isValidEmail(String email) {
		boolean valueofvalid=true;
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@gmail\\.com$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		
		if (!matcher.matches()) {
			valueofvalid=false;
		}
       return valueofvalid;

		
	}

}

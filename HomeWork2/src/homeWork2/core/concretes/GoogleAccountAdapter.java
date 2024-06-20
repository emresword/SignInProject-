package homeWork2.core.concretes;

import homeWork2.business.concretes.GmailAccountService;
import homeWork2.core.abstracts.ExternalAccountService;

public class GoogleAccountAdapter implements ExternalAccountService{
	private GmailAccountService gmailAccountService;

	public GoogleAccountAdapter(GmailAccountService gmailAccountService) {
		super();
		this.gmailAccountService = gmailAccountService;
	}

	@Override
	public void registerWithExtenalAccount(String message) {
		GmailAccountService gmailAccountService=new GmailAccountService();
		gmailAccountService.register(message);
		
	}

	@Override
	public void logInWithExtenalAccount(String message) {
		GmailAccountService gmailAccountService=new GmailAccountService();
		gmailAccountService.login(message);
		
	}
	

}

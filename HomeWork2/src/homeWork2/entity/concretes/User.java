package homeWork2.entity.concretes;

import homeWork2.entity.abstracts.Entity;

public class User implements Entity{
	private String userName;
	private String userSurname;
	private String eposta;
	private String parola;
	public User() {
		super();
	}
	public User(String userName, String userSurname, String eposta, String parola) {
		super();
		this.userName = userName;
		this.userSurname = userSurname;
		this.eposta = eposta;
		this.parola = parola;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	
}

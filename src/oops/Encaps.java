package oops;

public class Encaps {//pojo::Plain Old Java Object....
	private String username;
	private String passowrd;

	public void setUserName(String uname) {
		username=uname;
	}
	public void setPassWord(String pword) {
		passowrd=pword;
	}
	
	public String getUserName() {//without argumnets and with return type
		return username;
	}
	public String getPassword() {
		return passowrd;
	}
}

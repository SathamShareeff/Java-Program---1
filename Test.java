package org.facebook;

public class Test {

	String userName="Abc";
	String password;
	boolean loginUser;

	void loginCredentials(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	boolean loginStatus(boolean login) {
		return true;
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.loginUser);
		System.out.println(t.loginStatus(true));
	}
}

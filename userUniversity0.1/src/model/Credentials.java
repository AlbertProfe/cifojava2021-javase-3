package model;

import interfaces.CredentialsCalculations;

public class Credentials  {

	public String userName;
	public String password;
	public boolean isValidated = false;
	public boolean isBlocked = false;

	public Credentials() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValidated() {
		return isValidated;
	}

	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", isValidated=" + isValidated + ", isBlocked="
				+ isBlocked + "]";
	}

	

}

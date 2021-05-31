package model;

import java.util.List;

import interfaces.CredentialsCalculations;

public class Member extends User implements CredentialsCalculations {
	
	private List<Holidays> holidays;
	private Credentials credentials;
	
	
	@Override
	public void managmentCredentials() {
		// TODO Auto-generated method stub
		
	}

}

package com.service;

import com.entities.Login;

public class ImplementValidate implements IValidate
{
	Login log1= new Login("Akash","0000");
	Login log2= new Login("Alok","alok1234");
	Login log3= new Login("Babita","Babita1234");
	
	Login[] logins= {log1,log2,log3};
	public String validateLogin(String username,String password) 
	{
		for(Login log:logins) 
		{
			if(log.getUserName().equals(username) && log.getPassword().equals(password)) {
				return "Successful";
			}
		}

		return "Failed";
	}
}

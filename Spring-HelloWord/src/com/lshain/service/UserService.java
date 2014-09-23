package com.lshain.service;

import com.lshain.dao.UserDAO;
import com.lshain.model.User;

public class UserService
{
	private UserDAO userDAO;
	
	public UserDAO getUserDAO( )
	{
		return userDAO;
	}
	
	public void setUserDAO( UserDAO userDAO )
	{
		this.userDAO = userDAO;
	}
	
	public void add( User u )
	{
		this.userDAO.save( u );
	}
}

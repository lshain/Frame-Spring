package com.lshain.dao.impl;

import com.lshain.dao.UserDAO;
import com.lshain.model.User;

public class UserDaoImpl implements UserDAO
{
	@Override
	public void save( User u )
	{
		System.out.println( "save UserName: " + u.getUserName( ) + " PassWord:" + u.getPassWord( ) );
	}
}

package com.lshain.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lshain.model.User;
import com.lshain.service.UserService;

public class TestDI
{
	public static void main( String[] args )
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext( "bean-xml/beans.xml" );
		
		UserService us = ( UserService ) ( ( BeanFactory ) ac ).getBean( "UserService" );
		User u = ( User ) ( ( BeanFactory ) ac ).getBean( "User" );
		
		us.add( u );
	}
}

package com.lshain.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lshain.example.pojo.Pojo;

public class TestDI
{
	private static final String TAG = "TestDI";
	private static final boolean DEBUG = true;
	
	private static final void debug( String msg )
	{
		if ( DEBUG )
		{
			System.out.println( TAG + ":" + msg );
		}
	}
	
	public static void main( String[] args )
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext( "bean-xml/beans.xml" );
		
		Pojo pojoSingle = ( Pojo ) ( ( BeanFactory ) ac ).getBean( "PojoSingle" );
		
		debug( pojoSingle.toString( ) );
		
		Pojo pojo = ( Pojo ) ( ( BeanFactory ) ac ).getBean( "Pojo" );
		debug( pojo.toString( ) );
	}
}

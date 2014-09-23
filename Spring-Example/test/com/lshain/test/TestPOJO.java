package com.lshain.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lshain.example.pojo.Pojo;
import com.lshain.example.spel.Module;

public class TestPOJO
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
	
	public static void testPOJO( )
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext( "bean-xml/pojo_test.xml" );
		
		Pojo pojoSingle = ( Pojo ) ( ( BeanFactory ) ac ).getBean( "PojoSingle" );
		
		debug( pojoSingle.toString( ) );
		
		Pojo pojo = ( Pojo ) ( ( BeanFactory ) ac ).getBean( "Pojo" );
		debug( pojo.toString( ) );
	}
	
	public static void testModule( )
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext( "bean-xml/module_test.xml" );
		
		Module module = ( Module ) ( ( BeanFactory ) ac ).getBean( "Module" );
		
		debug( module.toString( ) );
	}
	
	public static void main( String[] args )
	{
		testModule( );
	}
}

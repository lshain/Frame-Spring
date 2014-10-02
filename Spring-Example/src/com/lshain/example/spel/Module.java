package com.lshain.example.spel;

import java.util.ArrayList;

public class Module
{
	private int aInt = 0;
	private String bString;
	private boolean cBoolean;
	private String dString;
	private double eDouble;
	private Attr fAttr;
	private char gChar;
	
	private Attr hAttr;
	private Attr iAttr;
	private ArrayList< Attr > jAttrs;
	
	public int getaInt( )
	{
		return aInt;
	}
	
	public void setaInt( int aInt )
	{
		this.aInt = aInt;
	}
	
	public String getbString( )
	{
		return bString;
	}
	
	public void setbString( String bString )
	{
		this.bString = bString;
	}
	
	public boolean iscBoolean( )
	{
		return cBoolean;
	}
	
	public void setcBoolean( boolean cBoolean )
	{
		this.cBoolean = cBoolean;
	}
	
	@Override
	public String toString( )
	{
		return " [ " + aInt + " , " + bString + " , " + cBoolean + " , " + dString + " , " + eDouble + " , " + ( fAttr != null ? fAttr.toString( ) : "fAttr == null" ) + " , " + gChar + " ] ";
	}
	
	public String getdString( )
	{
		return dString;
	}
	
	public void setdString( String dString )
	{
		this.dString = dString;
	}
	
	public double geteDouble( )
	{
		return eDouble;
	}
	
	public void seteDouble( double eDouble )
	{
		this.eDouble = eDouble;
	}
	
	public Attr getfAttr( )
	{
		return fAttr;
	}
	
	public void setfAttr( Attr fAttr )
	{
		this.fAttr = fAttr;
	}
	
	public char getgChar( )
	{
		return gChar;
	}
	
	public void setgChar( char gChar )
	{
		this.gChar = gChar;
	}
	
	public Attr gethAttr( )
	{
		return hAttr;
	}
	
	public void sethAttr( Attr hAttr )
	{
		this.hAttr = hAttr;
	}
	
	public Attr getiAttr( )
	{
		return iAttr;
	}
	
	public void setiAttr( Attr iAttr )
	{
		this.iAttr = iAttr;
	}
	
	public ArrayList< Attr > getjAttrs( )
	{
		return jAttrs;
	}
	
	public void setjAttrs( ArrayList< Attr > jAttrs )
	{
		this.jAttrs = jAttrs;
	}
}

package com.lshain.example.spel;

public class Module
{
	private int aInt = 0;
	private String bString;
	private boolean cBoolean;
	private String dString;
	private double eDouble;
	
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
		return " [ " + aInt + " , " + bString + " , " + cBoolean + " , " + dString + " , " + eDouble + " ] ";
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
}

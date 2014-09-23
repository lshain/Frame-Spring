package com.lshain.example.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Pojo
{
	private static final String TAG = "Pojo";
	private static final boolean DEBUG = true;
	
	private static final void debug( String msg )
	{
		if ( DEBUG )
		{
			System.out.println( TAG + ":" + msg );
		}
	}
	
	private Attr cattr = null;
	private int intValue = -1;
	private String stringValue = null;
	private ArrayList< String > as = null;
	private ArrayList< Attr > aa = null;
	private Properties properties = null;
	private HashSet< Attr > sa = null;
	private HashMap< String, Attr > hmsa = null;
	private Attr attr = null;
	private Attr innerattr = null;
	
	public void initBefor( )
	{
		debug( "initBefor..." );
	}
	
	public void destoryAfter( )
	{
		debug( "destoryAfter..." );
	}
	
	public Pojo( Attr cattr, int a )
	{
		this.cattr = cattr;
		debug( "Pojo...a: " + a );
	}
	
	private static class PojoHolder
	{
		static Pojo instance = new Pojo( new Attr( ), 0 );
	}
	
	public static Pojo getInstance( )
	{
		debug( "getInstance...." );
		return PojoHolder.instance;
	}
	
	public int getIntValue( )
	{
		return intValue;
	}
	
	public void setIntValue( int intValue )
	{
		this.intValue = intValue;
	}
	
	public String getStringValue( )
	{
		return stringValue;
	}
	
	public void setStringValue( String stringValue )
	{
		this.stringValue = stringValue;
	}
	
	public ArrayList< String > getAs( )
	{
		return as;
	}
	
	public void setAs( ArrayList< String > as )
	{
		this.as = as;
	}
	
	public ArrayList< Attr > getAa( )
	{
		return aa;
	}
	
	public void setAa( ArrayList< Attr > aa )
	{
		this.aa = aa;
	}
	
	public Properties getProperties( )
	{
		return properties;
	}
	
	public void setProperties( Properties properties )
	{
		this.properties = properties;
	}
	
	public HashSet< Attr > getSa( )
	{
		return sa;
	}
	
	public void setSa( HashSet< Attr > sa )
	{
		this.sa = sa;
	}
	
	public HashMap< String, Attr > getHmsa( )
	{
		return hmsa;
	}
	
	public void setHmsa( HashMap< String, Attr > hmsa )
	{
		this.hmsa = hmsa;
	}
	
	public Attr getAttr( )
	{
		return attr;
	}
	
	public void setAttr( Attr attr )
	{
		this.attr = attr;
	}
	
	public Attr getInnerattr( )
	{
		return innerattr;
	}
	
	public void setInnerattr( Attr innerattr )
	{
		this.innerattr = innerattr;
	}
	
	@Override
	public String toString( )
	{
		String str = "";
		
		if ( cattr != null )
		{
			str += cattr.toString( ) + " | ";
		}
		else
		{
			str += "cattr == null" + " | ";
		}
		
		str += "intValue: " + intValue + " | ";
		
		if ( stringValue != null )
		{
			str += stringValue + " | ";
		}
		else
		{
			str += "stringValue == null" + " | ";
		}
		
		if ( aa != null )
		{
			for ( Attr attr : aa )
			{
				str += attr.toString( );
			}
			
			str += " | ";
		}
		else
		{
			str += "aa == null" + " | ";
		}
		
		if ( properties != null )
		{
			str += properties.toString( ) + " | ";
		}
		else
		{
			str += "properties == null" + " | ";
		}
		
		if ( sa != null )
		{
			for ( Attr attr : sa )
			{
				str += attr.toString( );
			}
			
			str += " | ";
		}
		else
		{
			str += "sa == null" + " | ";
		}
		
		if ( hmsa != null )
		{
			@SuppressWarnings( "rawtypes" )
			Iterator iter = hmsa.entrySet( ).iterator( );
			while ( iter.hasNext( ) )
			{
				@SuppressWarnings( "rawtypes" )
				Map.Entry entry = ( Map.Entry ) iter.next( );
				String key = ( String ) entry.getKey( );
				Attr val = ( Attr ) entry.getValue( );
				str += "key: " + key;
				str += "val: " + val.toString( );
			}
			
			str += " | ";
		}
		else
		{
			str += "hmsa == null" + " | ";
		}
		
		if ( attr != null )
		{
			str += attr.toString( ) + " | ";
		}
		else
		{
			str += "attr == null" + " | ";
		}
		
		if ( innerattr != null )
		{
			str += innerattr.toString( ) + " | ";
		}
		else
		{
			str += "innerattr == null" + " | ";
		}
		
		return str;
	}
}

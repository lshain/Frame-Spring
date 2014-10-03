package hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Application
{
	public static void main( String args[] )
	{
		BasicDataSource dataSource = new BasicDataSource( );
		dataSource.setDriverClassName( "com.mysql.jdbc.Driver" );
		dataSource.setUrl( "jdbc:mysql://192.168.2.104/analysisengine" );
		dataSource.setUsername( "gyh" );
		dataSource.setPassword( "123456" );
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate( dataSource );
		
		String tableName = "customers";
		
		System.out.println( "Creating tables: " + tableName );
		jdbcTemplate.execute( "DROP TABLE IF EXISTS " + tableName );
		jdbcTemplate.execute( "CREATE TABLE IF NOT EXISTS " + tableName + "(" + "id serial, first_name varchar(255), last_name varchar(255)) ENGINE=InnoDB DEFAULT CHARSET=utf8" );
		
		String[] names = "John Woo;Jeff Dean;Josh Bloch;Josh Long".split( ";" );
		for ( String fullname : names )
		{
			String[] name = fullname.split( " " );
			System.out.printf( "Inserting customer record for %s %s\n", name[0], name[1] );
			jdbcTemplate.update( "INSERT INTO customers(first_name,last_name) values(?,?)", name[0], name[1] );
		}
		
		System.out.println( "Querying for customer records where first_name = 'Josh':" );
		List< Customer > results = jdbcTemplate.query( "select * from customers where first_name = ?", new Object[] { "Josh" }, new RowMapper< Customer >( )
		{
			@Override
			public Customer mapRow( ResultSet rs, int rowNum ) throws SQLException
			{
				return new Customer( rs.getLong( "id" ), rs.getString( "first_name" ), rs.getString( "last_name" ) );
			}
		} );
		
		for ( Customer customer : results )
		{
			System.out.println( customer );
		}
	}
}

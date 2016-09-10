package controller;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbctest {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
		 
		   DataSource dataSource=ctx.getBean("dataSource",DataSource.class);
		 
		     String sql="select * from user";   
		 
		  Connection connection=dataSource.getConnection(); 
		 
		  Statement stm=connection.createStatement();
		 
		  ResultSet rs=stm.executeQuery(sql); 
		 
		    while(rs.next())    
		 
		{       System.out.println("用户名为:"); 
		 
		     System.out.println(rs.getString(2)); 
		 
		    }                  

	}

}

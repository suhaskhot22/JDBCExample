package com.demo.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
public static void main(String[] args) {
	try {
		// 1.Load the Driver
		Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println("Load driver successfully.....");
		
		// 2.Established the Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Suhas");
		System.out.println("database connected....");
		
		//Using Statement
		
		// 3.Create Statement
		//Statement st=con.createStatement();
		
		
		
		// 4.Execute Query
		
		//For create database
		/*String sql="create database student";
		  st.executeUpdate(sql);
		  */
		
		//for drop database
		/*String sql = "drop database student ";
		 * st.executeUpdate(sql);
		 * */
		
		//for create table
		/*String sql="create table studentdata(id int not null,name varchar(20))";
		 * st.executeUpdate(sql);
		 * */
		
		//for drop table
		/*String sql = "drop table studentdata ";
		 * st.executeUpdate(sql);
		 * */

		//for inserting data
		/*String sql = "insert into studentdata values(4,'Amar')";
		 * st.executeUpdate(sql);
		 * */
		
		//for retriving all data
		/*String sql = "select * from studentdata";
		ResultSet rs=st.executeQuery(sql);
		System.out.println("Rollno"+"  "+"Name");
		while(rs.next())
		{
			
			System.out.println(rs.getInt("id")+"	"+rs.getString("name"));
		}*/
		
		
		//for retriving particular data
		/*		String sql = "select * from studentdata where id=1";
				ResultSet rs=st.executeQuery(sql);
				System.out.println("Rollno"+"  "+"Name");
				while(rs.next())
				{
					
					System.out.println(rs.getInt("id")+"	"+rs.getString("name"));
				}
		*/		
		
		//Using ResultSet methods
		
		/*String sql = "select * from studentdata";
		ResultSet rs=st.executeQuery(sql);
		System.out.println("Rollno"+"  "+"Name");
		//rs.absolute(3);
		//rs.relative(2);
		//rs.next();
		//rs.previous();
		//rs.first();
		//rs.last();
			System.out.println(rs.getInt("id")+"	"+rs.getString("name"));
		*/
		
		//for update records 
		/*String sql="update studentdata SET name='pashu' where id=1";*/
		
		//for delete records
		/*String sql="delete from studentdata where id=4";
		st.executeUpdate(sql);
*/		
		/*System.out.println("Database created successfully....");*/
		/*System.out.println("table created successfully....");*/
		/*System.out.println("record inserted successfully....");*/
		/*System.out.println("record updated successfully....");*/
		/*System.out.println("record Deleted successfully....");*/
		
		//for LIKE Clause
		/*String sql = "select * from studentdata where name LIKE '%Su%'";
		ResultSet rs=st.executeQuery(sql);
		System.out.println("Rollno"+"  "+"Name");
		while(rs.next())
		{
			
			System.out.println(rs.getInt("id")+"	"+rs.getString("name"));
		}*/
		
		
		//USING Prepared Statement(prepared stmt is )
		
        PreparedStatement ps=con.prepareStatement("insert into studentdata values(?,?)");
		ps.setInt(1, 4);
		ps.setString(2, "Amar");
		
		int i=ps.executeUpdate();  
		System.out.println(i+" records inserted");
		
		// 5.Close the connection
		//st.close();
		con.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} //Load the Driver
 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}

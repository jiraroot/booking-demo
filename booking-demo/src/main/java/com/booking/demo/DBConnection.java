package com.booking.demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class DBConnection {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println( "Hello Connection!" );
		//声明Connection对象
		 Connection con;
		//驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		//URL指向要访问的数据库名mydata
		String url = "jdbc:mysql://127.0.0.1:3306/booking";
		//MySQL配置时的用户名
		String user = "root";
		//MySQL配置时的密码
		String password = "QAZwsx123!@#";
		try {
		//加载驱动程序
		Class.forName(driver);
		//1.getConnection()方法，连接MySQL数据库！！
		con = (Connection) DriverManager.getConnection(url,user,password);
		if(!con.isClosed())
		System.out.println("Succeeded connecting to the Database!");
		//2.创建statement类对象，用来执行SQL语句！！
		Statement statement = (Statement) con.createStatement();
		//要执行的SQL语句
		delete(con);
		insert(con);
		update(con);
		
		
		String sql = "select * from users";
		//3.ResultSet类，用来存放获取的结果集！！
		ResultSet rs = statement.executeQuery(sql);
		System.out.println("-----------------");
		System.out.println("执行结果如下所示:");  
		System.out.println("-----------------");  
		System.out.println("id" + "\t" + "姓名" + "\t" + "密码");  
		System.out.println("-----------------");  
		 
		String username = null;
		String id = null;
		String pwd = null;
		
		
		while(rs.next()){
		    //获取username这列数据
		     username = rs.getString("username");
		    //获取id这列数据
		    id = rs.getString("id");
		    //获取password密码
		     pwd = rs.getString("password");
		    //输出结果
		    System.out.println(id + "\t" + username + "\t" + pwd);
		}
		rs.close();
		con.close();
		         } catch(ClassNotFoundException e) {   
		//数据库驱动类异常处理
		System.out.println("Sorry,can`t find the Driver!");   
		e.printStackTrace();   
		} catch(SQLException e) {
		//数据库连接失败异常处理
		e.printStackTrace();  
		}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		         }finally{
		System.out.println("数据库数据成功获取！！");
		         }
		

	}

	protected static void insert(Connection con) throws SQLException{
		System.out.println("/*");
		System.out.println("insert data from here!");
		System.out.println("*/");
		String name;
		String id;
		String password;
		
		PreparedStatement psql;
		ResultSet res;
		//预处理添加数据，其中有两个参数--“？”
		psql = (PreparedStatement) con.prepareStatement("insert into users (id,username,password) " + "values(?,?,?)");
		psql.setInt(1, 6);  //设置参数1，创建id为2的数据
		psql.setString(2, "user6"); //设置参数2，name 为user1
		psql.setString(3, "4567");
		psql.executeUpdate();//执行更新	;
	}
	
	protected static void update(Connection con) throws SQLException{
		System.out.println("/*");
		System.out.println("update data from here!");
		System.out.println("*/");
		PreparedStatement psql;
		//预处理更新（修改）数据，change the password of user4 to 909090
		psql = (PreparedStatement) con.prepareStatement("update users set password = ? where username = ?");
		psql.setString(1,"909090");      
		psql.setString(2,"user6");             
		psql.executeUpdate();
	}
	
	protected static void delete(Connection con) throws SQLException{
		System.out.println("/*");
		System.out.println("delete data from here!");
		System.out.println("*/");
		PreparedStatement psql;
		//预处理删除数据
		psql = (PreparedStatement) con.prepareStatement("delete from users where username = ?");
		psql.setString(1, "user6");
		psql.executeUpdate();
		psql.close();
	}
}

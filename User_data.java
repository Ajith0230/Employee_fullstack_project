package dao_Emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto_emp.User;

public class User_data {
	
	static String ref= "emp0230";
	public static Connection connection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//not necessary
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","root");
		return con;
	}
	
	public static int insertData(User user) throws ClassNotFoundException, SQLException
	{
		if(user.getCode().equals(ref))
		{
		Connection con = connection();
		
		PreparedStatement pst = con.prepareStatement("insert into emptable values(?,?,?,?,?,?)");
		
		
		pst.setInt(1,user.getUserid());
		pst.setString(2, user.getUsername());
		pst.setString(3, user.getUsermail());
		pst.setLong(4, user.getUsercontact());
		pst.setString(5, user.getUserpassword());
		
		int result =pst.executeUpdate();
		return result;
		}
		else
		{
			return 0;
		}
		
	}
	
	public static User mailcheck(String email) throws ClassNotFoundException, SQLException
	{
		Connection con = connection();
		PreparedStatement pst = con.prepareStatement("select useremail,userpassword from emptable where useremail = ?");
		
		pst.setString(1, email);
		
		ResultSet rs = pst.executeQuery();
		
		if(rs.next())
		{
			User user = new User();
			user.setUsermail(rs.getString(1));
			user.setUserpassword(rs.getString(2));
			
			return user;
		}
		else
		{
			return null;
		}
	}
}

	
package Controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto_emp.User;
import dao_Emp.*;

@WebServlet("/data")
public class DataInsert extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = new User();
		user.setUserid(Integer.parseInt(req.getParameter("id")));
		user.setUsername((String)req.getParameter("name"));
		user.setUsermail((String)req.getParameter("email"));
		user.setUsercontact(Long.parseLong(req.getParameter("contact")));
		user.setUserpassword((String)req.getParameter("password"));
		user.setCode(req.getParameter("code"));
		
		try {
			User_data user_data = new User_data();
			int result =user_data.insertData(user);
			if(result>0)
			{
			resp.getWriter().print(result + " row added");
			}
			else
			{
				resp.getWriter().print("wrong reference code");
			}
		} catch (ClassNotFoundException | SQLException e) 
			{
			e.printStackTrace();
			resp.getWriter().print(e.toString());;
		}
	}

}

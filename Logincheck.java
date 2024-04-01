package Controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao_Emp.User_data;
import dto_emp.User;

@WebServlet("/logincheck")
public class Logincheck extends HttpServlet{

	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			User_data  userdata =  new User_data();
			try {
				User user = userdata.mailcheck(email);
				
				if(user!=null)
				{
					if(user.getUserpassword().equals(password))
					{
						resp.sendRedirect("home.jsp");
					}
					else
					{
						req.setAttribute("message", "wrong password");
						resp.sendRedirect("login.jsp");
					}
				}
				else
				{
					req.setAttribute("message", "wrong email");
					resp.sendRedirect("login.jsp");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

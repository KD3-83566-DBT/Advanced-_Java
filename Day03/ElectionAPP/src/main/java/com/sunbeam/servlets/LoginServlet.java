package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.User;

//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		processRequest(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		processRequest(req,resp);
	}
	

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) {
		String email=req.getParameter("email");
		String passwd=req.getParameter("passwd");
		try(UserDao userDao=new UserDaoImpl()){
			 User user=userDao.findByEmail(email);
			 if(user != null && user.getPassword().equals(passwd)){
				Cookie c = new Cookie("uname",user.getFirstName());
				 c.setMaxAge(3600);
				 resp.addCookie(c);
				 HttpSession session=req.getSession();
				 session.setAttribute("curuser", user);
				 System.out.println("Login Success:"+user);
				 if(user.getRole().equals("voter")) { // voter login
					 resp.sendRedirect("candList");
					// System.out.println("if");
//					 String reUrl = resp.encodeRedirectURL("candlist");
//					 resp.sendRedirect(reUrl);
				 }
				 else {
					 System.out.println("Admin");
					 resp.sendRedirect("result");
				 }
			 }
			 else {
				 resp.setContentType("text/html");
				 PrintWriter out= resp.getWriter();
				 out.println("<html");
				 out.println("<head>");
				 out.println("<title> Login Failed </title>");
				 out.println("</head>");
				 out.println("<body>");
				 out.println("Invalied email and Password. <br></br>");
				 out.println("<a href='index.html'>Login Again</a>");
				 out.println("</body>");
				 out.println("</html>");
			 }
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}







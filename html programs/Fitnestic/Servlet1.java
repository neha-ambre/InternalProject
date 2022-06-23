package loginpkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		String n=req.getParameter("et1");
		String p=req.getParameter("p1");
		
		Cookie ck1=new Cookie("email",n);
		res.addCookie(ck1);
		Cookie ck2=new Cookie("pass",p);
		res.addCookie(ck2);
		res.sendRedirect("servlet2");
		
		
	}
}

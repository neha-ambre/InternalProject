package loginpkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		String email,pass;
		Cookie ck[]=req.getCookies();
		email=ck[0].getValue();
		pass=ck[1].getValue();
		if(pass.contentEquals("neha@123"))
			pw.print("Welcome "+email);
		else 
			pw.print("Wrong password try again.");
	}

}

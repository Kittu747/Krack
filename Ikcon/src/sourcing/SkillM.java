package sourcing;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SkillM extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{

		String firstname = req.getParameter("Fname");
		String lastname = req.getParameter("Lname");
		String ssn = req.getParameter("ssn");
		String contact = req.getParameter("contact");
		String skype = req.getParameter("skype");
		String mail = req.getParameter("mail");
		String totalxp = req.getParameter("totalexp");
		String usxp = req.getParameter("usexp");
		String legalstatus = req.getParameter("visa");
		String visaexpirydate = req.getParameter("expiredate");
		String likedin = req.getParameter("linked");
		String availability = req.getParameter("avail");
		String relocation = req.getParameter("relo");
		String currentloaction = req.getParameter("currentlo");
		
		HttpSession session=req.getSession();
		session.setAttribute("Fname",firstname);
		session.setAttribute("Lname",lastname);
		session.setAttribute("ssn",ssn);
		session.setAttribute("contact",contact);
		session.setAttribute("skype",skype);
		session.setAttribute("mail",mail);
		session.setAttribute("totalexp",totalxp);
		session.setAttribute("usexp",usxp);
		session.setAttribute("visa",legalstatus);
		session.setAttribute("expiredate",visaexpirydate);
		session.setAttribute("linked",likedin);
		session.setAttribute("avail",availability);
		session.setAttribute("relo",relocation);
		session.setAttribute("currentlo",currentloaction);
		
		RequestDispatcher rd=req.getRequestDispatcher("index1.html");
		
		rd.forward(req, res);
		
		//res.sendRedirect("index1.html");  
	}
}
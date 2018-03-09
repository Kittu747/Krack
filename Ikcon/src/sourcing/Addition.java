package sourcing;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Addition extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		String emptype = req.getParameter("emptype");
		String empmail = req.getParameter("empmail");
		String empcontact = req.getParameter("empcontact");
		String empwebsite = req.getParameter("empurl");
		String ref1name = req.getParameter("R1name");
		String ref1designation = req.getParameter("R1designation");
		String ref1mail = req.getParameter("R1mail");	
		String ref1contact = req.getParameter("R1contact");
		String contacttype1 = req.getParameter("proper");
		String ref2name = req.getParameter("R2name");
		String ref2designation = req.getParameter("R2designation");
		String ref2mail = req.getParameter("R2mail");
		String ref2contact = req.getParameter("R2contact");
		String contacttype2 = req.getParameter("optional");
		
		HttpSession session=req.getSession();
		session.setAttribute("emptype",emptype);
		session.setAttribute("empmail",empmail);
		session.setAttribute("empcontact",empcontact);
		session.setAttribute("empurl",empwebsite);
		session.setAttribute("R1name",ref1name);
		session.setAttribute("R1designation",ref1designation);
		session.setAttribute("R1mail",ref1mail);
		session.setAttribute("R1contact",ref1contact);
		session.setAttribute("proper",contacttype1);
		session.setAttribute("R2name",ref2name);
		session.setAttribute("R2designation",ref2designation);
		session.setAttribute("R2mail",ref2mail);
		session.setAttribute("R2contact",ref2contact);
		session.setAttribute("optional",contacttype2);
		
		RequestDispatcher rd=req.getRequestDispatcher("index2.html");
		rd.forward(req, res);
		
		//res.sendRedirect("index2.html");  
	}
}
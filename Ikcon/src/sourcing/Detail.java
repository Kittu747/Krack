package sourcing;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Detail extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		HttpSession session = req.getSession();
		String firstname=(String)session.getAttribute("Fname");
		String lastname=(String)session.getAttribute("Lname");
		String ssn=(String)session.getAttribute("ssn");
		String contact=(String)session.getAttribute("contact");
		String skype=(String)session.getAttribute("skype");
		String mail=(String)session.getAttribute("mail");
		String totalxp=(String)session.getAttribute("totalexp");
		String usxp=(String)session.getAttribute("usexp");
		String legalstatus=(String)session.getAttribute("visa");
		String visaexpirydate=(String)session.getAttribute("expiredate");
		String likedin=(String)session.getAttribute("linked");
		String availability=(String)session.getAttribute("avail");
		String relocation=(String)session.getAttribute("relo");
		String currentloaction=(String)session.getAttribute("currentlo");
		String emptype=(String)session.getAttribute("emptype");
		String empmail=(String)session.getAttribute("empmail");
		String empcontact=(String)session.getAttribute("empcontact");
		String empwebsite=(String)session.getAttribute("empurl");
		String ref1name=(String)session.getAttribute("R1name");
		String ref1designation=(String)session.getAttribute("R1designation");
		String ref1mail=(String)session.getAttribute("R1mail");
		String ref1contact=(String)session.getAttribute("R1contact");
		String contacttype1=(String)session.getAttribute("proper");
		String ref2name=(String)session.getAttribute("R2name");
		String ref2designation=(String)session.getAttribute("R2designation");
		String ref2mail=(String)session.getAttribute("R2mail");
		String ref2contact=(String)session.getAttribute("R2contact");
		String contacttype2=(String)session.getAttribute("optional");
		String bgv = req.getParameter("bgv");
		String ikc = req.getParameter("Ikc");
		
		
		PrintWriter out = res.getWriter();
		out.println("<b><br><br>Thanks for providing the details. We will keep updating you, no sooner we get from the client and good luck for your job search !!! <b>");
			

		String query = "insert into consultantinfo(First_Name, Last_Name, Last_4_Digits_of_SSN, Contact, Skype_ID, Email, Total_Experience_Years, US_Experience, Legal_Working_Status_in_US, Visa_Expiry_Date, Consultant_LinkedIn, Avalability, Relocation, CurrentLocation, Employment_Type, Employer_Email, Employer_Contact, Employer_Website, References1_Name, References1_Designation, References1_Email, References1_Contact, Contact1_Type, References2_Name, References2_Designation, References2_Email, References2_Contact, Contact2_Type, Undergone_3rdparty_BGV, Previously_worked_with_IKCON) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/consultants","root","root");
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,firstname);
		st.setString(2,lastname);
		st.setString(3,ssn);
		st.setString(4,contact);
		st.setString(5,skype);
		st.setString(6,mail);
		st.setString(7,totalxp);
		st.setString(8,usxp);
		st.setString(9,legalstatus);
		st.setString(10,visaexpirydate);
		st.setString(11,likedin);
		st.setString(12,availability);
		st.setString(13,relocation);
		st.setString(14,currentloaction);
		st.setString(15,emptype);
		st.setString(16,empmail);
		st.setString(17,empcontact);
		st.setString(18,empwebsite);
		st.setString(19,ref1name);
		st.setString(20,ref1designation);
		st.setString(21,ref1mail);
		st.setString(22,ref1contact);
		st.setString(23,contacttype1);
		st.setString(24,ref2name);
		st.setString(25,ref2designation);
		st.setString(26,ref2mail);
		st.setString(27,ref2contact);
		st.setString(28,contacttype2);
		st.setString(29,bgv);
		st.setString(30,ikc);
		
		st.executeUpdate();
		
		st.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}
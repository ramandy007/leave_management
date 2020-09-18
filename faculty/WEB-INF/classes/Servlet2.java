
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import java.sql.*;
import javax.servlet.http.*;  

public class Servlet2 extends  HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		Connection con=null;
		Statement stm=null;
		ResultSet rs=null;
		
		String pw=req.getParameter("pw");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3310/leave_app","leave_approval","root123");
			
                              HttpSession session=req.getSession(false);  
                           String n=(String)session.getAttribute("uname"); 
			String query="update dummy_table set password='"+pw+"' where fac_id='"+un+"'";
			stm=con.createStatement();
			rs=stm.executeQuery(query);
                       
			int flag=0;
			while(rs.next())
			{
                             RequestDispatcher rd=req.getRequestDispatcher("/home.html");  
			       rd.forward(req,res);
				flag=1;
			}
			if(flag==0)
			{
				
			
			        RequestDispatcher rd=req.getRequestDispatcher("/index.html");  
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert('Invalid Credentials ');");
                                     out.println("</script>");
			            rd.include(req,res); 	  
			}
			    
		}
		catch(ClassNotFoundException e)
		{
			out.println(e);
		}
		catch(SQLException e)
		{
			out.println(e);
		}
		finally
		{
			try
			{
				rs.close();
				stm.close();
				con.close();
			}
			catch(SQLException e)
			{
				out.println(e);
			}
		}
		
	}
}
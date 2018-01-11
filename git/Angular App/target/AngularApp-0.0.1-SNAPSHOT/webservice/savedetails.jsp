<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="dbconfig.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save details</title>
</head>
<body>
<%
     
		String fullname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String gendor=request.getParameter("gendor");
		String nationality=request.getParameter("nationality");
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("password");
		
		
		
		String sql="insert into user values(?,?,?,?,?,?,?,?)";
		ps=con.prepareStatement(sql);
	
		ps.setString(1,fullname);
		ps.setString(2,email);
		ps.setString(3,phone);
		ps.setString(4,address);
		ps.setString(5,gendor);
		ps.setString(6,nationality);
		ps.setString(7,uname);
		ps.setString(8,pwd);
		
		int n=ps.executeUpdate();
		if(n>0)
		{
			out.println("<html><body>");
			out.println("<font color='steelblue'>Data Inserted successfully</font>");
			out.println("</body></html>");
		}
		else
		{
			out.println("Data failed to insert");
		}
		

%>
</body>
</html>
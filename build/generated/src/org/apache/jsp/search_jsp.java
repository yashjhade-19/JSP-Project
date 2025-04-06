package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menudemo3.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"abc.css?v=3\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("<div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li> Home </li>\n");
      out.write("<li> <a href=\"insert.jsp\"> Insert </a></li>\n");
      out.write("<li> <a href=\"search.jsp\"> Search </a></li>\n");
      out.write("<li> <a href=\"ShowAll.jsp\"> ShowAll </a></li>\n");
      out.write("<li> <a href=\"update.jsp\"> Update </a></li>\n");
      out.write("<li> <a href=\"delete.jsp\"> Delete </a></li>\n");
      out.write("<li> <a href=\"login.jsp\"> logOut </a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"mydata\">\n");
      out.write("<center>\n");
      out.write("<form action=\"search.jsp\">\n");
      out.write("    \n");
      out.write("<table cellpadding=\"12\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> Enter RNO </td>\n");
      out.write("<td> <input type=\"text\" name=\"u1\" id=\"t1\" placeholder=\"Enter rno..\"> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"> <input type=\"submit\" name=\"b1\" class=\"B\" value=\"search..\"> </th>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</form>\n");

String s1=request.getParameter("b1");
if(s1!=null)
{
    String s11=request.getParameter("u1");
try
{
Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql:///jspproject?useSSL=false&allowPublicKeyRetrieval=true","root","yjserver19");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from insmarks where URNO='"+s11+"' ");
if(rs.next())
{

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"1\" cellpadding=\"10\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Subject 1</th>\n");
      out.write("                    <td>");
      out.print( rs.getString(1) );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Subject 2</th>\n");
      out.write("                    <td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("                 <tr>\n");
      out.write("                    <th>Subject 3</th>\n");
      out.write("                    <td>");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                   \n");
}
else
{
      out.write('\n');
      out.print( "invalid RNO." );
      out.write('\n');
    
}
}
catch(Exception e)
{
    out.println(e);
} }   

      out.write("\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menudemo1.jsp");
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"abc.css?v=2\"/>\n");
      out.write("<script>\n");
      out.write("function validation()\n");
      out.write("    {\n");
      out.write("        var name=document.getElementById(\"t1\").value.trim();\n");
      out.write("        var pass=document.getElementById(\"t2\").value.trim();\n");
      out.write("        var nameErr=document.getElementById(\"nameErr\");\n");
      out.write("        var passErr=document.getElementById(\"passErr\");\n");
      out.write("        \n");
      out.write("        nameErr.innerHTML=\"\";\n");
      out.write("        passErr.innerHTML=\"\";\n");
      out.write("        \n");
      out.write("        if(name.length <3)\n");
      out.write("        {\n");
      out.write("           nameErr.innerHTML=\"Username must be atleast 3 Characters\";\n");
      out.write("           return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        if(pass.length <3)\n");
      out.write("        {\n");
      out.write("           passErr.innerHTML=\"Password must be atleast 3 Characters\";\n");
      out.write("           return false;\n");
      out.write("        }\n");
      out.write("    return true;\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("<div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li> Home </li>\n");
      out.write("<li> <a href=\"login.jsp\"> Login </a></li>\n");
      out.write("<li>  <a href=\"register.jsp\"> Registration </a></li>\n");
      out.write("<li> About </li>\n");
      out.write("<li> Contact </li>\n");
      out.write("</ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("<div id=\"mydata\">\n");
      out.write("<center>\n");
 
String s11=request.getParameter("s1");
if(s11!=null)
{

      out.write("\n");
      out.write("<span class=\"error\">\n");
      out.write("    \n");
      out.print(s11);
      out.write("\n");
      out.write("</span>\n");
}
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<form action=\"login1.jsp\"  onsubmit=\"return validation()\" method=\"post\">\n");
      out.write("<table cellpadding=\"12\">\n");
      out.write("<caption > Login Page </caption>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> Enter Name </td>\n");
      out.write("<td> <input type=\"text\" name=\"u1\" class=\"c1\" id=\"t1\" placeholder=\"Enter name..\" onkeyup=\"validation()\">\n");
      out.write("      <br><span id=\"nameErr\" class=\"error\"></span> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> Enter Password </td>\n");
      out.write("<td> <input type=\"password\" name=\"u2\" class=\"c1\" id=\"t2\" placeholder=\"Enter password..\" onkeyup=\"validation()\"> \n");
      out.write("   <br><span id=\"passErr\" class=\"error\"></span>  </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"> <input type=\"submit\" class=\"B\" value=\"Login\"> </th>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html> \n");
      out.write("\n");
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

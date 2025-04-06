package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registask_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script >\n");
      out.write("    function uname()\n");
      out.write("{\n");
      out.write("var x=document.getElementById(\"t1\").value;\n");
      out.write("if(x.length>=3){return true;}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("document.getElementById('s1').innerHTML=\"invalid username length\";\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("function upass()\n");
      out.write("{\n");
      out.write("var x=document.getElementById(\"t2\").value;\n");
      out.write("if(x.length>=3){return true;}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("document.getElementById('s2').innerHTML=\"invalid username length\";\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function demo()\n");
      out.write("{\n");
      out.write("document.getElementById('s1').innerHTML=\"\";\n");
      out.write("document.getElementById('s2').innerHTML=\"\";\n");
      out.write("if(uname() && upass())\n");
      out.write("{\n");
      out.write("form1.submit();\n");
      out.write("}}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("     ");
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
      out.write("<form action=\"register1.jsp\"  name=\"form1\" >\n");
      out.write("<table cellpadding=\"12\">\n");
      out.write("<caption > Registration Page </caption>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> Enter Name </td>\n");
      out.write("<td> <input type=\"text\" name=\"un\" class=\"c1\" id=\"t1\" placeholder=\"Enter name..\" >\n");
      out.write("      <br><span id=\"s1\" class=\"error\"></span> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> Enter Password </td>\n");
      out.write("<td> <input type=\"text\" name=\"up\" class=\"c1\" id=\"t2\" placeholder=\"Enter password..\" > \n");
      out.write("   <br><span id=\"s2\" class=\"error\"></span>  </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> Enter C.N. </td>\n");
      out.write("<td> <input type=\"text\" name=\"ucn\" class=\"c1\" id=\"t3\" placeholder=\"Enter C.N...\"> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"> <input type=\"button\" onclick=\"demo()\" class=\"B\" value=\"insert..\"> </th>\n");
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

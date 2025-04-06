package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"abc.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
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
      out.write("    <center>\n");
      out.write("        <form action=\"insert1.jsp\" method=\"post\">\n");
      out.write("            <table cellpadding=\"12\">\n");
      out.write("       \n");
      out.write("                <caption > <h3> Enter Student Marks </h3> </caption>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter Roll No</td>\n");
      out.write("                    <td><input type=\"text\" name=\"roll_no\" id=\"t1\" placeholder=\"Enter RNo..\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" id=\"t1\" placeholder=\"Enter Name..\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter Subject 1</td>\n");
      out.write("                    <td><input type=\"text\" name=\"sub1\" required></td>\n");
      out.write("                    <td>Marks</td>\n");
      out.write("                    <td><input type=\"text\" name=\"marks1\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter Subject 2</td>\n");
      out.write("                    <td><input type=\"text\" name=\"sub2\" required></td>\n");
      out.write("                    <td>Marks</td>\n");
      out.write("                    <td><input type=\"text\" name=\"marks2\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter Subject 3</td>\n");
      out.write("                    <td><input type=\"text\" name=\"sub3\" required></td>\n");
      out.write("                    <td>Marks</td>\n");
      out.write("                    <td><input type=\"text\" name=\"marks3\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"4\"><input type=\"submit\" value=\"Insert\" class=\"B\"></th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

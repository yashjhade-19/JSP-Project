package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Main Page</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"abc.css\"/>\n");
      out.write(" <style>\n");
      out.write("       .button-container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 70vh;\n");
      out.write("            margin: 0;\n");
      out.write("            flex-direction: column;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .button-container {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            gap: 40px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write(" </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h2>Welcome to Marks Management System</h2>\n");
      out.write("    <div class=\"button-container\">\n");
      out.write("        <h4 style=\"color:white\" >Select Your Role</h4>\n");
      out.write("        <form action=\"login.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"Admin\" class=\"B\" style=\"font-size: 18px; padding: 12px 24px; width: 100px; height: 50px;\">\n");
      out.write("        </form>\n");
      out.write("        <form action=\"studentlogin.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"User\" class=\"B\" style=\"font-size: 18px; padding: 12px 24px; width: 100px; height: 50px;\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
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

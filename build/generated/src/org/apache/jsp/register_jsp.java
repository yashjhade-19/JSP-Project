package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Student Registration</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"abc.css?v=2\"/>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("   function validation() {\n");
      out.write("    var name = document.getElementById(\"name\").value.trim();\n");
      out.write("    var cn = document.getElementById(\"cn\").value.trim();\n");
      out.write("    var email = document.getElementById(\"email\").value.trim();\n");
      out.write("    var roll = document.getElementById(\"roll\").value.trim();\n");
      out.write("    var dob = document.getElementById(\"dob\").value;\n");
      out.write("    var pass = document.getElementById(\"password\").value.trim();\n");
      out.write("    var confirmPass = document.getElementById(\"confirmPassword\").value.trim();\n");
      out.write("    var address = document.getElementById(\"address\").value.trim();\n");
      out.write("\n");
      out.write("    var nameErr = document.getElementById(\"nameErr\");\n");
      out.write("    var cnErr = document.getElementById(\"cnErr\");\n");
      out.write("    var emailErr = document.getElementById(\"emailErr\");\n");
      out.write("    var rollErr = document.getElementById(\"rollErr\");\n");
      out.write("    var dobErr = document.getElementById(\"dobErr\");\n");
      out.write("    var passErr = document.getElementById(\"passErr\");\n");
      out.write("    var confirmPassErr = document.getElementById(\"confirmPassErr\");\n");
      out.write("    var addressErr = document.getElementById(\"addressErr\");\n");
      out.write("\n");
      out.write("    // Reset error messages\n");
      out.write("    nameErr.innerHTML = cnErr.innerHTML = emailErr.innerHTML = rollErr.innerHTML = dobErr.innerHTML =\n");
      out.write("    passErr.innerHTML = confirmPassErr.innerHTML = addressErr.innerHTML = \"\";\n");
      out.write("\n");
      out.write("    var valid = true;\n");
      out.write("\n");
      out.write("    // Name Validation (Only alphabets, min 3 chars)\n");
      out.write("    if (!/^[a-zA-Z ]{3,}$/.test(name)) {\n");
      out.write("        nameErr.innerHTML = \"Enter a valid name (min 3 alphabets)\";\n");
      out.write("        valid = false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Contact Number Validation (Exactly 10 digits)\n");
      out.write("    if (!/^\\d{10}$/.test(cn)) {\n");
      out.write("        cnErr.innerHTML = \"Contact No. must be exactly 10 digits\";\n");
      out.write("        valid = false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Email Validation\n");
      out.write("    if (!/^\\S+@\\S+\\.\\S+$/.test(email)) {\n");
      out.write("        emailErr.innerHTML = \"Enter a valid email\";\n");
      out.write("        valid = false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Roll Number Validation (Only digits, 5-10 length)\n");
      out.write("    if (!/^\\d{5,10}$/.test(roll)) {\n");
      out.write("        rollErr.innerHTML = \"Roll No. must be 5-10 digits\";\n");
      out.write("        valid = false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Date of Birth Validation (Must be in past)\n");
      out.write("    var today = new Date();\n");
      out.write("    var inputDate = new Date(dob);\n");
      out.write("    if (dob === \"\" || inputDate >= today) {\n");
      out.write("        dobErr.innerHTML = \"Enter a valid Date of Birth\";\n");
      out.write("        valid = false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Address Validation (Required, min 5 characters)\n");
      out.write("    if (address.length < 5) {\n");
      out.write("        addressErr.innerHTML = \"Address must be at least 5 characters\";\n");
      out.write("        valid = false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Password Validation (Min 6 chars, must include a number & special char)\n");
      out.write("    if (!/^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,}$/.test(pass)) {\n");
      out.write("        passErr.innerHTML = \"Password must be at least 6 chars, with a number & special character\";\n");
      out.write("        valid = false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Confirm Password Validation\n");
      out.write("    if (pass !== confirmPass) {\n");
      out.write("        confirmPassErr.innerHTML = \"Passwords do not match\";\n");
      out.write("        valid = false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Debugging: Log validation status\n");
      out.write("    console.log(\"Validation Status:\", valid);\n");
      out.write("\n");
      out.write("    return valid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        .error { color: red; font-size: 14px; }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("    <div id=\"mydata\">\n");
      out.write("    <center>\n");
      out.write("    <form action=\"register1.jsp\" onsubmit=\"return validation()\" method=\"post\">\n");
      out.write("    <table cellpadding=\"12\">\n");
      out.write("    <caption> Registration Page </caption>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>Enter Full Name</td>\n");
      out.write("        <td> <input type=\"text\" name=\"name\" id=\"name\" placeholder=\"Enter name..\">\n");
      out.write("        <br><span id=\"nameErr\" class=\"error\"></span></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>Enter Contact No.</td>\n");
      out.write("        <td> <input type=\"text\" name=\"cname\" id=\"cn\" placeholder=\"Enter C.N...\"> \n");
      out.write("        <br><span id=\"cnErr\" class=\"error\"></span></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>Enter Email</td>\n");
      out.write("        <td> <input type=\"text\" name=\"email\" id=\"email\" placeholder=\"Enter email..\">\n");
      out.write("        <br><span id=\"emailErr\" class=\"error\"></span></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>Enter Roll Number</td>\n");
      out.write("        <td> <input type=\"text\" name=\"roll\" id=\"roll\" placeholder=\"Enter roll no..\">\n");
      out.write("        <br><span id=\"rollErr\" class=\"error\"></span></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>Enter Date Of Birth</td>\n");
      out.write("        <td> <input type=\"date\" name=\"dob\" id=\"dob\">\n");
      out.write("        <br><span id=\"dobErr\" class=\"error\"></span></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>Enter Address</td>\n");
      out.write("        <td> <textarea name=\"address\" id=\"address\" placeholder=\"Enter address..\" required></textarea>\n");
      out.write("        <br><span id=\"addressErr\" class=\"error\"></span></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <tr>\n");
      out.write("        <td>Enter Password</td>\n");
      out.write("        <td> <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"Enter password..\"> \n");
      out.write("        <br><span id=\"passErr\" class=\"error\"></span></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>Re-enter Password</td>\n");
      out.write("        <td> <input type=\"password\" name=\"confirmPassword\" id=\"confirmPassword\" placeholder=\"Re-enter password..\"> \n");
      out.write("        <br><span id=\"confirmPassErr\" class=\"error\"></span></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <th colspan=\"2\"> <input type=\"submit\" class=\"B\" value=\"Register\"> </th>\n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("    </form>\n");
      out.write("    </center>\n");
      out.write("    </div>\n");
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

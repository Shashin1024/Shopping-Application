package org.apache.jsp.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ClientRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <title>SB Admin - Start Bootstrap Template</title>\n");
      out.write("  <!-- Bootstrap core CSS-->\n");
      out.write("  <link href=\"../css/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  <link href=\"../css/vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("  <link href=\"../css/css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-dark\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"card card-register mx-auto mt-5\">\n");
      out.write("        <div class=\"card-header\"><h3><b>Register an Account</b></h3></div>\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <form action=\"../ClientRegister\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("              <label for=\"exampleInputName\"><b>National ID number</b></label>\n");
      out.write("                <input class=\"form-control\" name=\"nic\" id=\"exampleInputName\" type=\"text\" aria-describedby=\"nameHelp\" placeholder=\"Enter university ID\" required>\n");
      out.write("                <br>\n");
      out.write("            <label for=\"exampleInputEmail1\"><b>First Name</b></label>\n");
      out.write("            <input class=\"form-control\" name=\"firstname\" id=\"exampleInputEmail1\" type=\"text\" aria-describedby=\"emailHelp\" placeholder=\"Enter your first name\" required>\n");
      out.write("            \n");
      out.write("                <br>\n");
      out.write("            <label for=\"exampleInputEmail1\"><b>Last Name</b></label>\n");
      out.write("            <input class=\"form-control\" name=\"lastname\" id=\"exampleInputEmail1\" type=\"text\" aria-describedby=\"emailHelp\" placeholder=\"Enter last name\" required>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <label for=\"exampleInputPassword1\"><b>Email</b></label>\n");
      out.write("                <input class=\"form-control\" name=\"email\" id=\"exampleInputPassword1\" type=\"text\" placeholder=\"Email\" required>\n");
      out.write("                <br>\n");
      out.write("            <label for=\"exampleInputPassword1\"><b>Password</b></label>\n");
      out.write("                <input class=\"form-control\" name=\"password\" id=\"exampleInputPassword1\" type=\"password\" placeholder=\"Password\" required>\n");
      out.write("                \n");
      out.write("            <label for=\"exampleInputPassword1\"><b>Card Number</b></label>\n");
      out.write("                <input class=\"form-control\" name=\"cardno\" id=\"exampleInputPassword1\" type=\"cardno\" placeholder=\"Credit Card Number\" required>\n");
      out.write("                    \n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("      \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <input class=\"btn btn-primary btn-block\" type=\"submit\" value=\"Register\" />\n");
      out.write("        </form>\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("          <a class=\"d-block small mt-3\" href=\"\">Login Page</a>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- Bootstrap core JavaScript-->\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <!-- Core plugin JavaScript-->\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .fa {\n");
      out.write("                padding: 20px;\n");
      out.write("                font-size: 30px;\n");
      out.write("                width: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("            .fa:hover {\n");
      out.write("               opacity: 0.7;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <hr>\n");
      out.write("        <div style=\"float: bottom;\">\n");
      out.write("        <div style=\"height: 100px;width: 100%;\">\n");
      out.write("            <div style=\"height: 100px;width: 45%;float: left;\">\n");
      out.write("                <h3>Made with &#9749 and &#9834 by Pakhi Gupta</h3>\n");
      out.write("            </div>\n");
      out.write("            <div style=\" height: 100px;width: 45%;float: right;\">\n");
      out.write("                \n");
      out.write("                <span style=\"font-family: sans-serif;font-size: 20px;\"><strong>Connect with us :</strong></span>\n");
      out.write("                <a href=\"https://www.facebook.com/\" class=\"fa fa-facebook\"></a>\n");
      out.write("                <a href=\"https://twitter.com/\" class=\"fa fa-twitter\"></a>\n");
      out.write("                <a href=\"https://www.instagram.com/\" class=\"fa fa-instagram\"></a>\n");
      out.write("                <br><span style=\"font-family: sans-serif;font-size: 15px; color: black;\">\n");
      out.write("                    <a href=\"about.jsp\">About</a> \n");
      out.write("                        &#9829;\n");
      out.write("                        <a href=\"feedback.jsp\">Feedback</a>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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

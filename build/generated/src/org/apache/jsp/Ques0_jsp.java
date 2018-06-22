package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Ques0_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"res/w3.css\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>:Level 0</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(\"images/playwall.jpeg\");\n");
      out.write("            }\n");
      out.write("            #code {\n");
      out.write("                margin-top: 100px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body align=\"center\">\n");
      out.write("        <!-- Since you were smart enough to look here for hints, let us give you the answer for Level 0.\n");
      out.write("             'Sherlock'-->\n");
      out.write("        <img src=\"images/scan this code.jpeg\" alt='' id=\"code\" height=\"200px\" width=\"200px\">\n");
      out.write("        <br><form method=\"post\"><input type=\"text\" name =\"ans\" >\n");
      out.write("        <br><input type=\"submit\" name=\"submit\"></form>\n");
      out.write("        ");

            if(request.getParameter("submit")!=null)
            {
                String ans = request.getParameter("ans");
                ans=ans.toLowerCase();
                ans=ans.trim();
                String query  = "select answer from Answers where questionNumber = 0";
                ResultSet rs = jdbc.DAOLayer.selectData(query);
                rs.next();
                if(ans.equals(rs.getString(1)))
                {
                    out.print("<h3>Correct Answer!</h3>");
                    String username = session.getAttribute("username").toString();
                    String updateQuestion = "update Login set questionNumber = 1 where username = '"+username +"'";
                    jdbc.DAOLayer.updateData(updateQuestion);
                    
      out.write("\n");
      out.write("                    <script type=\"text/javascript\"> window.onload = call; </script>\n");
      out.write("                    <script>\n");
      out.write("                        function call(){\n");
      out.write("                        alert(\"Level Crossed!\");\n");
      out.write("                    }\n");
      out.write("                    </script>\n");
      out.write("                    ");

                    response.sendRedirect("Ques1.jsp?What_is_the_time?");
                }
                else
                {
                    out.print("<h3>Oops! Try Harder.</h3>");
                }
            }
        
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import org.hibernate.Session;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"res/w3.css\">\n");
      out.write("        <style>\n");
      out.write("            .menu {\n");
      out.write("                list-style-type: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: darkgrey;\n");
      out.write("                \n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("            li a {\n");
      out.write("                font-family: cursive;\n");
      out.write("                display: block;\n");
      out.write("                color: #4d4d4d;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a:hover {\n");
      out.write("                background-color: #111111;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Online Treasure Hunt</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                \n");
      out.write("                ");
 if (session.getAttribute("user")!=null) {
      out.write("\n");
      out.write("                <li style=\"float: right;\"><a href=\"logout.jsp\">Logout</a></li> ");
 }
                  else { 
      out.write("\n");
      out.write("                <li style=\"float: right;\"><a href=\"login.jsp\">Login</a></li> ");
 } 
      out.write("\n");
      out.write("                <li style=\"float: right;\"><a href=\"rules.jsp\">Rules</a></li>\n");
      out.write("                <li style=\"float: right;\"><a href=\"play.jsp\">Play</a></li>\n");
      out.write("                <li style=\"float: right;\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("               \n");
      out.write("                ");
 if(session.getAttribute("user")!=null) {
      out.write("\n");
      out.write("                ");
//check if already logged in
      out.write("\n");
      out.write("                <li style=\"float: left;\"><h2>Welcome ");
      out.print( session.getAttribute("user") );
      out.write("</h2></li>\n");
      out.write("                ");
 }
                else { 
      out.write("\n");
      out.write("                <li style=\"float: left;\"><h2>Welcome Guest User</h2></li> ");
 } 
      out.write("\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <style>\n");
      out.write("            #block {\n");
      out.write("                padding: 1%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"block\" style=\"float: left; height: 500px; width: 45%;\">\n");
      out.write("            <div id=\"block\" style=\"float: left; height: 200px;width: 200px;\"><img src=\"images/sherlocked.png\"></div>\n");
      out.write("            <div id=\"block\" style=\"float: right;\"><h2 class=\"w3-black\">Online Treasure Hunt<h2></div>\n");
      out.write("            <div id=\"block\" style=\"float: left;\">This is a sample description!</div>\n");
      out.write("        </div> \n");
      out.write("        <div id=\"block\" style=\"float: right;height: 500px; width: 45%; margin-right: 10%; background: beige\">\n");
      out.write("            <table style=\"border: 1px solid balck;\" class=\"w3-black\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Rank</th>\n");
      out.write("                    <th>User Name</th>                    \n");
      out.write("                </tr>\n");
      out.write("                ");
 
                    String query = "select username from Login order by questionNumber desc";
                    ResultSet rs = jdbc.DAOLayer.selectData(query);
                    int i=1;
                    while(rs.next())
                    {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td> ");
      out.print( i );
      out.write(" </td>\n");
      out.write("                            <td>");
      out.print( rs.getString(1) );
      out.write(" </td>\n");
      out.write("                        </tr>     \n");
      out.write("                    ");
}
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("            Leaderboard\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .fa {\n");
      out.write("                padding: 20px;\n");
      out.write("                font-size: 30px;\n");
      out.write("                width: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            };\n");
      out.write("            .fa:hover {\n");
      out.write("               opacity: 0.7;\n");
      out.write("            };\n");
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
      out.write("            <div style=\"height: 100px;width: 45%;float: left;background: darkgray;\">\n");
      out.write("                <h3>Made with &#9749 and &#9834 by Pakhi Gupta</h3>\n");
      out.write("            </div>\n");
      out.write("            <div style=\" height: 100px;width: 45%;float: right;background: darkgray;\">\n");
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

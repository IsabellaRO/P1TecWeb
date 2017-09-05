/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-09-05 01:17:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("  <!DOCTYPE html>\r\n");
      out.write("  <html>\r\n");
      out.write("    <head>\r\n");
      out.write("      <!--Import Google Icon Font-->\r\n");
      out.write("      <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("      <!--Import materialize.css-->\r\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\r\n");
      out.write("\r\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("      <!--Import jQuery before materialize.js-->\r\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col s12 m6\">\r\n");
      out.write("          <div class=\"card teal lighten-2\">\r\n");
      out.write("            <div class=\"card-content white-text\">\r\n");
      out.write("              <span class=\"card-title\">Card Title</span>\r\n");
      out.write("              <p>I am a very simple card. I am good at containing small bits of information.\r\n");
      out.write("              I am convenient because I require little markup to use effectively.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-action teal lighten-5\">\r\n");
      out.write("              <a href=\"#\">This is a link</a>\r\n");
      out.write("              <a href=\"#\">This is a link</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col s12 m5\">\r\n");
      out.write("        <div class=\"card-panel teal\">\r\n");
      out.write("          <span class=\"white-text\">I am a very simple card. I am good at containing small bits of information.\r\n");
      out.write("          I am convenient because I require little markup to use effectively. I am similar to what is called a panel in other frameworks.\r\n");
      out.write("          </span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("    <div class=\"card-content\">\r\n");
      out.write("      <p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"card-tabs\">\r\n");
      out.write("      <ul class=\"tabs tabs-fixed-width\">\r\n");
      out.write("        <li class=\"tab\"><a href=\"#test4\">Test 1</a></li>\r\n");
      out.write("        <li class=\"tab\"><a class=\"active\" href=\"#test5\">Test 2</a></li>\r\n");
      out.write("        <li class=\"tab\"><a href=\"#test6\">Test 3</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"card-content teal lighten-2\">\r\n");
      out.write("      <div id=\"test4\">Test 1</div>\r\n");
      out.write("      <div id=\"test5\">Test 2</div>\r\n");
      out.write("      <div id=\"test6\">Test 333</div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   \r\n");
      out.write("    </body>\r\n");
      out.write("  </html>\r\n");
      out.write("        ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

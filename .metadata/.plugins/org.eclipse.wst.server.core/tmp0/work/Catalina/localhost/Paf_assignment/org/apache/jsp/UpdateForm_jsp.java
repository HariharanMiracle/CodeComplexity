/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.39
 * Generated at: 2019-04-30 22:56:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- Favicon -->\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/core-img/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Stylesheet -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Preloader -->\r\n");
      out.write("    <div id=\"preloader\">\r\n");
      out.write("        <div class=\"loader\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /Preloader -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Header Area Start -->\r\n");
      out.write("    <header class=\"header-area\">\r\n");
      out.write("        <!-- Top Header Area Start -->\r\n");
      out.write("        <div class=\"top-header-area\">\r\n");
      out.write("            <div class=\"container h-100\">\r\n");
      out.write("                <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                    <div class=\"col-5\">\r\n");
      out.write("                        <div class=\"top-header-content\">\r\n");
      out.write("                            <p style = \"font-size: 20px;\"><b>Welcome to SELL '&' BUY!</b></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-7\">\r\n");
      out.write("                        <div class=\"top-header-content text-right\">\r\n");
      out.write("                            <p><i class=\"fa fa-clock-o\" aria-hidden=\"true\"></i> 24 hours service <span class=\"mx-2\"></span> | <span class=\"mx-2\"></span> <i class=\"fa fa-phone\" aria-hidden=\"true\"></i> Call us: (+12)-345-6789</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Top Header Area End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Main Header Start -->\r\n");
      out.write("        <div class=\"main-header-area\">\r\n");
      out.write("            <div class=\"classy-nav-container breakpoint-off\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <!-- Classy Menu -->\r\n");
      out.write("                    <nav class=\"classy-navbar justify-content-between\" id=\"akameNav\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Logo -->\r\n");
      out.write("                        <a class=\"nav-brand\" href=\"index.html\"><b><p style = \"color: Black; font-size: 30px;\">SELL '&' BUY :)</p></b></a>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Navbar Toggler -->\r\n");
      out.write("                        <div class=\"classy-navbar-toggler\">\r\n");
      out.write("                            <span class=\"navbarToggler\"><span></span><span></span><span></span></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Menu -->\r\n");
      out.write("                        <div class=\"classy-menu\">\r\n");
      out.write("                            <!-- Menu Close Button -->\r\n");
      out.write("                            <div class=\"classycloseIcon\">\r\n");
      out.write("                                <div class=\"cross-wrap\"><span class=\"top\"></span><span class=\"bottom\"></span></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Nav Start -->\r\n");
      out.write("                            <div class=\"classynav\">\r\n");
      out.write("                                <ul id=\"nav\">\r\n");
      out.write("                                    <li class=\"active\"><a href=\"./index.html\">Home</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Pages</a>\r\n");
      out.write("                                        <ul class=\"dropdown\">\r\n");
      out.write("                                            <li><a href=\"./index.html\">- Home</a></li>\r\n");
      out.write("                                            <li><a href=\"./about.html\">- About Us</a></li>\r\n");
      out.write("                                            <li><a href=\"./service.html\">- Services</a></li>\r\n");
      out.write("                                            <li><a href=\"./portfolio.html\">- Portfolio</a></li>\r\n");
      out.write("                                            <li><a href=\"./blog.html\">- Blog</a></li>\r\n");
      out.write("                                            <li><a href=\"./single-blog.html\">- Blog Details</a></li>\r\n");
      out.write("                                            <li><a href=\"./contact.html\">- Contact</a></li>\r\n");
      out.write("                                            <li><a href=\"#\">- Dropdown</a>\r\n");
      out.write("                                                <ul class=\"dropdown\">\r\n");
      out.write("                                                    <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">- Dropdown Item</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a href=\"./portfolio.html\">Portfolio</a></li>\r\n");
      out.write("                                    <li><a href=\"./service.html\">Services</a></li>\r\n");
      out.write("                                    <li><a href=\"./about.html\">About Us</a></li>\r\n");
      out.write("                                    <li><a href=\"./blog.html\">Blog</a></li>\r\n");
      out.write("                                    <li><a href=\"./contact.html\">Contact</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Cart Icon -->\r\n");
      out.write("                                <div class=\"cart-icon ml-5 mt-4 mt-lg-0\">\r\n");
      out.write("                                    <a href=\"#\"><i class=\"icon_cart\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Book Icon -->\r\n");
      out.write("                                <div class=\"book-now-btn ml-5 mt-4 mt-lg-0 ml-md-4\">\r\n");
      out.write("                                   <a href=\"Logout.jsp\" onclick = \"AlertLogout()\" style = \"color: gold\"><b>Logout</b></a>\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Nav End -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- Header Area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Welcome Area Start -->\r\n");
      out.write("    <section class=\"welcome-area\">\r\n");
      out.write("        <div class=\"welcome-slides owl-carousel\">\r\n");
      out.write("            <!-- Single Welcome Slide -->\r\n");
      out.write("            <div class=\"single-welcome-slide bg-img\" style=\"background-image: url(img/bg-img/16.jpg);\">\r\n");
      out.write("                <!-- Welcome Content -->\r\n");
      out.write("                <div class=\"welcome-content h-100\">\r\n");
      out.write("                    <div class=\"container h-100\">\r\n");
      out.write("                        <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                            <!-- Welcome Text -->\r\n");
      out.write("                            <div class=\"col-12 col-md-9 col-lg-6\">\r\n");
      out.write("                                <div class=\"welcome-text\">\r\n");
      out.write("                                    <h2 data-animation=\"fadeInUp\" data-delay=\"100ms\">SELL '&' BUY <br> WAY TO THE BEST</h2>\r\n");
      out.write("                                    <p data-animation=\"fadeInUp\" data-delay=\"400ms\">âDiscover your own style. Don't try to repeat what has already been written - have the courage to do your own thing and don't be afraid to do something different.â</p>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn akame-btn\" data-animation=\"fadeInUp\" data-delay=\"700ms\">About Us</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Single Welcome Slide -->\r\n");
      out.write("            <div class=\"single-welcome-slide bg-img\" style=\"background-image: url(img/bg-img/16.jpg);\">\r\n");
      out.write("                <!-- Welcome Content -->\r\n");
      out.write("                <div class=\"welcome-content h-100\">\r\n");
      out.write("                    <div class=\"container h-100\">\r\n");
      out.write("                        <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                            <!-- Welcome Text -->\r\n");
      out.write("                            <div class=\"col-12 col-md-9 col-lg-6\">\r\n");
      out.write("                                <div class=\"welcome-text\">\r\n");
      out.write("                                    <h2 data-animation=\"fadeInUp\" data-delay=\"100ms\">SELL '&' BUY <br> WAY TO THE BEST</h2>\r\n");
      out.write("                                    <p data-animation=\"fadeInUp\" data-delay=\"400ms\">âDiscover your own style. Don't try to repeat what has already been written - have the courage to do your own thing and don't be afraid to do something different.â</p>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn akame-btn active\" data-animation=\"fadeInUp\" data-delay=\"700ms\">About Us</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Welcome Area End -->\r\n");
      out.write("\r\n");
      out.write("    <div style = \"margin-left: 10%; margin-top: 50px;\">\r\n");
      out.write("\t\t");

	String un=(String)session.getAttribute("un");
	if(un == null){
		String message = "Login First";
		String redirectURL = "http://localhost:8081/Paf_assignment/login.jsp?message="+message;
		response.sendRedirect(redirectURL);
	}
	
	String name=(String)session.getAttribute("un"); 
	String type = "";
	String address = "";
	String mailAddress = "";
	String contactNumber = "";
	String password = "";
	
	try{
		type = request.getParameter("type");
		address = request.getParameter("address");
		mailAddress = request.getParameter("mailAddress");
		contactNumber = request.getParameter("contactNumber");
		password = request.getParameter("password");
	}
	catch(Exception e){
		System.out.println("Error: " + e);
	}

		
      out.write("\r\n");
      out.write("\t\t<a href=\"Logout.jsp\" onclick = \"AlertLogout()\">Logout</a>\r\n");
      out.write("\t\t<a href=\"paf/member/myProfile?username=");
      out.print(name);
      out.write("\">My Account</a>\r\n");
      out.write("\t\t\t<form action = \"paf/member/updateMember\" method = \"POST\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"username\" value = \"");
      out.print(name );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t<h3>Type: ");
      out.print(type );
      out.write("\r\n");
      out.write("\t\t\t\t\t<select name = \"type\">\r\n");
      out.write("\t\t\t\t\t  <option value=\"Seller\">Seller</option>\r\n");
      out.write("\t\t\t\t\t  <option value=\"Buyer\">Buyer</option>\r\n");
      out.write("\t\t\t\t\t</select></h3>\r\n");
      out.write("\t\t\t\t<h3>Address: <input type=\"text\" name=\"address\" value = \"");
      out.print(address );
      out.write("\" required/></h3>\r\n");
      out.write("\t\t\t\t<h3>Mail Address: <input type=\"email\" name=\"mailAddress\" value = \"");
      out.print(mailAddress );
      out.write("\" required/></h3>\r\n");
      out.write("\t\t\t\t<h3>Contact Number: <input type=\"text\" name=\"contactNumber\" value = \"");
      out.print(contactNumber );
      out.write("\" required/></h3>\r\n");
      out.write("\t\t\t\t<input type = \"submit\" value = \"Submit\"/>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("<a href = \"Homepage.jsp\">Home page</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Footer Area Start -->\r\n");
      out.write("    <footer class=\"footer-area section-padding-80-0\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-between\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Footer Widget -->\r\n");
      out.write("                <div class=\"col-12 col-sm-6 col-md-4\">\r\n");
      out.write("                    <div class=\"single-footer-widget mb-80\">\r\n");
      out.write("                        <!-- Footer Logo -->\r\n");
      out.write("                        <a href=\"#\" class=\"footer-logo\"><b><p style = \"color: Black; font-size: 30px;\">SELL '&' BUY :)</p></b></a>\r\n");
      out.write("\r\n");
      out.write("                        <p class=\"mb-30\">We would love to serve you and let you enjoy your culinary experience. Excepteur sint occaecat cupidatat non proident.</p>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Copywrite Text -->\r\n");
      out.write("                        <div class=\"copywrite-text\">\r\n");
      out.write("                            <p> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | Credits for our <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> team <a href=\"https://colorlib.com\" target=\"_blank\">Sell '&' Buy</a>\r\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Footer Widget -->\r\n");
      out.write("                <div class=\"col-12 col-sm-6 col-md-4 col-xl-3\">\r\n");
      out.write("                    <div class=\"single-footer-widget mb-80\">\r\n");
      out.write("                        <!-- Widget Title -->\r\n");
      out.write("                        <h4 class=\"widget-title\">Local shipping service</h4>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Open Times -->\r\n");
      out.write("                        <div class=\"open-time\">\r\n");
      out.write("                            <p>Monday: Friday: 10.00 - 23.00</p>\r\n");
      out.write("                            <p>Saturday: 10.00 - 19.00</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Social Info -->\r\n");
      out.write("                        <div class=\"social-info\">\r\n");
      out.write("                            <a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                            <a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                            <a href=\"#\" class=\"google-plus\"><i class=\"fa fa-google-plus\"></i></a>\r\n");
      out.write("                            <a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Footer Widget -->\r\n");
      out.write("                <div class=\"col-12 col-md-4 col-xl-3\">\r\n");
      out.write("                    <div class=\"single-footer-widget mb-80\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Widget Title -->\r\n");
      out.write("                        <h4 class=\"widget-title\">Contact Us</h4>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Contact Address -->\r\n");
      out.write("                        <div class=\"contact-address\">\r\n");
      out.write("                            <p>Tel: (+12) 345 678 910</p>\r\n");
      out.write("                            <p>E-mail: SELL'N'BUY@gmail.com</p>\r\n");
      out.write("                            <p>Address: Iris Watson, P.O. Box 283 8562 Fusce Rd, NY</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- Footer Area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- All JS Files -->\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Popper -->\r\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- All Plugins -->\r\n");
      out.write("    <script src=\"js/akame.bundle.js\"></script>\r\n");
      out.write("    <!-- Active -->\r\n");
      out.write("    <script src=\"js/default-assets/active.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

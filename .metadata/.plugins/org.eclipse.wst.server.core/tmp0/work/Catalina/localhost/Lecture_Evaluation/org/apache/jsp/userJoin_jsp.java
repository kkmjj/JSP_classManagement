/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.47
 * Generated at: 2019-11-16 12:40:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userJoin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\t<meta charset=\"EUC-KR\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"with=device-width, initial-scale=1, shrink-to-fit=no\"> \r\n");
      out.write("\t<title>강의 평가 웹 사이트 </title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"./css/custom.css\">\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("\t<a class=\"navbar-brand\" href=\"index.jsp\">강의평가 </a>\r\n");
      out.write("\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar\">\r\n");
      out.write("\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t</button>\r\n");
      out.write("\t<div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"index.jsp\">메인</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t<a class=\"nav-link dropdown-toggle\" id=\"dropdown\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t회원관리\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"userLogin.jsp\">로그인</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item active\" href=\"userJoin.jsp\">회원가입</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"userLogout.jsp\">로그아웃</a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("\t\t<input class=\"form-control mr-sm-2\" type=\"search\"\r\n");
      out.write("\t\tplaceholder=\"내용을 입력하세요\" aria-label=\"Search\">\r\n");
      out.write("\t\t<button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">검색</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<section class=\"container mt-3\" style=\"max-width: 560px; \"><!-- mt-3 위쪽 여백 3 -->\r\n");
      out.write("\t<form method=\"post\" action=\"./userRegisterAction.jsp\"><!-- 로그인을 요청했을때 정보가 해당 jsp 로 넘어감 -->\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("\t\t<label>아이디</label>\r\n");
      out.write("\t\t<input type=\"text\" name=\"userID\" class=\"form-control\"> <!-- 부트스트랩 form-control class 디자인  -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("\t\t<label>비밀번호</label>\r\n");
      out.write("\t\t<input type=\"password\" name=\"userPassword\" class=\"form-control\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("\t\t<label>이메일</label>\r\n");
      out.write("\t\t<input type=\"email\" name=\"userEmail\" class=\"form-control\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<button type=\"submit\" class=\"btn btn-primary\">회원가입</button>\r\n");
      out.write("\t</form> \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<footer class=\"bg-dark mt-4 p-5 text-center\" style=\"color: #ffffff;\">@copyright 김민준</footer>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!-- 제이쿼리 추가  -->\r\n");
      out.write("<script src=\"./js/jquery.min.js\"> </script>\r\n");
      out.write("<script src=\"./js/pooper.js\"> </script>\r\n");
      out.write("<script src=\"./js/bootstrap.min.js\"> </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

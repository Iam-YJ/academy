/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-01-28 04:01:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JoinForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1579759462526L));
    _jspx_dependants.put("/Layout/Header.jsp", Long.valueOf(1579759461926L));
    _jspx_dependants.put("jar:file:/D:/1월%20스프링%20_%20박유진/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MyHome/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/Layout/Footer.jsp", Long.valueOf(1579759461919L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<script>\r\n");
      out.write("\tfunction checkJoin(){\r\n");
      out.write("\t\tif(document.join.id.value == \"\"){\r\n");
      out.write("\t\t\talert(\"아이디를 입력하십시오!\");\r\n");
      out.write("\t\t}else if(document.join.password.value == \"\"){\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력하십시오!\");\r\n");
      out.write("\t\t}else if(document.join.repw.value == \"\"){\r\n");
      out.write("\t\t\talert(\"비밀번호확인을 입력하십시오!\");\r\n");
      out.write("\t\t}else if(document.join.name.value == \"\"){\r\n");
      out.write("\t\t\talert(\"이름을 입력하십시오!\");\r\n");
      out.write("\t\t}else if(document.join.email.value == \"\"){\r\n");
      out.write("\t\t\talert(\"이메일을 입력하십시오!\");\r\n");
      out.write("\t\t}else if(document.join.tel1.value == \"\"){\r\n");
      out.write("\t\t\talert(\"전화번호를 입력하십시오!\");\r\n");
      out.write("\t\t}else if(document.join.tel2.value == \"\"){\r\n");
      out.write("\t\t\talert(\"전화번호를 입력하십시오!\");\r\n");
      out.write("\t\t}else if(document.join.tel3.value == \"\"){\r\n");
      out.write("\t\t\talert(\"전화번호를 입력하십시오!\");\r\n");
      out.write("\t\t}else if(document.join.password.value != document.join.repw.value){\r\n");
      out.write("\t\t\talert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.join.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t#header , .footer {\r\n");
      out.write("\t\tborder : 1px black solid;\r\n");
      out.write("\t\twidth : 600px;\r\n");
      out.write("\t\theight : 40px;\r\n");
      out.write("\t\tpadding-top : 12px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#main {\r\n");
      out.write("\t\twidth : 600px;\r\n");
      out.write("\t\tmin-height : 400px;\r\n");
      out.write("\t\tpadding-top : 15px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#border {\r\n");
      out.write("\t\tborder : 1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("\t#table {\r\n");
      out.write("\t\twidth: 450px;\r\n");
      out.write("\t\tborder : 1px solid black;\r\n");
      out.write("\t\tborder-spacing: 0px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#button{\r\n");
      out.write("\t\twidth : 450px;\r\n");
      out.write("\t\ttext-align: right;\r\n");
      out.write("\t\tpadding-top: 15px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#link{\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t}\r\n");
      out.write("\tth{\r\n");
      out.write("\t\tborder : 1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd{\r\n");
      out.write("\t\tborder : 1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("\ta{\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<div align=\"center\" id = \"header\"  >\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<a href = \"/MyHome/Board/BoardList.brd\" style=\"text-decoration: none;\">Board</a> | \r\n");
      out.write("\t\t\t<a href = \"/MyHome/Index.jsp\" style=\"text-decoration: none;\">Home</a>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t\t<div align=\"center\" id = \"main\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<form action=\"/MyHome/Member/CheckJoin.jsp\" method=\"post\" name = \"join\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>ID</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name = \"id\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>PW</td>\r\n");
      out.write("\t\t\t<td><input type=\"password\" name = \"password\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>rePW</td>\r\n");
      out.write("\t\t\t<td><input type=\"password\" name = \"repw\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Name</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name = \"name\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>E-Mail</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name = \"email\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>TEL</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<select name = \"tel1\">\r\n");
      out.write("\t\t\t\t\t<option value=\"010\">010</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"010\">011</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"010\">016</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"010\">019</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t-<input type=\"text\" size = \"5\" maxlength=\"4\" name = \"tel2\">\r\n");
      out.write("\t\t\t\t-<input type=\"text\" size = \"5\" maxlength=\"4\" name = \"tel3\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"right\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"Join\" onclick=\"javascript:checkJoin()\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"Reset\" onclick=\"document.join.reset()\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div align=\"center\" class = \"footer\">KimMinJun's Work copyright。</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /Layout/Header.jsp(54,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.login != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<a href = \"/MyHome/Member/MyPage.jsp\">MyPage</a> | \r\n");
          out.write("\t\t\t\t<a href = \"/MyHome/Login/Logout.jsp\" style=\"text-decoration: none;\">Logout</a> |\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /Layout/Header.jsp(58,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.login == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<a href = \"/MyHome/Login.do\">Login</a> | \r\n");
          out.write("\t\t\t\t<a href = \"/MyHome/Member/JoinForm.jsp\" style=\"text-decoration: none;\">Join</a> | \r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}

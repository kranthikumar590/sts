package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<java.lang.String>(4);
    _jspx_dependants.add("/WEB-INF/views/jsp-includes/css_files.jsp");
    _jspx_dependants.add("/WEB-INF/views/jsp-includes/js_files.jsp");
    _jspx_dependants.add("/WEB-INF/views/jsp-includes/top_navigation.jsp");
    _jspx_dependants.add("/WEB-INF/views/jsp-includes/left_navigation.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!-- <a href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" > Logout</a>  -->\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0\" />\n");
      out.write("\t<title>Dashboard</title>\n");
      out.write("\n");
      out.write("\t<!-- Include CSS files -->\n");
      out.write("\t");
      out.write("<!--=== CSS ===-->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- Favicon -->\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"icon\" type=\"image/x-icon\" />\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("\t<!-- jQuery UI -->\n");
      out.write("\t<!--<link href=\"plugins/jquery-ui/jquery-ui-1.10.2.custom.css\" rel=\"stylesheet\" type=\"text/css\" />-->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/jquery-ui/jquery.ui.1.10.2.ie.css\"/>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("\t<!-- Theme -->\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write(" \">\n");
      out.write("\t<!--[if IE 7]>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/fontawesome/font-awesome-ie7.min.css\">\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("\t<!--[if IE 8]>\n");
      out.write("\t\t<link href=\"assets/css/ie8.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t<![endif]-->\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Include JS files -->\n");
      out.write("\t");
      out.write("<!--=== JavaScript ===-->\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write("\" ></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f10(_jspx_page_context))
        return;
      out.write("\" ></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f11(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\t<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t\t<script src=\"assets/js/libs/html5shiv.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("\t<!-- Smartphone Touch Events -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f12(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f13(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f14(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\t<!-- General -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f15(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f16(_jspx_page_context))
        return;
      out.write("\"></script> <!-- Polyfill for min/max-width CSS3 Media Queries (only for IE8) -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f17(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f18(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f19(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Page specific plugins -->\n");
      out.write("\t<!-- Charts -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"plugins/flot/excanvas.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f20(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f21(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f22(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f23(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f24(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f25(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f26(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f27(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f28(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f29(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f30(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Noty -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f31(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f32(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f33(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Forms -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f34(_jspx_page_context))
        return;
      out.write("\" ></script> <!-- Styled radio and checkboxes -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f35(_jspx_page_context))
        return;
      out.write("\"></script> <!-- Styled select boxes -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f36(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Form Validation -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f37(_jspx_page_context))
        return;
      out.write(" \"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f38(_jspx_page_context))
        return;
      out.write(" \"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- DataTables -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f39(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f40(_jspx_page_context))
        return;
      out.write("\"></script> <!-- optional -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f41(_jspx_page_context))
        return;
      out.write("\"></script> <!-- optional -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f42(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- App -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f43(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f44(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f45(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t\"use strict\";\n");
      out.write("\n");
      out.write("\t\tApp.init(); // Init layout and core plugins\n");
      out.write("\t\tPlugins.init(); // Init all plugins\n");
      out.write("\t\tFormComponents.init(); // Init all form-specific plugins\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<!-- Demo JS -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f46(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f47(_jspx_page_context))
        return;
      out.write(" \"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f48(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f49(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f50(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$(\"#showSingleSchoolDetails\").click(function(){\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\talert(\"hi\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\tfunction madeAjaxCall(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype: \"post\",\n");
      out.write("\t\t\t\turl: \"http://localhost:8080/SpringExamples/employee/add.htm\",\n");
      out.write("\t\t\t\tcache: false,\t\t\t\t\n");
      out.write("\t\t\t\tdata:'school_id=' + $(\"#firstName\").val() + \"&lastName=\" + $(\"#lastName\").val() + \"&email=\" + $(\"#email\").val(),\n");
      out.write("\t\t\t\tsuccess: function(response){\n");
      out.write("\t\t\t\t\t$('#result').html(\"\");\n");
      out.write("\t\t\t\t\tvar obj = JSON.parse(response);\n");
      out.write("\t\t\t\t\t$('#result').html(\"First Name:- \" + obj.firstName +\"</br>Last Name:- \" + obj.lastName  + \"</br>Email:- \" + obj.email);\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror: function(){\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\talert('Error while request..');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<!-- Include top navigation -->\n");
      out.write("\t");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("\t<header class=\"header navbar navbar-fixed-top\" role=\"banner\">\n");
      out.write("\t\t<!-- Top Navigation Bar -->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Only visible on smartphones, menu toggle -->\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li class=\"nav-toggle\"><a href=\"javascript:void(0);\" title=\"\"><i class=\"icon-reorder\"></i></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<strong>Admin</strong>Panel\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<!-- /logo -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- Sidebar Toggler -->\n");
      out.write("\t\t\t<a href=\"#\" class=\"toggle-sidebar bs-tooltip\" data-placement=\"bottom\" data-original-title=\"Toggle navigation\">\n");
      out.write("\t\t\t\t<i class=\"icon-reorder\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<!-- /Sidebar Toggler -->\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t<!-- Top Right Menu -->\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- User Login Dropdown -->\n");
      out.write("\t\t\t\t<li class=\"dropdown user\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t<!--<img alt=\"\" src=\"assets/img/avatar1_small.jpg\" />-->\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-male\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"username\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-caret-down small\"></i>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"pages_user_profile.html\"><i class=\"icon-user\"></i> My Profile</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"pages_calendar.html\"><i class=\"icon-calendar\"></i> My Calendar</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-tasks\"></i> My Tasks</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      if (_jspx_meth_c_005furl_005f51(_jspx_page_context))
        return;
      out.write("\" ><i class=\"icon-key\"></i> Log Out</a></li>\n");
      out.write("\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<!-- /user login dropdown -->\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<!-- /Top Right Menu -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /top navigation bar -->\n");
      out.write("\n");
      out.write("\t\t<!--=== Project Switcher ===-->\n");
      out.write("\t\t<div id=\"project-switcher\" class=\"container project-switcher\">\n");
      out.write("\t\t\t<div id=\"scrollbar\">\n");
      out.write("\t\t\t\t<div class=\"handle\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div> <!-- /#project-switcher -->\n");
      out.write("\t</header> <!-- /.header -->");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t<div id=\"sidebar\" class=\"sidebar-fixed\">\n");
      out.write("\t\t\t<div id=\"sidebar-content\">\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<!-- Left Navigation -->\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("<!--=== Navigation ===-->\n");
      out.write("\t\t\t\t<ul id=\"nav\">\n");
      out.write("\t\t\t\t\t<li class=\"current\">\n");
      out.write("\t\t\t\t\t\t<a href=\"/StudentTrackingSystem/senior/homepage\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-dashboard\"></i>\n");
      out.write("\t\t\t\t\t\t\tDashboard\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"/StudentTrackingSystem/senior/addschool\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-group\"></i>\n");
      out.write("\t\t\t\t\t\t\tAdd New School\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"/StudentTrackingSystem/\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icol-ui-text-field-password\"></i>\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;Change Password\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      if (_jspx_meth_c_005furl_005f52(_jspx_page_context))
        return;
      out.write("\" >\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-key\"></i>\n");
      out.write("\t\t\t\t\t\t\tLog out\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div id=\"divider\" class=\"resizeable\"></div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /Sidebar -->\n");
      out.write("\n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<!-- Breadcrumbs line -->\n");
      out.write("\t\t\t\t<div class=\"crumbs\">\n");
      out.write("\t\t\t\t\t<ul id=\"breadcrumbs\" class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-home\"></i>\n");
      out.write("\t\t\t\t\t\t\tDashboard\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li >\n");
      out.write("\t\t\t\t\t\t\tSchools List\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"crumb-buttons\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li class=\"range\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-calendar\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /Breadcrumbs line -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!--=== Page Header ===-->\n");
      out.write("\t\t\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"page-title\">\n");
      out.write("\t\t\t\t\t\t<h3>Schools List</h3>\n");
      out.write("\t\t\t\t\t\t<span>Create,Update,Delete Schools List</span>\n");
      out.write("\t\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 col-md-1\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6 col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"statbox widget box box-shadow\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"visual green\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-user\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"title\">Total Schools</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"value\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${schoolsListLength-1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div> <!-- /.smallstat -->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div> <!-- /.col-md-3 -->\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /Page Header -->\n");
      out.write("\t\t\t\t\n");
      out.write(" \t\t\t\t<!--    Students List  -->\n");
      out.write(" \t\t\t\t\n");
      out.write("\t\t\t\t<!--=== Managed Tables ===-->\n");
      out.write("\n");
      out.write("\t\t\t\t<!--=== Normal ===-->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"widget box\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-header\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4><i class=\"icon-reorder\"></i>Schools List</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"toolbar no-padding\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"btn btn-xs widget-collapse\"><i class=\"icon-angle-down\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-striped table-bordered table-hover table-checkable datatable\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>School Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Admin Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Status</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>option</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /Normal -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.container -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\t<!-- Modal dialog -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" >&times;</button>\n");
      out.write("\t\t\t\t\t\t<h4 class=\"modal-title\">New School Registration</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<!--=== Page Content ===-->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<!--=== Validation Example 1 ===-->\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"widget box\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-header\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4><i class=\"icon-reorder\"></i>Registration Form</h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-horizontal row-border\" id=\"validate-1\" action=\"newSchoolRegister\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">School Name <span class=\"required\">*</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"school_name\" class=\"form-control required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Admin Name <span class=\"required\">*</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"admin_name\" class=\"form-control required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Number of Buses <span class=\"required\">*</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"no_buses\" class=\"form-control required digits\" min=\"0\" value=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Number of Students <span class=\"required\">*</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"no_students\" class=\"form-control required digits\" min=\"0\" value=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Email <span class=\"required\">*</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"email\" class=\"form-control required email\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Phone Number <span class=\"required\">*</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"phone_no\" class=\"form-control required digits\" rangelength=\"5,15\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Address <span class=\"required\">*</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<textarea  name=\"address\" class=\"form-control required\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-actions\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default pull-right\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Register\" class=\"btn btn-primary pull-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /Validation Example 1 -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div><!-- /.modal-content -->\n");
      out.write("\t\t\t</div><!-- /.modal-dialog -->\n");
      out.write("\t\t</div><!-- /.modal -->\n");
      out.write("\t\t<!-- end of Modal dialog -->\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Modal dialog for School Information -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal1\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" >&times;</button>\n");
      out.write("\t\t\t\t\t\t<h4 class=\"modal-title\">School Information</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<!--=== Page Content ===-->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<!--=== Validation Example 1 ===-->\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"widget box\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-header\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4><i class=\"icon-reorder\"></i>School Name <span class=\"required\">:</span> </h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-horizontal row-border\" id=\"validate-1\" action=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">School Name <span class=\"required\">:</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Admin Name <span class=\"required\">:</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Number of Buses <span class=\"required\">:</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Number of Students <span class=\"required\">:</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Email <span class=\"required\">:</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Phone Number <span class=\"required\">:</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\">Address <span class=\"required\">:</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-actions\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default pull-right\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- /Validation Example 1 -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div><!-- /.modal-content -->\n");
      out.write("\t\t\t</div><!-- /.modal-dialog -->\n");
      out.write("\t\t</div><!-- /.modal -->\n");
      out.write("\t\t<!-- end of Modal dialog -->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/homepage.jsp(5,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/j_spring_security_logout");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/jsp-includes/css_files.jsp(5,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/assets/img/icons/led/src/dashboard.png");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/jsp-includes/css_files.jsp(7,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/bootstrap/css/bootstrap.min.css");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/views/jsp-includes/css_files.jsp(16,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/resources/assets/css/main.css");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/views/jsp-includes/css_files.jsp(17,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/resources/assets/css/plugins.css");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/views/jsp-includes/css_files.jsp(18,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/resources/assets/css/responsive.css");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent(null);
    // /WEB-INF/views/jsp-includes/css_files.jsp(19,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/resources/assets/css/icons.css");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f7.setParent(null);
    // /WEB-INF/views/jsp-includes/css_files.jsp(21,30) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f7.setValue("/resources/assets/css/fontawesome/font-awesome.min.css");
    int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
    if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f8.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(3,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f8.setValue("/resources/assets/js/libs/jquery-1.10.2.min.js");
    int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
    if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f9.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(4,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f9.setValue("/resources/plugins/jquery-ui/jquery-ui-1.10.2.custom.min.js");
    int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
    if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f10(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f10.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(6,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f10.setValue("/resources/bootstrap/js/bootstrap.min.js");
    int _jspx_eval_c_005furl_005f10 = _jspx_th_c_005furl_005f10.doStartTag();
    if (_jspx_th_c_005furl_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f11(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f11.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(7,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f11.setValue("/resources/assets/js/libs/lodash.compat.min.js");
    int _jspx_eval_c_005furl_005f11 = _jspx_th_c_005furl_005f11.doStartTag();
    if (_jspx_th_c_005furl_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f12(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f12.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(15,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f12.setValue("/resources/plugins/touchpunch/jquery.ui.touch-punch.min.js");
    int _jspx_eval_c_005furl_005f12 = _jspx_th_c_005furl_005f12.doStartTag();
    if (_jspx_th_c_005furl_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f13(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f13.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(16,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f13.setValue("/resources/plugins/event.swipe/jquery.event.move.js");
    int _jspx_eval_c_005furl_005f13 = _jspx_th_c_005furl_005f13.doStartTag();
    if (_jspx_th_c_005furl_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f14(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f14.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(17,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f14.setValue("/resources/plugins/event.swipe/jquery.event.swipe.js");
    int _jspx_eval_c_005furl_005f14 = _jspx_th_c_005furl_005f14.doStartTag();
    if (_jspx_th_c_005furl_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f15(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f15.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(20,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f15.setValue("/resources/assets/js/libs/breakpoints.js");
    int _jspx_eval_c_005furl_005f15 = _jspx_th_c_005furl_005f15.doStartTag();
    if (_jspx_th_c_005furl_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f16(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f16.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(21,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f16.setValue("/resources/plugins/respond/respond.min.js");
    int _jspx_eval_c_005furl_005f16 = _jspx_th_c_005furl_005f16.doStartTag();
    if (_jspx_th_c_005furl_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f17(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f17.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(22,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f17.setValue("/resources/plugins/cookie/jquery.cookie.min.js");
    int _jspx_eval_c_005furl_005f17 = _jspx_th_c_005furl_005f17.doStartTag();
    if (_jspx_th_c_005furl_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f17);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f18(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f18 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f18.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(23,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f18.setValue("/resources/plugins/slimscroll/jquery.slimscroll.min.js");
    int _jspx_eval_c_005furl_005f18 = _jspx_th_c_005furl_005f18.doStartTag();
    if (_jspx_th_c_005furl_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f19(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f19 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f19.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(24,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f19.setValue("/resources/plugins/slimscroll/jquery.slimscroll.horizontal.min.js");
    int _jspx_eval_c_005furl_005f19 = _jspx_th_c_005furl_005f19.doStartTag();
    if (_jspx_th_c_005furl_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f19);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f20(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f20 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f20.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(31,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f20.setValue("/resources/plugins/sparkline/jquery.sparkline.min.js");
    int _jspx_eval_c_005furl_005f20 = _jspx_th_c_005furl_005f20.doStartTag();
    if (_jspx_th_c_005furl_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f20);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f21(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f21 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f21.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(32,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f21.setValue("/resources/plugins/flot/jquery.flot.min.js");
    int _jspx_eval_c_005furl_005f21 = _jspx_th_c_005furl_005f21.doStartTag();
    if (_jspx_th_c_005furl_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f21);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f22(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f22 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f22.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(33,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f22.setValue("/resources/plugins/flot/jquery.flot.tooltip.min.js");
    int _jspx_eval_c_005furl_005f22 = _jspx_th_c_005furl_005f22.doStartTag();
    if (_jspx_th_c_005furl_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f22);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f23(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f23 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f23.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(34,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f23.setValue("/resources/plugins/flot/jquery.flot.resize.min.js");
    int _jspx_eval_c_005furl_005f23 = _jspx_th_c_005furl_005f23.doStartTag();
    if (_jspx_th_c_005furl_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f23);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f24(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f24 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f24.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(35,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f24.setValue("/resources/plugins/flot/jquery.flot.time.min.js");
    int _jspx_eval_c_005furl_005f24 = _jspx_th_c_005furl_005f24.doStartTag();
    if (_jspx_th_c_005furl_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f24);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f25(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f25 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f25.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(36,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f25.setValue("/resources/plugins/flot/jquery.flot.growraf.min.js");
    int _jspx_eval_c_005furl_005f25 = _jspx_th_c_005furl_005f25.doStartTag();
    if (_jspx_th_c_005furl_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f25);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f26(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f26 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f26.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(37,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f26.setValue("/resources/plugins/easy-pie-chart/jquery.easy-pie-chart.min.js");
    int _jspx_eval_c_005furl_005f26 = _jspx_th_c_005furl_005f26.doStartTag();
    if (_jspx_th_c_005furl_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f26);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f27(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f27 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f27.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(39,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f27.setValue("/resources/plugins/daterangepicker/moment.min.js");
    int _jspx_eval_c_005furl_005f27 = _jspx_th_c_005furl_005f27.doStartTag();
    if (_jspx_th_c_005furl_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f27);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f28(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f28 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f28.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f28.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(40,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f28.setValue("/resources/plugins/daterangepicker/daterangepicker.js");
    int _jspx_eval_c_005furl_005f28 = _jspx_th_c_005furl_005f28.doStartTag();
    if (_jspx_th_c_005furl_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f28);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f29(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f29 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f29.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f29.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(41,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f29.setValue("/resources/plugins/blockui/jquery.blockUI.min.js");
    int _jspx_eval_c_005furl_005f29 = _jspx_th_c_005furl_005f29.doStartTag();
    if (_jspx_th_c_005furl_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f29);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f30(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f30 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f30.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f30.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(43,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f30.setValue("/resources/plugins/fullcalendar/fullcalendar.min.js");
    int _jspx_eval_c_005furl_005f30 = _jspx_th_c_005furl_005f30.doStartTag();
    if (_jspx_th_c_005furl_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f30);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f31(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f31 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f31.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f31.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(46,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f31.setValue("/resources/plugins/noty/jquery.noty.js");
    int _jspx_eval_c_005furl_005f31 = _jspx_th_c_005furl_005f31.doStartTag();
    if (_jspx_th_c_005furl_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f31);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f32(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f32 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f32.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f32.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(47,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f32.setValue("/resources/plugins/noty/layouts/top.js");
    int _jspx_eval_c_005furl_005f32 = _jspx_th_c_005furl_005f32.doStartTag();
    if (_jspx_th_c_005furl_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f32);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f33(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f33 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f33.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f33.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(48,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f33.setValue("/resources/plugins/noty/themes/default.js");
    int _jspx_eval_c_005furl_005f33 = _jspx_th_c_005furl_005f33.doStartTag();
    if (_jspx_th_c_005furl_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f33);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f34(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f34 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f34.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f34.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(51,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f34.setValue("/resources/plugins/uniform/jquery.uniform.min.js");
    int _jspx_eval_c_005furl_005f34 = _jspx_th_c_005furl_005f34.doStartTag();
    if (_jspx_th_c_005furl_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f34);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f35(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f35 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f35.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f35.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(52,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f35.setValue("/resources/plugins/select2/select2.min.js");
    int _jspx_eval_c_005furl_005f35 = _jspx_th_c_005furl_005f35.doStartTag();
    if (_jspx_th_c_005furl_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f35);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f36(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f36 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f36.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f36.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(53,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f36.setValue("/resources/plugins/fileinput/fileinput.js");
    int _jspx_eval_c_005furl_005f36 = _jspx_th_c_005furl_005f36.doStartTag();
    if (_jspx_th_c_005furl_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f36);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f37(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f37 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f37.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f37.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(57,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f37.setValue("/resources/plugins/validation/jquery.validate.min.js");
    int _jspx_eval_c_005furl_005f37 = _jspx_th_c_005furl_005f37.doStartTag();
    if (_jspx_th_c_005furl_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f37);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f38(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f38 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f38.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f38.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(58,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f38.setValue("/resources/plugins/validation/additional-methods.min.js");
    int _jspx_eval_c_005furl_005f38 = _jspx_th_c_005furl_005f38.doStartTag();
    if (_jspx_th_c_005furl_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f38);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f39(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f39 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f39.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f39.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(61,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f39.setValue("/resources/plugins/datatables/jquery.dataTables.min.js");
    int _jspx_eval_c_005furl_005f39 = _jspx_th_c_005furl_005f39.doStartTag();
    if (_jspx_th_c_005furl_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f39);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f40(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f40 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f40.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f40.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(62,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f40.setValue("/resources/plugins/datatables/tabletools/TableTools.min.js");
    int _jspx_eval_c_005furl_005f40 = _jspx_th_c_005furl_005f40.doStartTag();
    if (_jspx_th_c_005furl_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f40);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f41(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f41 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f41.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f41.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(63,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f41.setValue("/resources/plugins/datatables/colvis/ColVis.min.js");
    int _jspx_eval_c_005furl_005f41 = _jspx_th_c_005furl_005f41.doStartTag();
    if (_jspx_th_c_005furl_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f41);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f42(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f42 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f42.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f42.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(64,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f42.setValue("/resources/plugins/datatables/DT_bootstrap.js");
    int _jspx_eval_c_005furl_005f42 = _jspx_th_c_005furl_005f42.doStartTag();
    if (_jspx_th_c_005furl_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f42);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f43(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f43 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f43.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f43.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(67,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f43.setValue("/resources/assets/js/app.js");
    int _jspx_eval_c_005furl_005f43 = _jspx_th_c_005furl_005f43.doStartTag();
    if (_jspx_th_c_005furl_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f43);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f44(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f44 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f44.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f44.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(68,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f44.setValue("/resources/assets/js/plugins.js");
    int _jspx_eval_c_005furl_005f44 = _jspx_th_c_005furl_005f44.doStartTag();
    if (_jspx_th_c_005furl_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f44);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f45(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f45 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f45.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f45.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(69,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f45.setValue("/resources/assets/js/plugins.form-components.js");
    int _jspx_eval_c_005furl_005f45 = _jspx_th_c_005furl_005f45.doStartTag();
    if (_jspx_th_c_005furl_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f45);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f46(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f46 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f46.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f46.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(82,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f46.setValue("/resources/assets/js/custom.js ");
    int _jspx_eval_c_005furl_005f46 = _jspx_th_c_005furl_005f46.doStartTag();
    if (_jspx_th_c_005furl_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f46);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f47(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f47 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f47.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f47.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(83,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f47.setValue("/resources/assets/js/demo/form_validation.js");
    int _jspx_eval_c_005furl_005f47 = _jspx_th_c_005furl_005f47.doStartTag();
    if (_jspx_th_c_005furl_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f47);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f48(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f48 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f48.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f48.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(84,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f48.setValue("/resources/assets/js/demo/pages_calendar.js");
    int _jspx_eval_c_005furl_005f48 = _jspx_th_c_005furl_005f48.doStartTag();
    if (_jspx_th_c_005furl_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f48);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f49(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f49 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f49.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f49.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(85,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f49.setValue("/resources/assets/js/demo/charts/chart_filled_blue.js");
    int _jspx_eval_c_005furl_005f49 = _jspx_th_c_005furl_005f49.doStartTag();
    if (_jspx_th_c_005furl_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f49);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f50(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f50 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f50.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f50.setParent(null);
    // /WEB-INF/views/jsp-includes/js_files.jsp(86,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f50.setValue("/resources/assets/js/demo/charts/chart_simple.js");
    int _jspx_eval_c_005furl_005f50 = _jspx_th_c_005furl_005f50.doStartTag();
    if (_jspx_th_c_005furl_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f50);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f51(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f51 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f51.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f51.setParent(null);
    // /WEB-INF/views/jsp-includes/top_navigation.jsp(48,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f51.setValue("/j_spring_security_logout");
    int _jspx_eval_c_005furl_005f51 = _jspx_th_c_005furl_005f51.doStartTag();
    if (_jspx_th_c_005furl_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f51);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f52(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f52 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f52.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f52.setParent(null);
    // /WEB-INF/views/jsp-includes/left_navigation.jsp(23,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f52.setValue("/j_spring_security_logout");
    int _jspx_eval_c_005furl_005f52 = _jspx_th_c_005furl_005f52.doStartTag();
    if (_jspx_th_c_005furl_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f52);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/homepage.jsp(162,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("school");
    // /WEB-INF/views/homepage.jsp(162,10) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${schoolsList}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\n");
          out.write("           \t\t\t\t\t\t\t\t\t \n");
          out.write("\t\t\t\t\t\t\t\t        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/homepage.jsp(163,11) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${school.role == 'ROLE_JUNIORADMIN' }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t                <tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                <td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<a data-toggle=\"modal\" href=\"#myModal1\" id=\"showSingleSchoolDetails\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${school.school_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<input type=\"hidden\" id=\"school_id\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${school.school_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                </td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${school.admin_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t               \t<td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t");
        if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("  \n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t");
        if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t");
        if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t              \t</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                <td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-sm\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEdit &nbsp;<i class=icon-edit></i>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"modal\" href=\"#myModal1\" class=\"btn btn-sm\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDelete &nbsp;<i class=icol-delete></i>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
        out.write("                \t\t\t\t\t\t\t \t\t  </tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/homepage.jsp(174,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("access");
    // /WEB-INF/views/homepage.jsp(174,28) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${school.access}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/homepage.jsp(176,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${access == true}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t\t<span class=\"label label-success\">Approved</span>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/homepage.jsp(180,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${access == false}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t\t<span class=\"label label-danger\"> Not Approved</span>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }
}

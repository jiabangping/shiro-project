package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class common_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_principal_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_guest;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_authenticated;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_hasPermission_name;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_shiro_principal_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_guest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_authenticated = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_hasPermission_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_shiro_principal_property_nobody.release();
    _jspx_tagPool_shiro_guest.release();
    _jspx_tagPool_shiro_authenticated.release();
    _jspx_tagPool_shiro_hasPermission_name.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<span>\r\n");
      //  shiro:authenticated
      org.apache.shiro.web.tags.AuthenticatedTag _jspx_th_shiro_authenticated_0 = (org.apache.shiro.web.tags.AuthenticatedTag) _jspx_tagPool_shiro_authenticated.get(org.apache.shiro.web.tags.AuthenticatedTag.class);
      _jspx_th_shiro_authenticated_0.setPageContext(_jspx_page_context);
      _jspx_th_shiro_authenticated_0.setParent(null);
      int _jspx_eval_shiro_authenticated_0 = _jspx_th_shiro_authenticated_0.doStartTag();
      if (_jspx_eval_shiro_authenticated_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t");
          //  shiro:hasPermission
          org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_0 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
          _jspx_th_shiro_hasPermission_0.setPageContext(_jspx_page_context);
          _jspx_th_shiro_hasPermission_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_authenticated_0);
          _jspx_th_shiro_hasPermission_0.setName("/admin/res/list");
          int _jspx_eval_shiro_hasPermission_0 = _jspx_th_shiro_hasPermission_0.doStartTag();
          if (_jspx_eval_shiro_hasPermission_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t<a href=\"");
              out.print(request.getContextPath() );
              out.write("/admin/res/list\" class=\"admin_link\">资源管理</a>\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_shiro_hasPermission_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_shiro_hasPermission_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
            return;
          }
          _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
          out.write("\r\n");
          out.write("\t");
          //  shiro:hasPermission
          org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_1 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
          _jspx_th_shiro_hasPermission_1.setPageContext(_jspx_page_context);
          _jspx_th_shiro_hasPermission_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_authenticated_0);
          _jspx_th_shiro_hasPermission_1.setName("/admin/role/list");
          int _jspx_eval_shiro_hasPermission_1 = _jspx_th_shiro_hasPermission_1.doStartTag();
          if (_jspx_eval_shiro_hasPermission_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t<a href=\"");
              out.print(request.getContextPath() );
              out.write("/admin/role/list\" class=\"admin_link\">角色管理</a>\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_shiro_hasPermission_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_shiro_hasPermission_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_1);
            return;
          }
          _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_1);
          out.write("\r\n");
          out.write("\t");
          //  shiro:hasPermission
          org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_2 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
          _jspx_th_shiro_hasPermission_2.setPageContext(_jspx_page_context);
          _jspx_th_shiro_hasPermission_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_authenticated_0);
          _jspx_th_shiro_hasPermission_2.setName("/admin/user/list");
          int _jspx_eval_shiro_hasPermission_2 = _jspx_th_shiro_hasPermission_2.doStartTag();
          if (_jspx_eval_shiro_hasPermission_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t<a href=\"");
              out.print(request.getContextPath() );
              out.write("/admin/user/list\" class=\"admin_link\">用户管理</a>\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_shiro_hasPermission_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_shiro_hasPermission_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_2);
            return;
          }
          _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_2);
          out.write("\r\n");
          out.write("\t<a href=\"");
          out.print(request.getContextPath() );
          out.write("/logout\">退出系统</a>\r\n");
          out.write("\t欢迎 ");
          if (_jspx_meth_shiro_principal_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_authenticated_0, _jspx_page_context))
            return;
          out.write("使用我们的系统!\r\n");
          int evalDoAfterBody = _jspx_th_shiro_authenticated_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_shiro_authenticated_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_shiro_authenticated.reuse(_jspx_th_shiro_authenticated_0);
        return;
      }
      _jspx_tagPool_shiro_authenticated.reuse(_jspx_th_shiro_authenticated_0);
      out.write('\r');
      out.write('\n');
      //  shiro:guest
      org.apache.shiro.web.tags.GuestTag _jspx_th_shiro_guest_0 = (org.apache.shiro.web.tags.GuestTag) _jspx_tagPool_shiro_guest.get(org.apache.shiro.web.tags.GuestTag.class);
      _jspx_th_shiro_guest_0.setPageContext(_jspx_page_context);
      _jspx_th_shiro_guest_0.setParent(null);
      int _jspx_eval_shiro_guest_0 = _jspx_th_shiro_guest_0.doStartTag();
      if (_jspx_eval_shiro_guest_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<a href=\"");
          out.print(request.getContextPath() );
          out.write("/login\">登录系统</a>\r\n");
          int evalDoAfterBody = _jspx_th_shiro_guest_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_shiro_guest_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_shiro_guest.reuse(_jspx_th_shiro_guest_0);
        return;
      }
      _jspx_tagPool_shiro_guest.reuse(_jspx_th_shiro_guest_0);
      out.write("\r\n");
      out.write("</span>\r\n");
      out.write("<hr/>");
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

  private boolean _jspx_meth_shiro_principal_0(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_authenticated_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_principal_0 = (org.apache.shiro.web.tags.PrincipalTag) _jspx_tagPool_shiro_principal_property_nobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_principal_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_principal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_authenticated_0);
    _jspx_th_shiro_principal_0.setProperty("nickname");
    int _jspx_eval_shiro_principal_0 = _jspx_th_shiro_principal_0.doStartTag();
    if (_jspx_th_shiro_principal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_principal_property_nobody.reuse(_jspx_th_shiro_principal_0);
      return true;
    }
    _jspx_tagPool_shiro_principal_property_nobody.reuse(_jspx_th_shiro_principal_0);
    return false;
  }
}

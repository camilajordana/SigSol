package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/statusUsuarioSenha.tag");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\t<title>Bem-vindo ao SigSol</title>\n");
      out.write("        \n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo_login.css\">    \t\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<div id=\"login\">\n");
      out.write("  <div id=\"triangle\"></div>\n");
      out.write("  \n");
      out.write("  <h1><img src=\"imagens/img_index.png\" height=\"100\" width=\"350\"/></h1>\n");
      out.write("  <form id=\"area\" method=\"POST\" action=\"logar\">\n");
      out.write("      \n");
      out.write("      <input type=\"text\" autofocus name=\"matricula\" id=\"matricula\" placeholder=\"Matrícula\" maxlength=\"14\" required />\n");
      out.write("      <input type=\"password\" name=\"senha\" id=\"senha\" placeholder=\"Senha\" required/>\n");
      out.write("      <input type=\"hidden\" name=\"acao\" value=\"confirmarLogin\"/>\n");
      out.write("      <p><strong>");
      if (_jspx_meth_tagsAviso_statusUsuarioSenha_0(_jspx_page_context))
        return;
      out.write("</strong></p>\n");
      out.write("    <input type=\"submit\" value=\"Entrar\" />\n");
      out.write("    \n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_tagsAviso_statusUsuarioSenha_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tagsAviso:statusUsuarioSenha
    org.apache.jsp.tag.web.statusUsuarioSenha_tag _jspx_th_tagsAviso_statusUsuarioSenha_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.statusUsuarioSenha_tag.class) : new org.apache.jsp.tag.web.statusUsuarioSenha_tag();
    _jspx_th_tagsAviso_statusUsuarioSenha_0.setJspContext(_jspx_page_context);
    _jspx_th_tagsAviso_statusUsuarioSenha_0.doTag();
    return false;
  }
}

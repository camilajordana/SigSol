package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pagHTML_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"home\" class=\"big\">\n");
      out.write("        <section id=\"wrapper\">\n");
      out.write("            <p id=\"tel\">\n");
      out.write("                <span>\n");
      out.write("                    IFRN - campus \n");
      out.write("                </span>\n");
      out.write("                João Câmara\n");
      out.write("            </p>\n");
      out.write("            <img id=\"logo\" alt=\"Sistema de Gerenciamento de Solicitações\" src=\"imagens/logo2.png\">\n");
      out.write("            <div>\n");
      out.write("                <nav id=\"nav\" class=\"primary\">\n");
      out.write("                    <div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"selected\">\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    Início\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    Solicitações\n");
      out.write("                                </a>\n");
      out.write("                            </li><li class=\"three\">\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    Cadastrar\n");
      out.write("                                </a>\n");
      out.write("                            </li><li>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    Usuários\n");
      out.write("                                </a>\n");
      out.write("                            </li><li>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    Relatório\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"six\">\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                   Avaliar\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    Horários\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                \n");
      out.write("                <main class=\"main\" role=\"main\">\n");
      out.write("                    \n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class relatorioIndividual_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SigSol - Relatório</title>\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"css/folha_de_estilo.css\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"home\" class=\"big\">\n");
      out.write("        <section id=\"section\">\n");
      out.write("            <p id=\"tel\">\n");
      out.write("                <span>\n");
      out.write("                    IFRN - campus \n");
      out.write("                </span>\n");
      out.write("                João Câmara\n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <section id=\"wrapper2\">\n");
      out.write("            <div id=\"imagensLogo\" align=\"center\"> <img id=\"logo\" alt=\"Sistema de Gerenciamento de Solicitações\" align=\"center\" src=\"imagens/ggg.png\" width=\"450\" height=\"150\"><a href=\"Sair\"><img src=\"imagens/imagem3.png\" width=\"70\" height=\"40\"  align=\"right\" id=\"sair\"></a></div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("            <div id=\"navMenu\">\n");
      out.write("                <ul id=\"c\">\n");
      out.write("                    <li><a href=\"#\">Início</a>\n");
      out.write("                    <li><a href=\"#\">Solicitações</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"material_escritorio.jsp\">Material escritório</a></li>\n");
      out.write("                            <li><a>Material videoaula</a></li>\n");
      out.write("                            <li><a>Salas</a></li>\n");
      out.write("                            <li><a>Livros</a></li>\n");
      out.write("                            <li><a>Objetos perdidos</a></li>\n");
      out.write("                            <li><a>Limpeza</a></li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    <li><a href=\"#\">Cadastrar</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"cadastrarUsuario.jsp\">Usuário</a></li>\n");
      out.write("                            <li><a href=\"#\">Material</a></li>\n");
      out.write("                            <li><a href=\"#\">Sala</a></li>\n");
      out.write("                            <li><a href=\"#\">Livro</a></li>\n");
      out.write("                            <li><a href=\"GerenciarDisciplinas?acao=listar\">Disciplina</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"\">Usuários</a></li>\n");
      out.write("                    <li class=\"selected\"><a href=\"#\">Relatório</a>\n");
      out.write("                    <ul>\n");
      out.write("                            <li><a>Individual</a></li>\n");
      out.write("                            <li><a>Geral</a></li>\n");
      out.write("                            <li><a>Avaliação de serviço</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        </li>\n");
      out.write("                    <li><a href=\"#\">Avaliar</a></li>\n");
      out.write("                    <li><a href=\"#\">Horários</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <section id=\"menu\">\n");
      out.write("                <div id=\"espaco\">\n");
      out.write("                 \n");
      out.write("                    <h1>Relatório individual</h1>\n");
      out.write("                    <br>\n");
      out.write("                    <form action=\"InicioAdm.jsp\" method=\"post\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nome: </td>\n");
      out.write("                            <td><input type=\"text\" required></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Matrícula: </td>\n");
      out.write("                            <td><input type=\"text\" required></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                        \n");
      out.write("                        <input type=\"submit\" value=\"Gerar\">\n");
      out.write("                        </form>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        \n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("\n");
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

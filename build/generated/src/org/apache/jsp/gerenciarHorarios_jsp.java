package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gerenciarHorarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <title>SigSol - Gerenciar horários</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/folha_de_estilo.css\">\n");
      out.write("    </head>\n");
      out.write("     <body id=\"home\" class=\"big\">\n");
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
      out.write("            <div id=\"imagensLogo\" align=\"center\"> <img id=\"logo\" alt=\"Sistema de Gerenciamento de Solicitações\" align=\"center\" src=\"imagens/gg.png\" width=\"560\" height=\"140\"><a href=\"Sair\"><img src=\"imagens/imagem3.png\" width=\"70\" height=\"40\"  align=\"right\" id=\"sair\"></a></div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("           <div id=\"wrapper\">\n");
      out.write("            <div id=\"navMenu\">\n");
      out.write("                <ul id=\"c\">\n");
      out.write("                    <li><a href=\"InicioAdm.jsp\">Início</a>\n");
      out.write("                    <li><a href=\"#\">Solicitações</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"material_escritorio.jsp\">Material escritório</a></li>\n");
      out.write("                            <li><a href=\"videoaula.jsp\">Material videoaula</a></li>\n");
      out.write("                            <li><a href=\"sala.jsp\">Salas</a></li>\n");
      out.write("                            <li><a href=\"livro.jsp\">Livros</a></li>\n");
      out.write("                            <li><a href=\"objetos_perdidos.jsp\">Objetos perdidos</a></li>\n");
      out.write("                            <li><a href=\"limpeza.jsp\">Limpeza</a></li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    <li class=\"selected\"><a href=\"#\">Cadastrar</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"cadastrarUsuario.jsp\">Usuário</a></li>\n");
      out.write("                            <li><a href=\"gerenciar_materialEscritorio.jsp\">Material</a></li>\n");
      out.write("                            <li><a href=\"gerenciar_salas.jsp\">Sala</a></li>\n");
      out.write("                            <li><a href=\"gerenciar_livros.jsp\">Livro</a></li>\n");
      out.write("                            <li><a href=\"gerenciarHorarios.jsp\">Horários</a></li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"gerenciarUsuarios.jsp\">Usuários</a></li>\n");
      out.write("                    <li><a href=\"\">Relatório</a>\n");
      out.write("                    <ul>\n");
      out.write("                            <li><a>Individual</a></li>\n");
      out.write("                            <li><a>Geral</a></li>\n");
      out.write("                            <li><a>Avaliação de serviço</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"AvaliacaoDeServico.jsp\">Avaliar</a></li>\n");
      out.write("                        <li><a href=\"visualizarHorarios.jsp\">Horários</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      <section id=\"menu\">\n");
      out.write("               <div id=\"espaco\">\n");
      out.write("       \n");
      out.write("            <form action=\"InicioAdm.jsp\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"500\">\n");
      out.write("                        Categoria: \n");
      out.write("                        <select>\n");
      out.write("                            <option>Turma</option>\n");
      out.write("                            <option>Professor</option>\n");
      out.write("                            <option>Monitoria</option>\n");
      out.write("                        </select>\n");
      out.write("                        <br>\n");
      out.write("                        Nome:\n");
      out.write("                        <input type=\"text\"><br>\n");
      out.write("                        <input type=\"submit\" value=\"Cadastrar\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        Buscar:\n");
      out.write("                        <input type=\"text\"><br>\n");
      out.write("                        <input type=\"submit\" value=\"Buscar\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("                   \n");
      out.write("                   <br>\n");
      out.write("                   <form method=\"post\">\n");
      out.write("                   <table border=\"1\">\n");
      out.write("             <tr align=\"center\">\n");
      out.write("                 <th>Horários</th>\n");
      out.write("                 <th>Segunda-feira</th>\n");
      out.write("                 <th>Terça-feira</th>\n");
      out.write("                 <th>Quarta-feira</th>\n");
      out.write("                 <th>Quinta-feira</th>\n");
      out.write("                 <th>Sexta-feira</th>\n");
      out.write("             </tr>\n");
      out.write("             <tr align=\"center\">\n");
      out.write("                 <td>1º</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("             </tr>\n");
      out.write("             <tr align=\"center\">\n");
      out.write("                 <td>2º</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("             </tr>\n");
      out.write("             <tr align=\"center\">\n");
      out.write("                 <td>Intervalo</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("             </tr>\n");
      out.write("             <tr align=\"center\">\n");
      out.write("                 <td>3º</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("             </tr>\n");
      out.write("             <tr align=\"center\">\n");
      out.write("                 <td>4º</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("             </tr>\n");
      out.write("             <tr align=\"center\">\n");
      out.write("                 <td>Intervalo</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("             </tr>\n");
      out.write("             <tr align=\"center\">\n");
      out.write("                 <td>5º</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("             </tr>\n");
      out.write("             <tr align=\"center\">\n");
      out.write("                 <td>6º</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("                 <td>---</td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("         </table>\n");
      out.write("                       <br>\n");
      out.write("                       <input type=\"submit\" value=\"Cadastrar\">\n");
      out.write("                   </form>\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("            </section>\n");
      out.write("        \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("   \n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/statusInformarCategoria.tag");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SigSol - Cadastro de usuários</title>\n");
      out.write("        \n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"css/folha_de_estilo.css\">\n");
      out.write("         \n");
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
      out.write("            <div id=\"imagensLogo\" align=\"center\"> <img id=\"logo\" alt=\"Sistema de Gerenciamento de Solicitações\" align=\"center\" src=\"imagens/gg.png\" width=\"560\" height=\"140\"><a href=\"Sair\"><img src=\"imagens/imagem3.png\" width=\"70\" height=\"40\"  align=\"right\" id=\"sair\"></a></div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("            <div id=\"navMenu\">\n");
      out.write("                <ul id=\"c\">\n");
      out.write("                    <li><a href=\"InicioAdm.jsp\">Início</a>\n");
      out.write("                    <li><a href=\"#\">Solicitações</a>\n");
      out.write("                    <li  class=\"selected\"><a href=\"#\">Cadastrar</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Usuário</a></li>\n");
      out.write("                            <li><a href=\"#\">Material</a></li>\n");
      out.write("                            <li><a href=\"#\">Sala</a></li>\n");
      out.write("                            <li><a href=\"#\">Livro</a></li>\n");
      out.write("                            <li><a href=\"cadastrarDisciplina.jsp\">Disciplina</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Usuários</a></li>\n");
      out.write("                    <li><a href=\"#\">Relatório</a></li>\n");
      out.write("                    <li><a href=\"#\">Avaliar</a></li>\n");
      out.write("                    <li><a href=\"#\">Horários</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         <section id=\"menu\">   \n");
      out.write("             <div id=\"espaco\">\n");
      out.write("         ");
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"divForm\">\n");
      out.write("         <form name=\"formulario\" action=\"GerenciarUsuarios\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            <h2 id=\"a1\">Usuários</h2>\n");
      out.write("            <h3 id=\"a2\">● Novo usuário:</h3>\n");
      out.write("            <br>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("            <table id=\"tabelaUsuarios\">\n");
      out.write("                \n");
      out.write("                <tr><td>\n");
      out.write("                          Categoria:\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"100\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          <p id=\"aviso\"><strong>");
      if (_jspx_meth_tagsAviso_statusInformarCategoria_0(_jspx_page_context))
        return;
      out.write("</strong></p>\n");
      out.write("                          \n");
      out.write("                      </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>\n");
      out.write("                        <select name=\"categoriaUsuario\" id=\"categoriaUsuario\" >\n");
      out.write("                            <option value=\"0\" selected>(Selecione)</option>\n");
      out.write("                            <option value=\"1\">Aluno</option>\n");
      out.write("                            <option value=\"2\">Professor</option>\n");
      out.write("                            <option value=\"3\">Técnico administrativo</option>\n");
      out.write("                        </select>\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"100\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>\n");
      out.write("                         Nome: \n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"100\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          Matrícula:\n");
      out.write("                      </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>\n");
      out.write("                      <input type=\"text\" name=\"nome\" required size=\"35\"/>\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"100\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                      <input type=\"text\" name=\"matricula\" maxlength=\"14\" required size=\"35\"/>\n");
      out.write("                      </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>\n");
      out.write("                          CPF:\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"100\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          RG:\n");
      out.write("                      </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>\n");
      out.write("                    <input type=\"text\" name=\"cpf\" onBlur=\"ValidarCPF(formulario.cpf);\" onKeyPress=\"MascaraCPF(formulario.cpf);\" maxlength=\"14\" required size=\"35\">\n");
      out.write("                    </td>\n");
      out.write("                    <td width=\"100\" height=\"10\">\n");
      out.write("                    </td>\n");
      out.write("                      <td>\n");
      out.write("                     <input type=\"text\" name=\"rg\" onBlur=\"ValidarRG(formulario.rg);\" onKeyPress=\"MascaraRG(formulario.rg);\" maxlength=\"14\" required size=\"35\">\n");
      out.write("                      </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>\n");
      out.write("                          Telefone:\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"100\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          E-mail:\n");
      out.write("                      </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>\n");
      out.write("                     <input type=\"text\" name=\"telefone\" onKeyPress=\"MascaraTelefone(formulario.telefone);\" maxlength=\"14\"  onBlur=\"ValidaTelefone(formulario.telefone);\" required size=\"35\">\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"100\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                      <input type=\"email\" name=\"email\" required size=\"35\"/>\n");
      out.write("                      </td>\n");
      out.write("                </tr>\n");
      out.write("              \n");
      out.write("                <tr><td>\n");
      out.write("                          Senha:\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"100\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          Confirmar senha:\n");
      out.write("                      </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>\n");
      out.write("                        <input type=\"password\" name=\"senha\" required size=\"35\"/> \n");
      out.write("                    </td>\n");
      out.write("                      <td width=\"100\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          <input type=\"password\" name=\"confirmarSenha\" required size=\"35\"/> \n");
      out.write("                     </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("            <br><br>\n");
      out.write("                      <div id=\"botao\">\n");
      out.write("              <input type=\"hidden\" name=\"acao\" value=\"confirmarDados\"/>\n");
      out.write("              <input type=\"submit\" name=\"cadastrar\" value=\"Cadastrar\"/>\n");
      out.write("              <input type=\"reset\" name=\"cadastrar\" value=\"Limpar\"/>\n");
      out.write("                    </div>\n");
      out.write("         </form>\n");
      out.write("        </div>\n");
      out.write("                    \n");
      out.write("     </div>\n");
      out.write("        </section>\n");
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

  private boolean _jspx_meth_tagsAviso_statusInformarCategoria_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tagsAviso:statusInformarCategoria
    org.apache.jsp.tag.web.statusInformarCategoria_tag _jspx_th_tagsAviso_statusInformarCategoria_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.statusInformarCategoria_tag.class) : new org.apache.jsp.tag.web.statusInformarCategoria_tag();
    _jspx_th_tagsAviso_statusInformarCategoria_0.setJspContext(_jspx_page_context);
    _jspx_th_tagsAviso_statusInformarCategoria_0.doTag();
    return false;
  }
}

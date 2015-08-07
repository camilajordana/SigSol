package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gerenciarUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SigSol - Usuários</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/folha_de_estilo.css\">\n");
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
      out.write("             <div id=\"wrapper\">\n");
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
      out.write("    <section id=\"menu\">\n");
      out.write("               <div id=\"espaco\">\n");
      out.write("        <form name=\"formulario\" action=\"GerenciarUsuarios\" method=\"POST\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Categoria</td>\n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("                        <select name=\"categoriaBusca\" id=\"categoriaBusca\">\n");
      out.write("                            <option value=\"0\" selected>(Todos)</option>\n");
      out.write("                            <option value=\"1\">Aluno</option>\n");
      out.write("                            <option value=\"2\">Professor</option>\n");
      out.write("                            <option value=\"3\">Técnico administrativo</option>\n");
      out.write("                        </select>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"100\">Nome: </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"nomeBusca\" size=\"40\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Matrícula: </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"matriculaBusca\" size=\"40\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"hidden\" name=\"acao\" value=\"buscar\"/>\n");
      out.write("            <input type=\"submit\" name=\"buscar\" value=\"Buscar\"/>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("         \n");
      out.write("         <h3 class=\"a1\">Lista de usuários</h3>\n");
      out.write("         <table>\n");
      out.write("             <tr>\n");
      out.write("                 <td></td>\n");
      out.write("                 <td  width=\"280\">Nome</td>\n");
      out.write("                 <td  width=\"120\">Matrícula</td>\n");
      out.write("                 <td  width=\"100\">Categoria</td>\n");
      out.write("                 <td  width=\"100\">RG</td>\n");
      out.write("                 <td  width=\"120\">CPF</td>\n");
      out.write("                 <td  width=\"110\">Telefone</td>\n");
      out.write("                 <td  width=\"110\">E-mail</td>\n");
      out.write("                 <td colspan=\"2\">Ação</td>\n");
      out.write("             </tr>\n");
      out.write("              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("         </table>\n");
      out.write("        </div>\n");
      out.write("            </section>\n");
      out.write("        \n");
      out.write("        </section>\n");
      out.write("        \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("registroPessoas");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessaoListaPessoas}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("             <tr>\n");
          out.write("             <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['idpessoa']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("             <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['nome']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("             <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['matricula']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("             <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['categoria']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("             <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['rg']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("             <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['cpf']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("             <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['telefone']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("             <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['email']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("             <td><a href=\"alteraUsuario.jsp?idpessoa=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['idpessoa']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&matricula=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['matricula']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&nome=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['nome']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&categoria=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['categoria']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&rg=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['rg']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&cpf=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['cpf']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&telefone=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['telefone']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&email=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['email']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><img src=\"imagens/editar.png\" width=\"20\" height=\"20\" alt=\"editar\"/></a></td>\n");
          out.write("             <td><a href=\"GerenciarUsuarios?acao=excluirusuario&matricula=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${registroPessoas['matricula']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><img src=\"imagens/delete.png\" width=\"20\" height=\"20\" alt=\"deletar\"/></a></td>\n");
          out.write("             </tr>\n");
          out.write("             ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

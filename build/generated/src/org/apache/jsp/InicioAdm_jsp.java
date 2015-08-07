package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InicioAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/UsuarioLogado.tag");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SigSol</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/folha_de_estilo.css\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"home\" class=\"big\">\n");
      out.write("        <section id=\"section\">\n");
      out.write("            <p id=\"tel\">\n");
      out.write("                <strong> ");
      if (_jspx_meth_tagsUsuario_UsuarioLogado_0(_jspx_page_context))
        return;
      out.write("</strong>\n");
      out.write("\n");
      out.write("                <a href=\"Sair\" id=\"tt\">(Sair)</a>\n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <section id=\"wrapper2\">\n");
      out.write("                <div id=\"imagensLogo\" align=\"center\"> <img id=\"logo\" alt=\"Sistema de Gerenciamento de Solicitações\" align=\"center\" src=\"imagens/cccaaaa.png\" width=\"800\" height=\"150\"></div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("                <div id=\"navMenu\">\n");
      out.write("\n");
      out.write("                    <ul id=\"c\">\n");
      out.write("                        <li  class=\"selected\"><a href=\"#\"><strong>Início</strong></a>\n");
      out.write("                        <li><a href=\"GerenciarUsuarios?acao=listar\"><strong>Usuários</strong></a></li>\n");
      out.write("                        <li><a href=\"#\"><strong>Gerenciar</strong></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"GerenciarMateriais?acao=listar\"><strong>Material</strong></a></li>\n");
      out.write("                                <li><a href=\"#\"><strong>Sala</strong></a></li>\n");
      out.write("                                <li><a href=\"#\"><strong>Livro</strong></a></li>\n");
      out.write("                                <li><a href=\"#\"><strong>Horários</strong></a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><strong>Cadastrar</strong></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"cadastrarUsuario.jsp\"><strong>Usuário</strong></a></li>\n");
      out.write("                                <li><a href=\"gerenciar_materialEscritorio.jsp\"><strong>Material</strong></a></li>\n");
      out.write("                                <li><a href=\"gerenciar_salas.jsp\"><strong>Sala</strong></a></li>\n");
      out.write("                                <li><a href=\"gerenciar_livros.jsp\"><strong>Livro</strong></a></li>\n");
      out.write("                                <li><a href=\"gerenciarHorarios.jsp\"><strong>Horários</strong></a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"\"><strong>Relatório</strong></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a><strong>Individual</strong></a></li>\n");
      out.write("                                <li><a><strong>Geral</strong></a></li>\n");
      out.write("                                <li><a><strong>Avaliação de serviço</strong></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"AvaliacaoDeServico.jsp\"><strong>Avaliar</strong></a></li>\n");
      out.write("                        <li><a href=\"visualizarHorarios.jsp\"><strong>Horários</strong></a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <section id=\"menu\">\n");
      out.write("                <div id=\"espaco\">\n");
      out.write("                    <h2> Bem-vindo(a) ao SigSol, ");
      if (_jspx_meth_tagsUsuario_UsuarioLogado_1(_jspx_page_context))
        return;
      out.write("!</h2>\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <h1>O SigSol propõe uma melhor execução das tarefas e facilidade no processo de solicitações feitas\n");
      out.write("                        pelas pessoas que utilizam esse setor do Apoio Acadêmico do IFRN campus João Câmara.</h1>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
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

  private boolean _jspx_meth_tagsUsuario_UsuarioLogado_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tagsUsuario:UsuarioLogado
    org.apache.jsp.tag.web.UsuarioLogado_tag _jspx_th_tagsUsuario_UsuarioLogado_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.UsuarioLogado_tag.class) : new org.apache.jsp.tag.web.UsuarioLogado_tag();
    _jspx_th_tagsUsuario_UsuarioLogado_0.setJspContext(_jspx_page_context);
    _jspx_th_tagsUsuario_UsuarioLogado_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tagsUsuario_UsuarioLogado_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tagsUsuario:UsuarioLogado
    org.apache.jsp.tag.web.UsuarioLogado_tag _jspx_th_tagsUsuario_UsuarioLogado_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.UsuarioLogado_tag.class) : new org.apache.jsp.tag.web.UsuarioLogado_tag();
    _jspx_th_tagsUsuario_UsuarioLogado_1.setJspContext(_jspx_page_context);
    _jspx_th_tagsUsuario_UsuarioLogado_1.doTag();
    return false;
  }
}

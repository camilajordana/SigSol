package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.edu.ifrn.jdbc.modelo.Pessoa;
import java.util.List;
import br.edu.ifrn.jdbc.dao.PessoaDAO;

public final class CadastrarProfessor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SigSol - Cadastro</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\">\n");
      out.write("        <script language=\"JavaScript\" type=\"text/javascript\" src=\"MascaraValidacao.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         ");
      out.write("\n");
      out.write("        \n");
      out.write("         <form name=\"formulario\" method=\"POST\" action=\"adicionarProfessor\">\n");
      out.write("             <h3 class=\"a1\">Cadastrar professores</h3>\n");
      out.write("              <h4>● Novo usuário</h4><br>\n");
      out.write("              <table id=\"DadosProfessor\">\n");
      out.write("                  <tr>\n");
      out.write("                      <td>\n");
      out.write("                          Nome:\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"50\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          Matrícula:\n");
      out.write("                      </td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                      <td>\n");
      out.write("                          <input type=\"text\" name=\"nome\" required size=\"35\"/>\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"50\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                           <input type=\"text\" name=\"matricula\" maxlength=\"14\" required size=\"35\"/>\n");
      out.write("                      </td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                      <td>\n");
      out.write("                          CPF:\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"50\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          RG:\n");
      out.write("                      </td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                      <td>\n");
      out.write("                          <input type=\"text\" name=\"cpf\" onBlur=\"ValidarCPF(formulario.cpf);\" onKeyPress=\"MascaraCPF(formulario.cpf);\" maxlength=\"14\" required size=\"35\">\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"50\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          <input type=\"text\" name=\"rg\" onKeyPress=\"MascaraRg(formulario.rg);\" maxlength=\"11\"  onBlur=\"ValidaRg(formulario.rg);\" required size=\"35\">\n");
      out.write("                      </td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                      <td>\n");
      out.write("                          Telefone:\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"50\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          E-mail:\n");
      out.write("                      </td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                      <td>\n");
      out.write("                          <input type=\"text\" name=\"telefone\" onKeyPress=\"MascaraTelefone(formulario.telefone);\" maxlength=\"14\"  onBlur=\"ValidaTelefone(formulario.telefone);\" required size=\"35\">\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"50\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                          <input type=\"email\" name=\"email\" required size=\"35\"/>\n");
      out.write("                      </td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                      <td>\n");
      out.write("                          Senha:\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"50\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                        Confirmar Senha:\n");
      out.write("                      </td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                      <td>\n");
      out.write("                          <input type=\"password\" name=\"senha\" required size=\"35\"/>\n");
      out.write("                      </td>\n");
      out.write("                      <td width=\"50\" height=\"10\">\n");
      out.write("                      </td>\n");
      out.write("                      <td>\n");
      out.write("                         <input type=\"password\" name=\"confirmarSenha\" required size=\"35\"/> \n");
      out.write("                      </td>\n");
      out.write("                  </tr>\n");
      out.write("              </table>\n");
      out.write("              <br>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              <input type=\"submit\" value=\"Cadastrar\" >\n");
      out.write("             <input type=\"reset\" value=\"Limpar\">\n");
      out.write("         \n");
      out.write("         </form>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         ");
      out.write(" \n");
      out.write("         <form>\n");
      out.write("            <table>\n");
      out.write("            \n");
      out.write("        ");

            String valor;
       PessoaDAO dao = new PessoaDAO();
       List pessoas = dao.getListaProfessores();
       for (int i = 0; i < pessoas.size(); i++ ) {
       Pessoa pessoa = (Pessoa) pessoas.get(i);
       
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("           <tr>\n");
      out.write("               \n");
      out.write("               <td>");
      out.print(pessoa.getNome());
      out.write("</td><td> ");
      out.print(pessoa.getMatricula());
      out.write("</td><td>");
      out.print(pessoa.getEmail());
      out.write("</td><td><img src=\"editar.png\" width=\"20\" height=\"20\"/></td><td><img src=\"delete.png\" width=\"20\" height=\"20\"/></td>\n");
      out.write("               \n");
      out.write("               ");

       }
       
      out.write("\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("       </table>\n");
      out.write("        </form>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <form name=\"form3\" method=\"POST\">\n");
      out.write("            <label>Matrícula: </label>\n");
      out.write("            <input type=\"text\" name=\"matricula2\"/>\n");
      out.write("            <input type=\"submit\" value=\"Buscar\"/>\n");
      out.write("        </form>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
      out.write("            ");
 
            
       Pessoa pesso = new Pessoa();
       String matriculaa = request.getParameter("matricula2");
       PessoaDAO daoo = new PessoaDAO();
       List<Pessoa> getAll_2 = daoo.getListaProfessores();     
       for (Pessoa cont2 : getAll_2) {
           if(cont2.getMatricula().equals(matriculaa)){
            
           
      out.write("\n");
      out.write("           <form name=\"form4\" method=\"POST\" action=\"EditarProfessor\">\n");
      out.write("               <input type=\"hidden\" name=\"idPessoa\" value=");
      out.print(cont2.getIdpessoa());
      out.write(" />\n");
      out.write("           <label>Nome: </label>   <input type=\"text\" name=\"nomeEditar\" value=");
      out.print(cont2.getNome());
      out.write(" /> <br>\n");
      out.write("           <label>Matrícula: </label><input type=\"text\" name=\"matriculaEditar\" value=");
      out.print(cont2.getMatricula());
      out.write(" /> <br>\n");
      out.write("           <label>CPF: </label><input type=\"text\" name=\"cpfEditar\" value=");
      out.print(cont2.getCpf());
      out.write(" /> <br>\n");
      out.write("           <label>RG: </label><input type=\"text\" name=\"rgEditar\" value=");
      out.print(cont2.getRg());
      out.write(" /> <br>\n");
      out.write("           <label>Telefone: </label><input type=\"text\" name=\"telefoneEditar\" value=");
      out.print(cont2.getTelefone());
      out.write(" /> <br>\n");
      out.write("           <label>E-mail: </label><input type=\"text\" name=\"emailEditar\" value=");
      out.print(cont2.getEmail());
      out.write(" /> <br>\n");
      out.write("           <label>Senha: </label><input type=\"password\" name=\"senhaEditar\" value=");
      out.print(cont2.getSenha());
      out.write(" /> <br>\n");
      out.write("           \n");
      out.write("            ");
      out.write("\n");
      out.write("           \n");
      out.write("               \n");
      out.write("                  ");

       }
       }
       
      out.write("    \n");
      out.write("      \n");
      out.write("       <input type=\"submit\" value=\"Ok\"/>\n");
      out.write("       <input type=\"reset\" value=\"Cancelar\"/>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("       <br/>\n");
      out.write("       <br/>\n");
      out.write("       <br/>\n");
      out.write("       <form method=\"POST\" action=\"ExcluirProfessor\">\n");
      out.write("           <label>Informe matricula do usuário que deseja remover: </label>\n");
      out.write("           <input type=\"text\" name=\"matriculaRemover\"/>\n");
      out.write("            <input type=\"submit\" value=\"Remover\"/>\n");
      out.write("       </form>\n");
      out.write("       \n");
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

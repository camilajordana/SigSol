package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exemplo2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        <img src=\"imagens/ifrn.png\"><br>\n");
      out.write("        <p>\n");
      out.write("            Isso é um texto! Blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá <br>\n");
      out.write("            blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá blá <\n");
      out.write("        </p>\n");
      out.write("        <br>\n");
      out.write("        <form>\n");
      out.write("            <label>Nome: </label>\n");
      out.write("            <input type=\"text\"><br>\n");
      out.write("            <label>Idade: </label>\n");
      out.write("            <input type=\"text\"><br>\n");
      out.write("            <label>Tipo de escola: </label>\n");
      out.write("            <select>\n");
      out.write("                <option>Pública</option>\n");
      out.write("                <option>Particular</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        ");

            for(int i = 0; i < 10; i++){
                out.println("Camila");
                
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            int i = 0;
            while(i < 10){
                if(i < 5){
                 out.println("Número: "+i+". Número MENOR que 5 <br>");   
                } else{
                    out.println("Número: "+i+". Número MAIOR que 5 <br>");  
                }
                
                i++;
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
}

package br.edu.ifrn.jdbc.servlets;

import br.edu.ifrn.jdbc.dao.LimpezaDAO;
import br.edu.ifrn.jdbc.modelo.Solicitacao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GerenciarLimpeza extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acao = request.getParameter("acao");
        
        try{
            
            
        if(acao.equals("listar4")){
            LimpezaDAO dao = new LimpezaDAO();
                try {
                    List lista = dao.getListaLimpezaSolicitar();

                    request.setAttribute("sessaoListaLimpeza", lista);

                    RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_limpeza.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }
        }
        
        if (acao.equals("listarTodos")) {
                LimpezaDAO mDao = new LimpezaDAO();
                
                try {
                    List lista = mDao.listarTodos();
                    request.setAttribute("sessaoListaLimpeza", lista);
                    RequestDispatcher rd = request.getRequestDispatcher("/relatorioLimpeza.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarLimpeza.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }catch(Exception e){
            
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("acao");
        
        

        if (acao.equals("solicitar")) {

            try {
                this.solicitar(request, response);
            } catch (Exception e) {

            }

        }
        if (acao.equals("solicitar2")) {

            try {
                this.solicitar2(request, response);
            } catch (Exception e) {

            }

        }
        
    }

    private void solicitar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String local = request.getParameter("local");
        String descricao = request.getParameter("descricao");
        String solicitantenomeLimpeza = request.getParameter("solicitantenomeLimpeza");
        String solicitantematriculaLimpeza = request.getParameter("solicitantematriculaLimpeza");
        
        
        if(local.equals("")){
            LimpezaDAO dao = new LimpezaDAO();
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            RequestDispatcher rd = request.getRequestDispatcher("solicitarlimpeza.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setLocalLimpeza(local);
            s.setDescricaoLimpeza(descricao);
            s.setTipo("limpeza");
            s.setStatus("Requisicao em andamento");
            s.setSolicitantenomeLimpeza(solicitantenomeLimpeza);
            s.setSolicitantematriculaLimpeza(solicitantematriculaLimpeza);
            
            try {
                LimpezaDAO dao = new LimpezaDAO();
                dao.solicitarLimpeza(s);
                request.setAttribute("mensagem", "Solicitação enviada!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitarlimpeza.jsp");
                rd.forward(request, response);
            } catch (Exception c) {

            }
        }
        
    
    }

    
        private void solicitar2(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String local = request.getParameter("local");
        String descricao = request.getParameter("descricao");
        String solicitantenomeLimpeza = request.getParameter("solicitantenomeLimpeza");
        String solicitantematriculaLimpeza = request.getParameter("solicitantematriculaLimpeza");
        
        
        if(local.equals("")){
            LimpezaDAO dao = new LimpezaDAO();
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            RequestDispatcher rd = request.getRequestDispatcher("solicitarlimpeza2.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setLocalLimpeza(local);
            s.setDescricaoLimpeza(descricao);
            s.setTipo("limpeza");
            s.setSolicitantenomeLimpeza(solicitantenomeLimpeza);
            s.setSolicitantematriculaLimpeza(solicitantematriculaLimpeza);
            
            try {
                LimpezaDAO dao = new LimpezaDAO();
                dao.solicitarLimpeza(s);
                request.setAttribute("mensagem", "Solicitação enviada!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitarlimpeza2.jsp");
                rd.forward(request, response);
            } catch (Exception c) {

            }
        }
        
    
    }

}

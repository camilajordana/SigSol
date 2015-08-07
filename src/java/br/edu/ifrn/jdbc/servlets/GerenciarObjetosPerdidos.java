package br.edu.ifrn.jdbc.servlets;

import br.edu.ifrn.jdbc.dao.LimpezaDAO;
import br.edu.ifrn.jdbc.dao.ObjetoDAO;
import br.edu.ifrn.jdbc.modelo.Solicitacao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GerenciarObjetosPerdidos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
        
        try{
        if(acao.equals("listar4")){
            ObjetoDAO dao = new ObjetoDAO();
                try {
                    List lista = dao.getListaObjetosSolicitar();

                    request.setAttribute("sessaoListaObjetos", lista);

                    RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_objetosPerdidos.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }
        }
        
        if (acao.equals("listarTodos")) {
                ObjetoDAO mDao = new ObjetoDAO();
                try {
                    List lista = mDao.listarTodos();
                    request.setAttribute("sessaoListaObjetos", lista);
                    RequestDispatcher rd = request.getRequestDispatcher("/relatorioObjeto.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarObjetosPerdidos.class.getName()).log(Level.SEVERE, null, ex);
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

        String objeto = request.getParameter("objeto");
        String dia = request.getParameter("dia");
        String local = request.getParameter("local");
        String descricao = request.getParameter("descricao");
        String solicitantenome = request.getParameter("solicitantenome");
        String solicitantematricula = request.getParameter("solicitantematricula");

        if ((objeto.equals("")) || (dia.equals("")) || (local.equals(""))) {
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            RequestDispatcher rd = request.getRequestDispatcher("objetos.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setObjeto(objeto);
            s.setDiaObjeto(dia);
            s.setLocalObjeto(local);
            s.setDescricaoObjeto(descricao);
            s.setTipo("objeto perdido");
            s.setStatus("Requisicao em andamento");
            s.setSolicitantenomeObjeto(solicitantenome);
            s.setSolicitantematriculaObjeto(solicitantematricula);
            
            
            try{
                    ObjetoDAO dao = new ObjetoDAO();
                    dao.solicitarObjetosPerdidos(s);
                    request.setAttribute("mensagem", "Solicitação enviada!");
                    RequestDispatcher rd = request.getRequestDispatcher("objetos.jsp");
                    rd.forward(request, response);
                }catch(Exception c){
                    
                }
        }
    }

    
    private void solicitar2(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String objeto = request.getParameter("objeto");
        String dia = request.getParameter("dia");
        String local = request.getParameter("local");
        String descricao = request.getParameter("descricao");
        String solicitantenome = request.getParameter("solicitantenome");
        String solicitantematricula = request.getParameter("solicitantematricula");

        if ((objeto.equals("")) || (dia.equals("")) || (local.equals(""))) {
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            RequestDispatcher rd = request.getRequestDispatcher("objetos2.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setObjeto(objeto);
            s.setDiaObjeto(dia);
            s.setLocalObjeto(local);
            s.setDescricaoObjeto(descricao);
            s.setTipo("objeto perdido");
            s.setSolicitantenomeObjeto(solicitantenome);
            s.setSolicitantematriculaObjeto(solicitantematricula);
            
            
            try{
                    ObjetoDAO dao = new ObjetoDAO();
                    dao.solicitarObjetosPerdidos(s);
                    request.setAttribute("mensagem", "Solicitação enviada!");
                    RequestDispatcher rd = request.getRequestDispatcher("objetos2.jsp");
                    rd.forward(request, response);
                }catch(Exception c){
                    
                }
        }
    }

}

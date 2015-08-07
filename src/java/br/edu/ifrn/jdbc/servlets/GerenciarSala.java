/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.jdbc.servlets;

import br.edu.ifrn.jdbc.dao.SalaDAO;
import br.edu.ifrn.jdbc.modelo.Sala;
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

public class GerenciarSala extends HttpServlet {

    logar f = new logar();
    public String teste = f.ativo;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            String acao = request.getParameter("acao");

          if(1==2){
              
          }
            
            
            if (acao.equals("listarSala")) {
                SalaDAO salaDao = new SalaDAO();
                try {
                    List listaSalas = salaDao.getListaSala();

                    request.setAttribute("sessaoListaSala", listaSalas);

                    RequestDispatcher rd = request.getRequestDispatcher("solicitarsala2.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }

            }
            
            
            
            if (acao.equals("listar4")) {
                SalaDAO salaDao = new SalaDAO();
                try {
                    List listaSalas = salaDao.getListaSala();

                    request.setAttribute("sessaoListaSala", listaSalas);

                    RequestDispatcher rd = request.getRequestDispatcher("solicitarsala2.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }

            }
            
            if (acao.equals("listando")) {
                SalaDAO salaDao = new SalaDAO();
                try {
                    List listaSalas = salaDao.getListaSalasSolicitar();

                    request.setAttribute("sessaoListaSalas", listaSalas);

                    RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_sala.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }

            }
            
            if (acao.equals("listarTodos")) {
                SalaDAO mDao = new SalaDAO();
                try {
                    List lista = mDao.listarTodos();
                    request.setAttribute("sessaoListaSalas", lista);
                    RequestDispatcher rd = request.getRequestDispatcher("/relatorioSalas.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            

            
            
            if (acao.equals("listar2")) {
                SalaDAO salaDao = new SalaDAO();
                try {
                    List listaSalas = salaDao.getListaSala();

                    request.setAttribute("sessaoListaSala", listaSalas);

                    RequestDispatcher rd = request.getRequestDispatcher("solicitarsala.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }

            }

            
            
            if (acao.equals("listar")) {
                SalaDAO salaDao = new SalaDAO();
                try {
                    List listaSalas = salaDao.getListaSala();

                    request.setAttribute("sessaoListaSala", listaSalas);

                    RequestDispatcher rd = request.getRequestDispatcher("gerenciarSalas.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }
            }
            
            
            

            if (acao.equals("excluir")) {
                String idsala = request.getParameter("idsala");
                int id = Integer.parseInt(idsala);
                Sala sala = new Sala();
                sala.setIdsala(id);
                SalaDAO dao = new SalaDAO();
                List<Sala> getAll = dao.getListaSala();
                for (Sala cont : getAll) {
                    if (cont.getIdsala() == id) {

                        dao.removerPeloID(sala);

                        acao = "li";
                        if (acao.equals("li")) {
                            SalaDAO salaDao = new SalaDAO();
                            try {
                                List listaSala = salaDao.getListaSala();
                                request.setAttribute("sessaoListaSala", listaSala);
                                RequestDispatcher rd = request.getRequestDispatcher("gerenciarSalas.jsp");
                                rd.forward(request, response);
                            } catch (SQLException ex) {
                                Logger.getLogger(GerenciarSala.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                    }
                }

            }

        } catch (Exception e) {

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

        if (acao.equals("confirmarCadastro")) {
            try {

                this.confirmarCadastro(request, response);

            } catch (Exception e) {

            }
        }

        if (acao.equals("alterarDados")) {
            try {
                this.alterar(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarSala.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void confirmarCadastro(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int validade = 0;
        RequestDispatcher rr = null;
        Sala sala = new Sala();
        String nome = request.getParameter("nome");
        sala.setNome(nome);
        String teste = nome;
        try {
            SalaDAO dao = new SalaDAO();
            List<Sala> getAll = dao.getListaSala();
            for (Sala cont : getAll) {
                String testeValidacao1 = cont.getNome().toLowerCase();
                String testeValidacao2 = teste.toLowerCase();
                if (testeValidacao1.equals(testeValidacao2)) {
                    validade++;
                }
            }
        } catch (Exception e) {

        }

        if (validade > 0) {
            String a = "listar";
            if (a.equals("listar")) {
                SalaDAO salDao = new SalaDAO();
                try {
                    List listaSalas = salDao.getListaSala();
                    request.setAttribute("mensagem", "Sala já cadastrada!");
                    request.setAttribute("sessaoListaSala", listaSalas);

                    RequestDispatcher rd = request.getRequestDispatcher("gerenciarSalas.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            try {

                //CADASTRANDO
                SalaDAO salaDao = new SalaDAO();
                salaDao.adicionarSala(sala);

                String a = "listar";
                if (a.equals("listar")) {
                    SalaDAO salDao = new SalaDAO();
                    try {
                        List listaSalas = salDao.getListaSala();

                        request.setAttribute("sessaoListaSala", listaSalas);

                        RequestDispatcher rd = request.getRequestDispatcher("gerenciarSalas.jsp");
                        rd.forward(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (Exception ex) {

            }
        }

    }

    private void alterar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int validarNOME = 0;

        String idsala = request.getParameter("idsala");
        int id = Integer.parseInt(idsala);
        String nome = request.getParameter("nome");
        Sala sala = new Sala();
        sala.setNome(nome);
        sala.setIdsala(id);
        String testeNOME = nome.toLowerCase();

        try {
            SalaDAO dao = new SalaDAO();
            List<Sala> getSalas = dao.getListaSala();
            for (Sala cont : getSalas) {
                String testeNOME2 = cont.getNome().toLowerCase();
                if ((testeNOME.equals(testeNOME2)) && (id != cont.getIdsala())) {
                    validarNOME = validarNOME + 1;
                }
            }

            if (validarNOME > 0) {
                SalaDAO mate = new SalaDAO();
                try {
                    List lista = mate.getListaSala();
                    request.setAttribute("mensagem", "Sala já cadastrado!");
                    request.setAttribute("sessaoListaSala", lista);
                    RequestDispatcher rd = request.getRequestDispatcher("gerenciarSalas.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    SalaDAO dao2 = new SalaDAO();
                    dao2.alterarSala(sala);

                    String a = "li";
                    if (a.equals("li")) {
                        SalaDAO mate = new SalaDAO();
                        try {
                            List listaSala = mate.getListaSala();
                            request.setAttribute("sessaoListaSala", listaSala);

                            RequestDispatcher rd = request.getRequestDispatcher("gerenciarSalas.jsp");
                            rd.forward(request, response);
                        } catch (SQLException ex) {
                            Logger.getLogger(GerenciarSala.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } catch (Exception e) {

                }
            }
        } catch (Exception c) {

        }

    }

    private void solicitar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String sala = request.getParameter("sala");
        String dia = request.getParameter("dia");
        String inicio = request.getParameter("inicio");
        String termino = request.getParameter("termino");
        String descricao = request.getParameter("descricao");
        String solicitantenome = request.getParameter("solicitantenome");
        String solicitantematricula = request.getParameter("solicitantematricula");

           // String solicitante = request.getParameter("s");
        //Se algum campo estiver vazio
        if ((dia.equals("")) || (inicio.equals("")) || (termino.equals(""))) {
            SalaDAO dao = new SalaDAO();
            List lista = dao.getListaSala();
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            request.setAttribute("sessaoListaSala", lista);
            RequestDispatcher rd = request.getRequestDispatcher("solicitarsala.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setSala(sala);
            s.setDiaSala(dia);
            s.setInicioSala(inicio);
            s.setTerminoSala(termino);
            s.setDescricaoSala(descricao);
            s.setTipo("sala");
            s.setStatus("Requisicao em andamento");
            s.setSolicitantenomeSala(solicitantenome);
            s.setSolicitantematriculaSala(solicitantematricula);

            logar n = new logar();
                //String testando = n.getUsuario();
            //String username = System.getProperty("user.name"); 
            //String usuariooo = request.getParameter(testando);
            //s.setSolicitante_matricula(usuariooo);

            String m = n.getH();
            // s.setSolicitante_matricula(solicitante);
            try {
                SalaDAO dao = new SalaDAO();
                List lista = dao.getListaSala();
                dao.solicitarSala1(s);
                request.setAttribute("mensagem", "Solicitação enviada!");
                request.setAttribute("sessaoListaSala", lista);
                RequestDispatcher rd = request.getRequestDispatcher("solicitarsala.jsp");
                rd.forward(request, response);
            } catch (Exception c) {

            }
        }

    }


    private void solicitar2(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String sala = request.getParameter("sala");
        String dia = request.getParameter("dia");
        String inicio = request.getParameter("inicio");
        String termino = request.getParameter("termino");
        String descricao = request.getParameter("descricao");
        String solicitantenome = request.getParameter("solicitantenome");
        String solicitantematricula = request.getParameter("solicitantematricula");

           // String solicitante = request.getParameter("s");
        //Se algum campo estiver vazio
        if ((dia.equals("")) || (inicio.equals("")) || (termino.equals(""))) {
            SalaDAO dao = new SalaDAO();
            List lista = dao.getListaSala();
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            request.setAttribute("sessaoListaSala", lista);
            RequestDispatcher rd = request.getRequestDispatcher("solicitarsala2.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setSala(sala);
            s.setDiaSala(dia);
            s.setInicioSala(inicio);
            s.setTerminoSala(termino);
            s.setDescricaoSala(descricao);
            s.setTipo("sala");
            s.setSolicitantenomeSala(solicitantenome);
            s.setSolicitantematriculaSala(solicitantematricula);

            logar n = new logar();
                //String testando = n.getUsuario();
            //String username = System.getProperty("user.name"); 
            //String usuariooo = request.getParameter(testando);
            //s.setSolicitante_matricula(usuariooo);

            String m = n.getH();
            // s.setSolicitante_matricula(solicitante);
            try {
                SalaDAO dao = new SalaDAO();
                List lista = dao.getListaSala();
                dao.solicitarSala1(s);
                request.setAttribute("mensagem", "Solicitação enviada!");
                request.setAttribute("sessaoListaSala", lista);
                RequestDispatcher rd = request.getRequestDispatcher("solicitarsala2.jsp");
                rd.forward(request, response);
            } catch (Exception c) {

            }
        }

    }


}

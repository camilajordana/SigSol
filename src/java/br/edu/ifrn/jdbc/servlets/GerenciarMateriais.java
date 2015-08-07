/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.jdbc.servlets;

import br.edu.ifrn.jdbc.dao.MaterialDAO;
import br.edu.ifrn.jdbc.modelo.Material;
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

/**
 *
 * @author maryna
 */
public class GerenciarMateriais extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
        
        
        
        

        try {
            
 
            if (acao.equals("aceito")) {
                try {
                    this.aceito(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);

                }
            }

            if (acao.equals("feito")) {
                try {

                    this.gerenciarSolicitacaoEscritorio1(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (acao.equals("listar3")) {
                MaterialDAO mDao = new MaterialDAO();
                try {
                    List lista = mDao.getListaEscritorio4();
                    request.setAttribute("sessaoListaMateriais", lista);
                    RequestDispatcher rd = request.getRequestDispatcher("/solicitacoes_materiaEscritorio.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            if (acao.equals("listarTodos")) {
                MaterialDAO mDao = new MaterialDAO();
                try {
                    List lista = mDao.listarTodos();
                    request.setAttribute("sessaoListaMateriais", lista);
                    RequestDispatcher rd = request.getRequestDispatcher("/relatorio.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            if (acao.equals("listarTodosVideoAula")) {
                MaterialDAO mDao = new MaterialDAO();
                try {
                    List lista = mDao.listarTodos2();
                    request.setAttribute("sessaoListaMateriais", lista);
                    RequestDispatcher rd = request.getRequestDispatcher("/relatorioVideoAula.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            

            if (acao.equals("listar4")) {
                MaterialDAO materialDao = new MaterialDAO();
                try {
                    List lista = materialDao.getListaVideoAulaSolicitar();
                    request.setAttribute("sessaoListaVideoAula", lista);
                    RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_videoAula.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }
            }

            if (acao.equals("listar2")) {
                MaterialDAO materialDao = new MaterialDAO();
                try {
                    List listaEscritorio = materialDao.getListaEscritorio();
                    List listaVideoaula = materialDao.getListaVideoaula();

                    request.setAttribute("sessaoListaEscritorio", listaEscritorio);
                    request.setAttribute("sessaoListaVideoaula", listaVideoaula);
                    RequestDispatcher rd = request.getRequestDispatcher("material.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }
            }

            if (acao.equals("listar")) {
                MaterialDAO materialDao = new MaterialDAO();
                try {
                    List listaEscritorio = materialDao.getListaEscritorio();
                    List listaVideoaula = materialDao.getListaVideoaula();

                    request.setAttribute("sessaoListaEscritorio", listaEscritorio);
                    request.setAttribute("sessaoListaVideoaula", listaVideoaula);

                    RequestDispatcher rd = request.getRequestDispatcher("gerenciarMateriais.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }
            }

            if (acao.equals("excluir")) {
                String idmaterial = request.getParameter("idmaterial");
                int id = Integer.parseInt(idmaterial);
                Material material = new Material();
                material.setIdmaterial(id);
                MaterialDAO dao = new MaterialDAO();
                List<Material> getAll = dao.getListaEscritorio();
                for (Material cont : getAll) {
                    if (cont.getIdmaterial() == id) {
                        dao.removerPeloID(material);

                        acao = "li";
                        if (acao.equals("li")) {
                            MaterialDAO materialDao = new MaterialDAO();
                            try {
                                List listaEscritorio = materialDao.getListaEscritorio();
                                List listaVideoaula = materialDao.getListaVideoaula();

                                request.setAttribute("sessaoListaEscritorio", listaEscritorio);
                                request.setAttribute("sessaoListaVideoaula", listaVideoaula);

                                RequestDispatcher rd = request.getRequestDispatcher("gerenciarMateriais.jsp");
                                rd.forward(request, response);
                            } catch (SQLException ex) {
                                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                    }
                }

            }

            if (acao.equals("excluirVideoaula")) {
                String idmaterial = request.getParameter("idmaterial");
                int id = Integer.parseInt(idmaterial);
                Material material = new Material();
                material.setIdmaterial(id);
                MaterialDAO dao = new MaterialDAO();
                List<Material> getAll = dao.getListaVideoaula();
                for (Material cont : getAll) {
                    if (cont.getIdmaterial() == id) {
                        dao.removerPeloID(material);

                        acao = "li";
                        if (acao.equals("li")) {
                            MaterialDAO materialDao = new MaterialDAO();
                            try {
                                List listaEscritorio = materialDao.getListaEscritorio();
                                List listaVideoaula = materialDao.getListaVideoaula();

                                request.setAttribute("sessaoListaEscritorio", listaEscritorio);
                                request.setAttribute("sessaoListaVideoaula", listaVideoaula);

                                RequestDispatcher rd = request.getRequestDispatcher("gerenciarMateriais.jsp");
                                rd.forward(request, response);
                            } catch (SQLException ex) {
                                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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

        if (acao.equals("solicitarEscritorio2")) {
            try {

                this.solicitarEscritorio2(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (acao.equals("solicitarVideoAula")) {
            try {

                this.solicitarVideoAula(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (acao.equals("solicitarEscritorio")) {
            try {

                this.solicitarEscritorio(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (acao.equals("confirmar_escritorio")) {
            try {

                this.confirmarDadosEscritorio(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (acao.equals("confirmar_videoaula")) {
            try {

                this.confirmarDadosVideoaula(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (acao.equals("alterarDados")) {
            try {
                this.alterar(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private void confirmarDadosEscritorio(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int validade = 0;
        RequestDispatcher rr = null;
        Material material = new Material();
        int tipo = 1; // tipo 1 = MATERIAL DE ESCRITÓRIO
        String nome_material = request.getParameter("nome_escritorio");
        material.setNome_material(nome_material);
        material.setTipo(tipo);
        //VERIFICAR SE MATERIAL JÁ ESTÁ CADASTRADO!!!
        if (tipo == 1) {
            String teste = nome_material;
            try {
                MaterialDAO dao = new MaterialDAO();
                List<Material> getAll = dao.getListaEscritorio();
                for (Material cont : getAll) {
                    String testeValidacao1 = cont.getNome_material().toLowerCase();
                    String testeValidacao2 = teste.toLowerCase();
                    if (testeValidacao1.equals(testeValidacao2)) {
                        validade++;
                    }
                }
            } catch (Exception e) {

            }
        }

        if (validade > 0) {
            String a = "listar";
            if (a.equals("listar")) {
                MaterialDAO materialDao = new MaterialDAO();
                try {
                    List listaEscritorio = materialDao.getListaEscritorio();
                    List listaVideoaula = materialDao.getListaVideoaula();
                    request.setAttribute("mensagem", "Material já cadastrado!");
                    request.setAttribute("sessaoListaEscritorio", listaEscritorio);
                    request.setAttribute("sessaoListaVideoaula", listaVideoaula);

                    RequestDispatcher rd = request.getRequestDispatcher("gerenciarMateriais.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            try {
                MaterialDAO materialDao = new MaterialDAO();
                materialDao.adicionarMaterial(material);

                //AQUI INÍCIO
                String a = "listar";
                if (a.equals("listar")) {
                    MaterialDAO pessoaDao = new MaterialDAO();
                    try {
                        List listaEscritorio = materialDao.getListaEscritorio();
                        List listaVideoaula = materialDao.getListaVideoaula();

                        request.setAttribute("sessaoListaEscritorio", listaEscritorio);
                        request.setAttribute("sessaoListaVideoaula", listaVideoaula);

                        RequestDispatcher rd = request.getRequestDispatcher("gerenciarMateriais.jsp");
                        rd.forward(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //AQUI FIM
                //FALTAAAAAAAA AQUIIIIIIIIIIIIIIIIIIIIII

            } catch (Exception e) {

            }
        }

    }

    private void confirmarDadosVideoaula(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        int validade = 0;
        RequestDispatcher rr = null;
        Material material = new Material();
        int tipo = 2; // tipo 2 = MATERIAL DE VIDEOAULA
        String nome_material = request.getParameter("nome_videoaula");
        material.setNome_material(nome_material);
        material.setTipo(tipo);

        //VERIFICAR SE MATERIAL JÁ ESTÁ CADASTRADO!!!
        if (tipo == 2) {
            String teste = nome_material;
            try {
                MaterialDAO dao = new MaterialDAO();
                List<Material> getAll = dao.getListaVideoaula();
                for (Material cont : getAll) {
                    String testeValidacao1 = cont.getNome_material().toLowerCase();
                    String testeValidacao2 = teste.toLowerCase();
                    if (testeValidacao1.equals(testeValidacao2)) {
                        validade++;
                    }
                }
            } catch (Exception e) {

            }
        }

        if (validade > 0) {

            String a = "listar";
            if (a.equals("listar")) {
                MaterialDAO materialDao = new MaterialDAO();
                try {
                    List listaEscritorio = materialDao.getListaEscritorio();
                    List listaVideoaula = materialDao.getListaVideoaula();
                    request.setAttribute("mensagem", "Material já cadastrado!");
                    request.setAttribute("sessaoListaEscritorio", listaEscritorio);
                    request.setAttribute("sessaoListaVideoaula", listaVideoaula);

                    RequestDispatcher rd = request.getRequestDispatcher("gerenciarMateriais.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            try {
                MaterialDAO materialDao = new MaterialDAO();
                materialDao.adicionarMaterial(material);

                //AQUI INÍCIO
                String a = "listar";
                if (a.equals("listar")) {
                    MaterialDAO pessoaDao = new MaterialDAO();
                    try {
                        List listaEscritorio = materialDao.getListaEscritorio();
                        List listaVideoaula = materialDao.getListaVideoaula();

                        request.setAttribute("sessaoListaEscritorio", listaEscritorio);
                        request.setAttribute("sessaoListaVideoaula", listaVideoaula);

                        RequestDispatcher rd = request.getRequestDispatcher("gerenciarMateriais.jsp");
                        rd.forward(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //AQUI FIM
                //FALTAAAAAAAA AQUIIIIIIIIIIIIIIIIIIIIII

            } catch (Exception e) {

            }
        }

    }

    private void alterar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        int validarNOME = 0;
        String tipomaterial = request.getParameter("tipo");
        String nome = request.getParameter("nome_material");
        String idmaterial = request.getParameter("idmaterial");
        Material material = new Material();
        material.setIdmaterial(Integer.parseInt(idmaterial));
        material.setNome_material(nome);
        material.setTipo(Integer.parseInt(tipomaterial));

        int testeTIPO = Integer.parseInt(tipomaterial);
        int testeID = Integer.parseInt(idmaterial);
        String nomeTESTE2 = nome.toLowerCase();

        try {
            MaterialDAO dao = new MaterialDAO();
            if (testeTIPO == 1) {
                List<Material> getMateriais = dao.getListaEscritorio();
                for (Material cont : getMateriais) {

                    String nomeTESTE = cont.getNome_material().toLowerCase();
                    if ((nomeTESTE.equals(nomeTESTE2)) && (testeID != cont.getIdmaterial())) {
                        validarNOME = validarNOME + 1;
                    }
                }
            }
            if (testeTIPO == 2) {
                List<Material> getMateriais = dao.getListaVideoaula();
                for (Material cont : getMateriais) {

                    String nomeTESTE = cont.getNome_material().toLowerCase();
                    if ((nomeTESTE.equals(nomeTESTE2)) && (testeID != cont.getIdmaterial())) {
                        validarNOME = validarNOME + 1;
                    }
                }
            }
        } catch (Exception e) {

        }

        if (validarNOME > 0) {
            MaterialDAO mate = new MaterialDAO();
            try {
                List listaEscritorio = mate.getListaEscritorio();
                List listaVideoaula = mate.getListaVideoaula();
                request.setAttribute("mensagem", "Material já cadastrado!");
                request.setAttribute("sessaoListaEscritorio", listaEscritorio);
                request.setAttribute("sessaoListaVideoaula", listaVideoaula);
                RequestDispatcher rd = request.getRequestDispatcher("gerenciarMateriais.jsp");
                rd.forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            MaterialDAO dao = new MaterialDAO();
            dao.alterarPessoa(material);
            String a = "li";
            if (a.equals("li")) {
                MaterialDAO mate = new MaterialDAO();
                try {
                    List listaEscritorio = mate.getListaEscritorio();
                    List listaVideoaula = mate.getListaVideoaula();

                    request.setAttribute("sessaoListaEscritorio", listaEscritorio);
                    request.setAttribute("sessaoListaVideoaula", listaVideoaula);

                    RequestDispatcher rd = request.getRequestDispatcher("gerenciarMateriais.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    private void solicitarEscritorio(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String escritorio = request.getParameter("escritorio");
        String quantidade = request.getParameter("quantidade");
        String descricaoEscritorio = request.getParameter("descricaoEscritorio");
        String solicitantenomeEscritorio = request.getParameter("solicitantenomeEscritorio");
        String solicitantematriculaEscritorio = request.getParameter("solicitantematriculaEscritorio");

        if (quantidade.equals("")) {
            MaterialDAO dao = new MaterialDAO();
            List lista = dao.getListaEscritorio();
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            request.setAttribute("sessaoListaEscritorio", lista);
            RequestDispatcher rd = request.getRequestDispatcher("material.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setEscritorio(escritorio);
            s.setStatus("Requisicao em andamento");
            s.setQuantidadeEscritorio(Integer.parseInt(quantidade));
            s.setDescricaoEscritorio(descricaoEscritorio);
            s.setTipo("material de escritorio");
            s.setSolicitantenomeEscritorio(solicitantenomeEscritorio);
            s.setSolicitantematriculaEscritorio(solicitantematriculaEscritorio);

            try {
                MaterialDAO dao = new MaterialDAO();
                List lista = dao.getListaEscritorio();
                dao.solicitarEscritorio(s);
                request.setAttribute("mensagem", "Solicitação enviada!");
                request.setAttribute("sessaoListaEscritorio", lista);
                RequestDispatcher rd = request.getRequestDispatcher("material.jsp");
                rd.forward(request, response);
            } catch (Exception c) {

            }
        }

    }

    private void solicitarVideoAula(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String dia = request.getParameter("dia");
        String inicio = request.getParameter("inicio");
        String termino = request.getParameter("termino");
        String descricaoVideoAula = request.getParameter("descricaoVideoAula");
        String solicitantenomeVideoAula = request.getParameter("solicitantenomeVideoAula");
        String solicitantematriculaVideoAula = request.getParameter("solicitantematriculaVideoAula");

        if ((dia.equals("")) && (inicio.equals("")) && (termino.equals(""))) {
            MaterialDAO dao = new MaterialDAO();
            List lista = dao.getListaEscritorio();
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            request.setAttribute("sessaoListaEscritorio", lista);
            RequestDispatcher rd = request.getRequestDispatcher("material.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setDiaVideoAula(dia);
            s.setInicioVideoAula(inicio);
            s.setTerminoVideoAula(termino);
            s.setDescricaoVideoAula(descricaoVideoAula);
            s.setTipo("material para videoaula");
            s.setStatus("Requisicao em andamento");
            s.setSolicitantematriculaVideoAula(solicitantematriculaVideoAula);
            s.setSolicitantenomeVideoAula(solicitantenomeVideoAula);

            try {
                MaterialDAO dao = new MaterialDAO();
                List lista = dao.getListaEscritorio();
                dao.solicitarVideoAula(s);
                request.setAttribute("mensagem", "Solicitação enviada!");
                request.setAttribute("sessaoListaEscritorio", lista);
                RequestDispatcher rd = request.getRequestDispatcher("material.jsp");
                rd.forward(request, response);
            } catch (Exception c) {

            }
        }

    }

    private void gerenciarSolicitacaoEscritorio1(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        String idsolicitarescritorio = request.getParameter("idsolicitarescritorio");
        String id_solicitacaoEscritorio = request.getParameter("id_solicitacaoEscritorio");
        String comentarioEscritorio = request.getParameter("comentarioEscritorio");
        String status = request.getParameter("status");
        int id_solicitacaoEscritorio2 = Integer.parseInt(id_solicitacaoEscritorio);
        int idsolicitarescritorio2 = Integer.parseInt(idsolicitarescritorio);
        Solicitacao s = new Solicitacao();
        s.setIdsolicitarescritorio(idsolicitarescritorio2);
        s.setId_solicitacaoEscritorio(id_solicitacaoEscritorio2);
        s.setComentarioEscritorio(comentarioEscritorio);
        s.setStatus("Solicitação aceita");
        MaterialDAO dao = new MaterialDAO();
        List<Solicitacao> getAll = dao.getListaEscritorio2();

        for (Solicitacao cont : getAll) {
            if (cont.getIdsolicitarescritorio() == idsolicitarescritorio2) {
                //FAZER O MÉTODO PARA ALTERAR COMENTARIO
                // PAREI AQUIIIIIIIIIIIIIIIIIIIIIIII
                dao.alterarEscritorio(s);

                String acao = "listar";
                if (acao.equals("listar")) {
                    MaterialDAO pessoaDao = new MaterialDAO();
                    try {
                        List listaPessoas = pessoaDao.getListaEscritorio2();
                        request.setAttribute("sessaoListaMateriais", listaPessoas);
                        RequestDispatcher rd = request.getRequestDispatcher("/solicitacoes_materialEscritorio.jsp");
                        rd.forward(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                RequestDispatcher rd = request.getRequestDispatcher("/solicitacoes_materialEscritorio.jsp");
                rd.forward(request, response);
            }
        }

    }

    private void solicitarEscritorio2(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String escritorio = request.getParameter("escritorio");
        String quantidade = request.getParameter("quantidade");
        String descricaoEscritorio = request.getParameter("descricaoEscritorio");
        String solicitantenomeEscritorio = request.getParameter("solicitantenomeEscritorio");
        String solicitantematriculaEscritorio = request.getParameter("solicitantematriculaEscritorio");

        if (quantidade.equals("")) {
            MaterialDAO dao = new MaterialDAO();
            List lista = dao.getListaEscritorio();
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            request.setAttribute("sessaoListaEscritorio", lista);
            RequestDispatcher rd = request.getRequestDispatcher("material2.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setEscritorio(escritorio);
            s.setQuantidadeEscritorio(Integer.parseInt(quantidade));
            s.setDescricaoEscritorio(descricaoEscritorio);
            s.setTipo("material de escritorio");
            s.setSolicitantenomeEscritorio(solicitantenomeEscritorio);
            s.setSolicitantematriculaEscritorio(solicitantematriculaEscritorio);

            try {
                MaterialDAO dao = new MaterialDAO();
                List lista = dao.getListaEscritorio();
                dao.solicitarEscritorio(s);
                request.setAttribute("mensagem", "Solicitação enviada!");
                request.setAttribute("sessaoListaEscritorio", lista);
                RequestDispatcher rd = request.getRequestDispatcher("material2.jsp");
                rd.forward(request, response);
            } catch (Exception c) {

            }
        }

    }

    private void aceito(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

    }

}

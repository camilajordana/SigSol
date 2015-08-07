package br.edu.ifrn.jdbc.servlets;

import br.edu.ifrn.jdbc.dao.LivroDAO;
import br.edu.ifrn.jdbc.modelo.Livro;
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

public class GerenciarLivros extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");

        try {
          
            if(acao.equals("listar4")){
                LivroDAO dao = new LivroDAO();
                try {
                    List lista = dao.getListaLivrosSolicitar();

                    request.setAttribute("sessaoListaLivros", lista);

                    RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_livro.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }
            }
            
            if (acao.equals("listarTodos")) {
                LivroDAO mDao = new LivroDAO();
                try {
                    List lista = mDao.listarTodos();
                    request.setAttribute("sessaoListaLivros", lista);
                    RequestDispatcher rd = request.getRequestDispatcher("/relatorioLivros.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarLivros.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(acao.equals("listaj")){
                LivroDAO livroDao = new LivroDAO();
                try {
                    List listaLivros = livroDao.getListaLivro();

                    request.setAttribute("sessaoListaLivro", listaLivros);

                    RequestDispatcher rd = request.getRequestDispatcher("gerenciarHorario.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }
            }
            

            if (acao.equals("listar2")) {
                LivroDAO livroDao = new LivroDAO();
                try {
                    List listaLivros = livroDao.getListaLivro();

                    request.setAttribute("sessaoListaLivro", listaLivros);

                    RequestDispatcher rd = request.getRequestDispatcher("solicitarlivro.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }

            }

            
            if (acao.equals("listarLivro")) {
                LivroDAO livroDao = new LivroDAO();
                try {
                    List listaLivros = livroDao.getListaLivro();

                    request.setAttribute("sessaoListaLivro", listaLivros);

                    RequestDispatcher rd = request.getRequestDispatcher("solicitarlivro2.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                }

            }
            
            if (acao.equals("listar")) {
                LivroDAO dao = new LivroDAO();
                try {
                    List listaLivros = dao.getListaLivro();
                    request.setAttribute("sessaoListaLivro", listaLivros);
                    RequestDispatcher rd = request.getRequestDispatcher("/gerenciarLivros.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (acao.equals("excluir")) {
                String idlivro = request.getParameter("idlivro");
                int id = Integer.parseInt(idlivro);
                Livro livro = new Livro();
                livro.setIdlivro(id);
                LivroDAO dao = new LivroDAO();
                List<Livro> getAll = dao.getListaLivro();
                for (Livro cont : getAll) {
                    if (cont.getIdlivro() == id) {
                        dao.removerPeloID(livro);

                        acao = "li";
                        if (acao.equals("li")) {
                            LivroDAO livroDao = new LivroDAO();
                            try {
                                List listaLivro = livroDao.getListaLivro();
                                request.setAttribute("sessaoListaLivro", listaLivro);
                                RequestDispatcher rd = request.getRequestDispatcher("gerenciarLivros.jsp");
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

        if (acao.equals("cadastrar")) {
            try {

                this.cadastrar(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarLivros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (acao.equals("alterarDados")) {
            try {

                this.alterar(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarLivros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int validade = 0;
        RequestDispatcher rr = null;
        Livro livro = new Livro();

        String nome = request.getParameter("nome");
        String autor = request.getParameter("autor");
        String disciplina = request.getParameter("disciplina");
        String isbn_string = request.getParameter("isbn");
        livro.setNome(nome);
        livro.setAutor(autor);
        livro.setDisciplina(disciplina);
        livro.setIsbn(Integer.parseInt(isbn_string));

        try {
            LivroDAO dao = new LivroDAO();
            List<Livro> getAll = dao.getListaLivro();
            for (Livro cont : getAll) {
                String teste = Integer.toString(cont.getIsbn());

                if (teste.equals(isbn_string)) {
                    validade++;
                }
            }
        } catch (Exception e) {

        }

        if (validade > 0) {
            request.setAttribute("mensagem", "Livro já cadastrado!");
            rr = request.getRequestDispatcher("/gerenciarLivros.jsp");
            rr.forward(request, response);
        } else {
            try {
                LivroDAO livroDao = new LivroDAO();
                livroDao.adicionarLivro(livro);

                //AQUI INÍCIO
                String a = "listar";
                if (a.equals("listar")) {
                    LivroDAO lDao = new LivroDAO();
                    try {
                        List listaLivros = lDao.getListaLivro();

                        request.setAttribute("sessaoListaLivro", listaLivros);
                        RequestDispatcher rd = request.getRequestDispatcher("gerenciarLivros.jsp");
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
        String idlivro = request.getParameter("idlivro");
        int id = Integer.parseInt(idlivro);
        String nome = request.getParameter("nome");
        String autor = request.getParameter("autor");
        String disciplina = request.getParameter("disciplina");
        String is = request.getParameter("isbn");
        int isbn = Integer.parseInt(is);
        Livro livro = new Livro();
        livro.setIdlivro(id);
        livro.setNome(nome);
        livro.setAutor(autor);
        livro.setDisciplina(disciplina);
        livro.setIsbn(isbn);
        int validarISBN = 0;

        try {

            LivroDAO dao = new LivroDAO();
            List<Livro> getLivros = dao.getListaLivro();
            for (Livro cont : getLivros) {
                if ((isbn == cont.getIsbn()) && (id != cont.getIdlivro())) {
                    validarISBN++;
                }
            }

            if (validarISBN > 0) {
                LivroDAO mate = new LivroDAO();
                try {
                    List lista = mate.getListaLivro();
                    request.setAttribute("mensagem", "Livro já cadastrado!");
                    request.setAttribute("sessaoListaLivro", lista);
                    RequestDispatcher rd = request.getRequestDispatcher("gerenciarLivros.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarLivros.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    LivroDAO dao2 = new LivroDAO();
                    dao2.alterarLivro(livro);

                    String a = "li";
                    if (a.equals("li")) {
                        LivroDAO mate = new LivroDAO();
                        try {
                            List listaLivro = mate.getListaLivro();
                            request.setAttribute("sessaoListaLivro", listaLivro);

                            RequestDispatcher rd = request.getRequestDispatcher("gerenciarLivros.jsp");
                            rd.forward(request, response);
                        } catch (SQLException ex) {
                            Logger.getLogger(GerenciarLivros.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } catch (Exception e) {

                }
            }

        } catch (Exception e) {

        }

    }

    private void solicitar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String livro = request.getParameter("livro");
        String quantidade = request.getParameter("quantidade");
        String descricao = request.getParameter("descricao");
        String solicitantenome = request.getParameter("solicitantenome");
        String solicitantematricula = request.getParameter("solicitantematricula");

        if (quantidade.equals("")) {
            LivroDAO dao = new LivroDAO();
            List lista = dao.getListaLivro();
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            request.setAttribute("sessaoListaLivro", lista);
            RequestDispatcher rd = request.getRequestDispatcher("solicitarlivro.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setLivro(livro);
            s.setQuantidadeLivro(Integer.parseInt(quantidade));
            s.setDescricaoLivro(descricao);
            s.setTipo("livro");
            s.setStatus("Requisicao em andamento");
            s.setSolicitantenomeLivro(solicitantenome);
            s.setSolicitantematriculaLivro(solicitantematricula);

            try {
                LivroDAO dao = new LivroDAO();
                List lista = dao.getListaLivro();
                dao.solicitarLivro(s);
                request.setAttribute("mensagem", "Solicitação enviada!");
                request.setAttribute("sessaoListaLivro", lista);
                RequestDispatcher rd = request.getRequestDispatcher("solicitarlivro.jsp");
                rd.forward(request, response);
            } catch (Exception c) {

            }

        }

    }

    
    private void solicitar2(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        String livro = request.getParameter("livro");
        String quantidade = request.getParameter("quantidade");
        String descricao = request.getParameter("descricao");
        String solicitantenome = request.getParameter("solicitantenome");
        String solicitantematricula = request.getParameter("solicitantematricula");

        if (quantidade.equals("")) {
            LivroDAO dao = new LivroDAO();
            List lista = dao.getListaLivro();
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            request.setAttribute("sessaoListaLivro", lista);
            RequestDispatcher rd = request.getRequestDispatcher("solicitarlivro2.jsp");
            rd.forward(request, response);
        } else {
            Solicitacao s = new Solicitacao();
            s.setLivro(livro);
            s.setQuantidadeLivro(Integer.parseInt(quantidade));
            s.setDescricaoLivro(descricao);
            s.setTipo("livro");
            s.setSolicitantenomeLivro(solicitantenome);
            s.setSolicitantematriculaLivro(solicitantematricula);

            try {
                LivroDAO dao = new LivroDAO();
                List lista = dao.getListaLivro();
                dao.solicitarLivro(s);
                request.setAttribute("mensagem", "Solicitação enviada!");
                request.setAttribute("sessaoListaLivro", lista);
                RequestDispatcher rd = request.getRequestDispatcher("solicitarlivro2.jsp");
                rd.forward(request, response);
            } catch (Exception c) {

            }

        }

    }

}

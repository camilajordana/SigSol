package br.edu.ifrn.jdbc.servlets;

import br.edu.ifrn.jdbc.dao.PessoaDAO;
import br.edu.ifrn.jdbc.modelo.Pessoa;
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

public class GerenciarUsuarios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String acao = request.getParameter("acao");
            // Listar Usuários

            if(1==2){
                
            }

            if (acao.equals("listar")) {
                PessoaDAO pessoaDao = new PessoaDAO();
                try {
                    List listaPessoas = pessoaDao.getLista();
                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (acao.equals("excluirusuario")) {
                String matricula = request.getParameter("matricula");
                Pessoa pessoa = new Pessoa();
                pessoa.setMatricula(matricula);
                PessoaDAO dao = new PessoaDAO();
                List<Pessoa> getAll = dao.getLista();
                for (Pessoa cont : getAll) {
                    if (cont.getMatricula().equals(matricula)) {
                        dao.removerPessoaPorMatricula(pessoa);
                        dao.update(pessoa);

                        acao = "listar";
                        if (acao.equals("listar")) {
                            PessoaDAO pessoaDao = new PessoaDAO();
                            try {
                                List listaPessoas = pessoaDao.getLista();
                                request.setAttribute("sessaoListaPessoas", listaPessoas);
                                RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                rd.forward(request, response);
                            } catch (SQLException ex) {
                                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                        rd.forward(request, response);
                    }
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");

        if (acao.equals("alterarSenha")) {
            try {
                this.alterarSenha(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //  if (acao.equals("alterarSenha")) {
        //    try {
        //      String matricula = request.getParameter("matricula");
        //    String senhaAtual = request.getParameter("senhaAtual");
        //  String novaSenha = request.getParameter("novaSenha");
        //String confirmarSenha = request.getParameter("confirmarSenha");
//                int teste = 0;
        //              Pessoa pessoa = new Pessoa();
        //            PessoaDAO dao = new PessoaDAO();
        //Se a nova senha for igual a confirmar senha
        //          if (novaSenha.equals(confirmarSenha)) {
        //            List<Pessoa> getLista = dao.getLista();
        //          for (Pessoa cont1 : getLista) {
        //            if (cont1.getMatricula().equals(matricula)) {
        //              teste = 1;
//                        }
//                    }
        //                  if (teste == 1) {
        //                    request.setAttribute("mensagem", "Senha alterada TESTE!");
        //                  RequestDispatcher rd = request.getRequestDispatcher("/alterarSenha.jsp");
        //                rd.forward(request, response);
        //          }
        //             if (cont.getMatricula().equals(matricula)) {
        //                   if (cont.getSenha().equals(senhaAtual)) {
        //     int id = cont.getIdpessoa();
        //       pessoa.setSenha(novaSenha);
        //         pessoa.setIdpessoa(id);
        //           dao.atualizarSenha(pessoa);
        //             teste = 1;
        //           }
        //         }
        //       }
        //    }
        //    if (teste == 1) {
        //      request.setAttribute("mensagem", "Senha alterada!");
        //           RequestDispatcher rd = request.getRequestDispatcher("/alterarSenha.jsp");
        //         rd.forward(request, response);
        //   }
        //          } catch (SQLException ex) {
//                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        //     }
        //   }
        // Cadastrar usuário
        if (acao.equals("confirmarDados")) {
            try {
                this.confirmarDadosDoCadastro(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (acao.equals("alterarDados")) {
            try {
                this.alterarDados(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (acao.equals("buscar")) {
            try {
                this.buscarUsuarios(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void confirmarDadosDoCadastro(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        //CRIANDO OBJETO DO TIPO PESSOA
        int validade = 0;
        Pessoa pessoa = new Pessoa();
        String categoria = "";
        String tipoPegar = request.getParameter("categoriaUsuario");
        String nome = request.getParameter("nome");
        String matricula = request.getParameter("matricula");
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String cSenha = request.getParameter("confirmarSenha");
        RequestDispatcher rr = null;
        pessoa.setMatricula(matricula);
        pessoa.setNome(nome);
        pessoa.setTelefone(telefone);
        pessoa.setEmail(email);
        pessoa.setRg(rg);
        pessoa.setCpf(cpf);
        pessoa.setSenha(senha);
        if (!tipoPegar.equals("0")) {
            pessoa.setTipo(Integer.parseInt(tipoPegar));
        } else {
            request.setAttribute("mensagem", "Informe os campos corretamente!");
            rr = request.getRequestDispatcher("/usuarios.jsp");
            rr.forward(request, response);
        }
        int tipoNum = Integer.parseInt(tipoPegar);
        if (tipoNum == 4) {
            categoria = "Administrador";
            pessoa.setCategoria(categoria);
        }
        if (tipoNum == 1) {
            categoria = "Aluno";
            pessoa.setCategoria(categoria);
        }
        if (tipoNum == 2) {
            categoria = "Professor";
            pessoa.setCategoria(categoria);
        }
        if (tipoNum == 3) {
            categoria = "Técnico Administrativo";
            pessoa.setCategoria(categoria);
        }
        if (tipoNum == 1) {
            if (cSenha.equals(senha)) {
                String matricula_form = matricula;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaAlunos();
                    for (Pessoa cont : getAll) {
                        if (cont.getMatricula().equals(matricula_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                String rg_form = rg;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaAlunos();
                    for (Pessoa cont : getAll) {
                        if (cont.getRg().equals(rg_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                String cpf_form = cpf;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaAlunos();
                    for (Pessoa cont : getAll) {
                        if (cont.getCpf().equals(cpf_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                if (validade > 0) {
                    // JAVASCRIPT AQUI 
                    String a = "listar";
                    if (a.equals("listar")) {
                        PessoaDAO pessoaDao = new PessoaDAO();
                        try {
                            List listaPessoas = pessoaDao.getLista();
                            request.setAttribute("mensagem", "Usuário já cadastrado!");
                            request.setAttribute("sessaoListaPessoas", listaPessoas);
                            RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                            rd.forward(request, response);
                        } catch (SQLException ex) {
                            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    try {
                        PessoaDAO dao = new PessoaDAO();
                        dao.adicionarPessoa(pessoa);
                        dao.update(pessoa);

                        //AQUI INÍCIO
                        String a = "listar";
                        if (a.equals("listar")) {
                            PessoaDAO pessoaDao = new PessoaDAO();
                            try {
                                List listaPessoas = pessoaDao.getLista();
                                request.setAttribute("sessaoListaPessoas", listaPessoas);
                                RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                rd.forward(request, response);
                            } catch (SQLException ex) {
                                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        //AQUI FIM

                    } catch (SQLException e) {
                        throw new ServletException(e);
                    }
                    // Através do response.getWriter() mostrar uma mensagem de ok para o usuário
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                    return;
                }
            } else {
                request.setAttribute("mensagem", "Informe senha corretamente!");
                rr = request.getRequestDispatcher("/usuarios.jsp");
                rr.forward(request, response);
            }
        }
        if (tipoNum == 2) {
            if (cSenha.equals(senha)) {
                String matricula_form = matricula;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaProfessores();
                    for (Pessoa cont : getAll) {
                        if (cont.getMatricula().equals(matricula_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                String rg_form = rg;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaProfessores();

                    for (Pessoa cont : getAll) {
                        if (cont.getRg().equals(rg_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                String cpf_form = cpf;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaProfessores();
                    for (Pessoa cont : getAll) {
                        if (cont.getCpf().equals(cpf_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                if (validade > 0) {
                    String a = "listar";
                    if (a.equals("listar")) {
                        PessoaDAO pessoaDao = new PessoaDAO();
                        try {
                            List listaPessoas = pessoaDao.getLista();
                            request.setAttribute("mensagem", "Usuário já cadastrado!");
                            request.setAttribute("sessaoListaPessoas", listaPessoas);
                            RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                            rd.forward(request, response);
                        } catch (SQLException ex) {
                            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    //request.setAttribute("mensagem", "Usuário já cadastrado!");
                    //rr = request.getRequestDispatcher("/usuarios.jsp");
                    //rr.forward(request, response);
                } else {
                    try {
                        PessoaDAO dao = new PessoaDAO();
                        dao.adicionarPessoa(pessoa);
                        dao.update(pessoa);

                        //AQUI INÍCIO
                        String a = "listar";
                        if (a.equals("listar")) {
                            PessoaDAO pessoaDao = new PessoaDAO();
                            try {
                                List listaPessoas = pessoaDao.getLista();
                                request.setAttribute("sessaoListaPessoas", listaPessoas);
                                RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                rd.forward(request, response);
                            } catch (SQLException ex) {
                                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        //AQUI FIM

                    } catch (SQLException e) {
                        throw new ServletException(e);
                    }
                    // Através do response.getWriter() mostrar uma mensagem de ok para o usuário
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                    return;
                }
            } else {
                request.setAttribute("mensagem", "Informe senha corretamente!");
                rr = request.getRequestDispatcher("/usuarios.jsp");
                rr.forward(request, response);
            }
        }
        if (tipoNum == 3) {
            if (cSenha.equals(senha)) {
                String matricula_form = matricula;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaTecnicosAdm();
                    for (Pessoa cont : getAll) {
                        if (cont.getMatricula().equals(matricula_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                String rg_form = rg;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaTecnicosAdm();
                    for (Pessoa cont : getAll) {
                        if (cont.getRg().equals(rg_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                String cpf_form = cpf;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaTecnicosAdm();
                    for (Pessoa cont : getAll) {
                        if (cont.getCpf().equals(cpf_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                if (validade > 0) {
                    String a = "listar";
                    if (a.equals("listar")) {
                        PessoaDAO pessoaDao = new PessoaDAO();
                        try {
                            List listaPessoas = pessoaDao.getLista();
                            request.setAttribute("mensagem", "Usuário já cadastrado!");
                            request.setAttribute("sessaoListaPessoas", listaPessoas);
                            RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                            rd.forward(request, response);
                        } catch (SQLException ex) {
                            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {
                    try {
                        PessoaDAO dao = new PessoaDAO();
                        dao.adicionarPessoa(pessoa);
                        dao.update(pessoa);

                        //AQUI INÍCIO
                        String a = "listar";
                        if (a.equals("listar")) {
                            PessoaDAO pessoaDao = new PessoaDAO();
                            try {
                                List listaPessoas = pessoaDao.getLista();
                                request.setAttribute("sessaoListaPessoas", listaPessoas);
                                RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                rd.forward(request, response);
                            } catch (SQLException ex) {
                                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        //AQUI FIM

                    } catch (SQLException e) {
                        throw new ServletException(e);
                    }
                    // Através do response.getWriter() mostrar uma mensagem de ok para o usuário
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                    return;
                }
            } else {
                request.setAttribute("mensagem", "Informe senha corretamente!");
                rr = request.getRequestDispatcher("/usuarios.jsp");
                rr.forward(request, response);
            }
        }

        if (tipoNum == 4) {
            if (cSenha.equals(senha)) {
                String matricula_form = matricula;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaAdministradores();
                    for (Pessoa cont : getAll) {
                        if (cont.getMatricula().equals(matricula_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                String rg_form = rg;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaAdministradores();
                    for (Pessoa cont : getAll) {
                        if (cont.getRg().equals(rg_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                String cpf_form = cpf;
                try {
                    PessoaDAO dao = new PessoaDAO();
                    List<Pessoa> getAll = dao.getListaAdministradores();
                    for (Pessoa cont : getAll) {
                        if (cont.getCpf().equals(cpf_form)) {
                            validade++;
                        }
                    }
                } catch (Exception e) {
                }
                if (validade > 0) {
                    // JAVASCRIPT AQUI 
                    String a = "listar";
                    if (a.equals("listar")) {
                        PessoaDAO pessoaDao = new PessoaDAO();
                        try {
                            List listaPessoas = pessoaDao.getLista();
                            request.setAttribute("mensagem", "Usuário já cadastrado!");
                            request.setAttribute("sessaoListaPessoas", listaPessoas);
                            RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                            rd.forward(request, response);
                        } catch (SQLException ex) {
                            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    try {
                        PessoaDAO dao = new PessoaDAO();
                        dao.adicionarPessoa(pessoa);
                        dao.update(pessoa);

                        //AQUI INÍCIO
                        String a = "listar";
                        if (a.equals("listar")) {
                            PessoaDAO pessoaDao = new PessoaDAO();
                            try {
                                List listaPessoas = pessoaDao.getLista();
                                request.setAttribute("sessaoListaPessoas", listaPessoas);
                                RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                rd.forward(request, response);
                            } catch (SQLException ex) {
                                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        //AQUI FIM

                    } catch (SQLException e) {
                        throw new ServletException(e);
                    }
                    // Através do response.getWriter() mostrar uma mensagem de ok para o usuário
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                    return;
                }
            } else {
                String a = "listar";
                if (a.equals("listar")) {
                    PessoaDAO pessoaDao = new PessoaDAO();
                    try {
                        List listaPessoas = pessoaDao.getLista();
                        request.setAttribute("mensagem", "Informe senha corretamente!");
                        request.setAttribute("sessaoListaPessoas", listaPessoas);
                        RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                        rd.forward(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    private void alterarDados(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int validarMATRICULA = 0;
        int validarCPF = 0;
        int validarRG = 0;

        String idpessoa = request.getParameter("idpessoa");
        String tipo = request.getParameter("tipo");
        String nome = request.getParameter("nome");
        String matricula = request.getParameter("matricula");
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setMatricula(matricula);
        pessoa.setCpf(cpf);
        pessoa.setRg(rg);
        pessoa.setTelefone(telefone);
        pessoa.setEmail(email);
        pessoa.setIdpessoa(Integer.parseInt(idpessoa));
        pessoa.setTipo(Integer.parseInt(tipo));

        int testeID = Integer.parseInt(idpessoa);
        int testeTIPO = Integer.parseInt(tipo);
        try {
            PessoaDAO dao = new PessoaDAO();
            if (testeTIPO == 1) {
                List<Pessoa> getAlunos = dao.getListaAlunos();
                for (Pessoa cont : getAlunos) {
                    if ((cont.getMatricula().equals(matricula)) && (cont.getIdpessoa() != testeID)) {
                        validarMATRICULA = validarMATRICULA + 1;
                    }
                }
                for (Pessoa cont : getAlunos) {
                    if ((cont.getCpf().equals(cpf)) && (cont.getIdpessoa() != testeID)) {
                        validarCPF = validarCPF + 1;
                    }
                }
                for (Pessoa cont : getAlunos) {
                    if ((cont.getRg().equals(rg)) && (cont.getIdpessoa() != testeID)) {
                        validarRG = validarRG + 1;
                    }
                }
            }
            if (testeTIPO == 2) {
                List<Pessoa> getProfessores = dao.getListaProfessores();
                for (Pessoa cont : getProfessores) {
                    if ((cont.getMatricula().equals(matricula)) && (cont.getIdpessoa() != testeID)) {
                        validarMATRICULA = validarMATRICULA + 1;
                    }
                }
                for (Pessoa cont : getProfessores) {
                    if ((cont.getCpf().equals(cpf)) && (cont.getIdpessoa() != testeID)) {
                        validarCPF = validarCPF + 1;
                    }
                }
                for (Pessoa cont : getProfessores) {
                    if ((cont.getRg().equals(rg)) && (cont.getIdpessoa() != testeID)) {
                        validarRG = validarRG + 1;
                    }
                }
            }
            if (testeTIPO == 3) {
                List<Pessoa> getTecAdministrativos = dao.getListaTecnicosAdm();
                for (Pessoa cont : getTecAdministrativos) {
                    if ((cont.getMatricula().equals(matricula)) && (cont.getIdpessoa() != testeID)) {
                        validarMATRICULA = validarMATRICULA + 1;
                    }
                }
                for (Pessoa cont : getTecAdministrativos) {
                    if ((cont.getCpf().equals(cpf)) && (cont.getIdpessoa() != testeID)) {
                        validarCPF = validarCPF + 1;
                    }
                }
                for (Pessoa cont : getTecAdministrativos) {
                    if ((cont.getRg().equals(rg)) && (cont.getIdpessoa() != testeID)) {
                        validarRG = validarRG + 1;
                    }
                }
            }
            if (testeTIPO == 4) {
                List<Pessoa> getAdm = dao.getListaAdministradores();
                for (Pessoa cont : getAdm) {
                    if ((cont.getMatricula().equals(matricula)) && (cont.getIdpessoa() != testeID)) {
                        validarMATRICULA = validarMATRICULA + 1;
                    }
                }
                for (Pessoa cont : getAdm) {
                    if ((cont.getCpf().equals(cpf)) && (cont.getIdpessoa() != testeID)) {
                        validarCPF = validarCPF + 1;
                    }
                }
                for (Pessoa cont : getAdm) {
                    if ((cont.getRg().equals(rg)) && (cont.getIdpessoa() != testeID)) {
                        validarRG = validarRG + 1;
                    }
                }
            }

            if ((validarMATRICULA > 0) || (validarCPF > 0) || (validarRG > 0)) {
                PessoaDAO mate = new PessoaDAO();
                try {
                    List listaPessoas = mate.getLista();
                    request.setAttribute("mensagem", "Usuário já cadastrado!");
                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {

                dao.alteraPessoa(pessoa);
                String a = "li";
                if (a.equals("li")) {
                    PessoaDAO mate = new PessoaDAO();
                    try {
                        List listaPessoas = mate.getLista();
                        request.setAttribute("mensagem", "Alteração feita!");
                        request.setAttribute("sessaoListaPessoas", listaPessoas);
                        RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                        rd.forward(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        } catch (Exception e) {

        }
    }

    private void buscarUsuarios(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        String tipo = request.getParameter("categoriaBusca");
        String nome = request.getParameter("nomeBusca");
        String matricula = request.getParameter("matriculaBusca");

        //Se os campos NOME e MATRÍCULA estiverem vazios.
        if (nome.equals("") && matricula.equals("")) {
            //TODOS
            if (tipo.equals("0")) {
                PessoaDAO pessoaDAO = new PessoaDAO();
                try {
                    List listaPessoas = pessoaDAO.getLista();
                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //ALUNOS
            if (tipo.equals("1")) {
                PessoaDAO pessoaDAO = new PessoaDAO();
                try {
                    List listaPessoas = pessoaDAO.getListaAlunos();
                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //PROFESSORES
            if (tipo.equals("2")) {
                PessoaDAO pessoaDAO = new PessoaDAO();
                try {
                    List listaPessoas = pessoaDAO.getListaProfessores();
                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //TÉCNICOS ADMINISTRATIVOS
            if (tipo.equals("3")) {
                PessoaDAO pessoaDAO = new PessoaDAO();
                try {
                    List listaPessoas = pessoaDAO.getListaTecnicosAdm();
                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (tipo.equals("4")) {
                PessoaDAO pessoaDAO = new PessoaDAO();
                try {
                    List listaPessoas = pessoaDAO.getListaAdministradores();
                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        if (tipo.equals("0")) {
            if (matricula.equals("")) {
                PessoaDAO pessoaDAO = new PessoaDAO();
                try {
                    List listaPessoas = pessoaDAO.pesquisarNomeTodos(nome);
                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nome.equals("")) {
                PessoaDAO pessoaDAO = new PessoaDAO();
                try {
                    List listaPessoas = pessoaDAO.pesquisarMatriculaTodos(matricula);
                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if ((!nome.equals("")) && (!matricula.equals(""))) {
                PessoaDAO pessoaDAO = new PessoaDAO();
                try {
                    List listaPessoas = pessoaDAO.pesquisarTodos(matricula, nome);
                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                    rd.forward(request, response);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            //TIPO = 1 (ALUNO)
            if (tipo.equals("1")) {
                if (matricula.equals("")) {
                    PessoaDAO pessoaDAO = new PessoaDAO();
                    try {
                        List listaPessoas = pessoaDAO.pesquisarNomeAluno(nome);
                        request.setAttribute("sessaoListaPessoas", listaPessoas);
                        RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                        rd.forward(request, response);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (nome.equals("")) {
                    PessoaDAO pessoaDAO = new PessoaDAO();
                    try {
                        List listaPessoas = pessoaDAO.pesquisarMatriculaAluno(matricula);
                        request.setAttribute("sessaoListaPessoas", listaPessoas);
                        RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                        rd.forward(request, response);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if ((!nome.equals("")) && (!matricula.equals(""))) {
                    PessoaDAO pessoaDAO = new PessoaDAO();
                    try {
                        List listaPessoas = pessoaDAO.pesquisarAluno(matricula, nome);
                        request.setAttribute("sessaoListaPessoas", listaPessoas);
                        RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                        rd.forward(request, response);
                    } catch (Exception ex) {
                        Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                //PROFESSOR
                if (tipo.equals("2")) {
                    if (matricula.equals("")) {
                        PessoaDAO pessoaDAO = new PessoaDAO();
                        try {
                            List listaPessoas = pessoaDAO.pesquisarNomeProfessor(nome);
                            request.setAttribute("sessaoListaPessoas", listaPessoas);
                            RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                            rd.forward(request, response);
                        } catch (Exception ex) {
                            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if (nome.equals("")) {
                        PessoaDAO pessoaDAO = new PessoaDAO();
                        try {
                            List listaPessoas = pessoaDAO.pesquisarMatriculaProfessor(matricula);
                            request.setAttribute("sessaoListaPessoas", listaPessoas);
                            RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                            rd.forward(request, response);
                        } catch (Exception ex) {
                            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if ((!nome.equals("")) && (!matricula.equals(""))) {
                        PessoaDAO pessoaDAO = new PessoaDAO();
                        try {
                            List listaPessoas = pessoaDAO.pesquisarProfessor(matricula, nome);
                            request.setAttribute("sessaoListaPessoas", listaPessoas);
                            RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                            rd.forward(request, response);
                        } catch (Exception ex) {
                            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    //TÉCNICOS ADM
                    if (tipo.equals("3")) {
                        if (matricula.equals("")) {
                            PessoaDAO pessoaDAO = new PessoaDAO();
                            try {
                                List listaPessoas = pessoaDAO.pesquisarNomeTecAdm(nome);
                                request.setAttribute("sessaoListaPessoas", listaPessoas);
                                RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                rd.forward(request, response);
                            } catch (Exception ex) {
                                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if (nome.equals("")) {
                            PessoaDAO pessoaDAO = new PessoaDAO();
                            try {
                                List listaPessoas = pessoaDAO.pesquisarMatriculaTecAdm(matricula);
                                request.setAttribute("sessaoListaPessoas", listaPessoas);
                                RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                rd.forward(request, response);
                            } catch (Exception ex) {
                                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if ((!nome.equals("")) && (!matricula.equals(""))) {
                            PessoaDAO pessoaDAO = new PessoaDAO();
                            try {
                                List listaPessoas = pessoaDAO.pesquisarTecAdm(matricula, nome);
                                request.setAttribute("sessaoListaPessoas", listaPessoas);
                                RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                rd.forward(request, response);
                            } catch (Exception ex) {
                                Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } else {
                        if (tipo.equals("4")) {
                            if (matricula.equals("")) {
                                PessoaDAO pessoaDAO = new PessoaDAO();
                                try {
                                    List listaPessoas = pessoaDAO.pesquisarNomeAdministrador(nome);
                                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                    rd.forward(request, response);
                                } catch (Exception ex) {
                                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (nome.equals("")) {
                                PessoaDAO pessoaDAO = new PessoaDAO();
                                try {
                                    List listaPessoas = pessoaDAO.pesquisarMatriculaAdministrador(matricula);
                                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                    rd.forward(request, response);
                                } catch (Exception ex) {
                                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if ((!nome.equals("")) && (!matricula.equals(""))) {
                                PessoaDAO pessoaDAO = new PessoaDAO();
                                try {
                                    List listaPessoas = pessoaDAO.pesquisarAdministrador(matricula, nome);
                                    request.setAttribute("sessaoListaPessoas", listaPessoas);
                                    RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
                                    rd.forward(request, response);
                                } catch (Exception ex) {
                                    Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                }

            }
        }

    }

    private void alterarSenha(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        int teste = 0;
        String idTeste = request.getParameter("id");
        String id = idTeste.trim();
        int idpessoa = Integer.parseInt(id);
        Pessoa pessoa = new Pessoa();
        PessoaDAO dao = new PessoaDAO();
        List<Pessoa> getLista = dao.getListaPessoasAlterarSenha();
        List<Pessoa> getLista2 = dao.getListaPessoasAlterarSenha();

        // Se o usuário estiver devidamente cadastrado no Sistema
        for (Pessoa cont : getLista) {
            if (cont.getIdpessoa() == idpessoa) {
                teste = 1;
                String senhaAtual = request.getParameter("senhaAtual");
                String novaSenha = request.getParameter("novaSenha");
                String confirmarSenha = request.getParameter("confirmarSenha");
                
               //Se senha atual estiver correta
                    if(cont.getSenha().equals(senhaAtual)){
                        //Se nova senha e confirmar senha forem iguais
                        if(novaSenha.equals(confirmarSenha)){
                            pessoa.setSenha(novaSenha);
                            pessoa.setIdpessoa(idpessoa);
                            dao.atualizarSenha(pessoa);
                            teste = 2;
                            //FAZER MÉTODO PARA ALTERAR SENHA!!!!!!!!!!!!!!!!!!!!!!!!
                        } else{
                            teste = 3;
                        }
                        
                        
                    } else {
                        //Se a senha atual não estiver correta
                        teste = 1;
                    }
                
            }
       }

       if (teste == 1) {
             request.setAttribute("mensagem", "Informe senha corretamente!");
             RequestDispatcher rd = request.getRequestDispatcher("/alterarSenha.jsp");
             rd.forward(request, response);
       }
        
        if (teste == 2) {
             request.setAttribute("mensagem", "Senha alterada!");
             RequestDispatcher rd = request.getRequestDispatcher("/alterarSenha.jsp");
             rd.forward(request, response);
       }
        
        
        if (teste == 3) {
             request.setAttribute("mensagem", "Confirmação de senha inválida. Tente novamente!");
             RequestDispatcher rd = request.getRequestDispatcher("/alterarSenha.jsp");
             rd.forward(request, response);
       }
        
        
        
        
        
        
  //      request.setAttribute("mensagem", "OK " + id + " sds");
    //    RequestDispatcher rd = request.getRequestDispatcher("/alterarSenha.jsp");
      //  rd.forward(request, response);
    }
}

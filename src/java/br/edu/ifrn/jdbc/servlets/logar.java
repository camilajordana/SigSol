/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.jdbc.servlets;

import br.edu.ifrn.jdbc.dao.LoginDAO;
import br.edu.ifrn.jdbc.dao.PessoaDAO;

import br.edu.ifrn.jdbc.modelo.Login;
import br.edu.ifrn.jdbc.modelo.Pessoa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.catalina.User;

/**
 *
 * @author maryna
 */
public class logar extends HttpServlet {

    public String ativo;
    public String logondia, logonhora;
    public int ii = 0;
    private String h;
    private String ggg;

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("acao");
        
        if(2==1){
            
        }
        
        if (acao.equals("confirmarLogin")) {
            try {
                this.confirmarLogin(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(logar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void confirmarLogin(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String usuario = request.getParameter("matricula");
        String usuario2 = request.getParameter("matricula");

        String senha = request.getParameter("senha");

        Pessoa pessoa = new Pessoa();
        pessoa.setMatricula(usuario);
        pessoa.setSenha(senha);

        boolean verificar = false;
        PessoaDAO dao = new PessoaDAO();
        List<Pessoa> getAll = dao.getLista();
        RequestDispatcher rd = null;

        for (Pessoa cont : getAll) {
            if ((cont.getMatricula().equals(usuario)) && (cont.getSenha().equals(senha))) {
                // Se for ADMINISTRADOR
                if (cont.getTipo() == 4) {
                    Login login = new Login();
                    login.setMatricula(usuario);
                    login.setTipo(4);
                    String data = "dd/MM/yyyy";
                    String horaa = "h:mm - a";
                    String data1, hora1;
                    java.util.Date agora = new java.util.Date();
                    SimpleDateFormat formata = new SimpleDateFormat(data);
                    data1 = formata.format(agora);
                    formata = new SimpleDateFormat(horaa);
                    hora1 = formata.format(agora);
                    login.setDialogin(data1);
                    login.setHoralogin(hora1);

                    LoginDAO dao2 = new LoginDAO();
                    ativo = usuario;
                    String hh = usuario;
                    logar j = new logar();
                    j.setH(usuario);

                    PessoaDAO d = new PessoaDAO();
                    List<Pessoa> listaDePessoas = d.getLista();
                    for (Pessoa contt : listaDePessoas) {
                        if ((contt.getMatricula().equals(usuario)) && (contt.getTipo() == 4)) {
                            String nomee = contt.getNome();
                            login.setNome(nomee);
                            dao2.adicionarLogin(login);
                            verificar = true;
                            HttpSession sessao = request.getSession();
                            sessao.setAttribute("sessaoUsuario", cont.getNome());
                            sessao.setAttribute("sessaoUsuario2", cont.getMatricula());
                            sessao.setAttribute("sessaoUsuario3", cont.getIdpessoa());
                            
                            rd = request.getRequestDispatcher("/InicioAdm.jsp");
                            rd.forward(request, response);

                        }
                    }

                }

                // Se for ALUNO
                if (cont.getTipo() == 1) {
                    Login login = new Login();
                    login.setMatricula(usuario);
                    login.setTipo(1);
                    String data = "dd/MM/yyyy";
                    String horaa = "h:mm - a";
                    String data1, hora1;
                    java.util.Date agora = new java.util.Date();
                    SimpleDateFormat formata = new SimpleDateFormat(data);
                    data1 = formata.format(agora);
                    formata = new SimpleDateFormat(horaa);
                    hora1 = formata.format(agora);
                    login.setDialogin(data1);
                    login.setHoralogin(hora1);

                    LoginDAO dao2 = new LoginDAO();
                    ativo = usuario;
                    String hh = usuario;
                    logar j = new logar();
                    j.setH(usuario);

                    PessoaDAO d = new PessoaDAO();
                    List<Pessoa> listaDePessoas = d.getLista();
                    for (Pessoa contt : listaDePessoas) {
                        if ((contt.getMatricula().equals(usuario)) && (contt.getTipo() == 1)) {
                            String nomee = contt.getNome();
                            login.setNome(nomee);
                            dao2.adicionarLogin(login);
                            verificar = true;
                            HttpSession sessao = request.getSession();
                            sessao.setAttribute("sessaoUsuario", cont.getNome());
                            sessao.setAttribute("sessaoUsuario2", cont.getMatricula());
                            sessao.setAttribute("sessaoUsuario3", cont.getIdpessoa());
                            rd = request.getRequestDispatcher("/InicioAluno.jsp");
                            rd.forward(request, response);

                        }
                    }
                }

                //Se for PROFESSOR
                if (cont.getTipo() == 2) {
                    Login login = new Login();
                    login.setMatricula(usuario);
                    login.setTipo(2);
                    String data = "dd/MM/yyyy";
                    String horaa = "h:mm - a";
                    String data1, hora1;
                    java.util.Date agora = new java.util.Date();
                    SimpleDateFormat formata = new SimpleDateFormat(data);
                    data1 = formata.format(agora);
                    formata = new SimpleDateFormat(horaa);
                    hora1 = formata.format(agora);
                    login.setDialogin(data1);
                    login.setHoralogin(hora1);

                    LoginDAO dao2 = new LoginDAO();
                    ativo = usuario;
                    String hh = usuario;
                    logar j = new logar();
                    j.setH(usuario);

                    PessoaDAO d = new PessoaDAO();
                    List<Pessoa> listaDePessoas = d.getLista();
                    for (Pessoa contt : listaDePessoas) {
                        if ((contt.getMatricula().equals(usuario)) && (contt.getTipo() == 2)) {
                            String nomee = contt.getNome();
                            login.setNome(nomee);
                            dao2.adicionarLogin(login);
                            verificar = true;
                            HttpSession sessao = request.getSession();
                            sessao.setAttribute("sessaoUsuario", cont.getNome());
                            sessao.setAttribute("sessaoUsuario2", cont.getMatricula());
                            sessao.setAttribute("sessaoUsuario3", cont.getIdpessoa());
                            rd = request.getRequestDispatcher("/InicioAdm.jsp");
                            rd.forward(request, response);

                        }
                    }
                }

                // Se for TÉCNICO ADMINISTRATIVO
                if (cont.getTipo() == 3) {
                    Login login = new Login();
                    login.setMatricula(usuario);
                    login.setTipo(3);
                    String data = "dd/MM/yyyy";
                    String horaa = "h:mm - a";
                    String data1, hora1;
                    java.util.Date agora = new java.util.Date();
                    SimpleDateFormat formata = new SimpleDateFormat(data);
                    data1 = formata.format(agora);
                    formata = new SimpleDateFormat(horaa);
                    hora1 = formata.format(agora);
                    login.setDialogin(data1);
                    login.setHoralogin(hora1);

                    LoginDAO dao2 = new LoginDAO();
                    ativo = usuario;
                    String hh = usuario;
                    logar j = new logar();
                    j.setH(usuario);

                    PessoaDAO d = new PessoaDAO();
                    List<Pessoa> listaDePessoas = d.getLista();
                    for (Pessoa contt : listaDePessoas) {
                        if ((contt.getMatricula().equals(usuario)) && (contt.getTipo() == 3)) {
                            String nomee = contt.getNome();
                            login.setNome(nomee);
                            dao2.adicionarLogin(login);
                            verificar = true;
                            HttpSession sessao = request.getSession();
                            sessao.setAttribute("sessaoUsuario", cont.getNome());
                            sessao.setAttribute("sessaoUsuario2", cont.getMatricula());
                            sessao.setAttribute("sessaoUsuario3", cont.getIdpessoa());
                            rd = request.getRequestDispatcher("/InicioAdm.jsp");
                            rd.forward(request, response);

                        }
                    }
                }
            }
        }

        // SE A SENHA OU USUÁRIO ESTIVEREM INCORRETOS!
        if (verificar == false) {
            request.setAttribute("mensagem", "Usuário ou senha inválidos.");
            rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }
    }

}

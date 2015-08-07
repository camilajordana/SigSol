package br.edu.ifrn.jdbc.servlets;

import br.edu.ifrn.jdbc.dao.HorariosDAO;
import br.edu.ifrn.jdbc.modelo.Horarios;

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

public class GerenciarHorarios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("acao");
        
        if(1==2){
            
        }

        if (acao.equals("excluir")) {
            try {
                this.excluir(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarLivros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");

        if (acao.equals("cadastrar")) {
            try {
                this.cadastrar(request, response);

            } catch (SQLException ex) {
                Logger.getLogger(GerenciarHorarios.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

        if (acao.equals("buscar")) {
            try {
                this.buscar(request, response);

            } catch (SQLException ex) {
                Logger.getLogger(GerenciarHorarios.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        
        if (acao.equals("buscar2")) {
            try {
                this.buscar2(request, response);

            } catch (SQLException ex) {
                Logger.getLogger(GerenciarHorarios.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        
        
        if (acao.equals("buscarAluno")) {
            try {
                this.buscarAluno(request, response);

            } catch (SQLException ex) {
                Logger.getLogger(GerenciarHorarios.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        
        
        if (acao.equals("alterarDados")) {
            try {
                this.alterar(request, response);

            } catch (SQLException ex) {
                Logger.getLogger(GerenciarHorarios.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

    private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        RequestDispatcher rr = null;
        String tipo = request.getParameter("tipo");

        //Se tipo  for igual a ---
        if (tipo.equals("0")) {
            request.setAttribute("mensagem", "Informe campos corretamente!");
            rr = request.getRequestDispatcher("/gerenciarHorario.jsp");
            rr.forward(request, response);
        } else {
            String nome = request.getParameter("nome");
            String seg1 = request.getParameter("seg1");
            String seg2 = request.getParameter("seg2");
            String seg3 = request.getParameter("seg3");
            String seg4 = request.getParameter("seg4");
            String seg5 = request.getParameter("seg5");
            String seg6 = request.getParameter("seg6");
            String seg7 = request.getParameter("seg7");
            String seg8 = request.getParameter("seg8");
            String seg9 = request.getParameter("seg9");
            String seg10 = request.getParameter("seg10");
            String seg11 = request.getParameter("seg11");
            String seg12 = request.getParameter("seg12");
            String seg13 = request.getParameter("seg13");
            String seg14 = request.getParameter("seg14");
            String seg15 = request.getParameter("seg15");
            String seg16 = request.getParameter("seg16");
            String ter1 = request.getParameter("ter1");
            String ter2 = request.getParameter("ter2");
            String ter3 = request.getParameter("ter3");
            String ter4 = request.getParameter("ter4");
            String ter5 = request.getParameter("ter5");
            String ter6 = request.getParameter("ter6");
            String ter7 = request.getParameter("ter7");
            String ter8 = request.getParameter("ter8");
            String ter9 = request.getParameter("ter9");
            String ter10 = request.getParameter("ter10");
            String ter11 = request.getParameter("ter11");
            String ter12 = request.getParameter("ter12");
            String ter13 = request.getParameter("ter13");
            String ter14 = request.getParameter("ter14");
            String ter15 = request.getParameter("ter15");
            String ter16 = request.getParameter("ter16");
            String qua1 = request.getParameter("qua1");
            String qua2 = request.getParameter("qua2");
            String qua3 = request.getParameter("qua3");
            String qua4 = request.getParameter("qua4");
            String qua5 = request.getParameter("qua5");
            String qua6 = request.getParameter("qua6");
            String qua7 = request.getParameter("qua7");
            String qua8 = request.getParameter("qua8");
            String qua9 = request.getParameter("qua9");
            String qua10 = request.getParameter("qua10");
            String qua11 = request.getParameter("qua11");
            String qua12 = request.getParameter("qua12");
            String qua13 = request.getParameter("qua13");
            String qua14 = request.getParameter("qua14");
            String qua15 = request.getParameter("qua15");
            String qua16 = request.getParameter("qua16");
            String qui1 = request.getParameter("qui1");
            String qui2 = request.getParameter("qui2");
            String qui3 = request.getParameter("qui3");
            String qui4 = request.getParameter("qui4");
            String qui5 = request.getParameter("qui5");
            String qui6 = request.getParameter("qui6");
            String qui7 = request.getParameter("qui7");
            String qui8 = request.getParameter("qui8");
            String qui9 = request.getParameter("qui9");
            String qui10 = request.getParameter("qui10");
            String qui11 = request.getParameter("qui11");
            String qui12 = request.getParameter("qui12");
            String qui13 = request.getParameter("qui13");
            String qui14 = request.getParameter("qui14");
            String qui15 = request.getParameter("qui15");
            String qui16 = request.getParameter("qui16");
            String sex1 = request.getParameter("sex1");
            String sex2 = request.getParameter("sex2");
            String sex3 = request.getParameter("sex3");
            String sex4 = request.getParameter("sex4");
            String sex5 = request.getParameter("sex5");
            String sex6 = request.getParameter("sex6");
            String sex7 = request.getParameter("sex7");
            String sex8 = request.getParameter("sex8");
            String sex9 = request.getParameter("sex9");
            String sex10 = request.getParameter("sex10");
            String sex11 = request.getParameter("sex11");
            String sex12 = request.getParameter("sex12");
            String sex13 = request.getParameter("sex13");
            String sex14 = request.getParameter("sex14");
            String sex15 = request.getParameter("sex15");
            String sex16 = request.getParameter("sex16");
            String nomee = nome.toLowerCase();
            String testeNome = null;
            int validade = 0;
            try {
                HorariosDAO dao = new HorariosDAO();
                List<Horarios> getListaTurmas = dao.getListaHorariosTurmas();
                List<Horarios> getListaProfessores = dao.getListaHorariosProfessores();
                List<Horarios> getListaMonitoria = dao.getListaHorariosMonitoria();

                //Se cadastrar TURMA
                if (tipo.equals("1")) {
                    for (Horarios cont1 : getListaTurmas) {
                        testeNome = cont1.getNome().toLowerCase();
                        if (testeNome.equals(nomee)) {
                            validade++;
                        }
                    }
                }

                //Se cadastrar PROFESSOR
                if (tipo.equals("2")) {
                    for (Horarios cont2 : getListaProfessores) {
                        testeNome = cont2.getNome().toLowerCase();
                        if (testeNome.equals(nomee)) {
                            validade++;
                        }
                    }
                }

                //Se cadastrar MONITORIA
                if (tipo.equals("3")) {
                    for (Horarios cont3 : getListaMonitoria) {
                        testeNome = cont3.getNome().toLowerCase();
                        if (testeNome.equals(nomee)) {
                            validade++;
                        }
                    }
                }

                if (validade > 0) {
                    request.setAttribute("mensagem", "Este horário já está cadastrado! Tente novamente.");
                    rr = request.getRequestDispatcher("/gerenciarHorario.jsp");
                    rr.forward(request, response);
                } else {
                    Horarios horario = new Horarios();
                    horario.setNome(nome);
                    horario.setTipo(Integer.parseInt(tipo));
                    horario.setSeg1(seg1);
                    horario.setSeg2(seg2);
                    horario.setSeg3(seg3);
                    horario.setSeg4(seg4);
                    horario.setSeg5(seg5);
                    horario.setSeg6(seg6);
                    horario.setSeg7(seg7);
                    horario.setSeg8(seg8);
                    horario.setSeg9(seg9);
                    horario.setSeg10(seg10);
                    horario.setSeg11(seg11);
                    horario.setSeg12(seg12);
                    horario.setSeg13(seg13);
                    horario.setSeg14(seg14);
                    horario.setSeg15(seg15);
                    horario.setSeg16(seg16);
                    horario.setTer1(ter1);
                    horario.setTer2(ter2);
                    horario.setTer3(ter3);
                    horario.setTer4(ter4);
                    horario.setTer5(ter5);
                    horario.setTer6(ter6);
                    horario.setTer7(ter7);
                    horario.setTer8(ter8);
                    horario.setTer9(ter9);
                    horario.setTer10(ter10);
                    horario.setTer11(ter11);
                    horario.setTer12(ter12);
                    horario.setTer13(ter13);
                    horario.setTer14(ter14);
                    horario.setTer15(ter15);
                    horario.setTer16(ter16);
                    horario.setQua1(qua1);
                    horario.setQua2(qua2);
                    horario.setQua3(qua3);
                    horario.setQua4(qua4);
                    horario.setQua5(qua5);
                    horario.setQua6(qua6);
                    horario.setQua7(qua7);
                    horario.setQua8(qua8);
                    horario.setQua9(qua9);
                    horario.setQua10(qua10);
                    horario.setQua11(qua11);
                    horario.setQua12(qua12);
                    horario.setQua13(qua13);
                    horario.setQua14(qua14);
                    horario.setQua15(qua15);
                    horario.setQua16(qua16);
                    horario.setQui1(qui1);
                    horario.setQui2(qui2);
                    horario.setQui3(qui3);
                    horario.setQui4(qui4);
                    horario.setQui5(qui5);
                    horario.setQui6(qui6);
                    horario.setQui7(qui7);
                    horario.setQui8(qui8);
                    horario.setQui9(qui9);
                    horario.setQui10(qui10);
                    horario.setQui11(qui11);
                    horario.setQui12(qui12);
                    horario.setQui13(qui13);
                    horario.setQui14(qui14);
                    horario.setQui15(qui15);
                    horario.setQui16(qui16);
                    horario.setSex1(sex1);
                    horario.setSex2(sex2);
                    horario.setSex3(sex3);
                    horario.setSex4(sex4);
                    horario.setSex5(sex5);
                    horario.setSex6(sex6);
                    horario.setSex7(sex7);
                    horario.setSex8(sex8);
                    horario.setSex9(sex9);
                    horario.setSex10(sex10);
                    horario.setSex11(sex11);
                    horario.setSex12(sex12);
                    horario.setSex13(sex13);
                    horario.setSex14(sex14);
                    horario.setSex15(sex15);
                    horario.setSex16(sex16);
                    dao.adicionarHorario(horario);
                    request.setAttribute("mensagem", "Horário foi cadastrado!");
                    rr = request.getRequestDispatcher("/gerenciarHorario.jsp");
                    rr.forward(request, response);
                    // int testeTIPO = Integer.parseInt(tipo);
                    //int id = 0;
                    //List<Horarios> getLista = dao.getListaHorarios();
                    //for(Horarios i : getLista){
                    //  String testee = i.getNome().toLowerCase();
                    // if((testeNome.equals(testee)) && (testeTIPO == i.getTipo())){
                    //   id = i.getIdhorarios();
                    //    id = id + 1;
                    //}
                    //}
                    //                  HorariosManha manha = new HorariosManha();
//                    manha.setSeg1(seg1);
                    //manha.setSeg2(seg2);
                    //  manha.setSeg3(seg3);
                    //    manha.setSeg4(seg4);
                    //      manha.setSeg5(seg5);
                    //        manha.setSeg6(seg6);
                    //          manha.setTer1(ter1);
                    //            manha.setTer2(ter2);
                    //              manha.setTer3(ter3);
                    //                manha.setTer4(ter4);
                    //                  manha.setTer5(ter5);
//                    manha.setTer6(ter6);
                    //manha.setQua1(qua1);
                    //  manha.setQua2(qua2);
                    //    manha.setQua3(qua3);
                    //      manha.setQua4(qua4);
                    //        manha.setQua5(qua5);
                    //          manha.setQua6(qua6);
                    //            manha.setQui1(qui1);
                    //              manha.setQui2(qui2);
                    //                manha.setQui3(qui3);
                    //                  manha.setQui4(qui4);
//                    manha.setQui5(qui5);
                    //manha.setQui6(qui6);
                    //  manha.setSex1(sex1);
                    //    manha.setSex2(sex2);
                    //      manha.setSex3(sex3);
                    //        manha.setSex4(sex4);
                    //          manha.setSex5(sex5);
                    //            manha.setSex6(sex6);
                    //              manha.setIdhorario(id);
                    //                HorariosTarde tarde = new HorariosTarde();
                    //                  tarde.setSeg1(seg7);
//                    tarde.setSeg2(seg8);
                    //tarde.setSeg3(seg9);
                    //  tarde.setSeg4(seg10);
                    //    tarde.setSeg5(seg11);
                    //      tarde.setSeg6(seg12);
                    //        tarde.setTer1(ter7);
                    //          tarde.setTer2(ter8);
                    //            tarde.setTer3(ter9);
                    //              tarde.setTer4(ter10);
                    //                tarde.setTer5(ter11);
                    //                  tarde.setTer6(ter12);
//                    tarde.setQua1(qua7);
                    //tarde.setQua2(qua8);
                    //  tarde.setQua3(qua9);
                    //    tarde.setQua4(qua10);
                    //      tarde.setQua5(qua11);
                    //        tarde.setQua6(qua12);
                    //          tarde.setQui1(qui7);
                    //            tarde.setQui2(qui8);
                    //              tarde.setQui3(qui9);
                    //                tarde.setQui4(qui10);
                    //                  tarde.setQui5(qui11);
//                    tarde.setQui6(qui12);
                    //tarde.setSex1(sex7);
                    //  tarde.setSex2(sex8);
                    //    tarde.setSex3(sex9);
                    //      tarde.setSex4(sex10);
                    //        tarde.setSex5(sex11);
                    //          tarde.setSex6(sex12);
                    //            tarde.setIdhorarios(id);
                    //              HorariosNoite noite = new HorariosNoite();
                    //                noite.setSeg1(seg13);
                    //                  noite.setSeg2(seg14);
//                    noite.setSeg3(seg15);
                    //   noite.setSeg4(seg16);
                    //    noite.setSex1(sex13);
                    //      noite.setSex2(sex14);
                    //        noite.setSex3(sex15);
                    //          noite.setSex4(sex16);
                    //            noite.setTer1(ter13);
                    //              noite.setTer2(ter14);
                    //                noite.setTer3(ter15);
                    //                  noite.setTer4(ter16);
//                    noite.setQua1(qua13);
                    //noite.setQua2(qua14);
                    //noite.setQua3(qua15);
                    //noite.setQua4(qua16);
                    //noite.setQui1(qui13);
                    //noite.setQui2(qui14);
                    //noite.setQui3(qui15);
                    //noite.setQui4(qui16);
                    //  noite.setId_horarios(id);
                    //ADICIONAR TARDE E NOITE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    //    dao.adicionarManha(manha);
                }

            } catch (SQLException e) {

            }
        }

    }

    private void buscar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        RequestDispatcher rr = null;
        String tipo = request.getParameter("tipoBuscar");
        String nome = request.getParameter("nomeBuscar");

        if (tipo.equals("")) {
            request.setAttribute("mensagem", "Informe campos corretamente!");
            rr = request.getRequestDispatcher("/gerenciarHorario.jsp");
            rr.forward(request, response);
        } else {
            HorariosDAO dao = new HorariosDAO();
            try {
                if (tipo.equals("1")) {
                    List listaturmas = dao.pesquisarHorarioTurma(nome);
                    request.setAttribute("sessaoListaHorarios", listaturmas);
                    RequestDispatcher rd = request.getRequestDispatcher("/gerenciarHorario.jsp");
                    rd.forward(request, response);
                }
                if (tipo.equals("2")) {
                    List listaturmas = dao.pesquisarHorarioProfessor(nome);
                    request.setAttribute("sessaoListaHorarios", listaturmas);
                    RequestDispatcher rd = request.getRequestDispatcher("/gerenciarHorario.jsp");
                    rd.forward(request, response);
                }

                if (tipo.equals("3")) {
                    List listaturmas = dao.pesquisarHorarioMonitoria(nome);
                    request.setAttribute("sessaoListaHorarios", listaturmas);
                    RequestDispatcher rd = request.getRequestDispatcher("/gerenciarHorario.jsp");
                    rd.forward(request, response);
                }

            } catch (SQLException e) {

            }
        }

    }

    private void excluir(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        String idhorarios = request.getParameter("idhorarios");

        int id = Integer.parseInt(idhorarios);
        Horarios horario = new Horarios();
        horario.setIdhorarios(id);
        horario.setIdhorario_manha(id);
        horario.setIdhorario_tarde(id);
        horario.setIdhorario_noite(id);

        HorariosDAO dao = new HorariosDAO();
        List<Horarios> getAll = dao.getListaHorarios();

        for (Horarios cont : getAll) {
            if (cont.getIdhorarios() == id) {
                dao.removerHorarioManha(horario);
                dao.removerHorarioTarde(horario);
                dao.removerHorarioNoite(horario);
                dao.removerHorarios(horario);
                request.setAttribute("mensagem", "O horário foi excluído!" + id);
                RequestDispatcher rd = request.getRequestDispatcher("gerenciarHorario.jsp");
                rd.forward(request, response);
            }
        }

        //for (Horarios cont : getAll) {
        //  if (cont.getIdhorarios() == id) {
        //    dao.removerPeloID(horario, id);
        //     request.setAttribute("mensagem", "O horário foi excluído!");
        //    RequestDispatcher rd = request.getRequestDispatcher("gerenciarHorario.jsp");
        //   rd.forward(request, response);
        //}
        //}
    }

    private void alterar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        String id_h = request.getParameter("idhorarios");
        String idh_manha = request.getParameter("idhorario_manha");
        String idh_tarde = request.getParameter("idhorario_tarde");
        String idh_noite = request.getParameter("idhorario_noite");
        int idhorarios = Integer.parseInt(id_h);
        int idhorario_manha = Integer.parseInt(idh_manha);
        int idhorario_tarde = Integer.parseInt(idh_tarde);
        int idhorario_noite = Integer.parseInt(idh_noite);

        String nome = request.getParameter("nome");
        String seg1 = request.getParameter("seg1");
        String seg2 = request.getParameter("seg2");
        String seg3 = request.getParameter("seg3");
        String seg4 = request.getParameter("seg4");
        String seg5 = request.getParameter("seg5");
        String seg6 = request.getParameter("seg6");
        String seg7 = request.getParameter("seg7");
        String seg8 = request.getParameter("seg8");
        String seg9 = request.getParameter("seg9");
        String seg10 = request.getParameter("seg10");
        String seg11 = request.getParameter("seg11");
        String seg12 = request.getParameter("seg12");
        String seg13 = request.getParameter("seg13");
        String seg14 = request.getParameter("seg14");
        String seg15 = request.getParameter("seg15");
        String seg16 = request.getParameter("seg16");
        String ter1 = request.getParameter("ter1");
        String ter2 = request.getParameter("ter2");
        String ter3 = request.getParameter("ter3");
        String ter4 = request.getParameter("ter4");
        String ter5 = request.getParameter("ter5");
        String ter6 = request.getParameter("ter6");
        String ter7 = request.getParameter("ter7");
        String ter8 = request.getParameter("ter8");
        String ter9 = request.getParameter("ter9");
        String ter10 = request.getParameter("ter10");
        String ter11 = request.getParameter("ter11");
        String ter12 = request.getParameter("ter12");
        String ter13 = request.getParameter("ter13");
        String ter14 = request.getParameter("ter14");
        String ter15 = request.getParameter("ter15");
        String ter16 = request.getParameter("ter16");
        String qua1 = request.getParameter("qua1");
        String qua2 = request.getParameter("qua2");
        String qua3 = request.getParameter("qua3");
        String qua4 = request.getParameter("qua4");
        String qua5 = request.getParameter("qua5");
        String qua6 = request.getParameter("qua6");
        String qua7 = request.getParameter("qua7");
        String qua8 = request.getParameter("qua8");
        String qua9 = request.getParameter("qua9");
        String qua10 = request.getParameter("qua10");
        String qua11 = request.getParameter("qua11");
        String qua12 = request.getParameter("qua12");
        String qua13 = request.getParameter("qua13");
        String qua14 = request.getParameter("qua14");
        String qua15 = request.getParameter("qua15");
        String qua16 = request.getParameter("qua16");
        String qui1 = request.getParameter("qui1");
        String qui2 = request.getParameter("qui2");
        String qui3 = request.getParameter("qui3");
        String qui4 = request.getParameter("qui4");
        String qui5 = request.getParameter("qui5");
        String qui6 = request.getParameter("qui6");
        String qui7 = request.getParameter("qui7");
        String qui8 = request.getParameter("qui8");
        String qui9 = request.getParameter("qui9");
        String qui10 = request.getParameter("qui10");
        String qui11 = request.getParameter("qui11");
        String qui12 = request.getParameter("qui12");
        String qui13 = request.getParameter("qui13");
        String qui14 = request.getParameter("qui14");
        String qui15 = request.getParameter("qui15");
        String qui16 = request.getParameter("qui16");
        String sex1 = request.getParameter("sex1");
        String sex2 = request.getParameter("sex2");
        String sex3 = request.getParameter("sex3");
        String sex4 = request.getParameter("sex4");
        String sex5 = request.getParameter("sex5");
        String sex6 = request.getParameter("sex6");
        String sex7 = request.getParameter("sex7");
        String sex8 = request.getParameter("sex8");
        String sex9 = request.getParameter("sex9");
        String sex10 = request.getParameter("sex10");
        String sex11 = request.getParameter("sex11");
        String sex12 = request.getParameter("sex12");
        String sex13 = request.getParameter("sex13");
        String sex14 = request.getParameter("sex14");
        String sex15 = request.getParameter("sex15");
        String sex16 = request.getParameter("sex16");
        String idm = request.getParameter("idhorariosmanha");
        String idt = request.getParameter("idhorariostarde");
        String idn = request.getParameter("idhorariosnoite");
        
        int manha = Integer.parseInt(idm); //erro nessa linha
        int tarde = Integer.parseInt(idt);
        int noite = Integer.parseInt(idn);
        
        

        
        
        Horarios horario = new Horarios();
        horario.setNome(nome);
        horario.setIdhorarios(idhorarios);
        horario.setIdhorario_manha(idhorario_manha);
        horario.setIdhorario_tarde(idhorario_tarde);
        horario.setIdhorario_noite(idhorario_noite);
        horario.setIdhorariosmanha(manha);
        horario.setIdhorariostarde(tarde);
        horario.setIdhorariosnoite(noite);
        horario.setSeg1(seg1);
        horario.setSeg2(seg2);
        horario.setSeg3(seg3);
        horario.setSeg4(seg4);
        horario.setSeg5(seg5);
        horario.setSeg6(seg6);
        horario.setSeg7(seg7);
        horario.setSeg8(seg8);
        horario.setSeg9(seg9);
        horario.setSeg10(seg10);
        horario.setSeg11(seg11);
        horario.setSeg12(seg12);
        horario.setSeg13(seg13);
        horario.setSeg14(seg14);
        horario.setSeg15(seg15);
        horario.setSeg16(seg16);
        horario.setTer1(ter1);
        horario.setTer2(ter2);
        horario.setTer3(ter3);
        horario.setTer4(ter4);
        horario.setTer5(ter5);
        horario.setTer6(ter6);
        horario.setTer7(ter7);
        horario.setTer8(ter8);
        horario.setTer9(ter9);
        horario.setTer10(ter10);
        horario.setTer11(ter11);
        horario.setTer12(ter12);
        horario.setTer13(ter13);
        horario.setTer14(ter14);
        horario.setTer15(ter15);
        horario.setTer16(ter16);
        horario.setQua1(qua1);
        horario.setQua2(qua2);
        horario.setQua3(qua3);
        horario.setQua4(qua4);
        horario.setQua5(qua5);
        horario.setQua6(qua6);
        horario.setQua7(qua7);
        horario.setQua8(qua8);
        horario.setQua9(qua9);
        horario.setQua10(qua10);
        horario.setQua11(qua11);
        horario.setQua12(qua12);
        horario.setQua13(qua13);
        horario.setQua14(qua14);
        horario.setQua15(qua15);
        horario.setQua16(qua16);
        horario.setQui1(qui1);
        horario.setQui2(qui2);
        horario.setQui3(qui3);
        horario.setQui4(qui4);
        horario.setQui5(qui5);
        horario.setQui6(qui6);
        horario.setQui7(qui7);
        horario.setQui8(qui8);
        horario.setQui9(qui9);
        horario.setQui10(qui10);
        horario.setQui11(qui11);
        horario.setQui12(qui12);
        horario.setQui13(qui13);
        horario.setQui14(qui14);
        horario.setQui15(qui15);
        horario.setQui16(qui16);
        horario.setSex1(sex1);
        horario.setSex2(sex2);
        horario.setSex3(sex3);
        horario.setSex4(sex4);
        horario.setSex5(sex5);
        horario.setSex6(sex6);
        horario.setSex7(sex7);
        horario.setSex8(sex8);
        horario.setSex9(sex9);
        horario.setSex10(sex10);
        horario.setSex11(sex11);
        horario.setSex12(sex12);
        horario.setSex13(sex13);
        horario.setSex14(sex14);
        horario.setSex15(sex15);
        horario.setSex16(sex16);
        int validadeNOME = 0;
        String nomeTESTE = nome.toLowerCase();
        try {
            HorariosDAO dao = new HorariosDAO();
            List<Horarios> getAll = dao.getListaHorarios();
            for (Horarios cont : getAll) {
                String nomee = cont.getNome().toLowerCase();
                if ((nomee.equals(nomeTESTE)) && (idhorarios != cont.getIdhorarios())) {
                    validadeNOME++;
                }
            }

            if (validadeNOME > 0) {
                request.setAttribute("mensagem", "Este horário já foi cadastrado anteriormente! Tente novamente!");
                RequestDispatcher rd = request.getRequestDispatcher("alteraHorarios.jsp");
                rd.forward(request, response);

            } else {
                dao.alterar(horario);
                request.setAttribute("mensagem", "Horário foi alterado!");
                RequestDispatcher rd = request.getRequestDispatcher("gerenciarHorario.jsp");
                rd.forward(request, response);
            }

        } catch (SQLException e) {

        }

    }
    
    
        private void buscar2(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        RequestDispatcher rr = null;
        String tipo = request.getParameter("tipoBuscar");
        String nome = request.getParameter("nomeBuscar");

        if (tipo.equals("")) {
            request.setAttribute("mensagem", "Informe campos corretamente!");
            rr = request.getRequestDispatcher("/horarios.jsp");
            rr.forward(request, response);
        } else {
            HorariosDAO dao = new HorariosDAO();
            try {
                if (tipo.equals("1")) {
                    List listaturmas = dao.pesquisarHorarioTurma(nome);
                    request.setAttribute("sessaoListaHorarios", listaturmas);
                    RequestDispatcher rd = request.getRequestDispatcher("/horarios.jsp");
                    rd.forward(request, response);
                }
                if (tipo.equals("2")) {
                    List listaturmas = dao.pesquisarHorarioProfessor(nome);
                    request.setAttribute("sessaoListaHorarios", listaturmas);
                    RequestDispatcher rd = request.getRequestDispatcher("/horarios.jsp");
                    rd.forward(request, response);
                }

                if (tipo.equals("3")) {
                    List listaturmas = dao.pesquisarHorarioMonitoria(nome);
                    request.setAttribute("sessaoListaHorarios", listaturmas);
                    RequestDispatcher rd = request.getRequestDispatcher("/horarios.jsp");
                    rd.forward(request, response);
                }

            } catch (SQLException e) {

            }
        }

    }


        
        private void buscarAluno(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        RequestDispatcher rr = null;
        String tipo = request.getParameter("tipoBuscar");
        String nome = request.getParameter("nomeBuscar");

        if (tipo.equals("")) {
            request.setAttribute("mensagem", "Informe campos corretamente!");
            rr = request.getRequestDispatcher("/horarios2.jsp");
            rr.forward(request, response);
        } else {
            HorariosDAO dao = new HorariosDAO();
            try {
                if (tipo.equals("1")) {
                    List listaturmas = dao.pesquisarHorarioTurma(nome);
                    request.setAttribute("sessaoListaHorarios", listaturmas);
                    RequestDispatcher rd = request.getRequestDispatcher("/horarios2.jsp");
                    rd.forward(request, response);
                }
                if (tipo.equals("2")) {
                    List listaturmas = dao.pesquisarHorarioProfessor(nome);
                    request.setAttribute("sessaoListaHorarios", listaturmas);
                    RequestDispatcher rd = request.getRequestDispatcher("/horarios2.jsp");
                    rd.forward(request, response);
                }

                if (tipo.equals("3")) {
                    List listaturmas = dao.pesquisarHorarioMonitoria(nome);
                    request.setAttribute("sessaoListaHorarios", listaturmas);
                    RequestDispatcher rd = request.getRequestDispatcher("/horarios2.jsp");
                    rd.forward(request, response);
                }

            } catch (SQLException e) {

            }
        }

    }


}

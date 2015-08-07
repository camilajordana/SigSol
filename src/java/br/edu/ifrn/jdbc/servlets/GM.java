/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.jdbc.servlets;

import br.edu.ifrn.jdbc.dao.LimpezaDAO;
import br.edu.ifrn.jdbc.dao.LivroDAO;
import br.edu.ifrn.jdbc.dao.MaterialDAO;
import br.edu.ifrn.jdbc.dao.ObjetoDAO;
import br.edu.ifrn.jdbc.dao.SalaDAO;
import br.edu.ifrn.jdbc.modelo.Solicitacao;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
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

/**
 *
 * @author maryna
 */
public class GM extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("acao");

        try {

            if (acao.equals("pdf")) {
              //  Document document = new Document();
             //   try {
               //     PdfWriter.getInstance(document, new FileOutputStream("C:\\PDF.pdf"));
                //    document.open();

                    // adicionando um parágrafo no documento
                  //  document.add(new Paragraph("Gerando PDF - Java"));
            //        document.addSubject("Gerando PDF em Java");
              //      document.addKeywords("www.devmedia.com.br");
                //    document.addCreator("iText");
                  //  document.addAuthor("Davi Gomes da Costa");

          //      } catch (DocumentException de) {
                  //  System.err.println(de.getMessage());
                //} catch (IOException ioe) {
              //      System.err.println(ioe.getMessage());
            //    }

          //      document.close();
            }

            
            
            
            
            
            
            
            
            
            
            
            
            if (acao.equals("aceitar")) {
                MaterialDAO dao = new MaterialDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoEscritorioString = request.getParameter("id_solicitacaoEscritorio");
                int id_solicitacaoEscritorio = Integer.parseInt(id_solicitacaoEscritorioString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoEscritorio == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoEscritorio);
                        s1.setStatus("Requisicao aceita");
                    }
                }

                dao.aceitarSolicitacao(s1);
                List lista = dao.getListaEscritorio4();
                request.setAttribute("sessaoListaMateriais", lista);
                request.setAttribute("mensagem", "Solicitação aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_materiaEscritorio.jsp");
                rd.forward(request, response);

            }
            if (acao.equals("naoaceito")) {

                MaterialDAO dao = new MaterialDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoEscritorioString = request.getParameter("id_solicitacaoEscritorio");
                int id_solicitacaoEscritorio = Integer.parseInt(id_solicitacaoEscritorioString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoEscritorio == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoEscritorio);
                        s1.setStatus("Requisicao nao aceita");
                    }
                }

                dao.aceitarSolicitacao(s1);
                List lista = dao.getListaEscritorio4();
                request.setAttribute("sessaoListaMateriais", lista);
                request.setAttribute("mensagem", "Solicitação não aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_materiaEscritorio.jsp");
                rd.forward(request, response);

            }

            if (acao.equals("aceitarVideoAula")) {

                MaterialDAO dao = new MaterialDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoVideoAulaString = request.getParameter("id_solicitacaoVideoAula");
                int id_solicitacaoVideoAula = Integer.parseInt(id_solicitacaoVideoAulaString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoVideoAula == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoVideoAula);
                        s1.setStatus("Requisicao aceita");
                    }
                }

                dao.aceitarSolicitacao(s1);
                List lista = dao.getListaVideoAulaSolicitar();
                request.setAttribute("sessaoListaVideoAula", lista);
                request.setAttribute("mensagem", "Solicitação aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_videoAula.jsp");
                rd.forward(request, response);

            }

            if (acao.equals("naoaceitoVideoAula")) {

                MaterialDAO dao = new MaterialDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoVideoAulaString = request.getParameter("id_solicitacaoVideoAula");
                int id_solicitacaoVideoAula = Integer.parseInt(id_solicitacaoVideoAulaString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoVideoAula == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoVideoAula);
                        s1.setStatus("Requisicao nao aceita");
                    }
                }

                dao.aceitarSolicitacao(s1);
                List lista = dao.getListaVideoAulaSolicitar();
                request.setAttribute("sessaoListaVideoAula", lista);
                request.setAttribute("mensagem", "Solicitação não aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_videoAula.jsp");
                rd.forward(request, response);

            }

            if (acao.equals("aceitarSala")) {

                SalaDAO dao = new SalaDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoSalaString = request.getParameter("id_solicitacaoSala");
                int id_solicitacaoSala = Integer.parseInt(id_solicitacaoSalaString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoSala == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoSala);
                        s1.setStatus("Requisicao aceita");
                    }
                }
//FALTA AJEITAR AQUI
                dao.aceitarSolicitacao(s1);
                List listaSalas = dao.getListaSalasSolicitar();
                request.setAttribute("sessaoListaSalas", listaSalas);
                request.setAttribute("mensagem", "Solicitação aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_sala.jsp");
                rd.forward(request, response);

            }

            if (acao.equals("naoaceitoSala")) {

                SalaDAO dao = new SalaDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoSalaString = request.getParameter("id_solicitacaoSala");
                int id_solicitacaoSala = Integer.parseInt(id_solicitacaoSalaString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoSala == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoSala);
                        s1.setStatus("Requisicao nao aceita");
                    }
                }
//FALTA AJEITAR AQUI
                dao.aceitarSolicitacao(s1);
                List listaSalas = dao.getListaSalasSolicitar();
                request.setAttribute("sessaoListaSalas", listaSalas);
                request.setAttribute("mensagem", "Solicitação não aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_sala.jsp");
                rd.forward(request, response);

            }

            if (acao.equals("aceitarLivro")) {

                LivroDAO dao = new LivroDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoLivroString = request.getParameter("id_solicitacaoLivro");
                int id_solicitacaoLivro = Integer.parseInt(id_solicitacaoLivroString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoLivro == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoLivro);
                        s1.setStatus("Requisicao aceita");
                    }
                }
//FALTA AJEITAR AQUI
                dao.aceitarSolicitacao(s1);
                List listaSalas = dao.getListaLivrosSolicitar();
                request.setAttribute("sessaoListaLivros", listaSalas);
                request.setAttribute("mensagem", "Solicitação aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_livro.jsp");
                rd.forward(request, response);

            }

            if (acao.equals("naoaceitoLivro")) {

                LivroDAO dao = new LivroDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoLivroString = request.getParameter("id_solicitacaoLivro");
                int id_solicitacaoLivro = Integer.parseInt(id_solicitacaoLivroString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoLivro == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoLivro);
                        s1.setStatus("Requisicao nao aceita");
                    }
                }
//FALTA AJEITAR AQUI
                dao.aceitarSolicitacao(s1);
                List listaSalas = dao.getListaLivrosSolicitar();
                request.setAttribute("sessaoListaLivros", listaSalas);
                request.setAttribute("mensagem", "Solicitação não aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_livro.jsp");
                rd.forward(request, response);

            }

            if (acao.equals("aceitarObjeto")) {

                ObjetoDAO dao = new ObjetoDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoObjetoString = request.getParameter("id_solicitacaoObjeto");
                int id_solicitacaoObjeto = Integer.parseInt(id_solicitacaoObjetoString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoObjeto == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoObjeto);
                        s1.setStatus("Requisicao aceita");
                    }
                }
//FALTA AJEITAR AQUI
                dao.aceitarSolicitacao(s1);
                List lista = dao.getListaObjetosSolicitar();
                request.setAttribute("sessaoListaObjetos", lista);
                request.setAttribute("mensagem", "Solicitação aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_objetosPerdidos.jsp");
                rd.forward(request, response);

            }

            if (acao.equals("naoaceitoObjeto")) {

                ObjetoDAO dao = new ObjetoDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoObjetoString = request.getParameter("id_solicitacaoObjeto");
                int id_solicitacaoObjeto = Integer.parseInt(id_solicitacaoObjetoString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoObjeto == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoObjeto);
                        s1.setStatus("Requisicao nao aceita");
                    }
                }
//FALTA AJEITAR AQUI
                dao.aceitarSolicitacao(s1);
                List lista = dao.getListaObjetosSolicitar();
                request.setAttribute("sessaoListaObjetos", lista);
                request.setAttribute("mensagem", "Solicitação não aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_objetosPerdidos.jsp");
                rd.forward(request, response);

            }

            if (acao.equals("aceitarLimpeza")) {

                LimpezaDAO dao = new LimpezaDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoLimpezaString = request.getParameter("id_solicitacaoLimpeza");
                int id_solicitacaoLimpeza = Integer.parseInt(id_solicitacaoLimpezaString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoLimpeza == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoLimpeza);
                        s1.setStatus("Requisicao aceita");
                    }
                }
//FALTA AJEITAR AQUI
                dao.aceitarSolicitacao(s1);
                List lista = dao.getListaLimpezaSolicitar();
                request.setAttribute("sessaoListaLimpeza", lista);
                request.setAttribute("mensagem", "Solicitação aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_limpeza.jsp");
                rd.forward(request, response);

            }

            if (acao.equals("naoaceitoLimpeza")) {

                LimpezaDAO dao = new LimpezaDAO();
                Solicitacao s1 = new Solicitacao();
                String id_solicitacaoLimpezaString = request.getParameter("id_solicitacaoLimpeza");
                int id_solicitacaoLimpeza = Integer.parseInt(id_solicitacaoLimpezaString);
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoLimpeza == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoLimpeza);
                        s1.setStatus("Requisicao nao aceita");
                    }
                }
//FALTA AJEITAR AQUI
                dao.aceitarSolicitacao(s1);
                List lista = dao.getListaLimpezaSolicitar();
                request.setAttribute("sessaoListaLimpeza", lista);
                request.setAttribute("mensagem", "Solicitação não aceita!");
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_limpeza.jsp");
                rd.forward(request, response);

            }

        } catch (SQLException ex) {
            Logger.getLogger(GM.class.getName()).log(Level.SEVERE, null, ex);

        }

//        
//        if(botao.equals("aceito")){
//            String teste = "sim";
//            request.setAttribute("mensagem", "Solicitação aceita!" + botao);
//        //             request.setAttribute("sessaoListaEscritorio", lista);
//        RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_materiaEscritorio.jsp");
//        rd.forward(request, response);
//        } else {
//            if(botao.equals("naoaceito")){
//                String teste = "not";
//            request.setAttribute("mensagem", "Solicitação aceita!" + teste);
//        //             request.setAttribute("sessaoListaEscritorio", lista);
//        RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_materiaEscritorio.jsp");
//        rd.forward(request, response);
//            }
//        }
//                String n = null;
        //              Solicitacao s = new Solicitacao();
        //            String id_solicitacaoEscritorio = request.getParameter("id_solicitacaoEscritorio");
        //          String idsolicitarescritorio = request.getParameter("idsolicitarescritorio");
        //        int idd = Integer.parseInt(id_solicitacaoEscritorio);
        //      int id = Integer.parseInt(id_solicitacaoEscritorio);
        //    MaterialDAO dao = new MaterialDAO();
        //  List<Solicitacao> getAll = dao.getListaEscritorio2();
        //for(Solicitacao contI : getAll){
//          if(idd == contI.getIdsolicitarescritorio()){
        //         s.setIdsolicitarescritorio(idd);
        //       s.setComentarioEscritorio(comentario);
        //     n = "Solicitacao aceita";
        //    }
//        }
        //                     try {
        //            MaterialDAO dao1 = new MaterialDAO();
        //          List lista = dao1.getListaEscritorio2();
        //      dao1.aceitarEscritorio(s);
        //   request.setAttribute("mensagem", "Solicitação aceita!" + comentario);
        //             request.setAttribute("sessaoListaEscritorio", lista);
        // RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_materiaEscritorio.jsp");
        // rd.forward(request, response);
        //        } catch (Exception c) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Solicitacao s1 = new Solicitacao();
        String botao = request.getParameter("botao");
        String idsolicitacarescritorioString = request.getParameter("idsolicitarescritorio");
        String id_solicitacaoEscritorioString = request.getParameter("id_solicitacaoEscritorio");
        int idsolicitacarescritorio = Integer.parseInt(idsolicitacarescritorioString);
        int id_solicitacaoEscritorio = Integer.parseInt(id_solicitacaoEscritorioString);
        try {
            MaterialDAO dao = new MaterialDAO();
            if (botao.equals("aceito")) {
                List<Solicitacao> getAll2 = dao.getListaSolicitacao();
                for (Solicitacao i : getAll2) {
                    if (id_solicitacaoEscritorio == i.getIdsolicitacao()) {
                        s1.setIdsolicitacao(id_solicitacaoEscritorio);
                        s1.setStatus("Requisicao aceita");
                    }
                }

                dao.aceitarSolicitacao(s1);
                request.setAttribute("mensagem", "Solicitação aceita!" + id_solicitacaoEscritorioString);
                RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_materiaEscritorio.jsp");
                rd.forward(request, response);
            } else {
                if (botao.equals("naoaceito")) {
                    request.setAttribute("mensagem", "Solicitação não aceita!");
                    RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_materiaEscritorio.jsp");
                    rd.forward(request, response);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GM.class.getName()).log(Level.SEVERE, null, ex);

        }

        //   String vb = request.getParameter("botao");
        // String comentario = request.getParameter("comentario");
        // Solicitacao solicitacao = new Solicitacao();
        //   Solicitacao solicitacao2 = new Solicitacao();
        //     String idsolicitacarescritorio = request.getParameter("idsolicitarescritorio");
        //       String id_solicitacaoEscritorio = request.getParameter("id_solicitacaoEscritorio");
        //  int id1 = Integer.parseInt(idsolicitacarescritorio);
        //    int id2 = Integer.parseInt(id_solicitacaoEscritorio);
        //  /   try {
        //     MaterialDAO dao = new MaterialDAO();
        //          List<Solicitacao> getAll = dao.getListaEscritorio2();
//            List<Solicitacao> getAll2 = dao.getListaSolicitacao();
        //    if (vb.equals("aceito")) {
        //          for (Solicitacao contAceito : getAll) {
        //                if (id1 == contAceito.getIdsolicitarescritorio()) {
        //                      solicitacao.setIdsolicitarescritorio(id1);
        //solicitacao.setComentarioEscritorio("teste");
        //  for (Solicitacao contAceito2 : getAll2) {
        //        if(id2 == contAceito2.getIdsolicitacao()){
        //              solicitacao2.setStatus("Solicitacao aceita");
        //                solicitacao2.setIdsolicitacao(id2);
        //              }
        //            }
        //          }
        //        }
        //      }
        //        dao.aceitarEscritorio(solicitacao);
        //          dao.aceitarSolicitacao(solicitacao2);
        //  List lista = dao.getListaEscritorio2();
        //          request.setAttribute("mensagem", "Solicitação aceita!" + comentario);
        //      request.setAttribute("sessaoListaEscritorio", lista);
        //        RequestDispatcher rd = request.getRequestDispatcher("solicitacoes_materiaEscritorio.jsp");
        //     rd.forward(request, response);
        // } catch (SQLException ex) {
        //       Logger.getLogger(GM.class.getName()).log(Level.SEVERE, null, ex);
        //     }
    }
}

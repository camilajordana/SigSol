/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.jdbc.dao;

import br.edu.ifrn.jdbc.ConnectionFactory;
import br.edu.ifrn.jdbc.modelo.Solicitacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LimpezaDAO {
    
    //conexão com o banco de dados
    private Connection connection;
    PreparedStatement psmt = null;
    ResultSet rs = null;

    public LimpezaDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public void solicitarLimpeza(Solicitacao ss) throws SQLException {
    
        PreparedStatement stmt = this.connection.prepareStatement("insert into solicitacao (tipo, statuss) values (?, ?)");
        stmt.setString(1, ss.getTipo());
        stmt.setString(2, ss.getStatus());
        
        stmt.execute();
        stmt.close();
        
       
        PreparedStatement stmt2 = this.connection.prepareStatement("insert into solicitarlimpeza (local_limpeza, descricao, solicitantenome, solicitantematricula, id_solicitacaoLimpeza) values (?, ?, ?, ?, (SELECT MAX(solicitacao.idsolicitacao) from solicitacao));");
        stmt2.setString(1, ss.getLocalLimpeza());
        stmt2.setString(2, ss.getDescricaoLimpeza());
        stmt2.setString(3, ss.getSolicitantenomeLimpeza());
        stmt2.setString(4, ss.getSolicitantematriculaLimpeza());
        
     //   stmt2.setInt(7, ss.getIdsolicitacao()); //AQUI É O PROBLEMA
        stmt2.execute();
        stmt2.close();
        
        
        
    }
    
    
    
    
        public List<Solicitacao> getListaLimpezaSolicitar() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select solicitarlimpeza.local_limpeza, solicitarlimpeza.solicitantenome, solicitarlimpeza.solicitantematricula, solicitarlimpeza.descricao, solicitarlimpeza.id_solicitacaoLimpeza from solicitarlimpeza, solicitacao where solicitarlimpeza.id_solicitacaoLimpeza = solicitacao.idsolicitacao and solicitacao.statuss = 'Requisicao em andamento'");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> limpezas = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao limpeza = new Solicitacao();
            limpeza.setLocalLimpeza(rs.getString("local_limpeza"));
            limpeza.setSolicitantenomeLimpeza(rs.getString("solicitantenome"));
            limpeza.setSolicitantematriculaLimpeza(rs.getString("solicitantematricula"));
            limpeza.setDescricaoLimpeza(rs.getString("descricao"));
            limpeza.setId_solicitacaoLimpeza(rs.getInt("id_solicitacaoLimpeza"));
            
         //   material.setIdsolicitacao(rs.getInt("idsolicitacao"));
            //     material.setStatus(rs.getString("statuss"));
            //adicionando objeto à lista
            limpezas.add(limpeza);
        }
        rs.close();
        stmt.close();
        return limpezas;

    }
        
        
        
public List<Solicitacao> getListaSolicitacao() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from solicitacao");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> materiais = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao material = new Solicitacao();
            material.setIdsolicitacao(rs.getInt("idsolicitacao"));
            material.setStatus(rs.getString("statuss"));
            material.setTipo(rs.getString("tipo"));

            //adicionando objeto à lista
            materiais.add(material);
        }
        rs.close();
        stmt.close();
        return materiais;
    }

public void aceitarSolicitacao(Solicitacao ss) throws SQLException {

        PreparedStatement stmt = this.connection.prepareStatement("update solicitacao set statuss = ? where idsolicitacao = ?");
        stmt.setString(1, ss.getStatus());
        stmt.setInt(2, ss.getIdsolicitacao());
        stmt.execute();
        stmt.close();

        //PreparedStatement stmt2 = this.connection.prepareStatement("insert into solicitarvideoaula (dia, inicio, termino, descricao, solicitantenome, solicitantematricula, id_solicitacaoVideoAula) values (?, ?, ?, ?, ?, ?, (SELECT MAX(solicitacao.idsolicitacao) from solicitacao));");
        //  stmt2.setString(1, ss.getDiaVideoAula());
        //    stmt2.setString(2, ss.getInicioVideoAula());
        //      stmt2.setString(3, ss.getTerminoVideoAula());
//        stmt2.setString(4, ss.getDescricaoVideoAula());
        //stmt2.setString(5, ss.getSolicitantenomeVideoAula());
        //stmt2.setString(6, ss.getSolicitantematriculaVideoAula());
        //     stmt2.execute();
        //   stmt2.close();
    }
 
public List<Solicitacao> listarTodos() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("SELECT solicitacao.idsolicitacao, solicitacao.statuss, solicitarlimpeza.local_limpeza, solicitarlimpeza.solicitantenome, solicitarlimpeza.solicitantematricula, solicitarlimpeza.descricao, solicitarlimpeza.id_solicitacaoLimpeza FROM solicitacao, solicitarlimpeza WHERE solicitacao.idsolicitacao = solicitarlimpeza.id_solicitacaoLimpeza;");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> limpezas = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao limpeza = new Solicitacao();
            limpeza.setIdsolicitacao(rs.getInt("idsolicitacao"));
            limpeza.setStatus(rs.getString("statuss"));
            limpeza.setLocalLimpeza(rs.getString("local_limpeza"));
            limpeza.setSolicitantenomeLimpeza(rs.getString("solicitantenome"));
            limpeza.setSolicitantematriculaLimpeza(rs.getString("solicitantematricula"));
            limpeza.setDescricaoLimpeza(rs.getString(("descricao")));
            limpeza.setId_solicitacaoLimpeza(rs.getInt("id_solicitacaoLimpeza"));
            //adicionando objeto à lista
            limpezas.add(limpeza);
        }
        rs.close();
        stmt.close();
        return limpezas;

    }
    
    
}

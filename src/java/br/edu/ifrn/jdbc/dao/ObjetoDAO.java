package br.edu.ifrn.jdbc.dao;

import br.edu.ifrn.jdbc.ConnectionFactory;
import br.edu.ifrn.jdbc.modelo.Solicitacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ObjetoDAO {

    //conexão com o banco de dados
    private Connection connection;
    PreparedStatement psmt = null;
    ResultSet rs = null;
    
    public ObjetoDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public void solicitarObjetosPerdidos(Solicitacao ss) throws SQLException {
    
        PreparedStatement stmt = this.connection.prepareStatement("insert into solicitacao (tipo, statuss) values (?, ?)");
        stmt.setString(1, ss.getTipo());
        stmt.setString(2, ss.getStatus());
        
        stmt.execute();
        stmt.close();
        
       
        PreparedStatement stmt2 = this.connection.prepareStatement("insert into solicitarobjeto (objeto, dia, local_objeto, descricao, solicitantenome, solicitantematricula, id_solicitacaoObjeto) values (?, ?, ?, ?, ?, ?, (SELECT MAX(solicitacao.idsolicitacao) from solicitacao));");
        stmt2.setString(1, ss.getObjeto());
        stmt2.setString(2, ss.getDiaObjeto());
        stmt2.setString(3, ss.getLocalObjeto());
        stmt2.setString(4, ss.getDescricaoObjeto());
        stmt2.setString(5, ss.getSolicitantenomeObjeto());
        stmt2.setString(6, ss.getSolicitantematriculaObjeto());
        
     //   stmt2.setInt(7, ss.getIdsolicitacao()); //AQUI É O PROBLEMA
        stmt2.execute();
        stmt2.close();
        
        
        
    }
    
       public List<Solicitacao> getListaObjetosSolicitar() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select solicitarobjeto.objeto, solicitarobjeto.solicitantenome, solicitarobjeto.solicitantematricula, solicitarobjeto.dia, solicitarobjeto.local_objeto, solicitarobjeto.descricao, solicitarobjeto.id_solicitacaoObjeto from solicitarobjeto, solicitacao where solicitarobjeto.id_solicitacaoObjeto = solicitacao.idsolicitacao and solicitacao.statuss = 'Requisicao em andamento'");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> objetos = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao objeto = new Solicitacao();
            objeto.setObjeto(rs.getString("objeto"));
            objeto.setSolicitantenomeObjeto(rs.getString("solicitantenome"));
            objeto.setSolicitantematriculaObjeto(rs.getString("solicitantematricula"));
            objeto.setDiaObjeto(rs.getString("dia"));
            objeto.setLocalObjeto(rs.getString("local_objeto"));
            objeto.setDescricaoObjeto(rs.getString("descricao"));
            objeto.setId_solicitacaoObjeto(rs.getInt("id_solicitacaoObjeto"));
            
         //   material.setIdsolicitacao(rs.getInt("idsolicitacao"));
            //     material.setStatus(rs.getString("statuss"));
            //adicionando objeto à lista
            objetos.add(objeto);
        }
        rs.close();
        stmt.close();
        return objetos;

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
        
        
        
        public List<Solicitacao> getListaSalasSolicitar() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select solicitarsala.sala, solicitarsala.solicitantenome, solicitarsala.solicitantematricula, solicitarsala.dia, solicitarsala.inicio, solicitarsala.termino, solicitarsala.descricao, solicitarsala.id_solicitacao from solicitarsala, solicitacao where solicitarsala.id_solicitacao = solicitacao.idsolicitacao and solicitacao.statuss = 'Requisicao em andamento'");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> salas = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao sala = new Solicitacao();
            sala.setSala(rs.getString("sala"));
            sala.setSolicitantenomeSala(rs.getString("solicitantenome"));
            sala.setSolicitantematriculaSala(rs.getString("solicitantematricula"));
            sala.setDiaSala(rs.getString("dia"));
            sala.setInicioSala(rs.getString("inicio"));
            sala.setTerminoSala(rs.getString("termino"));
            sala.setDescricaoSala(rs.getString("descricao"));
            sala.setId_solicitacaoSala(rs.getInt("id_solicitacao"));
         //   material.setIdsolicitacao(rs.getInt("idsolicitacao"));
            //     material.setStatus(rs.getString("statuss"));
            //adicionando objeto à lista
            salas.add(sala);
        }
        rs.close();
        stmt.close();
        return salas;

    }
        
        
        
    public List<Solicitacao> listarTodos() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("SELECT solicitacao.idsolicitacao, solicitacao.statuss, solicitarobjeto.objeto, solicitarobjeto.solicitantenome, solicitarobjeto.solicitantematricula, solicitarobjeto.local_objeto, solicitarobjeto.dia, solicitarobjeto.descricao, solicitarobjeto.id_solicitacaoObjeto FROM solicitacao, solicitarobjeto WHERE solicitacao.idsolicitacao = solicitarobjeto.id_solicitacaoObjeto;");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> objetos = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao objeto = new Solicitacao();
            objeto.setIdsolicitacao(rs.getInt("idsolicitacao"));
            objeto.setStatus(rs.getString("statuss"));
            objeto.setObjeto(rs.getString("objeto"));
            objeto.setSolicitantenomeObjeto(rs.getString("solicitantenome"));
            objeto.setSolicitantematriculaObjeto(rs.getString("solicitantematricula"));
            objeto.setLocalObjeto(rs.getString("local_objeto"));
            objeto.setDiaObjeto(rs.getString("dia"));
            objeto.setDescricaoObjeto(rs.getString("descricao"));
            objeto.setId_solicitacaoObjeto(rs.getInt("id_solicitacaoObjeto"));
            //adicionando objeto à lista
            objetos.add(objeto);
        }
        rs.close();
        stmt.close();
        return objetos;

    }
    
}

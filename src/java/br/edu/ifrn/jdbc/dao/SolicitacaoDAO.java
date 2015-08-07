

package br.edu.ifrn.jdbc.dao;

import br.edu.ifrn.jdbc.ConnectionFactory;
import br.edu.ifrn.jdbc.modelo.Solicitacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SolicitacaoDAO {
    private Connection connection;
    PreparedStatement psmt = null;
    ResultSet rs = null;
    
    public SolicitacaoDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }
    
 public List<Solicitacao> getLista(String matricula) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("SELECT solicitacao.idsolicitacao, solicitarescritorio.material, solicitarescritorio.solicitantematricula, solicitarescritorio.quantidade, solicitarescritorio.descricao, solicitarescritorio.id_solicitacaoEscritorio FROM solicitacao, solicitarescritorio WHERE solicitacao.idsolicitacao = solicitarescritorio.id_solicitacaoEscritorio and solicitarescritorio.solicitantematricula = '"+matricula+"';");
        ResultSet rs = stmt.executeQuery();
        List<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Solicitacao solicitacao = new Solicitacao();
            
            solicitacao.setIdsolicitacao(rs.getInt("idsolicitacao"));
            solicitacao.setEscritorio(rs.getString("material"));
            solicitacao.setSolicitantematriculaEscritorio(rs.getString("solicitantematricula"));
            solicitacao.setQuantidadeEscritorio(rs.getInt("quantidade"));
            solicitacao.setDescricaoEscritorio(rs.getString("descricao"));
            solicitacao.setId_solicitacaoEscritorio(rs.getInt("id_solicitacaoEscritorio"));

            //adicionando objeto à lista
            solicitacoes.add(solicitacao);
        }
        rs.close();
        stmt.close();
        return solicitacoes;

        
        
        
        
        
        PreparedStatement stmt2 = this.connection.prepareStatement("SELECT solicitacao.idsolicitacao, solicitarlimpeza.local_limpeza, solicitarlimpeza.solicitantematricula, solicitarlimpeza.descricao, solicitarlimpeza.id_solicitacaoLimpeza FROM solicitacao, solicitarlimpeza WHERE solicitacao.idsolicitacao = solicitarlimpeza.id_solicitacaoLimpeza and solicitarlimpeza.solicitantematricula = '"+matricula+"';");
        ResultSet rs2 = stmt.executeQuery();
        List<Solicitacao> solicitacoes2 = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Solicitacao solicitacao2 = new Solicitacao();
            
            solicitacao.setIdsolicitacao(rs.getInt("idsolicitacao"));
            solicitacao.setEscritorio(rs.getString("material"));
            solicitacao.setSolicitantematriculaEscritorio(rs.getString("solicitantematricula"));
            solicitacao.setQuantidadeEscritorio(rs.getInt("quantidade"));
            solicitacao.setDescricaoEscritorio(rs.getString("descricao"));
            solicitacao.setId_solicitacaoEscritorio(rs.getInt("id_solicitacaoEscritorio"));

            //adicionando objeto à lista
            solicitacoes2.add(solicitacao2);
        }
        rs.close();
        stmt.close();
        return solicitacoes2;

        
        
        
        
    }
   
}

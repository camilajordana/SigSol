/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.jdbc.dao;

import br.edu.ifrn.jdbc.ConnectionFactory;
import static br.edu.ifrn.jdbc.ConnectionFactory.getConnection;
import br.edu.ifrn.jdbc.modelo.Sala;
import br.edu.ifrn.jdbc.modelo.Solicitacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalaDAO {

    //conexão com o banco de dados
    private Connection connection;
    PreparedStatement psmt = null;
    ResultSet rs = null;

    public SalaDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public void adicionarSala(Sala sala) throws SQLException {

        //prepared statement para inserir
        PreparedStatement stmt = this.connection.prepareStatement("insert into sala (nome) values (?)");

        stmt.setString(1, sala.getNome());
        stmt.execute();
        stmt.close();

    }

    public List<Sala> getListaSala() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from sala");
        ResultSet rs = stmt.executeQuery();

        List<Sala> salas = new ArrayList<Sala>();

        while (rs.next()) {
            Sala sala = new Sala();
            sala.setIdsala(rs.getInt("idsala"));
            sala.setNome(rs.getString("nome"));

            salas.add(sala);
        }

        rs.close();
        stmt.close();
        return salas;
    }

    public void update(Sala sala) throws SQLException {
        connection = getConnection();
        PreparedStatement stmt;
        String sql = "UPDATE sala set nome = ? where idsala = ?";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, sala.getNome());
            stmt.setInt(2, sala.getIdsala());
            stmt.executeUpdate();
            System.out.println("Dado atualizado com sucesso");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void removerPeloID(Sala sala) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("delete from sala where idsala = ?");
        stmt.setInt(1, sala.getIdsala());
        stmt.execute();
        stmt.close();
    }

    public void alterarSala(Sala sala) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("update sala set nome = ? where idsala = ?");
        stmt.setString(1, sala.getNome());
        stmt.setInt(2, sala.getIdsala());
        stmt.execute();
        stmt.close();
    }

    public void solicitarSala1(Solicitacao ss) throws SQLException {

        PreparedStatement stmt = this.connection.prepareStatement("insert into solicitacao (tipo, statuss) "
                + "values (?, ?)");
        stmt.setString(1, ss.getTipo());
        stmt.setString(2, ss.getStatus());

        stmt.execute();
        stmt.close();

        PreparedStatement stmt2 = this.connection.prepareStatement("insert into solicitarsala (dia, inicio, "
                + "termino, descricao, sala, solicitantenome, solicitantematricula, id_solicitacao) "
                + "values (?, ?, ?, ?, ?, ?, ?, (SELECT MAX(solicitacao.idsolicitacao) from solicitacao));");
        stmt2.setString(1, ss.getDiaSala());
        stmt2.setString(2, ss.getInicioSala());
        stmt2.setString(3, ss.getTerminoSala());
        stmt2.setString(4, ss.getDescricaoSala());
        stmt2.setString(5, ss.getSala());
        stmt2.setString(6, ss.getSolicitantenomeSala());
        stmt2.setString(7, ss.getSolicitantematriculaSala());

        stmt2.execute();
        stmt2.close();

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
        try {
            PreparedStatement stmt = this.connection.prepareStatement("update solicitacao set "
                    + "statuss = '?' where idsolicitacao = ?");
            stmt.setString(1, ss.getStatus());
            stmt.setInt(2, ss.getIdsolicitacao());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    
    public List<Solicitacao> listarTodos() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("SELECT solicitacao.idsolicitacao, solicitacao.statuss, solicitarsala.sala, solicitarsala.solicitantenome, solicitarsala.solicitantematricula, solicitarsala.dia, solicitarsala.inicio, solicitarsala.termino, solicitarsala.descricao, solicitarsala.id_solicitacao FROM solicitacao, solicitarsala WHERE solicitacao.idsolicitacao = solicitarsala.id_solicitacao;");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> salas = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao sala = new Solicitacao();
            sala.setIdsolicitacao(rs.getInt("idsolicitacao"));
            sala.setStatus(rs.getString("statuss"));
            sala.setSala(rs.getString("sala"));
            sala.setSolicitantenomeSala(rs.getString("solicitantenome"));
            sala.setSolicitantematriculaSala(rs.getString("solicitantematricula"));
            sala.setDiaSala(rs.getString("dia"));
            sala.setInicioSala(rs.getString("inicio"));
            sala.setTerminoSala(rs.getString("termino"));
            sala.setDescricaoSala(rs.getString("descricao"));
            sala.setId_solicitacaoSala(rs.getInt("id_solicitacao"));
            //adicionando objeto à lista
            salas.add(sala);
        }
        rs.close();
        stmt.close();
        return salas;

    }


}

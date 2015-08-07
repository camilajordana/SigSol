/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.jdbc.dao;

import br.edu.ifrn.jdbc.ConnectionFactory;
import static br.edu.ifrn.jdbc.ConnectionFactory.getConnection;
import br.edu.ifrn.jdbc.modelo.Material;
import br.edu.ifrn.jdbc.modelo.Pessoa;
import br.edu.ifrn.jdbc.modelo.Solicitacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MaterialDAO {

    //conexão com o banco de dados
    private Connection connection;
    PreparedStatement psmt = null;
    ResultSet rs = null;

    public MaterialDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public void adicionarMaterial(Material material) throws SQLException {

        //prepared statement para inserir
        PreparedStatement stmt = this.connection.prepareStatement("insert into material (nome_material, tipo) values (?, ?)");

        //seta os valores
        stmt.setString(1, material.getNome_material());
        stmt.setInt(2, material.getTipo());

        //executa
        stmt.execute();
        stmt.close();
    }

    public List<Material> getListaEscritorio() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from material where tipo = 1");
        ResultSet rs = stmt.executeQuery();

        List<Material> materiais = new ArrayList<Material>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Material material = new Material();
            material.setIdmaterial(rs.getInt("idmaterial"));
            material.setNome_material(rs.getString("nome_material"));
            material.setTipo(rs.getInt("tipo"));

            //adicionando objeto à lista
            materiais.add(material);
        }
        rs.close();
        stmt.close();
        return materiais;
    }

    public List<Material> getListaVideoaula() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from material where tipo = 2");
        ResultSet rs = stmt.executeQuery();

        List<Material> materiais = new ArrayList<Material>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Material material = new Material();
            material.setIdmaterial(rs.getInt("idmaterial"));
            material.setNome_material(rs.getString("nome_material"));
            material.setTipo(rs.getInt("tipo"));

            //adicionando objeto à lista
            materiais.add(material);
        }
        rs.close();
        stmt.close();
        return materiais;
    }

    public void update(Material material) throws SQLException {
        connection = getConnection();
        PreparedStatement stmt;
        String sql = "UPDATE material set nome_material = ?, tipo = ? where idmaterial = ?";
        try {

            stmt = connection.prepareStatement(sql);
            stmt.setString(1, material.getNome_material());
            stmt.setInt(2, material.getTipo());
            stmt.setInt(3, material.getIdmaterial());
            stmt.executeUpdate();
            System.out.println("Dado atualizado com sucesso");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void removerPeloID(Material material) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("delete from material where idmaterial = ?");
        stmt.setInt(1, material.getIdmaterial());
        stmt.execute();
        stmt.close();

    }

    public void alterarPessoa(Material material) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("update material set nome_material = ? where idmaterial = ?");
        stmt.setString(1, material.getNome_material());
        stmt.setInt(2, material.getIdmaterial());
        stmt.execute();
        stmt.close();
    }

    public void solicitarEscritorio(Solicitacao ss) throws SQLException {

        PreparedStatement stmt = this.connection.prepareStatement("insert into solicitacao (tipo, statuss) values (?, ?)");
        stmt.setString(1, ss.getTipo());
        stmt.setString(2, ss.getStatus());
        stmt.execute();
        stmt.close();

        PreparedStatement stmt2 = this.connection.prepareStatement("insert into solicitarescritorio (material, quantidade, descricao, solicitantenome, solicitantematricula, id_solicitacaoEscritorio) values (?, ?, ?, ?, ?, (SELECT MAX(solicitacao.idsolicitacao) from solicitacao));");
        stmt2.setString(1, ss.getEscritorio());
        stmt2.setInt(2, ss.getQuantidadeEscritorio());
        stmt2.setString(3, ss.getDescricaoEscritorio());
        stmt2.setString(4, ss.getSolicitantenomeEscritorio());
        stmt2.setString(5, ss.getSolicitantematriculaEscritorio());

        //   stmt2.setInt(7, ss.getIdsolicitacao()); //AQUI É O PROBLEMA
        stmt2.execute();
        stmt2.close();

    }

    public void solicitarVideoAula(Solicitacao ss) throws SQLException {

        PreparedStatement stmt = this.connection.prepareStatement("insert into solicitacao (tipo, statuss) values (?, ?)");
        stmt.setString(1, ss.getTipo());
        stmt.setString(2, ss.getStatus());
        stmt.execute();
        stmt.close();

        PreparedStatement stmt2 = this.connection.prepareStatement("insert into solicitarvideoaula (dia, inicio, termino, descricao, solicitantenome, solicitantematricula, id_solicitacaoVideoAula) values (?, ?, ?, ?, ?, ?, (SELECT MAX(solicitacao.idsolicitacao) from solicitacao));");
        stmt2.setString(1, ss.getDiaVideoAula());
        stmt2.setString(2, ss.getInicioVideoAula());
        stmt2.setString(3, ss.getTerminoVideoAula());
        stmt2.setString(4, ss.getDescricaoVideoAula());
        stmt2.setString(5, ss.getSolicitantenomeVideoAula());
        stmt2.setString(6, ss.getSolicitantematriculaVideoAula());

        //   stmt2.setInt(7, ss.getIdsolicitacao()); //AQUI É O PROBLEMA
        stmt2.execute();
        stmt2.close();

    }

    public List<Solicitacao> getListaEscritorio2() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from solicitarescritorio");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> materiais = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao material = new Solicitacao();
            material.setIdsolicitarescritorio(rs.getInt("idsolicitarescritorio"));
            material.setEscritorio(rs.getString("material"));
            material.setQuantidadeEscritorio(rs.getInt("quantidade"));
            material.setDescricaoEscritorio(rs.getString(("descricao")));
            material.setSolicitantenomeEscritorio(rs.getString("solicitantenome"));
            material.setSolicitantematriculaEscritorio(rs.getString("solicitantematricula"));

            material.setId_solicitacaoEscritorio(rs.getInt("id_solicitacaoEscritorio"));

            //adicionando objeto à lista
            materiais.add(material);
        }
        rs.close();
        stmt.close();
        return materiais;
    }

    public void alterarEscritorio(Solicitacao ss) throws SQLException {

        PreparedStatement stmt = connection.prepareStatement("update solicitacao set statuss = ? where idsolicitacao = ?");
        stmt.setString(1, ss.getStatus());
        stmt.setInt(2, ss.getId_solicitacaoEscritorio());
        stmt.execute();
        stmt.close();

    }

    public void aceitarEscritorio(Solicitacao ss) throws SQLException {

        PreparedStatement stmt = this.connection.prepareStatement("update solicitarescritorio set comentario = ? where idsolicitarescritorio = ?");
        stmt.setString(1, ss.getComentarioEscritorio());
        stmt.setInt(2, ss.getIdsolicitarescritorio());
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

    public List<Solicitacao> getListaEscritorio3() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from solicitarescritorio where status = 'Requisicao aceita'");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> materiais = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao material = new Solicitacao();
            material.setIdsolicitarescritorio(rs.getInt("idsolicitarescritorio"));
            material.setEscritorio(rs.getString("material"));
            material.setQuantidadeEscritorio(rs.getInt("quantidade"));
            material.setDescricaoEscritorio(rs.getString(("descricao")));
            material.setSolicitantenomeEscritorio(rs.getString("solicitantenome"));
            material.setSolicitantematriculaEscritorio(rs.getString("solicitantematricula"));

            material.setId_solicitacaoEscritorio(rs.getInt("id_solicitacaoEscritorio"));

            //adicionando objeto à lista
            materiais.add(material);
        }
        rs.close();
        stmt.close();
        return materiais;
    }

    public List<Solicitacao> getListaEscritorio4() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select solicitarescritorio.material, solicitarescritorio.solicitantenome, solicitarescritorio.solicitantematricula, solicitarescritorio.quantidade, solicitarescritorio.descricao, solicitarescritorio.id_solicitacaoEscritorio, solicitacao.statuss   from solicitarescritorio, solicitacao where solicitarescritorio.id_solicitacaoEscritorio = solicitacao.idsolicitacao and solicitacao.statuss = 'Requisicao em andamento'");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> materiais = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao material = new Solicitacao();
            material.setEscritorio(rs.getString("material"));
            material.setSolicitantenomeEscritorio(rs.getString("solicitantenome"));
            material.setSolicitantematriculaEscritorio(rs.getString("solicitantematricula"));
            material.setQuantidadeEscritorio(rs.getInt("quantidade"));
            material.setDescricaoEscritorio(rs.getString(("descricao")));
            material.setId_solicitacaoEscritorio(rs.getInt("id_solicitacaoEscritorio"));
            //   material.setIdsolicitacao(rs.getInt("idsolicitacao"));
            material.setStatus(rs.getString("statuss"));
            //adicionando objeto à lista
            materiais.add(material);
        }
        rs.close();
        stmt.close();
        return materiais;

    }

    public List<Solicitacao> getListaVideoAulaSolicitar() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select solicitarvideoaula.dia, solicitarvideoaula.inicio, solicitarvideoaula.termino, solicitarvideoaula.descricao, solicitarvideoaula.solicitantenome, solicitarvideoaula.solicitantematricula, solicitarvideoaula.id_solicitacaoVideoAula   from solicitarvideoaula, solicitacao where solicitarvideoaula.id_solicitacaoVideoAula = solicitacao.idsolicitacao and solicitacao.statuss = 'Requisicao em andamento'");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> materiais = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao material = new Solicitacao();
            material.setDiaVideoAula(rs.getString("dia"));
            material.setInicioVideoAula(rs.getString("inicio"));
            material.setTerminoVideoAula(rs.getString("termino"));
            material.setDescricaoVideoAula(rs.getString("descricao"));
            material.setSolicitantenomeVideoAula(rs.getString("solicitantenome"));
            material.setSolicitantematriculaVideoAula(rs.getString("solicitantematricula"));
            material.setId_solicitacaoVideoAula(rs.getInt("id_solicitacaoVideoAula"));
            //   material.setIdsolicitacao(rs.getInt("idsolicitacao"));
            //     material.setStatus(rs.getString("statuss"));
            //adicionando objeto à lista
            materiais.add(material);
        }
        rs.close();
        stmt.close();
        return materiais;

    }

    public List<Solicitacao> getListaVideoAula4() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select solicitarescritorio.material, solicitarescritorio.solicitantenome, solicitarescritorio.solicitantematricula, solicitarescritorio.quantidade, solicitarescritorio.descricao, solicitarescritorio.id_solicitacaoEscritorio   from solicitarescritorio, solicitacao where solicitarescritorio.id_solicitacaoEscritorio = solicitacao.idsolicitacao and solicitacao.statuss = 'Requisicao em andamento'");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> materiais = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao material = new Solicitacao();
            material.setEscritorio(rs.getString("material"));
            material.setSolicitantenomeEscritorio(rs.getString("solicitantenome"));
            material.setSolicitantematriculaEscritorio(rs.getString("solicitantematricula"));
            material.setQuantidadeEscritorio(rs.getInt("quantidade"));
            material.setDescricaoEscritorio(rs.getString(("descricao")));
            material.setId_solicitacaoEscritorio(rs.getInt("id_solicitacaoEscritorio"));
            //   material.setIdsolicitacao(rs.getInt("idsolicitacao"));
            //     material.setStatus(rs.getString("statuss"));
            //adicionando objeto à lista
            materiais.add(material);
        }
        rs.close();
        stmt.close();
        return materiais;

    }

    public List<Solicitacao> listarTodos() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("SELECT solicitacao.idsolicitacao, solicitacao.statuss, solicitarescritorio.material, solicitarescritorio.solicitantenome, solicitarescritorio.solicitantematricula, solicitarescritorio.quantidade, solicitarescritorio.descricao, solicitarescritorio.id_solicitacaoEscritorio FROM solicitacao, solicitarescritorio where solicitacao.idsolicitacao = solicitarescritorio.id_solicitacaoEscritorio;");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> materiais = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao material = new Solicitacao();
            material.setIdsolicitacao(rs.getInt("idsolicitacao"));
            material.setStatus(rs.getString("statuss"));
            material.setEscritorio(rs.getString("material"));
            material.setSolicitantenomeEscritorio(rs.getString("solicitantenome"));
            material.setSolicitantematriculaEscritorio(rs.getString("solicitantematricula"));
            material.setQuantidadeEscritorio(rs.getInt("quantidade"));
            material.setDescricaoEscritorio(rs.getString(("descricao")));
            material.setId_solicitacaoEscritorio(rs.getInt("id_solicitacaoEscritorio"));
            //adicionando objeto à lista
            materiais.add(material);
        }
        rs.close();
        stmt.close();
        return materiais;

    }
    

    public List<Solicitacao> listarTodos2() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("SELECT solicitacao.idsolicitacao, solicitacao.statuss, solicitarvideoaula.solicitantenome, solicitarvideoaula.solicitantematricula, solicitarvideoaula.dia, solicitarvideoaula.inicio, solicitarvideoaula.descricao, solicitarvideoaula.termino, solicitarvideoaula.id_solicitacaoVideoAula FROM solicitacao, solicitarvideoaula where solicitacao.idsolicitacao = solicitarvideoaula.id_solicitacaoVideoAula;");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> materiais = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao material = new Solicitacao();
            material.setIdsolicitacao(rs.getInt("idsolicitacao"));
            material.setStatus(rs.getString("statuss"));
            material.setSolicitantenomeVideoAula(rs.getString("solicitantenome"));
            material.setSolicitantematriculaVideoAula(rs.getString("solicitantematricula"));
            material.setDiaVideoAula(rs.getString("dia"));
            material.setInicioVideoAula(rs.getString("inicio"));
            material.setDescricaoVideoAula(rs.getString("descricao"));
            material.setTerminoVideoAula(rs.getString("termino"));
            material.setId_solicitacaoVideoAula(rs.getInt("id_solicitacaoVideoAula"));
            //adicionando objeto à lista
            materiais.add(material);
        }
        rs.close();
        stmt.close();
        return materiais;

    }

}

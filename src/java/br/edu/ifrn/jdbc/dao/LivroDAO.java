package br.edu.ifrn.jdbc.dao;

import br.edu.ifrn.jdbc.ConnectionFactory;
import static br.edu.ifrn.jdbc.ConnectionFactory.getConnection;
import br.edu.ifrn.jdbc.modelo.Livro;
import br.edu.ifrn.jdbc.modelo.Solicitacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    private Connection connection;

    public LivroDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public void adicionarLivro(Livro livro) throws SQLException {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("insert into livro (nome, autor,"
                    + " disciplina, isbn) values (?, ?, ?, ?)");

            stmt.setString(1, livro.getNome());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getDisciplina());
            stmt.setInt(4, livro.getIsbn());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    PreparedStatement psmt = null;
    ResultSet rs = null;

    public List<Livro> getListaLivro() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from livro");
        ResultSet rs = stmt.executeQuery();

        List<Livro> livros = new ArrayList<Livro>();

        while (rs.next()) {
            Livro livro = new Livro();
            livro.setIdlivro(rs.getInt("idlivro"));
            livro.setNome(rs.getString("nome"));
            livro.setAutor(rs.getString("autor"));
            livro.setDisciplina(rs.getString("disciplina"));
            livro.setIsbn(rs.getInt("isbn"));

            livros.add(livro);
        }

        rs.close();
        stmt.close();
        return livros;
    }

    public void update(Livro livro) throws SQLException {
        connection = getConnection();
        PreparedStatement stmt;
        String sql = "UPDATE livro set nome = ?, autor = ?, disciplina = ?, isbn = ? where idlivro = ?";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, livro.getNome());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getDisciplina());
            stmt.setInt(4, livro.getIsbn());
            stmt.setInt(5, livro.getIdlivro());
            stmt.executeUpdate();
            System.out.println("Dado atualizado com sucesso");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void removerPeloID(Livro livro) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("delete from livro where idlivro = ?");
        stmt.setInt(1, livro.getIdlivro());
        stmt.execute();
        stmt.close();
    }

    public void alterarLivro(Livro livro) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("update livro set nome = ?, autor = ?, disciplina = ?, isbn = ? where idlivro = ?");
        stmt.setString(1, livro.getNome());
        stmt.setString(2, livro.getAutor());
        stmt.setString(3, livro.getDisciplina());
        stmt.setInt(4, livro.getIsbn());
        stmt.setInt(5, livro.getIdlivro());

        stmt.execute();
        stmt.close();
    }

    public void solicitarLivro(Solicitacao ss) throws SQLException {

        PreparedStatement stmt = this.connection.prepareStatement("insert into solicitacao (tipo, statuss) values (?, ?)");
        stmt.setString(1, ss.getTipo());
        stmt.setString(2, ss.getStatus());
        stmt.execute();
        stmt.close();

        PreparedStatement stmt2 = this.connection.prepareStatement("insert into solicitarlivro (livro, quantidade, descricao, solicitantenome, solicitantematricula, id_solicitacaoLivro) values (?, ?, ?, ?, ?, (SELECT MAX(solicitacao.idsolicitacao) from solicitacao));");
        stmt2.setString(1, ss.getLivro());
        stmt2.setInt(2, ss.getQuantidadeLivro());
        stmt2.setString(3, ss.getDescricaoLivro());
        stmt2.setString(4, ss.getSolicitantenomeLivro());
        stmt2.setString(5, ss.getSolicitantematriculaLivro());

        //   stmt2.setInt(7, ss.getIdsolicitacao()); //AQUI É O PROBLEMA
        stmt2.execute();
        stmt2.close();

    }

    public List<Solicitacao> getListaLivrosSolicitar() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select solicitarlivro.livro, solicitarlivro.solicitantenome, solicitarlivro.solicitantematricula, solicitarlivro.quantidade, solicitarlivro.descricao, solicitarlivro.id_solicitacaoLivro from solicitarlivro, solicitacao where solicitarlivro.id_solicitacaoLivro = solicitacao.idsolicitacao and solicitacao.statuss = 'Requisicao em andamento'");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> livros = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao livro = new Solicitacao();
            livro.setLivro(rs.getString("livro"));
            livro.setSolicitantenomeLivro(rs.getString("solicitantenome"));
            livro.setSolicitantematriculaLivro(rs.getString("solicitantematricula"));
            livro.setQuantidadeLivro(rs.getInt("quantidade"));
            livro.setDescricaoLivro(rs.getString("descricao"));
            livro.setId_solicitacaoLivro(rs.getInt("id_solicitacaoLivro"));

            //   material.setIdsolicitacao(rs.getInt("idsolicitacao"));
            //     material.setStatus(rs.getString("statuss"));
            //adicionando objeto à lista
            livros.add(livro);
        }
        rs.close();
        stmt.close();
        return livros;

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
        PreparedStatement stmt = this.connection.prepareStatement("SELECT solicitacao.idsolicitacao, solicitacao.statuss, solicitarlivro.livro, solicitarlivro.solicitantenome, solicitarlivro.solicitantematricula, solicitarlivro.quantidade, solicitarlivro.descricao, solicitarlivro.id_solicitacaoLivro FROM solicitacao, solicitarlivro WHERE solicitacao.idsolicitacao = solicitarlivro.id_solicitacaoLivro;");
        ResultSet rs = stmt.executeQuery();

        List<Solicitacao> livros = new ArrayList<Solicitacao>();

        while (rs.next()) {
            //Criando o objeto Mateirial
            Solicitacao livro = new Solicitacao();
            livro.setIdsolicitacao(rs.getInt("idsolicitacao"));
            livro.setStatus(rs.getString("statuss"));
            livro.setLivro(rs.getString("livro"));
            livro.setSolicitantenomeLivro(rs.getString("solicitantenome"));
            livro.setSolicitantematriculaLivro(rs.getString("solicitantematricula"));
            livro.setQuantidadeLivro(rs.getInt("quantidade"));
            livro.setDescricaoLivro(rs.getString("descricao"));
            livro.setId_solicitacaoLivro(rs.getInt("id_solicitacaoLivro"));
            //adicionando objeto à lista
            livros.add(livro);
        }
        rs.close();
        stmt.close();
        return livros;

    }

}

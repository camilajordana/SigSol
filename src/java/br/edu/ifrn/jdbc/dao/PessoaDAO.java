package br.edu.ifrn.jdbc.dao;

import br.edu.ifrn.jdbc.ConnectionFactory;
import static br.edu.ifrn.jdbc.ConnectionFactory.getConnection;
import br.edu.ifrn.jdbc.modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaDAO {

    private Connection connection;
    
     public PessoaDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }
     
    public void adicionarPessoa(Pessoa pessoa) throws SQLException {
        try {
        PreparedStatement stmt = this.connection.prepareStatement("insert into pessoa (matricula, nome, telefone,"
                + " email, rg, cpf, senha, tipo, categoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
            stmt.setString(1, pessoa.getMatricula());
            stmt.setString(2, pessoa.getNome());
            stmt.setString(3, pessoa.getTelefone());
            stmt.setString(4, pessoa.getEmail());
            stmt.setString(5, pessoa.getRg());
            stmt.setString(6, pessoa.getCpf());
            stmt.setString(7, pessoa.getSenha());
            stmt.setInt(8, pessoa.getTipo());
            stmt.setString(9, pessoa.getCategoria());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    
    PreparedStatement psmt = null;
    ResultSet rs = null;
    public List<Pessoa> getLista() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;
    }

    public void alterarPessoa(Pessoa pessoa) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("update pessoa set matricula = ?, nome = ?, telefone = ?, email = ?, rg = ?, cpf = ?, senha = ? where idpessoa = ?");
        stmt.setString(1, pessoa.getMatricula());
        stmt.setString(2, pessoa.getNome());
        stmt.setString(3, pessoa.getTelefone());
        stmt.setString(4, pessoa.getEmail());
        stmt.setString(5, pessoa.getRg());
        stmt.setString(6, pessoa.getCpf());
        stmt.setString(7, pessoa.getSenha());
        stmt.setInt(8, pessoa.getIdpessoa());

        stmt.execute();
        stmt.close();
    }

    public void removerPessoa(Pessoa pessoa) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("delete from pessoa where matricula = ?");
        stmt.setInt(1, pessoa.getIdpessoa());
        stmt.execute();
        stmt.close();
    }

    public List<Pessoa> getListaAlunos() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 1;");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;
    }

    public List<Pessoa> getListaTecnicosAdm() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 3;");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;
    }

    public Pessoa getByMatricula(String matricula1) throws SQLException {
        connection = getConnection();
        String sql = "Select * from pessoa WHERE idpessoa = ?";
        try {
            psmt = connection.prepareStatement(sql);
            psmt.setString(1, matricula1);
            rs = psmt.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String rg = rs.getString("rg");
                String cpf = rs.getString("cpf");
                String senha = rs.getString("senha");
                Pessoa c = new Pessoa(matricula1, nome, telefone, email, rg, cpf, senha);
                return c;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Pessoa> getListaProfessores() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 2;");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;
    }

    public void update(Pessoa pessoa) throws SQLException {
        connection = getConnection();
        PreparedStatement stmt;
        String sql = "UPDATE pessoa set matricula = ?, nome = ?, telefone = ?, email = ?, rg = ?, cpf = ?, senha = ? where idpessoa = ?";
        try {

            stmt = connection.prepareStatement(sql);
            stmt.setString(1, pessoa.getMatricula());
            stmt.setString(2, pessoa.getNome());
            stmt.setString(3, pessoa.getTelefone());
            stmt.setString(4, pessoa.getEmail());
            stmt.setString(5, pessoa.getRg());
            stmt.setString(6, pessoa.getCpf());
            stmt.setString(7, pessoa.getSenha());
            stmt.setInt(8, pessoa.getIdpessoa());
            stmt.executeUpdate();
            System.out.println("Dado atualizado com sucesso");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void removerPessoaPorMatricula(Pessoa pessoa) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("delete from pessoa where matricula = ?");
        stmt.setString(1, pessoa.getMatricula());
        stmt.execute();
        stmt.close();
    }

    public void alteraPessoa(Pessoa pessoa) throws SQLException {
        String sql = "UPDATE pessoa SET nome = ?, matricula = ?, rg = ?, cpf = ?, telefone = ?, email = ? where idpessoa = ?";
        PreparedStatement stmt = null;
        try {
            psmt = connection.prepareStatement(sql);
            psmt.setString(1, pessoa.getNome());
            psmt.setString(2, pessoa.getMatricula());
            psmt.setString(3, pessoa.getRg());
            psmt.setString(4, pessoa.getCpf());
            psmt.setString(5, pessoa.getTelefone());
            psmt.setString(6, pessoa.getEmail());
            psmt.setInt(7, pessoa.getIdpessoa());
            psmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.close();
            psmt.close();
        }
    }

    public List<Pessoa> pesquisarNomeAluno(String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 1 and nome like '" + nome + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarNomeProfessor(String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 2 and nome like '" + nome + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarNomeTecAdm(String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 3 and nome like '" + nome + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarMatriculaTecAdm(String matricula) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 3 and matricula like '" + matricula + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarMatriculaProfessor(String matricula) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 2 and matricula like '" + matricula + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarMatriculaAluno(String matricula) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 1 and matricula like '" + matricula + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarAluno(String matricula, String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 1 and matricula like '" + matricula + "%' and nome like '" + nome + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarProfessor(String matricula, String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 2 and matricula like '" + matricula + "%' and nome like '" + nome + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarTecAdm(String matricula, String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 3 and matricula like '" + matricula + "%' and nome like '" + nome + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarNomeTodos(String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where nome like '" + nome + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarMatriculaTodos(String matricula) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where matricula like '" + matricula + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarTodos(String matricula, String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where matricula like '" + matricula + "%' and nome like '" + nome + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> getListaAdministradores() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 4;");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;
    }

    public List<Pessoa> pesquisarNomeAdministrador(String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 4 and nome like '" + nome + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarMatriculaAdministrador(String matricula) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 4 and matricula like '" + matricula + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public List<Pessoa> pesquisarAdministrador(String matricula, String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoa where tipo = 4 and matricula like '" + matricula + "%' and nome like '" + nome + "%';");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setEmail(rs.getString("email"));
            pessoa.setRg(rs.getString("rg"));
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setSenha(rs.getString("senha"));
            pessoa.setCategoria(rs.getString("categoria"));
            pessoa.setTipo(rs.getInt("tipo"));
            //adicionando objeto à lista
            pessoas.add(pessoa);
        }
        rs.close();
        stmt.close();
        return pessoas;

    }

    public void atualizarSenha(Pessoa pessoa) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("update pessoa set senha = ? where idpessoa = ?");
        stmt.setString(1, pessoa.getSenha());
        stmt.setInt(2, pessoa.getIdpessoa());
        stmt.execute();
        stmt.close();
    }

    public List<Pessoa> getListaPessoasAlterarSenha() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select idpessoa, matricula, senha from pessoa");
        ResultSet rs = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (rs.next()) {
            Pessoa pessoa = new Pessoa();
            pessoa.setIdpessoa(rs.getInt("idpessoa"));
            pessoa.setMatricula(rs.getString("matricula"));
            pessoa.setSenha(rs.getString("senha"));

            pessoas.add(pessoa);
        }

        rs.close();
        stmt.close();
        return pessoas;
    }
}

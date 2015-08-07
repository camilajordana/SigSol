package br.edu.ifrn.jdbc.dao;

import br.edu.ifrn.jdbc.ConnectionFactory;
import br.edu.ifrn.jdbc.modelo.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaDAO {

    //conexão com o banco de dados
    private Connection connection;
    PreparedStatement psmt = null;
    ResultSet rs = null;
    
    
    public DisciplinaDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }
    public void adicionarDisciplina(Disciplina disciplina) throws SQLException {
       
        //prepared statement para inserir
        PreparedStatement stmt = this.connection.prepareStatement("insert into disciplina (nome) values (?);");
        
        //seta os valores
        stmt.setString(1, disciplina.getNome());
      //executa
        stmt.execute();
        stmt.close();
    }
    
    
    public List<Disciplina> getListaDisciplinas() throws SQLException{
       PreparedStatement stmt = this.connection.prepareStatement("select * from disciplina;");
       ResultSet rs = stmt.executeQuery();
        
       List<Disciplina> disciplinas = new ArrayList<Disciplina>();
        
        while (rs.next()){
            //Criando o objeto Pessoa
            Disciplina disciplina = new Disciplina();
            disciplina.setIddisciplina(rs.getInt("iddisciplina"));
            disciplina.setNome(rs.getString("nome"));
            
            //adicionando objeto à lista
            disciplinas.add(disciplina);
        }
        rs.close();
        stmt.close();
        return disciplinas;
    }
    
    public void removerDisciplinaPorId(Disciplina disciplina) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("delete from disciplina where iddisciplina = ?;");
        stmt.setInt(1, disciplina.getIddisciplina());
        stmt.execute();
        stmt.close();
    }
    
    
    public void alterarDisciplina(Disciplina disciplina) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("update disciplina set nome = ? where iddisciplina = ?");
        stmt.setString(1, disciplina.getNome());
        stmt.setInt(2, disciplina.getIddisciplina());
        
        
        stmt.execute();
        stmt.close();
    }
}

package br.edu.ifrn.jdbc.dao;

import br.edu.ifrn.jdbc.ConnectionFactory;
import br.edu.ifrn.jdbc.modelo.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {

    
    //conexão com o banco de dados
    private Connection connection;
    PreparedStatement psmt = null;
    ResultSet rs = null;
    
    public LoginDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }
    
     public List<Login> getListaLogin() throws SQLException{
        PreparedStatement stmt = this.connection.prepareStatement("select * from login");
        ResultSet rs = stmt.executeQuery();
        
        List<Login> logins = new ArrayList<Login>();
        
        while(rs.next()){
            Login login = new Login();
            login.setIdlogin(rs.getInt("idlogin"));
            login.setTipo(rs.getInt("tipo"));
            login.setDialogin(rs.getString("datalogin"));
            login.setHoralogin(rs.getString("horalogin"));
            login.setMatricula(rs.getString("matricula"));
            login.setNome(rs.getString("nome"));
            logins.add(login);
        }
        
        rs.close();
        stmt.close();
        return logins;
    }
    
    public void adicionarLogin(Login login) throws SQLException {

        PreparedStatement stmt = this.connection.prepareStatement("insert into login (tipo, datalogin, horalogin, matricula, nome) values (?, ?, ?, ?, ?)");
        
        stmt.setInt(1, login.getTipo());
        stmt.setString(2, login.getDialogin());
        stmt.setString(3, login.getHoralogin());
        stmt.setString(4, login.getMatricula());
        stmt.setString(5, login.getNome());
        
        
        stmt.execute();
        stmt.close();
        
        
        
        
        
        
        
        //prepared statement para inserir
        //PreparedStatement stmt = this.connection.prepareStatement("insert into login (tipo, datalogin, horalogin, matricula) values (?, ?, ?, ?)");
        
        
    }
    
   
    
    
    
   
    
    
}

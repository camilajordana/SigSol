package br.edu.ifrn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //Criando a fábrica de conexões
    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectado ao banco!");
            return DriverManager.getConnection("jdbc:mysql://localhost/tcc","root","camila");
        } catch (ClassNotFoundException e){
            throw new SQLException(e.getMessage());
}
}
}

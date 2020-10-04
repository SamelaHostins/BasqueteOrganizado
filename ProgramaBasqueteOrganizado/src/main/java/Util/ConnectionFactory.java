/*
Conectando com o banco de dados
 */
package Util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class ConnectionFactory {
    
    /**
    DRIVER:conexão entre o java e o banco de dados, no caso só precisa mudar o 
    nome, nessa caso usei o Mysql
    URL: mostra o caminho de conexão até o banco de dados
    PASS seria a senha, mas não tenho.
    */
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/basqueteorganizado";
    public static final String USER = "root";
    public static final String PASS = "";
    
    
    /** Cria-se o método de conexão (getConnection) "static" significa que não 
    precisa criar um objeto da classe para executar esse método. O(Class.forName)
    especifica e carrega o drive no sistema. E o (try) faz um tratamento e avisa 
    se tiver um erro.
     */
    
    
    public static java.sql.Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro no banco");
        }
    }
    
    //* Método de fim da conexão*/
    public static void closeConnection(java.sql.Connection connection, PreparedStatement statement) { 
  try {
      if(connection != null){
          connection.close();
      }
      
      if (statement != null){
          statement.close();
      }
      
  }catch (Exception e) {
     throw new RuntimeException ("Erro ao fechar a conexão com o banco de dados"); 
  }
      
  }
    //* Método de fim da conexão*/
    public static void closeConnection(java.sql.Connection connection, PreparedStatement statement, ResultSet resultSet) { 
  try {
      if(connection != null){
          connection.close();
      }
      
      if (statement != null){
          statement.close();
      }
      if (resultSet != null){
          resultSet.close();
      }
      
  }catch (Exception e) {
     throw new RuntimeException ("Erro ao fechar a conexão com o banco de dados"); 
  }
      
  }
 }

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
    DRIVER:conex�o entre o java e o banco de dados, no caso s� precisa mudar o 
    nome, nessa caso usei o Mysql
    URL: mostra o caminho de conex�o at� o banco de dados
    PASS seria a senha, mas n�o tenho.
    */
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/basqueteorganizado";
    public static final String USER = "root";
    public static final String PASS = "";
    
    
    /** Cria-se o m�todo de conex�o (getConnection) "static" significa que n�o 
    precisa criar um objeto da classe para executar esse m�todo. O(Class.forName)
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
    
    //* M�todo de fim da conex�o*/
    public static void closeConnection(java.sql.Connection connection, PreparedStatement statement) { 
  try {
      if(connection != null){
          connection.close();
      }
      
      if (statement != null){
          statement.close();
      }
      
  }catch (Exception e) {
     throw new RuntimeException ("Erro ao fechar a conex�o com o banco de dados"); 
  }
      
  }
    //* M�todo de fim da conex�o*/
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
     throw new RuntimeException ("Erro ao fechar a conex�o com o banco de dados"); 
  }
      
  }
 }

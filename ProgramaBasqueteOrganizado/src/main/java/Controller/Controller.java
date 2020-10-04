/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Jogo;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Controller {

    
    public void save (Jogo jogo){
     String sql = "Insert into jogos (id, Jogo, Placar, MinTemp, MaxTemp, QuebraRecMin, QuebraRecMax)"
    + "values (?,?,?,?,?,?,?)";
    
    Connection connection = null;
    PreparedStatement statement = null;
    connection = ConnectionFactory.getConnection();
      try {
       
       statement = connection.prepareStatement(sql);
       
       statement.setInt(1, jogo.getId());
       statement.setString (2, jogo.getJogo());
       statement.setString (3, jogo.getPlacar());
       statement.setInt (4, jogo.getMinTemp());
       statement.setInt (5, jogo.getMaxTemp());
       statement.setInt (6, jogo.getQuebraRecMin());
       statement.setInt (7, jogo.getQuebraRecMax());
       statement.execute();
          
      } catch (Exception e) {
       throw new RuntimeException ("Erro ao salvar o jogo" + e.getMessage(),e);   
          
      }finally{
          ConnectionFactory.closeConnection(connection, statement);
      }
    }   
    
    public static List<Jogo> getAll(){
        String sql = "SELECT * FROM jogos";
       Connection connection = null;
    PreparedStatement statement = null;
    
    /** Classe que recuperará os dados do banco de dados*/
    ResultSet resultSet = null;
    List<Jogo> jogos = new ArrayList<>();
    
        try {
         connection = ConnectionFactory.getConnection(); 
          statement = connection.prepareStatement(sql);
          resultSet = statement.executeQuery();
          
          /**Enquanto existir dados no banco de dados faça:*/
          while(resultSet.next()) {
              Jogo jogo = new Jogo();
              
            jogo.setId(resultSet.getInt("id"));   
            jogo.setJogo(resultSet.getString("Jogo"));  
            jogo.setPlacar(resultSet.getString("Placar")); 
            jogo.setMinTemp(resultSet.getInt("MinTemp")); 
            jogo.setMaxTemp(resultSet.getInt("MaxTemp")); 
            jogo.setQuebraRecMin(resultSet.getInt("QuebraRecMin")); 
            jogo.setQuebraRecMax(resultSet.getInt("QuebraRecMax"));
            
            jogos.add(jogo);
          }         
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao buscar os jogos" + ex.getMessage(), ex);
        }finally{
           ConnectionFactory.closeConnection(connection, statement, resultSet); 
        }
        /**Retorna a lista de jogos que foi criada e carregado do banco de dados*/
    return jogos;
    }
    
    public static void removeById (int id) {
     String sql = "DELETE FROM jogos WHERE id = ?";
     Connection connection = null;
    PreparedStatement statement = null;
    
        try {
         connection = ConnectionFactory.getConnection(); 
          statement = connection.prepareStatement(sql);
          statement.setInt(1, id);
          statement.execute();
          
        } catch (Exception e) {
           throw new RuntimeException ("Erro ao deletar o jogo" + e.getMessage(),e);  
        }finally{
          ConnectionFactory.closeConnection(connection, statement);  
        }
   
        
    }
    
}

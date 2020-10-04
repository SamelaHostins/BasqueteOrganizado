/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Model.Jogo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelJogos extends AbstractTableModel {
    
    /** Estabelecendo todas as colunas da tabela a partir de um vetor string. */
    
    String[] columns = {"Jogo", "Placar", "Mínimo da Temporada", "Máximo da Temporada"," Quebra Recorde Mínimo", "Quebra Recorde Máximo", "Excluir"};
   List <Jogo> jogos = new ArrayList();
  
   
    
    /**Quantos jogos eu tenho */
    @Override
    public int getRowCount() {
        return jogos.size();
        
    }
/**Quantas colunas eu tenho*/
    @Override
    public int getColumnCount() {
    return columns.length;    
    }
    
    /**Faz com que o nome das colunas sejam exibidos*/
     
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }

/**Valor em determinada linha e coluna*/
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch(columnIndex){   
            case 0:
                return jogos.get(rowIndex).getJogo();
            case 1:
                return jogos.get(rowIndex).getPlacar();
            case 2:
                return jogos.get(rowIndex).getMinTemp();
            case 3:
                return jogos.get(rowIndex).getMaxTemp();
            case 4:
                return jogos.get(rowIndex).getQuebraRecMin();
            case 5:
                return jogos.get(rowIndex).getQuebraRecMax(); 
             case 6:
                return "";

            default:
               return "Dados não encontrados";  
        
        }
    }

    public String[] getColunas() {
        return columns;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }
    
  //public void notifyUpdate (List <Jogo> jogos){
     // int index = jogos.indexOf(jogos);
     // fireTableRowsUpdated(index, index);
 // }
}

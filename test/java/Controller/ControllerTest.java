/*
Testando a conexão com o banco de dados
 */
package Controller;

import Model.Jogo;
import java.util.List;
import org.junit.Test;
/**
 *
 * @author Usuario
 */
public class ControllerTest {
    
    public ControllerTest() {
                
    }
/**Teste do método Save, para checar se salva no banco de 
 * dados*/
    @Test
    public void testSave() {

    Controller controller = new Controller();
    Jogo jogo = new Jogo();
        jogo.setJogo("1");
        jogo.setPlacar("12");
        jogo.setMinTemp(Integer.parseInt("12"));
        jogo.setMaxTemp(Integer.parseInt("12"));
        jogo.setQuebraRecMin(Integer.parseInt("0"));
        jogo.setQuebraRecMax(Integer.parseInt("0"));
        Controller.save(jogo);
    }

    
    /**Teste do método getAll, para checar se pega todos os jogos do banco de 
 * dados*/
    @Test
    public void testGetAll() {
      Controller controller = new Controller();
    Jogo jogo = new Jogo();
        jogo.setJogo("1");
        jogo.setPlacar("12");
        jogo.setMinTemp(Integer.parseInt("12"));
        jogo.setMaxTemp(Integer.parseInt("12"));
        jogo.setQuebraRecMin(Integer.parseInt("0"));
        jogo.setQuebraRecMax(Integer.parseInt("0"));
        Controller.save(jogo);
        
     List<Jogo> jogos= Controller.getAll();
     System.out.println("Total de projetos = "+ jogos.size());
        
    }

 /**Teste do método RemoveById, para checar se a conexão com o banco 
  * de dados */
    @Test
    public void testRemoveById() {
    
    
    Controller controller = new Controller();
    Jogo jogo = new Jogo();
        jogo.setJogo("1");
        jogo.setPlacar("12");
        jogo.setMinTemp(Integer.parseInt("12"));
        jogo.setMaxTemp(Integer.parseInt("12"));
        jogo.setQuebraRecMin(Integer.parseInt("0"));
        jogo.setQuebraRecMax(Integer.parseInt("0"));
        Controller.save(jogo);
        
     List<Jogo> jogos= Controller.getAll();
     System.out.println("Total de projetos = "+ jogos.size());
     Controller.removeById(1);
    }
}

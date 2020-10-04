/**
Estabelecendo o que há no banco de dados e colocação do método construtor e de getter e setter
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Jogo {
    private int id;
    public String Jogo;
    public String Placar;
    private int MinTemp; 
    private int MaxTemp;
    private int QuebraRecMin;
    private int QuebraRecMax;

    
    public Jogo(int id, String Jogo, String Placar, int MinTemp, int MaxTemp, int QuebraRecMin, int QuebraRecMax) {
        this.id = id;
        this.Jogo = Jogo;
        this.Placar = Placar;
        this.MinTemp = MinTemp;
        this.MaxTemp = MaxTemp;
        this.QuebraRecMin = QuebraRecMin;
        this.QuebraRecMax = QuebraRecMax;
    }

    public Jogo() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getJogo() {
        return Jogo;
    }

    public String getPlacar() {
        return Placar;
    }

    public int getMinTemp() {
        return MinTemp;
    }

    public int getMaxTemp() {
        return MaxTemp;
    }

    public int getQuebraRecMin() {
        return QuebraRecMin;
    }

    public int getQuebraRecMax() {
        return QuebraRecMax;
    }

    public void setJogo(String Jogo) {
        this.Jogo = Jogo;
    }

    public void setPlacar(String Placar) {
        this.Placar = Placar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMinTemp(int MinTemp) {
        this.MinTemp = MinTemp;
    }

    public void setMaxTemp(int MaxTemp) {
        this.MaxTemp = MaxTemp;
    }

    public void setQuebraRecMin(int QuebraRecMin) {
        this.QuebraRecMin = QuebraRecMin;
    }

    public void setQuebraRecMax(int QuebraRecMax) {
        this.QuebraRecMax = QuebraRecMax;
    }

    @Override
    public String toString() {
        return "Jogo{" + "id=" + id + ", Jogo=" + Jogo + ", Placar=" + Placar + ", MinTemp=" + MinTemp + ", MaxTemp=" + MaxTemp + ", QuebraRecMin=" + QuebraRecMin + ", QuebraRecMax=" + QuebraRecMax + '}';
    }
  
    
    
}


import java.util.Random;

public class Dado {
    private int facce;
    private boolean truccato;


    public Dado() {
        this.facce = 0;
        this.truccato = true;
    }

    public Dado(int facce, boolean truccato) {
        this.facce = facce;
        this.truccato = truccato;
    }
    public void setFacce(int facce){
        this.facce = facce;
    }
    public void setTruccato(boolean truccato){
    this.truccato = truccato;
    }
    public int getFacce(){
        return this.facce;
    }
    public boolean getTruccato(){
        return this.truccato;
    }
    public int lancia(){
        Random rnd = new Random();
        if(truccato = false){
            return rnd.nextInt(facce+1);
        }else{
            return 3;
        }
    }
}


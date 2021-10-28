package Cicchellero_A_Stato;

public class Stato {
    private String nome;
    private double superficie;
    private double popolazione;

    public Stato(){
        this.nome = "";
        this.superficie = 0;
        this.popolazione = 0;
    }
    public Stato(String nome, double superficie, double popolazione){
        this.nome = nome;
        this.superficie = superficie;
        this.popolazione = popolazione;
    }
    public String getNome(){
        return this.nome;
    }
    public double getSuperficie(){
        return this.superficie;
    }
    public double getPopolazione() {
        return this.popolazione;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSuperficie(double superficie){
        this.superficie = superficie;
    }
    public void setPopolazione(double popolazione){
        this.popolazione = popolazione;
    }
    public String toString(){
        return "Stato{" +
                "Nome = " + this.nome +
                "; Superficie = " + this.superficie +
                " km2; Popolazione = " + this.popolazione +
                " milioni di abitanti; Densità = " + (this.calcolaDensità()) + " di abitanti per km2" +
                "}";
    }
    public double calcolaDensità(){
        return (this.popolazione / this.superficie) * 1000000;
    }
    public String confronta(Stato stato){
        if(this.calcolaDensità() < stato.calcolaDensità()){
            return stato.nome;
        }
        if(this.calcolaDensità() > stato.calcolaDensità()){
            return this.nome;
        }
        return "Hanno la stessa densità";
    }
    public boolean confronta(double min, double max){
        if(this.calcolaDensità() < max && this.calcolaDensità() > min){
            return true;
        }
        return false;
    }

}
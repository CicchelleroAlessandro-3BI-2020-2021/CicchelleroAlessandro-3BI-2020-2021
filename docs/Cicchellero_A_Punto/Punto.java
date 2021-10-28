package Cicchellero_A_Punto;

import static java.lang.Math.sqrt;

public class Punto{
    private String nome;
    private int x;
    private int y;

    public Punto(){
        this.nome = "";
        this.x = 0;
        this.y = 0;
    }
    public Punto(String nome, int x, int y){
        this.nome = nome;
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distanzaOrigine(){
        return sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public double distanzaPP(Punto punto){
        return sqrt(Math.pow((this.x - punto.x), 2) + Math.pow((this.y - punto.y), 2));
    }
    public Punto piuVicinoO(Punto punto){
        if(this.distanzaOrigine() < punto.distanzaOrigine()){
            return this;
        }
        return punto;
    }
    public String toString(){
        return "Punto " + this.nome + " (" + this.x + "; " + this.y + ")";
    }
}
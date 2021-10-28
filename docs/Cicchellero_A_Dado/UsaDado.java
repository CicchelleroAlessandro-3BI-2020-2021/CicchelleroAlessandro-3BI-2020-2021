package Cicchellero_A_Dado;

public class UsaDado {
    public static void main(String[] args) {
        Dado dado1 = new Dado(6, false);
        Dado dado2 = new Dado(20, true);
        System.out.println(dado1.getTruccato());
        System.out.println(dado2.getTruccato());
        System.out.println(dado1.lancia());
        System.out.println(dado2.lancia());
    }
}

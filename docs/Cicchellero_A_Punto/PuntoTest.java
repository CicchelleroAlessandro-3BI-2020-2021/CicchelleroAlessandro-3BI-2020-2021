package Cicchellero_A_Punto;

public class PuntoTest {
    public static void main(String[] args) {
        Punto a = new Punto("A", 3, 4);
        Punto b = new Punto("B", 6, 8);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.distanzaPP(b));
    }
}

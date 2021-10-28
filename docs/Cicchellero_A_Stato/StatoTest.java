package Cicchellero_A_Stato;

public class StatoTest {
    public static void main(String[] args) {
        Stato italia = new Stato("Italia", 302073, 60.36);
        Stato francia = new Stato("Francia", 675417, 68.30);
        System.out.println(italia.toString());
        System.out.println(francia.toString());
        System.out.println(italia.confronta(francia) + " è più densamente popolata.");
        if (francia.confronta(0, 100)) {
            System.out.println("La densità della Francia è compresa tra 0 e 100");
        } else {
            System.out.println("La densità della Francia non è compresa tra 0 e 100");
        }
    }
}

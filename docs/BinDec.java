import java.util.Scanner;
//Realizza un programma per convertire un numero binario nel corrispondente valore decimale
public class BinDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bin = new int[5];
        int dec = 0;
        int k = bin.length-1;
        System.out.println("Inserisci 5 numeri in formato binario.");
        for (int i = 0; i < bin.length; i++) {
            do {
                int a = scanner.nextInt();
                bin[i] = a;
                if (bin[i] >= 2 || bin[i] <= -1) {
                    System.out.println("Il numero deve essere 1 o 0");
                }
            } while (bin[i] >= 2 || bin[i] <= -1);

            dec += (Math.pow(2, k) * bin[i]);
            k--;
        }
        System.out.print("Il numero binario ");
        for (int i = 0; i < bin.length; i++) {
            System.out.print(bin[i]);
        }
        System.out.print(" corrisponde al numero decimale " + dec + ".");
    }
}

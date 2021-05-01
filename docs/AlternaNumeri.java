import java.util.Scanner;
/*Scrivere il programma AlternaNumeri che chiede all'utente di inserire 10 numeri e li
ristampa, stampando prima i numeri inseriti negli inserimenti dispari e poi i numeri
inseriti negli inserimenti pari.
*/
public class AlternaNumeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]num = new int[10];
        System.out.println("Inserisci 10 numeri interi:");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println("Numeri inseriti in posizione dispari:");
        for (int i = 0; i < num.length; i++) {
            if(i%2 == 0){
                System.out.println(num[i]);
            }
        }
        System.out.println("Numeri inseriti in posizione pari:");
        for (int i = 0; i < num.length; i++) {
            if(i%2 == 1){
                System.out.println(num[i]);
            }
        }
    }
}

import java.util.Scanner;

//Scrivere un programma che verifica se esistono due elementi uguali nell'array.
public class TrovaValoreUguale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        boolean end = true;
        System.out.println("Inserisci 10 numeri interi:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i2 < array.length; i2++) {
                if (i == i2) {
                } else if (array[i] == array[i2]) {
                    end = false;
                    break;
                }
            }
            if (!end) {
                break;
            }
        }
        if (!end) {
            System.out.println("Ci sono 2 numeri uguali.");
        } else {
            System.out.println("Non ci sono numeri uguali.");
        }
    }
}

import java.util.Scanner;

/*Si supponga di avere un array valori di 10 elementi in cui gli elementi della prima metà e
della seconda metà sono disposti in ordine crescente. Copiare tutti gli elementi di valori
in un nuovo array valori2 in modo che siano tutti ordinati.
*/
public class Ordinamento2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int[] array2 = new int[array.length];
        int salva = 0;
        int check = array.length / 2;
        System.out.println("Inserisci 10 numeri.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("L'array iniziale: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Viene ordinato in: ");
        for (int i = 0; i < check; i++) {
            for (int i2 = 0; i2 < check; i2++) {
                if (array[i] < array[i2]) {
                    salva = array[i];
                    array[i] = array[i2];
                    array[i2] = salva;
                }
            }

        }
        for (int i = check; i < array.length; i++) {
            for (int i2 = check; i2 < array.length; i2++) {
                if (array[i] < array[i2]) {
                    salva = array[i];
                    array[i] = array[i2];
                    array[i2] = salva;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i2 < array.length; i2++) {
                if (array2[i] < array2[i2]) {
                    salva = array2[i];
                    array2[i] = array2[i2];
                    array2[i2] = salva;
                }
            }
        }
        System.out.println();
        System.out.println("Viene infine riordinato in: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}

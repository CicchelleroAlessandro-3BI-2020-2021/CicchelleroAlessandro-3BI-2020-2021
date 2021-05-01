import java.util.Scanner;

/*Verificare se un array di char è palindromo, ossia la sequenza di caratteri letti da sinistra a destra,
 oppure da destra a sinistra è la stessa.
 */
public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] sequenza = new char[100];
        int count = -1;
        char stop = ' ';
        boolean end = true;
        System.out.println("Inserire dei caratteri, e il programma dirà se la sequenza è palindroma. Terminare con spazio.");
        for (int i = 0; i < sequenza.length; i++) {
            sequenza[i] = scanner.nextLine().charAt(0);
            if (sequenza[i] != stop) {
                count++;
            } else {
                break;
            }
        }
        for (int i = 0; count >= 0; count--) {
            if (sequenza[i] == sequenza[count]) {
                i++;
            } else {
                end = false;
                break;
            }
        }
        if (end) {
            System.out.println("La sequenza è palindroma.");
        } else {
            System.out.println("La sequenza non è palindroma.");
        }
    }
}

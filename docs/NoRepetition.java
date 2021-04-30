import java.util.Random;

// Sviluppare un'algoritmo che permetta di riempire un vettore di 5 elementi interi con 5 numeri compresi fra 0 e 9 (inclusi) in modo casuale (random) e senza che vi siano ripetizioni.
class NoRepetition {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] a = new int[5];
        int check = 0;
        for (int i = 0; i < a.length; i++) {
            boolean z = true;
            while (z) {
                check = Math.abs(rnd.nextInt() % 10);
                for (int i2 = 0; i2 < 5; i2++) {
                    if (check == a[i2]) {
                        z = true;
                        break;
                    } else {
                        z = false;
                    }
                }
            }
            a[i] = check;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}

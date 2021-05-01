import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min;
        int[] val = new int[10];
        System.out.println("Inserire 10 valori interi:");
        for (int i = 0; i < val.length; i++) {
            val[i] = scanner.nextInt();
        }
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i] + " ");
        }
        for (int i = 0; i < val.length - 1; i++) {
            min = i;
            for (int i2 = i + 1; i2 < val.length; i2++) {
                if (val[i2] < val[min]) {
                    min = i2;
                }
            }
            int check = val[min];
            val[min] = val[i];
            val[i] = check;
        }
        System.out.println("La sequenza ordinata è:");
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i]+ " ");
        }
    }
}

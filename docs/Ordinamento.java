import java.util.Scanner;
//Eseguire l'ordinamento di un vettore di interi tramite l'algoritmo di scambio, usando un intero di transito per lo scambio (salva=a; a=b; b=salva).
public class Ordinamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salva = 0;
        int[]v = new int[10];
        System.out.println("Inserisci dieci numeri.");
        for(int i = 0; i < v.length; i++){
            v[i] = scanner.nextInt();
        }
        System.out.println("La seguente sequenza di numeri:");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
        System.out.println("viene riordinata in:");
        for(int i = 0; i < v.length; i++){
            for(int i2 = 0; i2 < v.length; i2++){
                if(v[i] < v[i2]){
                    salva = v[i];
                    v[i] = v[i2];
                    v[i2] = salva;
                }
            }
        }
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
    }
}

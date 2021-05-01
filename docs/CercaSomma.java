import java.util.Scanner;

/*Scrivere il programma CercaSomma che chiede all'utente di inserire 5 numeri e stampa il
messaggio "Ci sono due numeri con somma pari a 100" se ci sono, tra i numeri inseriti dall'utente
due numeri la cui somma è pari a 100. In caso contrario il programma tampa
il messaggio "Non ci sono due numeri con somma pari a 100."*/
public class CercaSomma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] check = new int[5];
        boolean end = true;
        System.out.println("Inserire 5 numeri interi:");
        for (int i = 0; i < check.length; i++) {
            check[i] = scanner.nextInt();
        }
        for (int i = 0; i < check.length; i++) {
            for (int i2 = 0; i2 < check.length; i2++) {
                if (i == i2) {
                } else if (check[i] + check[i2] == 100) {
                    end = false;
                    break;
                }
            }
            if(!end){
                break;
            }
        }
        if(end){
            System.out.println("Non ci sono due numeri con somma pari a 100.");
        }else{
            System.out.println("Ci sono due numeri con somma pari a 100");
        }

    }
}

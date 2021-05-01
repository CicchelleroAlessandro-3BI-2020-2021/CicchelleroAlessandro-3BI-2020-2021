import java.util.Scanner;
/*Scrivere il programma TantiPariQuantiDispari che chiede all'utente di inserire 10 numeri
e stampa il messaggio "Tanti pari quanti dispari" se i numeri pari inseriti sono tanti quanti i numeri dispari.
In caso contrario il programma stampa "I numeri pari sono in numero supriore" oppure "I numeri dispari sono in numero superiore".
se l'utente ha inserito più numeri pari o più numeri dispari, rispettivamente.Svolgere l'esercizio senza l'uso di un vettore
e successivamente con l'uso di un vettore.
 */
public class TantiPariQuantiDispari2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]check = new int[10];
        int dispari = 0;
        int pari = 0;
        System.out.println("Inserire 10 numeri interi:");
        for (int i = 0; i < check.length ; i++) {
            check[i] = scanner.nextInt();
            if(check[i]%2 == 0) {
                pari++;
            }else{
                dispari++;
            }
        }
        if(pari > dispari){
            System.out.println("I numeri pari sono in numero superiore.");
        }else if(pari < dispari){
            System.out.println("I numeri dispari sono in numero superiore.");
        }else{
            System.out.println("Tanti pari quanti dispari.");
        }
    }
}

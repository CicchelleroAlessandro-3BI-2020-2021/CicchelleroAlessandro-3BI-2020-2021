import java.util.Scanner;
//Scrivere un programma CominciaPer che chiede all'utente di inserire una sequenza di stringhe terminata dalla stringa vuota. Successivamente, chiede all'utente di inserire un carattere e stampa tutte le stringhe precedentemente inserite che iniziano con quel carattere.
public class CominciaPer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[100];
        String stop = "";
        String stop2 = " ";
        int count = 0;
        System.out.println("Inserisci delle stringhe di caratteri, quando hai finito, lascia la stringa vuota.");
        for(int i = 0; i < lines.length; i++){
            lines[i] = scanner.nextLine();
            if(!lines[i].equals(stop) && !lines[i].equals(stop2)){
                count++;
            }else{
                break;
            }

        }
        System.out.println("Inserisci un carattere, e verranno mostrate tutte le stringhe inserite che iniziano con quel carattere.");
        String a = scanner.nextLine();
        char check = a.charAt(0);
        for(int i = 0; i < count; i++){
           if(lines[i].charAt(0) == check){
                System.out.println(lines[i]);
            }
        }
    }
}

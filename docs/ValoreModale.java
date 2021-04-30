import java.util.Random;
//Realizzare un programma per individuare il valore modale contenuto in un vettore di interi.

//Nota: Il programma mostrerà solo il numero minore che appare più volte, per esempio, tra 2 e 8, il programma ritornerà 2.
public class ValoreModale {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[]a = new int[10];
        int[]moda = new int[10];
        int count = 0;
        int check = 0;
        int count2 = 0;
        for(int i = 0; i < moda.length; i++){
            moda[i] = i;
        }
        for(int i = 0; i < a.length; i++){
            a[i] = Math.abs(rnd.nextInt()%10);
        }
        for(int i = 0; i < moda.length; i++){
            count = 0;
            for(int i2 = 0; i2 < a.length; i2++){
                if(moda[i] == a[i2]){
                    count++;
                }
            }
            if(count > count2){
                count2 = count;
                check = i;
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Il numero più frequente è stato " + moda[check] + ".");

    }
}

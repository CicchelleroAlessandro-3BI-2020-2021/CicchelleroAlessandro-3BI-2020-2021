import java.util.Random;
//Dato un vettore di 100 interi (numeri interi generati Random e compresi da 0 a 9) inserire in un secondo array (array "frequenze" ), le frequenze dei numeri che appaiono nel primo vettore.
public class Frequenze {
    public static void main(String[] args) {
        int[]vettore = new int[100];
        int[]frequenze = new int[10];
        int check;
        Random rnd = new Random();
        for(int i = 0; i < vettore.length; i++){
            check = Math.abs(rnd.nextInt() %10);
            vettore[i] = check;
        }
        for(int i = 0; i< vettore.length; i++){
            frequenze[vettore[i]] ++;
            //System.out.print(vettore[i] + " ");
        }
        for(int i = 0; i < frequenze.length; i++) {
            System.out.print(frequenze[i] + " ");
        }
    }
}

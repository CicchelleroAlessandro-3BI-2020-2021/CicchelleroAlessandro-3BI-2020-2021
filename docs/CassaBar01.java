import java.util.Scanner;
public class CassaBar01 {
    public static void azzera(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String listino[] = new String[6];
        double prezzi[] = new double[5];
        int ordini[] = new int[5];
        int ordini_f[] = new int[5];
        double costo = 0;
        double guadagno = 0;

        listino[0] = "Pizza";
        prezzi[0] = 4.8;
        listino[1] = "Pane";
        prezzi[1] = 0.5;
        listino[2] = "Risotto";
        prezzi[2] = 4.5;
        listino[3] = "Acqua";
        prezzi[3] = 0.5;
        listino[4] = "Salamelle";
        prezzi[4] = 5.0;
        listino[5] = "";

        for (int i = 0; i < listino.length; i++) {
            while (!(listino[i].equals(""))) {
                System.out.println(i + " " + listino[i] + "    ---->    " + prezzi[i] + "0€");
                break;
            }
        }
        boolean fine_giornata = true;
        boolean end;
        while (fine_giornata) {
            end = true;
            System.out.println("Inserisci il tuo ordine. Premere 5 per terminare.");
            while (end) {
                int n1 = scanner.nextInt();
                if (n1 == 5) {
                    for (int i = 0; i < ordini.length; i++) {
                        ordini_f[i] += ordini[i];
                        end = false;
                    }
                } else {
                    System.out.println("In che quantità?");
                    int n2 = scanner.nextInt();
                    ordini[n1] += n2;
                    System.out.println("Cos'altro vuoi ordinare?");
                }
            }
            for (int i = 0; i < ordini.length; i++) {
                System.out.println(ordini[i] + " " + listino[i] + "    ---->    " + prezzi[i] + "0€");
                costo += ordini[i] * prezzi[i];
            }
            System.out.println();
            System.out.println("Il prezzo complessivo è di " + costo + "0€");
            guadagno += costo;
            costo = 0;
            azzera(ordini);
            System.out.println("La giornata è finita? (1 = sì, altro = no)");
            int risp = scanner.nextInt();
            if (risp == 1) {
                fine_giornata = false;
            }
        }
            System.out.println("Oggi sono stati ordinati: ");
            for (int i = 0; i < ordini.length; i++) {
                System.out.println(ordini_f[i] + " " + listino[i] + "    ---->    " + prezzi[i] + "0€");
            }
            System.out.println();
            System.out.println("Per un guadagno totale di " + guadagno + "0€");

    }
}

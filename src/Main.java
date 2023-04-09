import java.util.Scanner;

public class Main {

    public static int menu() {
        System.out.println("1. Cerchio");
        System.out.println("2. Rettangolo");
        System.out.println("3. Quadrato");
        System.out.println("0. Esci");
        Scanner tastiera = new Scanner(System.in);
        int scelta = tastiera.nextInt();
        return scelta;
    }

    public static void cerchio() {
        float raggio;
        double circonferenza, area;
        Scanner tastiera = new Scanner (System.in);

        do {
            System.out.println("Inserisci il valore del raggio");
            raggio = tastiera.nextFloat();
        } while (raggio <= 0);

        circonferenza = 2*raggio*Math.PI;

        area = raggio*raggio*Math.PI;

        System.out.println("Circonferenza = " +circonferenza);
        System.out.println("Area = " +area);
    }
    public static void rettangolo() {
        float area, perimetro, base, altezza;
        Scanner tastiera = new Scanner (System.in);

        do {
            System.out.println("Inserisci la base del rettangolo");
            base = tastiera.nextFloat();
            System.out.println("Inserisci l'altezza del rettangolo");
            altezza = tastiera.nextFloat();
        } while (base <= 0 && altezza <= 0);

        perimetro = (base*2) + (altezza*2);

        area = base * altezza;

        System.out.println("Perimetro = " +perimetro);
        System.out.println("Area = " +area);
    }

    public static void quadrato() {
        float area, perimetro, lato;
        Scanner tastiera = new Scanner (System.in);

        do {
            System.out.println("Inserisci il valore del lato");
            lato = tastiera.nextFloat();
        } while (lato <= 0);

        perimetro = lato*4;

        area = lato*lato;

        System.out.println("Perimetro = " +perimetro);
        System.out.println("Area = " +area);
    }
    public static void main(String[] args) {

        int scelta;

        do {
            scelta = menu();
            switch (scelta) {
                case 1: cerchio();
                    break;
                case 2: rettangolo();
                    break;
                case 3: quadrato();
                    break;
                case 0: break;
                default: System.out.println ("Inserisci un valore compreso tra 1 e 3");
                    break;
            }
        } while(scelta != 0);

    }

}
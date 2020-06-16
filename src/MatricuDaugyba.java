import java.util.Scanner;

public class MatricuDaugyba {

    public static void main(String[] args) {

        // double [][] m1 = {{2.5, 6}, {5, 0.8}};

        // matricosSukurimas(m1);

        // atspausdintiMatrica(m1);

        matricuDydzioSukurimas();



    }
    /*
    static double [] dviejuDauginimoMatricuSukurimas() {

        int [] dydziai = matricuDydzioSukurimas();

        double [][] matrica1 = new double[dydziai[0]][dydziai[1]];
        double [][] matrica2 = new double[dydziai[1]][dydziai[2]];

        return matrica1;

    }

     */

    static int [] matricuDydzioSukurimas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matricas galima dauginti, jei jos yra suderintos.");
        System.out.println("1-os matricos stulpeliu skaicius turi sutapti su 2-os matricos eiluciu skaicium.");
        System.out.println();
        System.out.print("Iveskite 1-os matricos eiluciu kieki: ");
        int m = scanner.nextInt();
        System.out.print("Iveskite 1-os matricos stulpeliu kieki: ");
        int s = scanner.nextInt();
        System.out.println("2-os matricos eiluciu kiekis: " + s);
        System.out.print("Iveskite 2-os matricos stulpeliu kieki: ");
        int n = scanner.nextInt();
        System.out.println();

        int [] dydziai = {m, s, n};

        return dydziai;
    }

    /*
    static double atsitiktinioSkaiciausGeneravimas () {


    }

     */

    static void matricosSukurimas(double [][] matrica) {

    }

    static void atspausdintiMatrica(double [][] matrica) {
        for (double[] eilute : matrica) {
            for (double elem : eilute) {
                System.out.print(elem + "  ");
            }
            System.out.println();
        }

    }


}

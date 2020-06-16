import java.util.Random;
import java.util.Scanner;

public class MatricuDaugyba {

    public static void main(String[] args) {

        int [] dydis = matricuDydzioSukurimas();

        double [][] m1 = new double[dydis[0]][dydis[1]];
        double [][] m2 = new double[dydis[1]][dydis[2]];

        matricosUzpildymas(m1);
        matricosUzpildymas(m2);

        double [][] m3 = matricuDaugyba(m1, m2);

        /* kontrolinis pavyzdys is wiki
        double [][] m1 = {{3, 1}, {2, 1}, {1, 0}};
        double [][] m2 = {{1, 0, 2}, {-1, 3, 1}};
        double [][] m3 = matricuDaugyba(m1, m2);
        */

        /* kontrolinis pavyzdys is uzdavinio salygos
        double [][] m1 = {  {2, 3},
                            {4, 5}};
        double [][] m2 = {  {1, 2},
                            {0, 4}};
        double [][] m3 = matricuDaugyba(m1, m2);
        double [][] kontrolineMatrica = {   {2*1+3*0, 2*2+3*4},
                                            {4*1+5*0, 4*2+5*4}};
        atspausdintiMatrica(kontrolineMatrica);
        System.out.println();
        */

        atspausdintiMatrica(m1);
        System.out.println();
        atspausdintiMatrica(m2);
        System.out.println();
        atspausdintiMatrica(m3);

    }

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

    static double atsitiktinioSkaiciausGeneravimas() {
        Random rand = new Random();
        double skaicius = rand.nextDouble();
        double teigNeig = rand.nextDouble();
        double minPlus = 0;
        skaicius = skaicius * 100;
        skaicius = Math.round(skaicius);
        skaicius = skaicius / 10;
        if (teigNeig < 0.5) {
            minPlus = -1;
        } else {
            minPlus = 1;
        };
        skaicius = skaicius * minPlus;

        return skaicius;
    }

    static void matricosUzpildymas (double[][] matrica) {
        for(int i = 0; i < matrica.length; i++) {
            for(int j = 0; j < matrica[i].length; j++) {
                matrica[i][j] = atsitiktinioSkaiciausGeneravimas();
            }
        }
    }

    static double[][] matricuDaugyba (double[][]matrica1, double[][]matrica2) {
        double [][] matrica3 = new double[matrica1.length][matrica2[0].length];
        int s = matrica1[0].length;

        for(int i = 0; i < matrica3.length; i++) {
            for (int j = 0; j < matrica3[i].length; j++) {
                for (int k = 0; k < s; k++) {
                    matrica3[i][j] = matrica3[i][j] + ( matrica1[i][k] * matrica2[k][j] );
                }
            }
        }
        return matrica3;
    }

    static void atspausdintiMatrica(double [][] matrica) {
        for(int i = 0; i < matrica.length; i++) {
            for(int j = 0; j < matrica[i].length; j++) {
                System.out.print(matrica[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

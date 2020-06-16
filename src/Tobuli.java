import java.util.Scanner;

public class Tobuli {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Max skaicius: ");

        int ikiKiek = scanner.nextInt();

        long start = System.currentTimeMillis();

        int kontrolineSuma =0;

        for ( int i = 1; i <= ikiKiek; i ++) {

            for (int daliklis = 2; daliklis <= Math.sqrt(i); ++daliklis) {
                if (i % daliklis == 0) {
                    kontrolineSuma = kontrolineSuma + daliklis + (i/daliklis);
                }
            }
            if (kontrolineSuma == i) {
                System.out.println(i + " tobulas !!!");
            }
            kontrolineSuma = 1;
        }

        long stop = System.currentTimeMillis();
        System.out.println("Uztruko " + (stop - start) + " ms");

    }
}

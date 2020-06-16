import java.util.*;

public class MinMax {

    public static void main(String[] args) {

        // Generuojamas 10 atsitiktiniu skaiciu masyvas
        // reiksmes nuo -100 iki 100

        int[] masyvas = new int[10];
        Random rand = new Random();

        for (int i = 0; i < masyvas.length; i++) {
            masyvas [i] = rand.nextInt(100 + 100) - 100;
        };

        System.out.println("Sugeneruotas atsitiktinis masyvas");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Randami (ir issaugomi) maziausias ir didziausias skaiciai
        // Randamos (ir issaugomos) maziausio ir didziausio skaiciu vietos masyve

        int min = masyvas[0];
        int max = masyvas[0];
        int minVieta = 0;
        int maxVieta = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < min) {
                min = masyvas[i];
                minVieta = i;
            }
            if (masyvas[i] > max) {
                max = masyvas[i];
                maxVieta = i;
            }
        }
        System.out.println("Maziausias: " + min + "   Didziausias: " + max);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Maziausias ir didziausias skaiciai sukeiciami vietomis
        masyvas[minVieta] = max;
        masyvas[maxVieta] = min;

        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        System.out.println();
    }
}

package zydrunas.bit.java.p08;

public class MinMaxDestytojo {

    public static void main(String[] args) {

        int [] m = {-1, 2, 0, 2, -1, 1};

        atspausdintiMasyva(m);
        // abc(m[0]);
        // atspausdintiMasyva(m);
        sprendimas(m);
        atspausdintiMasyva(m);



    }

    /*
    static  void abc(int x) {
        x = 10;
    }
    */

    static void atspausdintiMasyva (int[] a) {
        for (int e : a) { System.out.print(e + " ");}
        System.out.println();
    }

    static void sprendimas(int[] masyvas) {

        int pirmaDidziausia = rastiPirmosDidziausiosIndeksa(masyvas);
        int pirmaMaziausia = rastiPaskutinesMaziausiosIndeksa(masyvas);

        sukeistiElementus(masyvas, pirmaDidziausia, pirmaMaziausia);
    }

    static int rastiPirmosDidziausiosIndeksa(int[] masyvas) {
        int rastasIndeksas = 0;
        int rastaReiksme = masyvas [0];

        for (int i = 1; i < masyvas.length; i++) {
            if (masyvas[i] > rastaReiksme) {
                rastasIndeksas = i;
                rastaReiksme = masyvas[i];
            }
        }
        return rastasIndeksas;
    }

    static int rastiPaskutinesMaziausiosIndeksa(int[] masyvas) {
        int rastasIndeksas = (masyvas.length - 1);
        int rastaReiksme = masyvas [(masyvas.length - 1)];

        for (int i = (masyvas.length - 2); i >= 0; i--) {
            if (masyvas[i] < rastaReiksme) {
                rastasIndeksas = i;
                rastaReiksme = masyvas[i];
            }
        }
        return rastasIndeksas;

    }

    static void  sukeistiElementus(int[] masyvas, int i, int j) {
        int x = masyvas[i];
        masyvas[i] = masyvas[j];
        masyvas[j] = x;
    }

}

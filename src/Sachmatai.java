import java.math.BigInteger;

public class Sachmatai {

    public static void main(String[] args) {

        // Su "long" tipo kintamaisiais max lentos dydis 63 langeliai
        // Su BigInteger skaiciuoja ir didesnius skaicius
        // reikia nuimti komentara nuo 15, 16, 23, 24 eiluciu ir uzkomentuoti 13, 14, 21, 22 eilutes

        System.out.println("Atlygis uz sachmatus");

        long grudaiLangelyje = 1;
        long grudaiViso = 1;
        // BigInteger grudaiLangelyje = new BigInteger("1");
        // BigInteger grudaiViso = new BigInteger("1");
        int lentosDydis = 63;
        int likoLangeliu = lentosDydis;

        while (--likoLangeliu > 0) {
            grudaiLangelyje = grudaiLangelyje *2;
            grudaiViso = grudaiViso + grudaiLangelyje;
            // grudaiLangelyje = grudaiLangelyje.multiply(new BigInteger("2"));
            // grudaiViso = grudaiViso.add(grudaiLangelyje);
            System.out.println("Jei langeliu yra " + (lentosDydis - likoLangeliu +1) + ", tai " + (lentosDydis - likoLangeliu +1) + " langelyje yra " + grudaiLangelyje +" grudai, o grudu suma yra " +grudaiViso);
        }
        System.out.println();
        System.out.println("Reikia sumoketi tiek grudu: " + grudaiViso);

        System.out.println();


    }
}

package org.example;

public class Main {
    public static int addiere(int a, int b) {
        return a + b;
    }

    public static int subtra(int a, int b) {
        return a - b;
    }

    public static boolean isgleich(int nummer){
        return nummer % 2 == 0;
    }




public static void main(String[] args) {
        int summe = Main.addiere(100,80);
        System.out.println();
        System.out.println("Die Summe ist " + summe);

        int diff = Main.subtra(80,40);
        System.out.println("Diff ist : " + diff);

         boolean bolly = Main.isgleich(10);
         System.out.println("isgleich... : " + bolly);


}
}


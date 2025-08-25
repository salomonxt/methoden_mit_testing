package org.example;

public class Main {
    public static int addiere(int a, int b) {
        return a + b;
    }

    public static int subtra(int a, int b) {
        return a - b;
    }
public static void main(String[] args) {
        int summe = Main.addiere(50,10);
        System.out.println("Die Summe ist " + summe);

        int diff = Main.subtra(-20,4);
        System.out.println("Summe/Diff ist : " + diff);

}
}


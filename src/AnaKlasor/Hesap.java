package AnaKlasor;

import java.util.Scanner;

public class Hesap {
    public static void main(String[] args) {
        int mat, tur, kim, biy, muz, tar;
        Scanner cal = new Scanner(System.in);
        System.out.println(cal);
        System.out.print("Matematik Not: ");
        mat = cal.nextInt();
        System.out.print("Turkce Not: ");
        tur = cal.nextInt();
        System.out.print("Kimya Not: ");
        kim = cal.nextInt();
        System.out.print("Biyoloji Not: ");
        biy = cal.nextInt();
        System.out.print("Müzik Not: ");
        muz = cal.nextInt();
        System.out.print("Tarih Not: ");
        tar = cal.nextInt();
        int toplam =  (mat+tar+tur+biy+muz+kim);
        double ortalama= toplam/6.0;
        System.out.println("Ortalama: " + ortalama);
        boolean kosul1 = ortalama >= 70;
        String hem = kosul1 ? "BAŞARILI" : "BAŞARISIZ";
        System.out.println(hem);

    }
}

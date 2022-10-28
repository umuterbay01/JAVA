package AnaKlasor;

import java.util.Scanner;

public class KdvHesaplayici {
    public static void main(String[] args) {
        double anaPara, kdvOrani= 0.18;
        Scanner giris = new Scanner(System.in);
        System.out.println(giris);
        System.out.print("ANA PARAYI GİRİNİZ : ");
        anaPara = giris.nextDouble();
        double kdvTutar = anaPara * kdvOrani;
        System.out.println("KDV TUTARI : " + kdvTutar);
        double kdvliPara = anaPara + kdvTutar;
        System.out.println("KDVLİ PARANIZ : "+ kdvliPara);
    }
}

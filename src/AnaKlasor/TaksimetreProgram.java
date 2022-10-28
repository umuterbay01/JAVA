package AnaKlasor;

import java.util.Scanner;

public class TaksimetreProgram {
    public static void main(String[] args) {
        int baslangic=10;
        double tutar, km;
        Scanner tks = new Scanner(System.in);
        System.out.println("TAKSİMETRE AÇILIŞ : " + baslangic);
        System.out.print("KAÇ KİLOMETRE GİTTİĞİNİZİ GİRİNİZ :");
        km = tks.nextDouble();
        tutar = (2.2 * km) + 10;
        boolean kosul1 = tutar >= 20.0;
        double enson = kosul1 ? tutar : 20.0;
        System.out.println(enson + "TL");
    }
}




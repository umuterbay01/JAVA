package AnaKlasor;

import java.util.Scanner;

public class TaksimetreProgram {
    public static void main(String[] args) {
        int km;
        double tutar, baslangic = 10;
        Scanner tks = new Scanner(System.in);
        System.out.println("TAKSİMETRE AÇILIŞ : " + baslangic);
        System.out.print("KAÇ KİLOMETRE GİTTİĞİNİZİ GİRİNİZ :");
        km = tks.nextInt();
        tutar = (2.20 * km);
        tutar += baslangic;
        boolean kosul1 = tutar >= 20.0;
        double enson = kosul1 ? tutar : 20.0;
        System.out.println(enson + "TL");
    }
}




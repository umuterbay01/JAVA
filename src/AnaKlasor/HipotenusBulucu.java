package AnaKlasor;
import java.util.Scanner;

public class HipotenusBulucu {
    public static void main(String[] args) {
        int aDikKenar, bDikKenar;
        double cHipotenus;
        Scanner input = new Scanner(System.in);
        System.out.print("İLK KENARI GİRİNİZ : ");
        aDikKenar = input.nextInt();
        System.out.print("İKİNCİ KENARI GİRİNİZ : ");
        bDikKenar= input.nextInt();
        cHipotenus = Math.sqrt((aDikKenar * aDikKenar) + (bDikKenar * bDikKenar));
        System.out.println("HİPOTENÜS : " + cHipotenus);
    }


}

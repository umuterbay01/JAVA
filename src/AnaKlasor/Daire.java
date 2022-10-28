package AnaKlasor;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alan;
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        alan = pi * (r * r);
        System.out.println("ALAN: "+ alan);

    }
}

package KosulluIfadelerveKodBlokları;

import java.util.Scanner;

public class Artikyil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
        int year = inp.nextInt();

        if (year % 100 == 0 && !(year % 400 == 0)) {
            System.out.println(year + " bir artık yıl değildir !");
        } else if (year % 4 == 0) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }
}
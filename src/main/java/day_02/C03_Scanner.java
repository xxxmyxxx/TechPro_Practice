package day_02;

import java.util.Scanner;

public class C03_Scanner {
    // kullanicıdan 2 sayı al,sayıların karesini al ve eşit olup olmadığını kontrol et true, yada false return et
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.sayi gir: ");
        int birinciSayi=scan.nextInt();
        System.out.print("2.sayi gir: ");
        int ikinciSayi=scan.nextInt();
        boolean result =karelerEsitMi(birinciSayi,ikinciSayi);
        System.out.println("result = " + result);


    }

    private static boolean karelerEsitMi(int birinciSayi, int ikinciSayi) {
        boolean sonuc=birinciSayi*birinciSayi == ikinciSayi*ikinciSayi; // == işareti matematikte kullandığımız eşittir gibidir.

        return sonuc; // bulduk bunu görebilmek için bu methodu, manin methodunda bir kaba aktardık
        // result isimli boolean kabına koydum

    }

}

package day_02;

public class C05_MethodCreation {
    //sayı1 : 10
    //sayı2 : 20 yerlerini değiştir.

    public static void main(String[] args) {
        // 2. yol bu

        int sayi1 = 10;
        System.out.println("sayi1 = " + sayi1);
        int sayi2 = 20;
        System.out.println("sayi2 = " + sayi2);

        System.out.println("---------------------------------");

        sayi1 = sayi1 + sayi2; // sayi1 30
        sayi2 = sayi1 - sayi2; // sayi2 10
        sayi1 = sayi1 - sayi2; // sayi1 20

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // 1. (templi) yol
        int num1 = 3;
        int num2 = 5;

        swaplaYazdir(num1, num2);
    }

    private static void swaplaYazdir(int num1, int num2) {
        int temp;
        temp = num1; // temp artık yeni sayı1
        num1 = num2; // sayı1 i artık sayi 2 yaptık aktardık onu
        num2 = temp; //tempin içinde sayı 1 vardı onuda sayi 2 ye aktardık
        System.out.println("--------------");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

package day_02;

import java.util.Scanner;

public class C02_MethodCreation {
    // Kullanıcıdan fahrenheit cinsi bir değer girmesini isteyin
    // Fahrenheit değeri,Celcius değere çeviren method yazınız.
    // Formül : c = (f-32)/1.8
    // yani fahrenheit degerini bu methoda gönderdiğimde bana celsius cinsinden sıcaklık donmeli
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("f gir: ");
        double fahrenheit =scan.nextDouble();
        System.out.println("fahrenheit = " + fahrenheit);

        //main method içerisinden method oluştururken
        //methodumuza vereceğimizi ismi yazıyoruz
        //method parantezin içine argument yazıyoruz

        double celsius = fahrToCels(fahrenheit); // method parantezinin içine neyi değiştireceksek onu yazarız.

        System.out.println("celsius = " + celsius);


        //valueToConvert(); // benim yaptığım



    }

    public static double fahrToCels(double fahrenheit) {
        double celsius=(fahrenheit-32)/1.8;

        return celsius; // return (fahrenheit-32)/1.8; şeklinde de yazdırılabilirdi.
    }
    /*  public static void valueToConvert(){ // benim yaptığım
        System.out.print("Lütfen dönüştürmek istediğiniz Fahrenheit değerini giriniz : ");
        Scanner input = new Scanner(System.in);
        double value =input.nextDouble();
        double celcius = (value-32)/1.8;
        System.out.println("Girdiğiniz " +value+" Fahrenit'in celcius değeri : " + celcius);
    }

     */
}

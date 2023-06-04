package day_05;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Arrays {
    // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
    // ve bu rakamları bir array'e assign ediniz. Olusturdugunuz array'i yazdırınız
    // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
    // Ortalamadan daha buyuk olan array elemanlarını yazdırınız
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter four numbers");
        int numbers[]=new int[4];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= scan.nextInt();

        }
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        int number3 = scanner.nextInt();
//        int number4 = scanner.nextInt();
//
//        int [] numbers = {number1,number2,number3,number4};
        System.out.println("------------------");
        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------");
        int sum=0;

        for (int w: numbers) {
            sum = sum + w;
        }
        int ortalama=sum/numbers.length;
        System.out.println("ortalama = " + ortalama);
        System.out.println("------------------");
        for (int w: numbers) {
            if(w>ortalama){
                System.out.println(w);
            }
        }
        System.out.println("------------------");



    }
}

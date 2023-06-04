package day_05;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {
          /*
    Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
    ve ardından aşağıdaki şekli bu sayıya göre yazdırın:

    örnegin: Satır Sayısı 4 icin;

     1
     2 3
     4 5 6
     7 8 9 10

     */
        int a =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int lines=scanner.nextInt();
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

    }

}

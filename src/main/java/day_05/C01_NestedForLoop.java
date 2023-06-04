package day_05;

import java.util.Scanner;

public class C01_NestedForLoop {
    public static void main(String[] args) {

         /*
            Kullanıcıdan sisteme satır sayısını ve karakter girmesini isteyiniz.
            ve ardından kullanıcının girdiği karakteri kullanarak ikizkenar dik üçgen çizen
            bir method olusturun

            Satır sayısı = 4
            girilen karakter * ==>      *
                                        * *
                                        * * *
                                        * * * *
            */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int lines=scanner.nextInt();

        System.out.println("Enter char");
        char ch=scanner.next().charAt(0);

        ucgenCiz(lines,ch);



    }
    public static void ucgenCiz(int lines,char ch){
        for (int i = 1; i <= lines; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
}

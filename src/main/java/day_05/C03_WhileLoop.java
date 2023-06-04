package day_05;

import java.util.Scanner;

public class C03_WhileLoop {

    // Kullanıcıdan sisteme bir sayi girmesini isteyiniz
    // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
    //or: 5!=1*2*3*4*5

    //3 ! --> 1  *  2  *  3  =   6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number=scanner.nextInt();

        int fak=1;
        while (number>0){
            fak=fak*number;
            number--;
        }
        System.out.println(fak);
    }
}

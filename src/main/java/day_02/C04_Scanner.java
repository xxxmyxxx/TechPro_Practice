package day_02;

import java.util.Scanner;

public class C04_Scanner {
    // kullanicidan aldiginiz character ile asagıdaki gibi bir gorunum olusturunuz.
    /*
                          a
                         a a
                        a a a

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir karakter giriniz :");

        char ch = input.next().charAt(0); // scanner objesinde next char diye bir methodu yok
        // bu yüzden kullanıcının girdiği datayı once string olarak alıyorum
        // daha sonra bu stringin 0. indexindeki karakteri charAt(0) methodu ile alıyorum.
        System.out.println("ch = " + ch);
        System.out.println("----------------result--------------");
        System.out.println("  " + ch);
        System.out.println(" " + ch + " "+ch);
        System.out.println(ch + " " + ch + " " + ch);
        System.out.println("-----------------or------------"); // \n yeni satıra geçmeye yarar.



    }
}

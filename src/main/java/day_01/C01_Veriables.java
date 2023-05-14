package day_01;

public class C01_Veriables {

    public static void main(String[] args){

               int       yas                 =              33              ;
        // Data türü + veriable isim + atama oporatörü + veriable değeri+ noktalı vigül

        int sayi = 50;

        System.out.println(yas);

        // etiketi ile birlikte yazdırmak için ismini yaz nokta koy soutv tıkla.

        // sayi.soutv  bu şekilde

        System.out.println("sayi = " + sayi);

        // String non-primitive  Büyük harfle başlmasından anlayabiliriz.

        String name = " Mustafa";

        System.out.println("name = " + name);

        int benimYasim = yas;

        System.out.println("benimYasim = " + benimYasim);





        // veriable deklare etmek  
        String adim = "mustafa"; 
        
        // bir veriable başlatmak
        int age = 33;
        
        // baska bir verible başlatmak
        int nextAge = 34;
        
        age = nextAge;
        
        nextAge = 35;

        System.out.println("adim = " + adim);
        System.out.println("age = " + age);
        System.out.println("nextAge = " + nextAge);


    }
}

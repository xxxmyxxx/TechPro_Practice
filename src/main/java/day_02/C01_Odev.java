package day_02;

public class C01_Odev {
    // iki karenin toplamını bulan ve ayzdıran methodu oluştur
    // main methodun içinde tanımladığım iki sayının kareleri toplamını bulan ve yazdıran methodu oluştur
    public static void main(String[] args) {
        int a=2;
        int b=3;
        kareToplaYazdir(a,b); // buradaki parantez içindeki variable lara argument denir.
    }
    public static void kareToplaYazdir(int sayi1,int sayi2){
        int toplam=(sayi1*sayi1)+(sayi2*sayi2);
        System.out.println("toplam = " + toplam);
    }
}

package day_06;

public class C06_Scope {

    /*
    scope kapsam anlamına gelir, bir variable ın nerede gecerli oldugunu bıldırır

    4 cesıt scope vardır

    1-static variablelar=class variablelar
    2-instance variablelar= object variablelar
    -- static ve instance variablelar class levelda olusturulur
    3-local variablelar=methodların ıcınde olusturdugumuz variablelar ve methodun ıcınde gecerli olur
    4-loop variable=loopun ıcınde olusturdugumuz variablelar ve loopun icinde gecerli olur

     */


    static int staticSayi;//deger ataması yapmadıgımız zaman java bunlara otomatik default degerler atar
    int instanceSayi;



    public static void main(String[] args) {
        int localSayi = 4;
        for (int i = 0; i < 1; i++) {// buradaki i loop variabledir ve loopun disinda yazdirilamaz
            System.out.println(i);
        }
        //System.out.println(i);
        System.out.println(staticSayi);
        // static bir variable yani class variable class icinde kullanilabiliyor
        // System.out.println(instanceSayi);
        // Instance yani object veriable objeye bagli oldugu icin static bir methodda direk kullanilamaz.

        C06_Scope obj = new C06_Scope();
        System.out.println(obj.instanceSayi);

    }



}
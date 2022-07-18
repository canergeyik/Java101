package ders1;
import java.util.Scanner;
public class KDVtutarı {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Ürün tutarını giriniz");
        float tutar= inp.nextFloat();
        float kdvliTutar= (tutar<1000) ? tutar*0.18f+tutar : tutar*0.08f+tutar;
        float kdvTutarı=kdvliTutar-tutar;
        System.out.println("kdvsiz fiyat:"+tutar);
        System.out.println("kdvli fiyat:"+kdvliTutar);
        System.out.println("kdv tutar:"+kdvTutarı);
    }
}

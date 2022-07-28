package ders1;
import java.util.Scanner;
public class UcakBilet {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("KM cinsinden yol miktarını giriniz");
        int km= inp.nextInt();
        System.out.println("Yaşınızı giriniz");
        int yas= inp.nextInt();
        System.out.println("Yolculuk tipini giriniz.");
        int tip= inp.nextInt();
        if (km<0||yas<0||yas>100||tip<0||tip>2){
            System.out.println("hatalı veri girdiniz");

        }
        float indirim=0;
        float tutar=km*0.10f;
        if (yas<=12)
            indirim = tutar * 0.5f;
        else if (yas>12 && yas<=24)
            indirim=tutar*0.1f;
        else
            indirim=tutar*0.3f;
        tutar=tutar-indirim;
        indirim=0;
        if (tip==2) {
            indirim = tutar * 0.2f;
            tutar = tutar - indirim;
            System.out.println("Toplam tutar: "+tutar*2);
        }
        else
            System.out.println("Toplam tutar: "+tutar);
    }
}

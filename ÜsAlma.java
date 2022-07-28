package ders1;
import java.util.Scanner;
public class ÜsAlma {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz");
        int sayi= inp.nextInt();
        System.out.println("Üssü giriniz");
        int us= inp.nextInt();
        int i,sonuc=1;
        for (i=0;i<us;i++){
            sonuc=sonuc*sayi;
        }
        System.out.println("Cevap"+sonuc);
    }
}

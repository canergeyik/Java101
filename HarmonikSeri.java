package ders1;
import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("N sayısını giriniz");
        int sayi=inp.nextInt();
        int toplam=1,i;
        for (i=2;i<sayi+1;i++){
            toplam=toplam+(1/i);
        }
        System.out.println("Toplam:"+toplam);
    }
}

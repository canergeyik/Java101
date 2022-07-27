package ders1;
import java.util.Scanner;
public class ÇiftSayılar {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int kullanici,toplam=0,islemSayisi=0,i;
        kullanici=inp.nextInt();
        for (i=0;i<kullanici;i++){
            if(i%3==0 || i%4==0){
                toplam=toplam+i;
                islemSayisi+=1;
            }
        }
        float ortalama = toplam/islemSayisi;
        System.out.println("Ortalama:"+ortalama);
    }
}

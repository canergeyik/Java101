package ders1;
import java.util.Scanner;
public class ArmstrongSayı {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("sayıyı giriniz");
        int sayi1= inp.nextInt();
        int basamak=0,i,toplam=0;
        while(sayi1>0){
            sayi1=sayi1/10;
            basamak+=1;
        }
        for (i=1;i<=basamak;i++){
            toplam=toplam+(sayi1%(10*i))*basamak;
        }
        if (toplam==sayi1)
            System.out.println("Armstrong sayı");
        else
            System.out.println("Armstrong sayı değil");
    }
}

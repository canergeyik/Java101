package ders1;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int i,sayi,min=2147483647,max=0;
        for (i=1;i<5;i++){
            System.out.println(i+". sayıyı giriniz");
            sayi=inp.nextInt();
            if (sayi>max)
                max=sayi;
            if (sayi<min)
                min=sayi;
        }
        System.out.println("En küçük sayı="+min+"\nEn büyük sayı="+max);
    }
}

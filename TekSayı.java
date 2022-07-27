package ders1;
import java.util.Scanner;
public class TekSayı {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int toplam=0,kullanici;
        kullanici=1;
        while (kullanici%2==0){
            kullanici= inp.nextInt();
            if (kullanici%4==0)
                toplam=toplam+kullanici;
        }
    }
}

package ders1;
import java.util.Scanner;
public class MükemmelSayı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = inp.nextInt();
        int i, toplam = 0;
        for (i = 1; i < sayi+1; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == (sayi * 2)) {
            System.out.println(sayi + " bir mükemmel sayıdır");
        }
        else{
                System.out.println(sayi + " bir mükemmel sayı değildir");
            }

    }
}

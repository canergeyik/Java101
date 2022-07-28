package ders1;
import java.util.Scanner;
import java.util.Random;
public class SayıTahmin {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        Random rand = new Random();
        int sayi,kullanici=0,tekrar=0;
        sayi= rand.nextInt(1,100);
        while (sayi!=kullanici){
            System.out.println("Tahmininizi giriniz");
            kullanici=inp.nextInt();
            if (kullanici>sayi) {
                System.out.println("Daha küçük söyle");
            }
            else if (sayi>kullanici)
                System.out.println("daha büyük söyle");
                tekrar += 1;
        }
        System.out.println("Tebrikler sayıyı "+tekrar+" kerede bildiniz");
    }
}

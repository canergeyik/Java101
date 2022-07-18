package ders1;
import java.util.Scanner;
public class ÜçgenAlan {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Üçgenin bütün kenarlarını giriniz");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        float u = (a+b+c)/2;
        float alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin alanı"+Math.sqrt(alan));
    }
}

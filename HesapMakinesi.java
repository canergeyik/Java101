package ders1;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        int sayi1= inp.nextInt();
        System.out.println("islemi giriniz");
        String islem= inp.next();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2= inp.nextInt();
        switch (islem){
            case "+":
                System.out.println(sayi1+sayi2);
                break;
            case "-":
                System.out.println(sayi1-sayi2);
                break;
            case "/":
                System.out.println(sayi1/sayi2);
                break;
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            default:
                System.out.println("işlemi düzgün girdiğinizden emin olunuz. (+,-,/,*)");
        }
    }
}

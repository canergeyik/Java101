package ders1;
import java.util.Scanner;

public class NotOrtalamaGelişmiş {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat,turk,fizik,biyoloji,toplam;
        System.out.println("Matematik notunuzu giriniz.");
        mat=inp.nextInt();
        mat=(mat>=0 && mat<=100) ? mat : 0 ;
        System.out.println("fizik notunuzu giriniz.");
        fizik=inp.nextInt();
        fizik=(mat>=0 && mat<=100) ? fizik : 0;
        System.out.println("biyoloji notunuzu giriniz.");
        biyoloji=inp.nextInt();
        biyoloji=(mat>=0 && mat<=100) ? biyoloji : 0;
        System.out.println("turk notunuzu giriniz.");
        turk=inp.nextInt();
        turk=(mat>=0 && mat<=100) ? turk : 0;
        toplam=(mat+biyoloji+turk+fizik)/4;
        System.out.println("toplam:"+toplam);


    }
}

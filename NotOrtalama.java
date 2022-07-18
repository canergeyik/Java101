package ders1;
import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz");
        float mat=inp.nextFloat();
        System.out.println("fizik notunuzu giriniz");
        float fizik=inp.nextFloat();
        System.out.println("kimya notunuzu giriniz");
        float kimya=inp.nextFloat();
        System.out.println("turkce notunuzu giriniz");
        float turkce=inp.nextFloat();
        System.out.println("tarih notunuzu giriniz");
        float tarih=inp.nextFloat();
        float ortalama= (mat+fizik+kimya+turkce+tarih)/5;
        String str= (ortalama>60) ? "Geçtiniz":"Kaldınız";
        System.out.println(str);
    }
}

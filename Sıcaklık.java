package ders1;
import java.util.Scanner;
public class Sıcaklık {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz");
        int sicaklik=inp.nextInt();
        if(sicaklik<5)
            System.out.println("kayak yapın");
        else if (sicaklik>=5 && sicaklik<15)
            System.out.println("sinemaya gidin");
        else if (sicaklik>=15 && sicaklik<25)
            System.out.println("piknik gidin");
        else if (sicaklik>=25)
            System.out.println("yüzme gidin");

    }
}

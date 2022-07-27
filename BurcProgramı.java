package ders1;
import java.util.Scanner;
public class BurcProgramı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Ayı sayısal olarak giriniz");
        int month = inp.nextInt();
        System.out.println("günü sayısal olarak giriniz");
        int day=inp.nextInt();
        if(month==1){
            if(day<=21)
                System.out.println("Oğlak burcusunuz");
            else
                System.out.println("Kova burcusunuz");
        }
        if(month==2){
            if (day<20)
                System.out.println("Kova burcusunuz");
            else
                System.out.println("Balık burcusunuz");
        }
        if(month==3){
            if(day<20)
                System.out.println("Balık Burcusunuz");
            else
                System.out.println("koç burcusunuz");
        }
        if(month==4){
            if(day<21)
                System.out.println("koç Burcusunuz");
            else
                System.out.println("Boğa burcusunuz");
        }
        if(month==5){
            if(day<21)
                System.out.println("Boğa Burcusunuz");
            else
                System.out.println("İkizler burcusunuz");
        }
        if(month==6){
            if(day<20)
                System.out.println("İkizler Burcusunuz");
            else
                System.out.println("Aslan burcusunuz");
        }
        if(month==7){
            if(day<20)
                System.out.println("Aslan Burcusunuz");
            else
                System.out.println("Başak burcusunuz");
        }
        if(month==8){
            if(day<20)
                System.out.println("Başak Burcusunuz");
            else
                System.out.println("Terazi burcusunuz");
        }
        if(month==9){
            if(day<20)
                System.out.println("Terazi Burcusunuz");
            else
                System.out.println("Akrep burcusunuz");
        }
        if(month==10){
            if(day<20)
                System.out.println("Akrep Burcusunuz");
            else
                System.out.println("Yay burcusunuz");
        }
        if(month==11){
            if(day<20)
                System.out.println("Yay Burcusunuz");
            else
                System.out.println("Oğlak burcusunuz");
        }
        if(month==12){
            if(day<20)
                System.out.println("Oğlak Burcusunuz");
            else
                System.out.println("Kova burcusunuz");
        }
    }
}

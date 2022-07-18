package ders1;
import java.util.Scanner;
public class ManavProgramı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float elma=2.14f;
        float armut=3.67f;
        float domates=1.11f;
        float muz=0.95f;
        float patlican=5.00f;
        System.out.println("Kaç kilo elma:");
        float elmaKG=inp.nextFloat();
        System.out.println("Kaç kilo armut:");
        float armutKG=inp.nextFloat();
        System.out.println("Kaç kilo domates:");
        float domatesKG=inp.nextFloat();
        System.out.println("Kaç kilo muz:");
        float muzKG=inp.nextFloat();
        System.out.println("Kaç kilo patlica:");
        float patlicanKG=inp.nextFloat();
        float toplam=(elma*elmaKG)+(armut*armutKG)+(domates*domatesKG)+(muz*muzKG)+(patlicanKG*patlican);
        System.out.println("Toplam:"+toplam+"TL");
    }
}

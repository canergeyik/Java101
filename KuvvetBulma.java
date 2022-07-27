package ders1;
import java.util.Scanner;
public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int kullanici= inp.nextInt();
        int i;
        //4 üssü
        for (i=1;i<kullanici;i*=4){
            System.out.println(i);
        }
        //5 üssü
        for (i=1;i<kullanici;i*=5){
            System.out.println(i);
        }
    }
}

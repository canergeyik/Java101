package ders1;
import java.util.Scanner;
public class KüçüktenBüyüğe {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int a,b,c;
        System.out.println("ilk sayıyı giriniz.");
        a= inp.nextInt();
        System.out.println("ikinci  sayıyı giriniz.");
        b= inp.nextInt();
        System.out.println("üçüncü sayıyı giriniz.");
        c= inp.nextInt();
        if (a<b && a<c){
            if (b>c)
                System.out.println("b>c>a");
            else
                System.out.println("c>b>a");
        }
        else if (b<c && b<a) {
            if (a>c)
                System.out.println("a>c>b");
            else
                System.out.println("c>a>b");
        }
        else{
            if (a>b)
                System.out.println("a>b>c");
            else
                System.out.println("b>a>c");
        }
    }
}

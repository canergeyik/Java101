package ders1;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int sayi1=0,sayi2=1,sayi3,i,count;
        count= inp.nextInt();
        System.out.print(sayi1+" "+sayi2);

        for(i=2;i<count;++i)
        {
            sayi3=sayi1+sayi2;
            System.out.print(" "+sayi3);
            sayi1=sayi2;
            sayi2=sayi3;
        }

    }
}

package ders1;
import java.util.Scanner;
public class ArtıkYıl {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int yil=inp.nextInt();
        if(yil%4==0)
            System.out.println(yil+" bir artık yıldır");
        else
            System.out.println(yil+" bir artık yıl değildir");
    }
}

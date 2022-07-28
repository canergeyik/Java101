package ders1;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        int sayi1= inp.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int sayi2= inp.nextInt();
        int ebob=1,ekok=1,tekrar=1;
        //EBOB
        while(sayi1>tekrar && sayi2>tekrar){
            if(sayi1%tekrar==0 && sayi2%tekrar==0){
                ebob=tekrar;
            }
            tekrar+=1;
        }
        System.out.println("Bu sayıların EBOB'U "+ebob);
        tekrar=1;
        //EKOK
        while(true){
            if(tekrar%sayi1==0 && tekrar%sayi2==0){
                ekok=tekrar;
                break;
            }
            tekrar+=1;
        }
        System.out.println("Bu sayıların en küçük ortak katı "+ekok);

    }
}

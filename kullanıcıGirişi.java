package ders1;
import java.util.Scanner;
public class kullanıcıGirişi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("kullanıcı adınızı giriniz");
        String kullaniciAdi= inp.next();
        System.out.println("sifrenizi giriniz.");
        String sifre=inp.next();
        if (kullaniciAdi.equals("caner") ){
            if (sifre.equals("caner123")) {
                System.out.println("giriş başarılı");
            }
            else{
                System.out.println("Şifreyi yanlış girdiniz.Şifrenizi sıfırlamak ister misiniz? (evet/hayır)");
                String onay= inp.next();
                if (onay.equals("evet")){
                    System.out.println("yeni şifrenizi giriniz");
                    String yeniSifre=inp.next();
                    if (sifre.equals(yeniSifre) && yeniSifre.equals("caner123")){
                        System.out.println("şifre oluşturulamadı.Tekrar deneyiniz.");
                    }
                    else {
                        System.out.println("şifre başarıyla oluşturuldu");
                    }
                }
                else{
                    System.out.println("şifre yenileme reddedildi");
                }
            }
        }
        else {
            System.out.println("Böyle bir kullanıcı yok");
        }

    }
}

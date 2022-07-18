package ders1;
import java.util.Scanner;
public class DaireDilimiAlanı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float pi=3.14f;
        System.out.println("Yarıçapı giriniz");
        int yaricap=inp.nextInt();
        System.out.println("açıyı giriniz");
        int aci=inp.nextInt();
        float alan=(pi*(yaricap*yaricap)*aci)/360;
        System.out.println("Alan:"+alan);
    }
}

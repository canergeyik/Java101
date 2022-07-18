package ders1;
import java.util.Scanner;

public class VücütKitleEndeksi {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz");
        float boy= inp.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz");
        int kilo= inp.nextInt();
        System.out.println("Vücut kitle endeksiniz"+kilo/(boy*boy));
    }}

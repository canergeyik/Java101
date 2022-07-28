package ders1;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Kelimeyi giriniz");
        String kelime= inp.next();
        if (palindrome(kelime)==true)
            System.out.println("Kelime palindrome bir kelimedir");
        else
            System.out.println("Kelime palindrome bir kelime değildir");
    }
    static boolean palindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
}

package day15_forLoop;

import java.util.Scanner;

public class C06_faktoryelHesabi {
    public static void main(String[] args) {
        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        //        // bu sayinin faktoryel degerini hesaplayin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen 17 den kucuk pozitif tam sayi giriniz");
        int girilensayi = scann.nextInt();

        int faktoryel = 1;
        for (int i = girilensayi; i >=1 ; i--) {
            faktoryel*=i;


        }
        System.out.println(faktoryel);



        }
    }


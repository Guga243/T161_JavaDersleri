package day15_forLoop;

import java.util.Scanner;

public class C04_AradekiSayilarinToplami {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsada kod calismali,

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen baslangic degerini giriniz");
        int baslangic = scann.nextInt();

        System.out.println("lutfen bitis degerinin giriniz");
        int bitis = scann.nextInt();

        int toplam =0;

        if (baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;
            }
        }else {
            // baslangic > bitis
            for (int i = baslangic; i >= bitis; i--) {
                toplam += i;

                System.out.println(toplam);
            }
        }














    }
}

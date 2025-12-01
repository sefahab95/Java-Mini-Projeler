package Giris;

import java.util.Scanner;

public class KombinasyonHesaplama {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Kombinasyon Hesaplama Programı ---");

        
        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        
        if (n < r) {
            System.out.println("\nHATA: n değeri r değerinden küçük olamaz. (n >= r olmalıdır)");
            scanner.close();
            return; 
        }

       
        long nFaktoriyel = faktoriyelHesapla(n);
        long rFaktoriyel = faktoriyelHesapla(r);
        long nEksiRFaktoriyel = faktoriyelHesapla(n - r);

        
        // C(n,r) = n! / (r! * (n-r)!)
        long kombinasyon = nFaktoriyel / (rFaktoriyel * nEksiRFaktoriyel);

        System.out.println("\n--- SONUÇ ---");
        System.out.println("C(" + n + "," + r + ") kombinasyonu: " + kombinasyon);

        scanner.close(); 
        
    } 

    
    public static long faktoriyelHesapla(int sayi) {
        
        if (sayi == 0 || sayi == 1) {
            return 1;
        }

        long sonuc = 1;
        for (int i = 2; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

} 

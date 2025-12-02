package Giris;

import java.util.Scanner;

public class UsluSayiHesaplama {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Üslü Sayı Hesaplama  ---");
        
        System.out.print("Taban sayısını girin : ");
        int taban = scanner.nextInt();
        
        System.out.print("Üs sayısını girin ): ");
        int us = scanner.nextInt();
        
        scanner.close();
        
        long sonuc = 1; 
        
        if (us == 0) {
            sonuc = 1;
        } else if (us > 0) {
            for (int i = 0; i < us; i++) {
                sonuc *= taban;
            }
        } else {
            System.out.println("\nHata: Bu program sadece pozitif tam sayı üsleri ve 0'ı desteklemektedir.");
            return;
        }
        
        System.out.println("Sonuç:"+sonuc);
        
        
	}

}

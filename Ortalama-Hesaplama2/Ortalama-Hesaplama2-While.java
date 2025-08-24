package Giris;

import java.util.Scanner;

public class Karalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int limit = input.nextInt();
        
        int toplam = 0;
        int sayiAdedi = 0;
        int i = 1; 

       
        while (i <= limit) {
            
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayiAdedi++;
            }
            i++; //
        }
        
       
        if (sayiAdedi > 0) {
            double ortalama = (double) toplam / sayiAdedi;
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("Girdiğiniz aralıkta 3 ve 4'e tam bölünen bir sayı bulunamadı.");
        }
        
        input.close();
    }
}

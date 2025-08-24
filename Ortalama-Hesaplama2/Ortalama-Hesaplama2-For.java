import java.util.Scanner;

public class OrtalamaHesaplama2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Kullanıcıdan limit sayısını alma
        System.out.print("Bir sayı giriniz: ");
        int limit = input.nextInt();
        
        double toplam = 0;
        int sayiAdedi = 0;

        // Döngü ile 1'den limit'e kadar olan sayıları kontrol etme
        for (int i = 1; i <= limit; i++) {
            
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i; // Sayıyı toplama ekle
                sayiAdedi++; // Sayı adedini bir artır
            }
        }
        
        // Ortalamayı hesaplama ve ekrana yazdırma
        if (sayiAdedi > 0) {
            double ortalama =  toplam / sayiAdedi;
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("Girdiğiniz aralıkta 3 ve 4'e tam bölünen bir sayı bulunamadı.");
        }
        
        input.close();
    }
}

package Giris;

	import java.util.Scanner;

	public class UcakBiletiHesaplama {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Kullanıcıdan verileri alma
	        System.out.print("Mesafeyi (km) girin: ");
	        int mesafe = input.nextInt();

	        System.out.print("Yaşınızı girin: ");
	        int yas = input.nextInt();

	        System.out.print("Yolculuk tipini seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
	        int yolculukTipi = input.nextInt();

	        // Hatalı veri kontrolü
	        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
	            System.out.println("Hatalı Veri Girdiniz !");
	            return; // Programı sonlandır
	        }

	        // Fiyat hesaplama
	        double normalFiyat = mesafe * 0.10;
	        double indirimliFiyat = normalFiyat;

	        // Yaşa göre indirim
	        if (yas < 12) {
	            indirimliFiyat -= indirimliFiyat * 0.50; // %50 indirim
	        } else if (yas >= 12 && yas <= 24) {
	            indirimliFiyat -= indirimliFiyat * 0.10; // %10 indirim
	        } else if (yas >= 65) {
	            indirimliFiyat -= indirimliFiyat * 0.30; // %30 indirim
	        }

	        // Yolculuk tipine göre indirim ve nihai fiyat
	        if (yolculukTipi == 2) {
	            indirimliFiyat -= indirimliFiyat * 0.20; // %20 gidiş-dönüş indirimi
	            indirimliFiyat *= 2; // Gidiş-dönüş olduğu için fiyatı 2 ile çarpma
	        }

	        System.out.println("Toplam Bilet Fiyatı: " + indirimliFiyat + " TL");
	        input.close();
	    }
	}



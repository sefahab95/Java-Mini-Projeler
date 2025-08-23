package Giris;

import java.util.Scanner;

public class SicaklikEtkinlik {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sicaklik;
		String sonuc;
		// ödev kodu
		
		System.out.println("Hava sıcaklığını giriniz: ");
		sicaklik=input.nextInt();
		
		sonuc= (sicaklik<5)? "Kayak yap":
			(sicaklik>=5 && sicaklik<15) ? "Sinemaya git":
				(sicaklik>=15 && sicaklik<25)? "Piknik": 
					(sicaklik>=25 && sicaklik<50)? "yüzme": "evde otur sakın çıkma" ;
		System.out.println(sonuc);
						

		/*
		Video kodu
		
		System.out.println("Hoşgeldiniz: hava sıcaklığına göre etkinlik önerme uygulaması");
		System.out.println("Lütfen Hava Sıcaklığını giriniz: ");
		sicaklik = input.nextDouble();

		if (sicaklik < 5) {
			System.out.println("Kayak yapmaya gitmelisin");
		} else if (sicaklik >= 5 && sicaklik < 15) {
			System.out.println("Sinemaya gitmelisin");
		} else if (sicaklik >= 15 && sicaklik < 25) {
			System.out.println("Pikniğe gitmelisin");
		} else if (sicaklik >= 25 && sicaklik < 40) {
			System.out.println("Denize gitmelisin");
		} else {
			System.out.println("EVDE OTUR");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

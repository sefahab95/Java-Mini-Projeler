package Giris;

import java.util.Scanner;

public class ArtikYilHesaplama {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Yıl Giriniz: ");
		int yil = input.nextInt();

		boolean artikYilMi = false;

		if (yil % 4 == 0) {
			// Yıl, 4'e tam bölünüyor.
			if (yil % 100 == 0) {
				// Yıl, 100'e tam bölünüyor. Şimdi 400'e de bölünüyor mu kontrol et.
				if (yil % 400 == 0) {
					artikYilMi = true;
				}
			} else {
				// Yıl, 4'e bölünüyor ancak 100'e bölünmüyor.
				artikYilMi = true;
			}
		}

		if (artikYilMi) {
			System.out.println(yil + " bir artık yıldır !");
		} else {
			System.out.println(yil + " bir artık yıl değildir !");
		}

		input.close();
	}
}

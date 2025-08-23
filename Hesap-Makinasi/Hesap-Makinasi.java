package Giris;

import java.util.Scanner;

public class HesapMakinasi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// a birinci sayi, b ikinci sayı
		System.out.print("1. sayiyi giriniz: ");
		int a = input.nextInt();
		System.out.print("2. sayiyi giriniz: ");
		int b = input.nextInt();

		int islem;

		System.out.println("Yapmak istediğiniz 4 işlemi tuşlama yaparak seçiniz: ");
		System.out.println("1-Toplama");
		System.out.println("2-Çıkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");

		islem = input.nextInt();

		switch (islem) {
		case 1:
			System.out.println("Sonuç: " + (a + b));
			break;
		case 2:
			System.out.println("Sonuç: " + (a - b));
			break;
		case 3:
			System.out.println("Sonuç: " + (a * b));
			break;
		case 4:
			if (b == 0) {
				System.out.println("Error");
			} else {
				System.out.println("Sonuç: " + (a / b));
			}

			break;
		default:
			System.out.println("Hatalı tuşlama yaptınız!");
			break;

		}

	}

}

package Giris;

import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double Mat, Fiz, Kim, Biyo, Muz, toplamNot = 0, gecerliDers = 0,ort;

		System.out.print("Matematik Dersi notunuzu giriniz: ");
		Mat = input.nextInt();
		if (Mat <= 100 && Mat >= 0) {

			toplamNot = toplamNot + Mat;
			gecerliDers = gecerliDers + 1;

		} else {
			System.out.println("not ortalamaya dahil edilmedi!");

		}
		System.out.print("Fizik Dersi notunuzu giriniz: ");
		Fiz = input.nextInt();
		if (Fiz <= 100 && Fiz >= 0) {

			toplamNot = toplamNot + Fiz;
			gecerliDers = gecerliDers + 1;

		} else {
			System.out.println("not ortalamaya dahil edilmedi!");
		}
		System.out.print("Kimya Dersi notunuzu giriniz: ");
		Kim = input.nextInt();
		if (Kim <= 100 && Kim >= 0) {

			toplamNot = toplamNot + Kim;
			gecerliDers = gecerliDers + 1;

		} else {
			System.out.println("not ortalamaya dahil edilmedi!");
		}
		System.out.print("Biyoloji Dersi notunuzu giriniz: ");
		Biyo = input.nextInt();
		if (Biyo <= 100 && Biyo >= 0) {

			toplamNot = toplamNot + Biyo;
			gecerliDers = gecerliDers + 1;

		} else {
			System.out.println("not ortalamaya dahil edilmedi!");
		}
		System.out.print("Müzik Dersi notunuzu giriniz: ");
		Muz = input.nextInt();
		if (Muz <= 100 && Muz >= 0) {

			toplamNot = toplamNot + Muz;
			gecerliDers = gecerliDers + 1;

		} else {
			System.out.println("not ortalamaya dahil edilmedi!");
		}

		if (gecerliDers == 0) {
			System.out.println("Üzgünüz yanlış not girişi yapıldığından dolayı sisteminiz sonlandırılmıştır.");
			System.exit(1);
		}
		ort = toplamNot / gecerliDers;

		if ((ort >= 55) && (ort <= 100)) {
			System.out.println("Sınıfı geçtiniz:" + ort);
		} else if (ort < 55 && ort >= 0) {
			System.out.println("Sınıf tekrarı:" + ort);
		} else {
			System.out.println("Hatalı not girdiniz!");
		}

	}
}

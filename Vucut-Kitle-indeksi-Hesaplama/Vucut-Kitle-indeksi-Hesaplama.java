package Giris;

import java.util.Scanner;

public class VucutKutleIndeksi {

	public static void main(String[] args) {

		double sonuc;

		Scanner input = new Scanner(System.in);
		System.out.print("Boyunuzu giriniz(Örnek:1,75 gibi): ");
		double Boy = input.nextDouble();
		System.out.print("Kilonuzu giriniz: ");
		double Kilo = input.nextDouble();

		sonuc = (Kilo) / (Boy * Boy);

		System.out.print("Vücut Kitle İndeksiniz: " + sonuc);

	}

}

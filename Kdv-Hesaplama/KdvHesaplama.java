package Giris;

import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		
		
		System.out.print("Ürün fiyatı giriniz: ");
		int urun=input.nextInt();
		
		double kdv = (urun > 0 && urun <= 1000) ? 0.18 : 0.08;
		double urunKdvFiyat= urun * kdv ;
		double toplam=urun + urunKdvFiyat ;
		
		System.out.println("Ürün Fiyatı: "+urun);
		System.out.println("kdv yüzdesi : "+kdv);
		System.out.println("Ürünün kdv fiyatı: "+urunKdvFiyat);
		System.out.println("KDV dahil ürün fiyatı: "+ toplam);
		

	}

}

package Giris;

import java.util.Scanner;

public class DaireAlanCevre {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double pi=3.14,alan,cevre,acı;
		
		
		System.out.print("YarıÇap giriniz: ");
		double r=input.nextDouble();
		System.out.println("alanını hesaplamak istediğiniz parçanın açısını giriniz");
		System.out.print("Eğer tüm daireyi hesaplamak istiyorsanız açıyı 360 giriniz: ");
		acı=input.nextDouble();
		
		alan=(pi * (r*r) * acı) / 360 ;
		cevre= 2 * pi * r;
		
		
		System.out.println("Çevresi: "+cevre);
		System.out.println("Alanı: "+alan);
		

	}

}

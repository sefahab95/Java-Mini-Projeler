package Giris;

import java.util.Scanner;

public class HipotenusHesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		/*  
		 
		double sonuc,hipo;
		System.out.print("Kısa kenarı giriniz: ");
		double a=input.nextDouble();
		System.out.print("Uzun kenarı giriniz: ");
		double b=input.nextDouble();
		sonuc=Math.sqrt( (a*a)+ (b*b));
		System.out.println("Hipotenüs Kenar: "+sonuc);
		
		*/
		
		
		double u,alan,a,b,c; 
		
		
		// u=ucgenin çevresi
		// a=ucgenin alanı
		
		System.out.println("Üçgenin 1. Kenar Uzunluğunu Giriniz: ");
		a=input.nextDouble();
		System.out.println("Üçgenin 2. Kenar Uzunluğunu Giriniz: ");
		b=input.nextDouble();
		System.out.println("Üçgenin 3. Kenar Uzunluğunu Giriniz: ");
		c=input.nextDouble();
		
		
		u= (a+b+c)/2;
		alan= u * (u-a)* (u-b) * (u-c);
		
		System.out.println("Üçgenin Çevresi: "+2*u);
		System.out.println("Üçgenin alanı: "+ Math.sqrt(alan));
		
		
	}

}

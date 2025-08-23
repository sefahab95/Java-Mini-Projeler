package Giris;

import java.util.Scanner;

public class TaksiMetre {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
	
		double km,perKm=2.20,total=10;
		System.out.print("Yol uzunluğunu km cinsinden giriniz: ");
		
		km=input.nextDouble();
		
		total = total +(km*perKm);
		
		total=(total<20)? 20:total;
		
		System.out.println("Taksimetre Ücreti: "+total);

	}

}

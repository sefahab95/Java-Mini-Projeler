package Giris;

import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double Afiyat=2.14,Efiyat=3.67,Dfiyat=1.11,Mfiyat=0.95,Pfiyat=5.00;
		
		System.out.print("Kaç kg Armut aldın: ");
		int Armut=input.nextInt();
		System.out.print("Kaç kg Elma aldın: ");
		int Elma=input.nextInt();
		System.out.print("Kaç kg Domates aldın: ");
		int Domates=input.nextInt();
		System.out.print("Kaç kg Muz aldın: ");
		int Muz=input.nextInt();
		System.out.print("Kaç kg Patlıcan aldın: ");
		int Patlıcan=input.nextInt();
		
		
		double sonuc=Afiyat*Armut+Efiyat*Elma+Dfiyat*Domates+Mfiyat*Muz+Pfiyat*Patlıcan;
		System.out.println("Tutar: "+sonuc);
		
	}
		

}

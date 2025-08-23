package Giris;

	import java.util.Scanner;

	public class CinZodyagiHesaplama  {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int dogumYili;

	        System.out.print("Doğum yılınızı giriniz: ");
	        dogumYili = input.nextInt();

	        int zodyakKalan = dogumYili % 12;
	        String zodyakBurcu;

	        switch (zodyakKalan) {
	            case 0:
	                zodyakBurcu = "Maymun";
	                break;
	            case 1:
	                zodyakBurcu = "Horoz";
	                break;
	            case 2:
	                zodyakBurcu = "Köpek";
	                break;
	            case 3:
	                zodyakBurcu = "Domuz";
	                break;
	            case 4:
	                zodyakBurcu = "Fare";
	                break;
	            case 5:
	                zodyakBurcu = "Öküz";
	                break;
	            case 6:
	                zodyakBurcu = "Kaplan";
	                break;
	            case 7:
	                zodyakBurcu = "Tavşan";
	                break;
	            case 8:
	                zodyakBurcu = "Ejderha";
	                break;
	            case 9:
	                zodyakBurcu = "Yılan";
	                break;
	            case 10:
	                zodyakBurcu = "At";
	                break;
	            case 11:
	                zodyakBurcu = "Koyun";
	                break;
	            default:
	                zodyakBurcu = "Hesaplanamadı. Lütfen geçerli bir yıl girin.";
	                break;
	        }

	        System.out.println("Çin Zodyağı burcunuz: " + zodyakBurcu);
	        input.close();
	    }
	

	}



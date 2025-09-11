import java.util.Scanner;

public class GirilenSayiKuvvetleri {
			public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Bir sayı girin: ");
	        int limit = scanner.nextInt();
	        scanner.close();

	        System.out.println("--- Girilen sayıya kadar 2'nin kuvvetleri ---");
	        for (int i = 1; i <= limit; i *= 2) {
	            System.out.println(i);
	        }
	    }
	}
		

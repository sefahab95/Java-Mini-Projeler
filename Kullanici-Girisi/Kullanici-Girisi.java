package Giris;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String userName, password, newPassword;
		int decide;
		System.out.print("Kullanıcı adını giriniz: ");
		userName = input.nextLine();
		System.out.print("Parola giriniz: ");
		password = input.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş başarılı hoşgeldiniz");

		} else {
			System.out.println("Girdiğiniz bilgiler hatalıdır.");

			System.out.println("Yeni şifre oluşturmak isterseniz 1 e istemezseniz 2 ye basınız: ");
			decide = input.nextInt();
			input.nextLine();
			

			switch (decide) {
			case 1:
				System.out.print("Yeni şifre giriniz: ");
				
				newPassword = input.nextLine();
				if (newPassword.equals(password)) {
					System.out.println("Şifre oluşturulamadı.");
				} 
				else {
					System.out.println("Şifre oluşturuldu.");
					password = newPassword;
				}

				break;

			case 2:
				System.out.println("Çıkış Yaptınız.");

				break;
			default:
				System.out.println("Hatalı tuşlama yaptınız");
				break;

			}

		}

	}

}

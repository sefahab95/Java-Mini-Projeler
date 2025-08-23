package Giris;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month, day;

        System.out.print("Doğduğunuz ay (1-12): ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün (1-31): ");
        day = input.nextInt();

        String horoscope = "";
        boolean isError = false;

        if (month >= 1 && month <= 12) {
            switch (month) {
                case 1: // Ocak
                    if (day >= 1 && day <= 31) {
                        if (day < 22) {
                            horoscope = "Oğlak";
                        } else {
                            horoscope = "Kova";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 2: // Şubat
                    if (day >= 1 && day <= 29) {
                        if (day < 20) {
                            horoscope = "Kova";
                        } else {
                            horoscope = "Balık";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 3: // Mart
                    if (day >= 1 && day <= 31) {
                        if (day < 21) {
                            horoscope = "Balık";
                        } else {
                            horoscope = "Koç";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 4: // Nisan
                    if (day >= 1 && day <= 30) {
                        if (day < 21) {
                            horoscope = "Koç";
                        } else {
                            horoscope = "Boğa";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 5: // Mayıs
                    if (day >= 1 && day <= 31) {
                        if (day < 22) {
                            horoscope = "Boğa";
                        } else {
                            horoscope = "İkizler";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 6: // Haziran
                    if (day >= 1 && day <= 30) {
                        if (day < 23) {
                            horoscope = "İkizler";
                        } else {
                            horoscope = "Yengeç";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 7: // Temmuz
                    if (day >= 1 && day <= 31) {
                        if (day < 23) {
                            horoscope = "Yengeç";
                        } else {
                            horoscope = "Aslan";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 8: // Ağustos
                    if (day >= 1 && day <= 31) {
                        if (day < 23) {
                            horoscope = "Aslan";
                        } else {
                            horoscope = "Başak";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 9: // Eylül
                    if (day >= 1 && day <= 30) {
                        if (day < 23) {
                            horoscope = "Başak";
                        } else {
                            horoscope = "Terazi";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 10: // Ekim
                    if (day >= 1 && day <= 31) {
                        if (day < 23) {
                            horoscope = "Terazi";
                        } else {
                            horoscope = "Akrep";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 11: // Kasım
                    if (day >= 1 && day <= 30) {
                        if (day < 22) {
                            horoscope = "Akrep";
                        } else {
                            horoscope = "Yay";
                        }
                    } else {
                        isError = true;
                    }
                    break;
                case 12: // Aralık
                    if (day >= 1 && day <= 31) {
                        if (day < 22) {
                            horoscope = "Yay";
                        } else {
                            horoscope = "Oğlak";
                        }
                    } else {
                        isError = true;
                    }
                    break;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı tuşlama yaptınız. Lütfen geçerli bir ay ve gün girin.");
        } else {
            System.out.println("Burcunuz: " + horoscope);
        }
    }
}



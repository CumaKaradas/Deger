import java.util.Scanner;

public class Deger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.println("Değiştirilmeden Önce:");
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // Geçici bir değişken kullanarak iki sayının değerini değiştirme
        int gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;

        System.out.println("\nDeğiştirildikten Sonra:");
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        scanner.close();
    }
}

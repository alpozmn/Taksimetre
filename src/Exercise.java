import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        double km, tutar;

        // Kullanıcıdan km bilgisini al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = scanner.nextDouble();
        scanner.close();

        // Taksimetre hesaplama
        tutar = 10 + km * 2.20;

        // Minimum tutar kontrolü
        tutar = (tutar < 20) ? 20 : tutar;

        // Sonucu ekrana yazdır
        System.out.println("Taksimetre Tutarı: " + tutar + " TL");
    }
}
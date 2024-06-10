import java.util.Scanner;

public class HitungOptik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nPilih perhitungan yang akan dilakukan:");
            System.out.println("1. Menghitung jari-jari kelengkungan cermin");
            System.out.println("2. Menghitung kekuatan lensa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda (1, 2, atau 3): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jarak fokus (f) dalam cm: ");
                    double fCermin = scanner.nextDouble();
                    double R = hitungJariJariKelengkungan(fCermin);
                    
                    System.out.printf("Jari-jari kelengkungan cermin adalah: %.2f cm\n", R);
                    break;

                case 2:
                    System.out.print("Masukkan panjang titik fokus lensa (f) dalam meter: ");
                    double fLensa = scanner.nextDouble();

                    double P = hitungKekuatanLensa(fLensa);

                    System.out.printf("Kekuatan lensa adalah: %.2f D\n", P);
                    break;

                case 3:
                    System.out.println("Keluar dari program. Terima kasih!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }

    public static double hitungJariJariKelengkungan(double f) {
        return 2 * f;
    }
    
    public static double hitungKekuatanLensa(double f) {
        return 1 / f;
    }
}

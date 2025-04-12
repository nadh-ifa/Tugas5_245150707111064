public class Aritmatika {

    // Method static untuk penjumlahan dua bilangan
    public static void penjumlahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil Penjumlahan: " + hasil);
    }

    // Method static untuk pengurangan dua bilangan
    public static void pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil Pengurangan: " + hasil);
    }

    // Method non-static untuk perkalian dua bilangan
    public void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil Perkalian: " + hasil);
    }

    // Method non-static untuk pembagian dua bilangan
    public void pembagian(double a, double b) {
        if (b != 0) { // validasi pembagi tidak nol
            double hasil = a / b;
            System.out.println("Hasil Pembagian: " + hasil);
        } else {
            System.out.println("Tidak bisa dibagi dengan nol!");
        }
    }

    // Method untuk menyederhanakan pecahan
    public void sederhana(int pembilang, int penyebut) {
        int gcd = gcd(pembilang, penyebut); // mencari pembagi terbesar
        pembilang /= gcd;
        penyebut /= gcd;
        System.out.println("Pecahan Sederhana: " + pembilang + "/" + penyebut);
    }

    // Method bantu untuk mencari GCD (Greatest Common Divisor)
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}

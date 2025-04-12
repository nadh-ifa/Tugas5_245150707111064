import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Untuk input dari user
        Jaket jaket = new Jaket(); // Membuat objek jaket

        // Input jumlah jaket A
        System.out.print("Masukkan jumlah jaket A yang dibeli: ");
        int a = input.nextInt();
        jaket.beliJaketA(a);

        // Input jumlah jaket B
        System.out.print("Masukkan jumlah jaket B yang dibeli: ");
        int b = input.nextInt();
        jaket.beliJaketB(b);

        // Input jumlah jaket C
        System.out.print("Masukkan jumlah jaket C yang dibeli: ");
        int c = input.nextInt();
        jaket.beliJaketC(c);

        // Menampilkan total akhir
        jaket.tampilkanTotal();
    }
}

public class Jaket {
    // Harga jaket A, B, dan C sebagai konstanta (final)
    public static final int HARGA_A = 100000;
    public static final int HARGA_B = 125000;
    public static final int HARGA_C = 175000;

    private int totalHarga = 0; // Menyimpan total harga seluruh pembelian

    // Method pembelian jaket A dengan diskon jika beli > 100
    public void beliJaketA(int jumlah) {
        int harga = (jumlah > 100) ? 95000 : HARGA_A;
        totalHarga += harga * jumlah;
        System.out.println("Total Jaket A: Rp " + (harga * jumlah));
    }

    // Method pembelian jaket B dengan diskon jika beli > 100
    public void beliJaketB(int jumlah) {
        int harga = (jumlah > 100) ? 120000 : HARGA_B;
        totalHarga += harga * jumlah;
        System.out.println("Total Jaket B: Rp " + (harga * jumlah));
    }

    // Method pembelian jaket C dengan diskon jika beli > 100
    public void beliJaketC(int jumlah) {
        int harga = (jumlah > 100) ? 160000 : HARGA_C;
        totalHarga += harga * jumlah;
        System.out.println("Total Jaket C: Rp " + (harga * jumlah));
    }

    // Menampilkan total seluruh pembelian
    public void tampilkanTotal() {
        System.out.println("Total Pembayaran: Rp " + totalHarga);
    }
}

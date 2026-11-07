package pbo.responsi;

public class pembayaran_transaksi extends tangki implements pengisi, pembayaran {
    private String metodeBayar;
    private double uangDiterima;
    private double totalBelanja;

    public pembayaran_transaksi(String namabensin, double hargabensin, double totalBelanja, String metodeBayar, double uangDiterima) {
        super(namabensin, hargabensin);
        this.totalBelanja = totalBelanja;
        this.metodeBayar = metodeBayar;
        this.uangDiterima = uangDiterima;
    }

    // Implementasi dari interface pengisi
    @Override
    public void mulaiisi(double liter) {
        System.out.println("Pengecekan ulang meteran untuk pembayaran: " + liter + " liter terkonfirmasi.");
    }

    // Implementasi dari interface pembayaran
    @Override
    public void bayar(String metodebayar) {
        System.out.println("Memproses pembayaran melalui kasir dengan metode: " + metodebayar);
    }

    @Override
    public void pengisian() {
        System.out.println("Status pengisian bahan bakar telah selesai di area pompa.");
    }

    @Override
    public void totalbayar() {
        System.out.println("Total tagihan bensin " + getnamabensin() + " adalah: Rp " + totalBelanja);
    }

    public void cetakStruk() {
        System.out.println("\n==========================================");
        System.out.println("          STRUK PEMBAYARAN SPBU           ");
        System.out.println("==========================================");
        System.out.println("Jenis BBM     : " + getnamabensin());
        System.out.println("Harga/Liter   : Rp " + gethargabensin());
        System.out.println("Total Tagihan : Rp " + totalBelanja);
        bayar(this.metodeBayar);

        if (uangDiterima >= totalBelanja) {
            double kembalian = uangDiterima - totalBelanja;
            System.out.println("Uang Diterima : Rp " + uangDiterima);
            System.out.println("Kembalian     : Rp " + kembalian);
            System.out.println("Status Bayar  : LUNAS / BERHASIL");
            setpenuh(true);
        } else {
            System.out.println("Uang Diterima : Rp " + uangDiterima);
            System.out.println("Status Bayar  : GAGAL (Uang tidak cukup!)");
            setpenuh(false);
        }
        System.out.println("==========================================");
    }
}
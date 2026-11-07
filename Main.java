package pbo.responsi;
class Main {
    public static void main(String[] args) {
        pbo.responsi.pengisian isiPertalite = new pbo.responsi.pengisian("Pertalite", 10000.0, 50000);
        System.out.println("Jenis BBM     : " + isiPertalite.getnamabensin());
        System.out.println("Harga / Liter : Rp " + isiPertalite.gethargabensin());
        System.out.println("Kapasitas Max : " + isiPertalite.getmaxtank() + " ml\n");
        isiPertalite.mulaiisi(20000.0); // Mengisi senilai Rp 20.000
        System.out.println("Status Tangki Penuh? : " + isiPertalite.getispenuh() + "\n");
        pengisi layananPompa = new pengisian("Pertamax", 13500.0, 120000);
        layananPompa.mulaiisi(50000.0); // Akan memicu percabangan batas max tangki
        pbo.responsi.pembayaran_transaksi transaksiKasir = new pembayaran_transaksi(
                "Pertamax Turbo", 15500.0, 77500.0, "QRIS", 100000.0
        );
        transaksiKasir.pengisian();
        transaksiKasir.totalbayar();
        transaksiKasir.cetakStruk();
    }
}
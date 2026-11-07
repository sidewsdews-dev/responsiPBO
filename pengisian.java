package pbo.responsi;
public class pengisian extends tangki implements pengisi{
    private int jumlahisi;
    private int batasisi;
    private int jumlah;
    public pengisian(String namabensin, double hargabensin, int batasisi) {
        super(namabensin, hargabensin); // Super Chaining (Syarat 5)
        this.jumlahisi = 0;
        this.batasisi = batasisi;
    }
    public pengisian(String namabensin, double hargabensin, int batasisi, int jumlahisi) {
        super(namabensin, hargabensin);
        this.jumlahisi = jumlahisi;
        this.batasisi = batasisi;
    }

    @Override
    public void mulaiisi(double hargaisi) {
        if (batasisi >= getmaxtank()) {
            System.out.println("Maaf, tidak bisa mengisi karena melewati batas kapasitas tangki!");
            setpenuh(true);
        } else {
            setpenuh(false);
            double literDapat = hargaisi / gethargabensin();
            System.out.println("Mengisi " + getnamabensin() + " sebanyak " + String.format("%.2f", literDapat) + " liter.");
            for (double i = 0; i <= hargaisi; i += 1000) {
                if(i==hargaisi){
                    System.out.println("pengisian selesai");
                    jumlah= (int) i;
                }else{
                    System.out.println(i);
                }
            }
        }
    }

    @Override
    public void pengisian() {
        System.out.println("Proses pengisian BBM sedang berjalan...");
    }

    @Override
    public void totalbayar() {
        double temp = jumlah * gethargabensin();
        settotaltransaksi((int) temp);
    }
}

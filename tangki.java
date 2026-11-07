package pbo.responsi;

public abstract class tangki{
    private static final double maxtank = 100000;
    private final double hargabensin;
    private boolean ispenuh;
    private boolean hidup;
    private String namabensin;
    private int totaltransaksi;
    public abstract void pengisian();
    public abstract void totalbayar();
    public double gethargabensin(){
        return hargabensin;
    }
    public tangki(String namabensin, double hargabensin){
        this.namabensin = namabensin;
        this.hargabensin = hargabensin;
    }
    public void matikanpengisian(boolean ispenuh){
        this.ispenuh = ispenuh;
    }
    public boolean getispenuh(){
        return ispenuh;
    }
    public void settotaltransaksi(int totaltransaksi){
        this.totaltransaksi=totaltransaksi;
    }
    public int gettotaltransaksi(){
        return totaltransaksi;
    }
    public String getnamabensin() {
        return namabensin;
    }
    public void setpenuh(boolean ispenuh){
        this.ispenuh=ispenuh;}
    public double getmaxtank(){
        return maxtank;
    }

}


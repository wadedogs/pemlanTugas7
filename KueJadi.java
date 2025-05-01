public class KueJadi extends Kue{
    private double jumlah;

    public KueJadi(String nama, double jumlah, double harga) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return harga*jumlah*2;
    }

    @Override
    public String toString() {
        return "Nama Kue Jadi: " + nama + "\nHarga: " + hitungHarga();
    }
}

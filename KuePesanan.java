public class KuePesanan extends Kue{
    private double berat;

    public KuePesanan(String nama, double berat, double harga) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        return harga*berat*2;
    }

    @Override
    public String toString() {
        return "Nama Kue Pesanan: " + nama + "\nHarga: " + hitungHarga();
    }
}

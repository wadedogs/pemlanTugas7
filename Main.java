public class Main {
    public static void main(String[] args) {
        Kue daftarKue[] = new Kue[20];
        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalHargaJadi = 0;
        double totalBerat = 0;
        double totalJumlah = 0;

        daftarKue[0] = new KueJadi("Croissant", 15, 25000);
        daftarKue[1] = new KuePesanan("Tiramisu", 1.2, 120000);
        daftarKue[2] = new KuePesanan("Cheesecake", 0.8, 150000);
        daftarKue[3] = new KueJadi("Macaron", 30, 10000);
        daftarKue[4] = new KuePesanan("Black Forest", 0.5, 180000);
        daftarKue[5] = new KueJadi("Cupcake", 20, 15000);
        daftarKue[6] = new KuePesanan("Red Velvet", 1.5, 90000);
        daftarKue[7] = new KueJadi("Eclair", 12, 20000);
        daftarKue[8] = new KuePesanan("Opera Cake", 0.6, 200000);
        daftarKue[9] = new KuePesanan("Chocolate Mousse", 1.0, 110000);
        daftarKue[10] = new KueJadi("Madeleine", 25, 8000);
        daftarKue[11] = new KueJadi("Cannoli", 18, 12000);
        daftarKue[12] = new KuePesanan("Carrot Cake", 1.3, 95000);
        daftarKue[13] = new KueJadi("Profiterole", 15, 18000);
        daftarKue[14] = new KuePesanan("Pavlova", 0.7, 130000);
        daftarKue[15] = new KuePesanan("Sachertorte", 0.9, 170000);
        daftarKue[16] = new KueJadi("Baklava", 10, 22000);
        daftarKue[17] = new KuePesanan("Dobos Torte", 0.8, 160000);
        daftarKue[18] = new KueJadi("Churros", 20, 15000);
        daftarKue[19] = new KueJadi("Danish Pastry", 15, 17000);

        Kue kueMahal = daftarKue[13];

        System.out.println("=== Daftar Semua Kue ===");
        for (Kue kue : daftarKue) {
            System.out.println(kue);
            double harga = kue.hitungHarga();
            totalHarga += harga;

            if (kue instanceof KuePesanan) {
                totalHargaPesanan += harga;
                totalBerat += ((KuePesanan) kue).getBerat();
            } else if (kue instanceof KueJadi) {
                totalHargaJadi += harga;
                totalJumlah += ((KueJadi) kue).getJumlah();
            }

            if (harga > kueMahal.hitungHarga()) {
                kueMahal = kue;
            }
        }
        System.out.println("\n========================");
        System.out.println("Total Harga Semua Kue      : Rp" + totalHarga);
        System.out.println("Total Harga Kue Pesanan    : Rp" + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan    : " + totalBerat + " kg");
        System.out.println("Total Harga Kue Jadi       : Rp" + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi      : " + (int) totalJumlah + " Kue");
        System.out.println("\nKue dengan harga tertinggi:");
        System.out.println(kueMahal);
        System.out.println("\n========================");
    }
}

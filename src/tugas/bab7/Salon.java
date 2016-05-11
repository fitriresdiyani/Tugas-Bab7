package Bab7;
public abstract class Salon {
    private String nama,jenis;
    private final double potong = 15000, creambath = 45000, smoothing = 200000, coloring = 150000, toning = 60000;
    private final double bodyspa = 250000, facial = 50000, manicure =20000, pedicure= 30000;
    private final double maskerwajah = 80000, zaitun= 650000, scrub = 85000, aromatherapy = 300000, maskerrambut = 60000,  lulur = 100000;
    protected double harga, diskonanggota;
    
    public Salon (String nama){
        this.nama = nama;        
    }
    public Salon(String nama, double diskonanggota) {
        this.nama = nama;
        this.diskonanggota = diskonanggota;
    }
    public String getNama() {
        return nama;
    }
    public void setHargaProduk(int a){
     if (a<7 && a!=0){
         jenis = "produk";
        if (a==1)
            this.harga = maskerwajah;
        else if (a==2)
            this.harga = maskerrambut;
        else if (a==3)
            this.harga = zaitun;
        else if (a==4)
            this.harga = lulur;
        else if (a==5)
            this.harga = scrub;
        else if (a==6)
            this.harga = aromatherapy;
     }
     else {
         jenis= "layanan";
        if (a==7)
            this.harga = potong;
        else if (a==8)
            this.harga = creambath;
        else if (a==9)
            this.harga = smoothing;
        else if (a==10)
            this.harga = coloring;
        else if (a==11)
            this.harga = toning;
        else if (a==12)
            this.harga = bodyspa;
        else if (a==13)
            this.harga = facial;
        else if (a==14)
            this.harga = manicure;
        else if (a==15)
            this.harga = pedicure;
    }
    }
    public double getHarga(){   
        return harga;
    }
    public String getJenis(){
        return jenis;
    }
    
    public void menu(){
        System.out.println("----------PILIHAN MENU----------");
        System.out.println("Produk Salon");
        System.out.println(" 1. Masker Wajah   : Rp.  80.000");
        System.out.println(" 2. Masker Rambut  : Rp.  60.000");
        System.out.println(" 3. Minyak Zaitun  : Rp.  65.000");
        System.out.println(" 4. Lulur          : Rp. 100.000");
        System.out.println(" 5. Scrub          : Rp.  85.000");
        System.out.println(" 6. Aromatherapy   : Rp. 300.000");
        System.out.println("Perawatan Salon");
        System.out.println(" 7. Potong Rambut  : Rp.  15.000");
        System.out.println(" 8. Creambath      : Rp.  45.000");
        System.out.println(" 9. Smoothing      : Rp. 200.000");
        System.out.println("10. Coloring       : Rp. 150.000");
        System.out.println("11. Toning         : Rp.  60.000");
        System.out.println("12. Body Spa       : Rp. 250.000");
        System.out.println("13. Facial         : Rp.  50.000");
        System.out.println("14. Manicure       : Rp.  20.000");
        System.out.println("15. Pedicure       : Rp.  30.000");
        System.out.println("--------------------------------");
    }
    public abstract double getDiskon();
    public abstract double getTotal();

}

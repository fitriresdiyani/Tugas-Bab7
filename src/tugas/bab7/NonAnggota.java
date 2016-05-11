package Bab7;
public class NonAnggota extends Salon{
    
    public NonAnggota(String nama) {
        super(nama);
        super.menu();
    }
    public double getDiskon() {
         return 0;
    }
    public double getTotal() {
         return super.getHarga();
    }
    public String toString() {
        return "Nama   : "+ super.getNama()+"\nNon Member"+"\nDiskon  : "+getDiskon()+"%"+"\nTotal  : "+getTotal(); 
    }
}

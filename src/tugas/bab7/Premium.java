package Bab7;
public class Premium extends Salon {
    private String noId, member;
    private double diskonpremium = 20;
    public Premium (String nama,double diskonanggota, String Id, String member) {
        super(nama,diskonanggota);
        this.noId = Id;
        this.member = member; 
        super.menu();
    }
    public String getMember(){
        return member;
    }
    public String getId(){
        return noId;
    }
    public double getDiskon() {
        if (super.getJenis().equalsIgnoreCase("layanan"))
            return diskonpremium;
        else if (super.getJenis().equalsIgnoreCase("produk")) 
            return super.diskonanggota;
        else 
        return 0;
    }
    public double getTotal() {
        return super.getHarga() - (super.getHarga()*(getDiskon()/100));
    }
    public String toString() {
        return "Nama   : "+ super.getNama()+"\nMember : "+getMember() +"\nNo ID  : "+getId()+"\nDiskon : "+getDiskon() + "%"+"\nTotal  : "+getTotal(); 
    }
}

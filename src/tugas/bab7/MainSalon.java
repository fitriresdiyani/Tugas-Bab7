package Bab7;

import java.util.Scanner;

public class MainSalon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, jenis, member, id, ulang = null;
        double diskon;
        int pilihan;
        System.out.println(" SELAMAT DATANG DI SALON FILKOM ");
        do {
            System.out.print("Masukkan nama : ");
            nama = in.next();
            System.out.print("Apakah anda memiliki member (y/n)? ");
            jenis = in.next();
            if (jenis.equalsIgnoreCase("y")) {
                System.out.print("Jenis Member (Premium, Gold, Silver) : ");
                member = in.next();
                System.out.print("Masukkan ID Anda : ");
                id = in.next();
                System.out.print("Masukkan diskon untuk hari ini : ");
                diskon = in.nextDouble();
                switch (member) {
                    case "Premium":
                        Salon customer = new Premium(nama, diskon, id, member);
                        System.out.print("Masukkan pilihan Anda : ");
                        pilihan = in.nextInt();
                        customer.setHargaProduk(pilihan);
                        customer.getHarga();
                        customer.getDiskon();
                        customer.getTotal();
                        System.out.println("---------------------------------");
                        System.out.println(customer);
                        break;
                    case "Gold":
                        Salon customer1 = new Gold(nama, diskon, id, member);
                        System.out.print("Masukkan pilihan Anda : ");
                        pilihan = in.nextInt();
                        customer1.setHargaProduk(pilihan);
                        customer1.getHarga();
                        customer1.getDiskon();
                        customer1.getTotal();
                        System.out.println("---------------------------------");
                        System.out.println(customer1);
                        break;
                    case "Silver":
                        Salon customer2 = new Silver(nama, diskon, id, member);
                        System.out.print("Masukkan pilihan Anda : ");
                        pilihan = in.nextInt();
                        customer2.setHargaProduk(pilihan);
                        customer2.getHarga();
                        customer2.getDiskon();
                        customer2.getTotal();
                        System.out.println("---------------------------------");
                        System.out.println(customer2);
                        break;
                    default : System.out.println("Jenis member tidak ditemukan");
                   }
            } else {
                Salon customer3 = new NonAnggota(nama);
                System.out.print("Masukkan pilihan Anda : ");
                pilihan = in.nextInt();
                customer3.setHargaProduk(pilihan);
                customer3.getHarga();
                customer3.getDiskon();
                customer3.getTotal();
                System.out.println("---------------------------------");
                System.out.println(customer3);
            }
            System.out.println("==========================================");
            System.out.print("Apakah Anda ingin input data kembali (y/n)?");
            ulang = in.next();
        } while (ulang.equalsIgnoreCase("y"));
    }
}

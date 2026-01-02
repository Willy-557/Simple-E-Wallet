// Class: Akun (NamaPemilik, Pin, Saldo).

// topUp(double jumlah): Tambah saldo.
// bayar(double jumlah): Kurangi saldo. (Wajib cek saldo cukup atau tidak).
// transfer(Akun penerima, double jumlah): Kurangi saldo pengirim, tambah saldo penerima.


import java.util.Scanner;
import java.util.HashMap;

class akun {
    String namaPemilik;
    double saldoPemilik;

    public akun(String namaPemilik, int saldoPemilik) {
        this.namaPemilik = namaPemilik;
        this.saldoPemilik = saldoPemilik;
    }

    void cekSaldo() {
        System.out.println("\nNama Rekening : " + this.namaPemilik);
        System.out.println("Saldo Rekening : " + this.saldoPemilik);
    }

    void tampilkanPemilik () {
        System.out.println("\nSelamat datang '" + this.namaPemilik + "'!");
    }

    void tampilkanNama(){
        System.out.println("Nama Rekening : " + this.namaPemilik);
    }

    public void topUp (int jumlah){
        this.saldoPemilik += jumlah;
    }

    public void transferAntarRekening (int uangTf){
        if (uangTf > this.saldoPemilik){
            
        }
    }
}

public class FileEWallet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Integer, akun> dataCustomer = new HashMap<>();

        while (true){
            System.out.println("\n===========");
            System.out.println("1. Log In");
            System.out.println("2. Sign In");
            System.out.println("3. Keluar");
            System.out.print(">> ");
            int opsi = scanner.nextInt();

            if (opsi == 3) {
                System.out.println("\nTerimakasih!");
                break;
            }
            else if (opsi > 3 || opsi < 0) {
                System.out.println("\nSilahkan memilih antara menu 1 dan menu 2");
            }
            else {
                if (opsi == 1) {
                    System.out.print("\nMasukkan no rekening: ");
                    int nomorRekening = scanner.nextInt();

                    if (!dataCustomer.containsKey(nomorRekening)){
                        System.out.println("\nNo Rekening yang anda masukkan belum dibuat / salah");
                        continue;
                    }
                    else {
                        akun ambilNama = dataCustomer.get(nomorRekening);
                        ambilNama.tampilkanPemilik();
                        
                        while (true){
                            System.out.println("\n=== E-Wallet ===");
                            System.out.println("1. Topup Saldo");
                            System.out.println("2. Cek Saldo");
                            System.out.println("3. Transfer antar rekening");
                            System.out.println("4. Keluar");
                            System.out.print(">> ");
                            int choice = scanner.nextInt();

                            if (choice == 4) {
                                System.out.println("\nTerimakasih!");
                                break;
                            }
                            else if (choice > 4 || choice < 0) {
                                System.out.println("\nMasukkan antara menu 1 sampai menu 4!");
                                continue;
                            }
                            else {
                                switch (choice) {
                                    case 1:
                                        System.out.print("\nMasukkan uang yang ingin di-top up: ");
                                        int saldoDariLuar = scanner.nextInt();

                                        akun tambahDataSaldo = dataCustomer.get(nomorRekening);
                                        if (saldoDariLuar < 0) {
                                            System.out.println("\nSaldo yang di-topup kan tidak boleh kurang dari 0 atau 0");
                                            break;
                                        }
                                        else {
                                            tambahDataSaldo.topUp(saldoDariLuar);
                                            System.out.println("\nSaldo berhasil di-tambahkan!");
                                            break;
                                        }
                                        

                                    case 2:
                                        akun lihatDataCustomer = dataCustomer.get(nomorRekening);
                                        lihatDataCustomer.cekSaldo();
                                    
                                    case 3:
                                        System.out.print("\nMasukkan no rekening yang ingin di-transfer: ");
                                        int nomorRekeningTf = scanner.nextInt();

                                        if (!dataCustomer.containsKey(nomorRekeningTf)){
                                            System.out.println("\nNo rekening '" + nomorRekeningTf + "' tidak ada di dalam sistem");
                                        }
                                        else {
                                            akun dataAkun = dataCustomer.get(nomorRekeningTf);
                                            System.out.println("\nNo rekening : " + nomorRekeningTf);
                                            dataAkun.tampilkanNama();
                                            System.out.print("\nMasukkan saldo yang ingin di-transfer: ");
                                            int saldoTf = scanner.nextInt();

                                            
                                        }

                                }
                            }
                            
                        }
                    }
                }
                        
                else if (opsi == 2) {
                    System.out.print("\nMasukkan No Rekening Baru: ");
                    int noRek = scanner.nextInt();

                    scanner.nextLine();
                    System.out.print("Masukkan nama: ");
                    String namaBaru = scanner.nextLine();

                    int saldoBaru = 0;
                    akun akunBaru = new akun(namaBaru, saldoBaru);

                    if (dataCustomer.containsKey(noRek)) {
                        System.out.println("\nNo rekening yang anda input sudah ada di dalam sistem, silahkan ganti Nomor Rekeningnya atau langsung Log In!");
                        continue;
                    }
                    else {
                        dataCustomer.put(noRek, akunBaru);
                        System.out.println("\nBerhasil membuat rekening a/n. '" + namaBaru + "'.");
                        
                    }
                        
                }
            }
        }
    }
}
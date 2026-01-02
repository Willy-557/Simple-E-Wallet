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
        System.out.println("Nama Rekening : " + this.namaPemilik);
        System.out.println("Saldo Rekening : " + this.saldoPemilik);
    }

    public void topUp (int jumlah){
        this.saldoPemilik += jumlah;
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
                switch (opsi) {
                    case 1:
                        System.out.print("\nMasukkan no rekening: ");
                        int nomorRekening = scanner.nextInt();

                        if (!dataCustomer.containsKey(nomorRekening)){
                            System.out.println("\nNo Rekening yang anda masukkan belum dibuat / salah");
                            break;
                        }
                        else {
                            while (true){
                                System.out.println("\nSelamat datang!");
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
                                                System.out.println("Saldo tidak boleh kurang dari 0 atau 0");
                                            }
                                            else {
                                                tambahDataSaldo.topUp(saldoDariLuar);
                                                System.out.println("\nSaldo berhasil di-tambahkan!");
                                                break;
                                            }
                                            

                                        case 2:
                                            akun lihatDataCustomer = dataCustomer.get(nomorRekening);
                                            lihatDataCustomer.cekSaldo();
                                    }
                                }
                            }
                            



                        }
                        
                    case 2:
                        System.out.print("\nMasukkan No Rekening Baru: ");
                        int noRek = scanner.nextInt();

                        scanner.nextLine();
                        System.out.print("Masukkan nama: ");
                        String namaBaru = scanner.nextLine();

                        int saldoBaru = 0;

                        akun akunBaru = new akun(namaBaru, saldoBaru);

                        dataCustomer.put(noRek, akunBaru);

                        System.out.println("\nBerhasil membuat rekening a/n. '" + namaBaru + "'.");
                }
            }
        }
    }
}
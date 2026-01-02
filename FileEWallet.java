// Class: Akun (NamaPemilik, Pin, Saldo).

// topUp(double jumlah): Tambah saldo.
// bayar(double jumlah): Kurangi saldo. (Wajib cek saldo cukup atau tidak).
// transfer(Akun penerima, double jumlah): Kurangi saldo pengirim, tambah saldo penerima.


import java.util.Scanner;
import java.util.HashMap;

class akun {
            String namaPemilik;
            int pinPemilik;
            double saldoPemilik;

            public akun(String namaPemilik, int pinPemilik, double saldoPemilik) {
                this.namaPemilik = namaPemilik;
                this.pinPemilik = pinPemilik;
                this.saldoPemilik = saldoPemilik;

            }

            void cekSaldo() {
                System.out.println("Nama Rekening : " + this.namaPemilik);
                System.out.println("Saldo Rekening : " + this.saldoPemilik);
            }

            int topUp (double jumlah){
                double saldoPemilik = saldoPemilik + jumlah;
                return saldoPemilik;
            }
        }

public class FileEWallet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Integer, akun> dataCustomer = new HashMap<>();

        System.out.println("==================");
        System.out.println("1. Masukkan no rekening");
        Sys

        System.out.println("=== E-Wallet ===");
        System.out.println("1. Topup Saldo");
        System.out.println("2. Cek Saldo");
        System.out.println("3. Transfer antar rekening");
        System.out.println("4. ");

    }
}
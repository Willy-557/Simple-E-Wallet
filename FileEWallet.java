// Class: Akun (NamaPemilik, Pin, Saldo).

// topUp(double jumlah): Tambah saldo.
// bayar(double jumlah): Kurangi saldo. (Wajib cek saldo cukup atau tidak).
// transfer(Akun penerima, double jumlah): Kurangi saldo pengirim, tambah saldo penerima.


import java.util.Scanner;
import java.util.HashMap;

public class FileEWallet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Integer, akun> dataCustomer = new HashMap<>();

        class akun {
            String namaPemilik;
            int pinPemilik;
            double saldoPemilik;

            public akun(String namaPemilik, int pinPemilik, double saldoPemilik) {
                this.namaPemilik = namaPemilik;
                this.pinPemilik = pinPemilik;
                this.saldoPemilik = saldoPemilik;

            }

            int topUp (){
                double tambahSaldo = saldoPemilik + saldoLuar;
                return tambahSaldo;
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SinglyLinkedList<Buku> linkedList = new SinglyLinkedList<>();

        while (true) {
            System.out.println(
                    "Pilih Salah Satu Fitur \n 1.Tambah Buku\n 2.Hapus Buku\n 3.Cetak Daftar Buku\n 4.Selesai");

            int pilihan = s.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan Judul Buku: ");
                String judulBuku = s.next();
                System.out.print("Masukkan Nama Penulis: ");
                String penulis = s.next();
                System.out.print("Masukkan Tahun Terbit: ");
                int tahun = s.nextInt();
                Buku buku = new Buku(judulBuku, penulis, tahun);
                while (true) {
                    System.out.print("Pilih Posisi Input\n 1.Depan\n 2.Belakang\n");
                    int pilihan1 = s.nextInt();

                    if (pilihan1 == 1) {
                        linkedList.inserAtFront(buku);
                        break;
                    } else if (pilihan1 == 2) {
                        linkedList.inserAtBack(buku);
                        break;
                    } else {
                        System.out.println("Masukkan Pilihan Yang Valid");
                        continue;
                    }
                }
            } else if (pilihan == 2) {
                while (true) {
                    System.out.print("Pilih Bagian Mana Yang Akan Dihapus\n1.Depan\n2.Belakang\n");
                    int pilihan2 = s.nextInt();
                    if (pilihan2 == 1) {
                        linkedList.removeFromFront();
                        break;
                    } else if (pilihan2 == 2) {
                        linkedList.removeFromBack();
                        break;
                    } else {
                        System.out.println("Pilihan Tidak Valid");
                        continue;
                    }
                }
            } else if (pilihan == 3) {
                linkedList.print();
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Pilihan Tidak Tersedia");
            }

        }
    }
}

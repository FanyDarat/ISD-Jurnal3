import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenArray<ATK> alatTulisKantorList = new GenArray<>(5);
        GenArray<BAG> bagList = new GenArray<>(5);

        for (int i = 0; i < 2; i++) {
            System.out.println("Masukkan Barang ATK");
            String kodeBarang = input.next();
            String jenisBarang = input.next();
            String namaBarang = input.next();
            int stokBarang = input.nextInt();
            System.out.println("Data masuk! ");
            input.nextLine();
            ATK alatTulisKantor = new ATK(kodeBarang, jenisBarang, namaBarang, stokBarang);
            alatTulisKantorList.addData(alatTulisKantor);
        }

        System.out.println("Data beres");

        for (int i = 0; i < 1; i++) {
            System.out.println("Masukkan Barang Bag");
            String kodeBarang = input.next();
            String jenisBarang = input.next();
            String namaBarang = input.next();
            int stokBarang = input.nextInt();
            System.out.println("Data masuk!");
            input.nextLine();
            BAG bag = (new BAG(kodeBarang, jenisBarang, namaBarang, stokBarang));

            bagList.addData(bag);
        }

        // alatTulisKantorList.addData(new ATK("A001", "Alat Tulis", "Spidol", 5));
        // bagList.addData(new BAG("C001", "Penyimpanan", "Tas", 5));

        alatTulisKantorList.displayShort();
        bagList.displayShort();

        // alatTulisKantorList.removeData("A01");
        // bagList.removeData("B01");
        // alatTulisKantorList.display();
        // bagList.display();

    }
}
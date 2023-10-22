package mahasiswasearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Jumlah Mahasiswa: ");
            int jlh = scan.nextInt();

            String[] data = new String[jlh];

            for (int x = 0; x < data.length; x++) {
                System.out.print("Masukkan nama mahasiswa ke-" + (x + 1) + " : ");
                data[x] = scan.next();
            }

            System.out.print("\nData Mahasiswa: ");
            for (int x = 0; x < data.length; x++)
                System.out.print(data[x] + " ");

            SortingUtil sortingUtil = new SortingUtil();
            sortingUtil.sort(data);

            System.out.println();
            System.out.print("Sorting: ");

            for (int x = 0; x < data.length; x++)
                System.out.print(data[x] + " ");

            System.out.print("\nNama Mahasiswa yang dicari: ");
            String cari = scan.next();

            BinarySearchUtil binarySearchUtil = new BinarySearchUtil();
            SearchResult result = binarySearchUtil.search(data, cari);

            if (result.isFound()) {
                System.out.println(
                        "\nMahasiswa dengan nama " + cari + " ditemukan pada index ke-" + result.getIndex() + "\n"
                                + "dan iterasi ke-" + result.getIterations());
            } else {
                System.out.println("\nMahasiswa dengan nama " + cari + " tidak ditemukan");
            }
        }
    }
}
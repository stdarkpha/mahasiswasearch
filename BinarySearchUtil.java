package mahasiswasearch;

public class BinarySearchUtil {
    public SearchResult search(String[] data, String target) {
        int awal = 0;
        int akhir = data.length - 1;
        int tengah;
        int count = 0;
        int iterasi = 0;

        while (awal <= akhir) {
            tengah = (awal + akhir) / 2;
            iterasi++;

            if (data[tengah].equalsIgnoreCase(target)) {
                return new SearchResult(true, tengah, iterasi);
            } else if (data[tengah].compareToIgnoreCase(target) < 0) {
                awal = tengah + 1;
            } else {
                akhir = tengah - 1;
            }

            // Cek worst case
            if (iterasi > data.length) {
                count++;
            }

            // Batasan untuk worst case
            if (count == 3) {
                break;
            }
        }

        return new SearchResult(false, -1, iterasi);
    }
}
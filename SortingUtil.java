package mahasiswasearch;

public class SortingUtil {
    public void sort(String[] data) {
        String temp = "";
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data.length; y++) {
                if (x == y)
                    continue;

                else {
                    if (data[x].compareToIgnoreCase(data[y]) < 0) {
                        temp = data[y];
                        data[y] = data[x];
                        data[x] = temp;
                    }
                }
            }
        }
    }
}
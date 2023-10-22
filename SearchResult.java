package mahasiswasearch;

public class SearchResult {
    private boolean found;
    private int index;
    private int iterations;

    public SearchResult(boolean found, int index, int iterations) {
        this.found = found;
        this.index = index;
        this.iterations = iterations;
    }

    public boolean isFound() {
        return found;
    }

    public int getIndex() {
        return index;
    }

    public int getIterations() {
        return iterations;
    }
}
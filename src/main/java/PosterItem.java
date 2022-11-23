public class PosterItem {
    private String productName;
    private String genreName;
    private int id;

    public PosterItem(String productName, String genreName, int id) {
        this.productName = productName;
        this.genreName = genreName;
        this.id = id;
    }
    public int getId() {
        return id;
    }

}

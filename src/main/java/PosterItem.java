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

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}

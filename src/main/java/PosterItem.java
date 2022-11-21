public class PosterItem {
    private String productName;
    private String genreName;

    public PosterItem(String productName, String genreName) {
        this.productName = productName;
        this.genreName = genreName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}

public class PosterRepository {
    private PosterItem[] items = new PosterItem[0];

    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {
        return items;
    }

    public void removeById(int id) {
        PosterItem[] tmp = new PosterItem[items.length - 1];
        int copyToIndex = 0;
        for (PosterItem item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public void removeAll() {
        PosterItem[] tmp = new PosterItem[items.length - items.length];
        items = tmp;
    }

    public void findById(int id) {
        PosterItem[] tmp = new PosterItem[items.length];
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId() == id) {
                tmp[i] = items[i];
            }
            else {
                tmp[i] = null;
            }
        }
        items = tmp;
    }

    public PosterItem[] getItems() {
        return items;
    }


}

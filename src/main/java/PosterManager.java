public class PosterManager {
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

    public PosterItem[] findLast1() {

        int resultLength;
        if (items.length > 10) {
            resultLength = 10;
        } else {
            resultLength = items.length;
        }
        PosterItem[] reversed = new PosterItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }


    public PosterItem[] findLast2(int length) {

        int resultLength;
        if (items.length > length) {
            resultLength = length;
        } else {
            resultLength = items.length;
        }
        PosterItem[] reversed = new PosterItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }

}






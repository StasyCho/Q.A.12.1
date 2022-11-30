public class PosterManager {
    private PosterRepository repo;
    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }
   // public void add(PosterItem item) {
      //  repo.save(item);
   // }

    public PosterItem[] findAll() {
        PosterItem[] all = repo.findAll();
        return all;
    }
}






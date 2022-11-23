import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {

    PosterRepository repo = new PosterRepository();

    PosterItem item1 = new PosterItem("Бладшот", "боевик", 1);
    PosterItem item2 = new PosterItem("Вперёд", "мультфильм", 5);
    PosterItem item3 = new PosterItem("ОтельБелград", "комедия", 25);
    PosterItem item4 = new PosterItem("Джентльмены", "боевик", 24);
    PosterItem item5 = new PosterItem("Человек-невидимка", "ужасы", 36);
    PosterItem item6 = new PosterItem("Тролли.Мировой тур", "мультфильм", 62);
    PosterItem item7 = new PosterItem("Номер один", "комедия", 28);
    PosterItem item8 = new PosterItem("Слон", "триллер", 14);
    PosterItem item9 = new PosterItem("Покерфейс", "боевик", 15);
    PosterItem item10 = new PosterItem("Любовники", "комедия", 8);
    PosterItem item11 = new PosterItem("Грозный папа", "приключения", 9);

    @Test
    public void test() {

        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);
        repo.save(item11);

       PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        PosterItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllItems1() {

        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);
        repo.save(item11);

        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        PosterItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeBiId() {
        PosterRepository repo = new PosterRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);
        repo.save(item11);
        repo.removeById(item2.getId());

        PosterItem[] expected = {item1, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        PosterItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void removeAll() {
        PosterRepository repo = new PosterRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);
        repo.save(item11);
        repo.removeAll();

        PosterItem[] expected = {};
        PosterItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findById() {
        PosterRepository repo = new PosterRepository();

        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);
        repo.save(item11);

        repo.findById(item3.getId());

        PosterItem[] expected = {null, null, item3, null, null, null, null, null, null, null, null,};
        PosterItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }


}

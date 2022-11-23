import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PosterManagerTest {

    PosterManager manager = new PosterManager();

    PosterItem item1 = new PosterItem("Бладшот", "боевик");
    PosterItem item2 = new PosterItem("Вперёд", "мультфильм");
    PosterItem item3 = new PosterItem("ОтельБелград", "комедия");
    PosterItem item4 = new PosterItem("Джентльмены", "боевик");
    PosterItem item5 = new PosterItem("Человек-невидимка", "ужасы");
    PosterItem item6 = new PosterItem("Тролли.Мировой тур", "мультфильм");
    PosterItem item7 = new PosterItem("Номер один", "комедия");
    PosterItem item8 = new PosterItem("Слон", "триллер");
    PosterItem item9 = new PosterItem("Покерфейс", "боевик");
    PosterItem item10 = new PosterItem("Любовники", "комедия");
    PosterItem item11 = new PosterItem("Грозный папа", "приключения");

    // @BeforeEach
    // public void setup() {
    //  manager.save(item1);
    //  manager.save(item2);
    //  manager.save(item3);
    //   manager.save(item4);
    //   manager.save(item5);
    //   manager.save(item6);
    //   manager.save(item7);
    //   manager.save(item8);
    //   manager.save(item9);
    //   manager.save(item10);
    //   manager.save(item11);
    //   }

    @Test
    public void test() {

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);

        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllItems1() {

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);

        PosterItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        PosterItem[] actual = manager.findLast1();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllItems2() {

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);

        PosterItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast1();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldReverseAllItems3() {

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);

        PosterItem[] expected = {item11, item10, item9, item8, item7};
        PosterItem[] actual = manager.findLast2(5);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllItems4() {

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);

        PosterItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast2(11);

        Assertions.assertArrayEquals(expected, actual);
    }
}

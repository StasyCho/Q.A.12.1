import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PosterManagerTest {

    PosterManager manager = new PosterManager();

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
    public void shouldReverseAllItems1() {

        PosterItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        PosterItem[] actual = manager.findLast1();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllItems2() {

        PosterItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast1();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldReverseAllItems3() {

        PosterItem[] expected = {item11, item10, item9, item8, item7};
        PosterItem[] actual = manager.findLast2(5);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllItems4() {


        PosterItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast2(11);

        Assertions.assertArrayEquals(expected, actual);
    }
}

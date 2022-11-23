import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


public class PosterManagerTest {

    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);

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








}

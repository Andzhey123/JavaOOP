package DZ2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Family m = new Family("Иван");
        m.birth("Алексей", "Иван");
        m.birth("Михаил", "Иван");
        m.birth("Виктор", "Михаил");
        List<String> list = m.getallChildren();
        System.out.println(list.toString());
        Brother ivan = new Brother("Алексей", "Станислав");
        Brother gosha = new Brother("Виктор", "Георгий");
        Brother pir = new Brother("Виктор", "Макс");
        ivan.display();
        gosha.display();
        pir.display();
    }
}

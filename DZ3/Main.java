package DZ3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Family m = new Family("Иван");
        m.addChild("Алексей", "Иван");
        m.addChild("Михаил", "Иван");
        m.addChild("Виктор", "Михаил");
        m.addChild("Кирилл", "Виктор");
        m.addChild("Андрей", "Кирилл");
        List<String> list = m.getallChildren();
        System.out.println(list.toString());
        Brother stanislav = new Brother("Алексей", "Станислав");
        Brother gosha = new Brother("Виктор", "Георгий");
        Brother max = new Brother("Виктор", "Макс");
        stanislav.display();
        gosha.display();
        max.display();
        Collections.sort(list);
        System.out.println("Члены семьи в алфавитном порядке:\n" + list);

    }
}

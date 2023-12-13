package weekThirteen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapNotes {
    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        System.out.println(capitals);

        System.out.println(capitals.containsValue("Paris"));

        capitals.replace("Japan", "Kyoko");

        System.out.println(capitals);
        capitals.remove("Japan");

        capitals.putIfAbsent("Japan", "Tokyo");
        System.out.println(capitals);

        capitals.remove("France");
        System.out.println(capitals);
        System.out.println(capitals.containsValue("Paris"));
    }
}

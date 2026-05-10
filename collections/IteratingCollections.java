import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class IteratingCollections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");

        System.out.println("\nUsing for loop: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nUsing for-each loop: ");

        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("\nUsing Iterator: ");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        Stack<String> s2 = new Stack<>();
        s2.push("First");
        s2.push("Second");
        s2.push("Third");

        while (!s2.isEmpty()) {
            System.out.println(s2.pop()); // pops from top
        }
    }
}

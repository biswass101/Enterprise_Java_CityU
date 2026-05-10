import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");

        System.out.println(list);


        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Hello");
        linkedList.add("World");

        System.out.println(linkedList);

        Stack<String> stack = new Stack<>();

        stack.push("Butter");
        stack.push("Chicken");

        stack.pop();

        stack.push("Brandy");

        System.out.println(stack);


        HashSet<String> set = new HashSet<>();

        set.add("niloy");
        set.add("robi");
        set.add("niloy");

        System.out.print(set);

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "niloy");
        map.put(2, "robi");
        map.put(3, "niloy");

        System.out.print(map);
    }
}
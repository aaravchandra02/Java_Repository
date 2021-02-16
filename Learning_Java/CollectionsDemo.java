package Learning_Java;

import java.util.*;

public class CollectionsDemo {

    public static void ListDemo() {
        List<String> l1 = new ArrayList<String>();
        for (int i = 65; i < 76; i++) {
            String temp = "John " + (char) (i);
            l1.add(temp);
        }
        System.out.println("\n ArrayList Elements");
        System.out.println("\t" + l1);
        System.out.println(l1.hashCode());
    }

    public static void LinkedListDemo() {
        List<String> l1 = new LinkedList<String>();
        l1.add("John");
        l1.add("Doe");
        l1.add("James");
        System.out.println("\n LinkedList Elements");
        System.out.print("\t" + l1 + "\n");
    }

    public static void HashSetDemo() {
        Set<String> l1 = new HashSet<String>();
        l1.add("John");
        l1.add("Doe");
        l1.add("James");
        System.out.println("\n HashSet Elements");
        System.out.print("\t" + l1 + "\n");
    }

    public static void HashMapDemo() {
        Map<String, Integer> l1 = new HashMap<String, Integer>();
        l1.put("John", 01);
        l1.put("Doe", 02);
        l1.put("James", 03);
        System.out.println("\n HashMap Elements");
        System.out.print("\t" + l1 + "\n\n");
    }

    public static void main(String[] args) throws Exception {
        ListDemo();
        LinkedListDemo();
        HashSetDemo();
        HashMapDemo();
    }
}
package ExercisesToHome;

import java.util.Map;
import java.util.TreeMap;
/*
Stwórz metodę, która przyjmuje TreeMap i wypisuje w konsoli pierwszy i ostatni EntrySet.
 */


public class MainTreeMap {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Niebieski", 3);
        map.put("Czerwony", 4);
        map.put("Zielony", 1);

        System.out.println("pierwszy element" + map.firstEntry() + ", ostatni element" + map.lastEntry());
    }
}

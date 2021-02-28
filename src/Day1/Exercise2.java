package Day1;
/*Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba, a
następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: <k>, Wartość: <v>. Na końcu
każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
Przykład:
Klucz: Java, Wartość: 18,
Klucz: Python, Wartość: 1,
...
Klucz: PHP, Wartość: 0.
*/

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Python", 1);
        map.put("PHP", 0);
        wypisz(map);
    }

    public static void wypisz(Map<String, Integer> map) {
        Integer i = 0;
        for (String key : map.keySet()) {
            System.out.println("klucz: " + key + ", Wartość: " + map.get(key));
            i++;


            if (map.size() > i) {
                System.out.println(",");

            } else {
                System.out.println(".");
            }
        }

    }

}

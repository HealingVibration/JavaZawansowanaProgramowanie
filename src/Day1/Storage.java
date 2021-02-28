package Day1;

import java.util.*;

/*Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
addToStorage(String key, String value) → dodawanie elementów do przechowywalni
printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
*/
public class Storage {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("A1", "Pionek");
        storage.addToStorage("A2", "Figura");
        storage.addToStorage("A3", "Człowiek");
        storage.addToStorage("A2", "Maszyna");
        storage.addToStorage("A4", "Pionek");
        storage.printValues("A2");
        storage.findValue("Pionek");
    }

    private final Map<String, List<String>> map;

    public Storage() {
        this.map = new HashMap<>();

    }

    public void addToStorage(String key, String value) {
        if (!map.containsKey(key)) {
            List<String> list = new ArrayList<>();
            map.put(key, list);
        }
        List<String> list = map.get(key);
        list.add(value);


    }

    public void printValues(String key) {


        System.out.println(map.get(key));


    }


    public void findValue(String value) {

        Set<Map.Entry<String, List<String>>> entries = map.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
           if( entry.getValue().contains(value)){
               System.out.println(entry.getKey());
           }

        }

    }

}

package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*Stwórz klasę Zoo, która będzie posiadała zbiór zwierząt oraz pozwalała na otrzymywanie statystyk
        na temat posiadanych zwierząt: int getNumberOfAllAnimals() → zwraca liczbę wszystkich zwierząt
        Map getAnimalsCount() → zwraca liczbę zwierząt każdego gatunku
        Map getAnimalsCountSorted() → zwraca liczbę zwierząt każdego gatunku
        posortowaną na podstawie ilości zwierząt danego gatunku, gdzie pierwszym
        elementem zawsze jest gatunek z największą ilością zwierząt void addAnimals(String, int)
        → dodaje n zwierząt danego gatunku
*/
public class ZOO {
    List<Animal> list = new ArrayList<>();





    public int getNumberOfAllAnimals() {
        return list.size();
    }



    public void addAnimals(String name, int numberOfAnimals){

        if(list.stream().anyMatch(animal -> name.equals(animal.getName()))) {
            list.stream().filter(animal -> name.equals(animal.getName())).findAny().get().add(numberOfAnimals);
        }else{

            Animal animal = new Animal(name, numberOfAnimals);
            list.add(animal);

        }


    }


}

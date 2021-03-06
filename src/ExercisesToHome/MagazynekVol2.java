package ExercisesToHome;

import java.util.ArrayList;
import java.util.List;

/*
Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru
magazynka za pomocą konstruktora. Zaimplementuj metody:
loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej
naboi niż wynosi pojemność magazynka
nie
isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy
shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden - ostatni
załadowany nabój i przygotowuje kolejny, załadowany przed ostatnim, jeżeli nie ma więcej nabojów to
wypisuje w konsoli “pusty magazynek”
 */
public class MagazynekVol2 {

    List<String> list;
    Integer numberOfBullet;
    Integer sizeOfmagazine;

    public MagazynekVol2(Integer sizeOfmagazine) {
        this.list = new ArrayList();
        this.numberOfBullet = 0;
        this.sizeOfmagazine = sizeOfmagazine;
    }


    public void loadMagazine(String bullet) {
        if (numberOfBullet < sizeOfmagazine) {
            list.add(bullet);
            numberOfBullet++;
        } else {
            System.out.println("za dużo");
        }
    }


    public boolean isLoaded() {
        if (numberOfBullet > 0) {
            System.out.println("W magazynku znajdują się naboje");
            return true;
        } else {
            System.out.println("Magazynek jest pusty");
            return false;
        }
    }



    public void shot(){
        if(numberOfBullet > 0) {
            System.out.println(list.get(numberOfBullet-1));
            list.remove(numberOfBullet-1);
            numberOfBullet--;
        }else {
            System.out.println("pusty magazynek");
        }
    }


}

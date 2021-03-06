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
public class Magazynek {
    String[] magazine;
    Integer sizeOfMagazine;
    Integer numberOfBullet = 0;

    public Magazynek(Integer sizeOfMagazine) {
        this.sizeOfMagazine = sizeOfMagazine;
        this.magazine = new String[sizeOfMagazine];
    }

    public void loadBullet(String bullet) {
        if (numberOfBullet < sizeOfMagazine) {
            magazine[numberOfBullet] = bullet;
            numberOfBullet++;
            System.out.println("dodanie naboju do magazynka");
        } else {
            System.out.println("za dużo naboi");
        }
    }

    public boolean isLoaded() {
        for (int i = 0; i < magazine.length - 1; i++) {
            if (numberOfBullet == 0) {
                System.out.println("magazynek jest pusty");
                return false;
            } else {
                System.out.println("magazynek jest naładowany chociaż jednym nabojem");
                return true;
            }
        }
        return false;
    }
    public void shot() {

        numberOfBullet--;
        if(numberOfBullet==0){
            System.out.println("pusty magazynek");
        }
    }
}

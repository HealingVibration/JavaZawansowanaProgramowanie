package Day1;

import java.util.Set;

/*
Zaimplementuj klasę SDAHashSet<E> , która będzie implementować logikę HashSet<E>. W tym celu
zaimplementuj obsługę metod:
•
•
•
•
•
add
remove
size
contains
clear

 */
public class Exercise4 {

    public static void main(String[] args) {


        Set<String> set = new SDAHashSet<>();
        set.add("Hotel");
        set.add("Motel");
        set.add("Willa");
        System.out.println(set);
        set.remove("Motel");
        System.out.println(set);
    }

}

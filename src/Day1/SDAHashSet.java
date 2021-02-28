package Day1;

import java.util.HashSet;
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

public class SDAHashSet<E> extends HashSet<E> {


    public SDAHashSet(){

    }

    @Override
    public int size(){
        return super.size();
    }

    @Override
    public boolean add(E e) {
        boolean isAdd;
        isAdd = super.add(e);
        return isAdd;
    }

    @Override
    public boolean remove(Object o){
        return super.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public void clear() {
        super.clear();
    }
}

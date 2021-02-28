package Day1;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Exercise1 {
    public static List<String> sortZA(List<String> list) {
        list.sort((s, secoundString) -> s.toLowerCase().compareTo(secoundString.toLowerCase())*(-1));

        return list;

    }


    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        List<String> listaDwa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            String doWpisania = scanner.nextLine();
            lista.add(doWpisania);
        }


        listaDwa.add("C");
        listaDwa.add("T");
        listaDwa.add("q");

        for(String element:listaDwa){
            element.toLowerCase();


        }


        listaDwa.sort(Comparator.reverseOrder());

        System.out.println(listaDwa);
        sortZA(lista);
        System.out.println(lista);

    }


}

package Day1;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static List<String> sortZA(List<String> list) {
        list.sort((o11, o21) -> o11.compareTo(o21));

        return list;

    }


    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            String doWpisania = scanner.nextLine();
            lista.add(doWpisania);
        }
        sortZA(lista);
        System.out.println(lista);

    }


}

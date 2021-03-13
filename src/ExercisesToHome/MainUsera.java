package ExercisesToHome;

import java.util.List;

public class MainUsera {
    //map
    public static void main(String[] args) {
    User user = new User("Koniczynka");


        for (User element:user.addUserToList()) {
            System.out.println(element.name);
        }
    }

}

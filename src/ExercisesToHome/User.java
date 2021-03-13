package ExercisesToHome;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    BankAccount banckAqount;


    public User(String name) {
        this.name = name;


    }

    public List<User> addUserToList() {
        List<User> userList = new ArrayList<>();
        this.getBanckAqount(banckAqount = new BankAccount("pomocDlaPotrzebujących"));
        userList.add(new User("Carrick"));

        return userList;
    }


    public BankAccount getBanckAqount(BankAccount banckAqount) {
        return banckAqount;
    }

    public String getName() {
        return this.name;
    }

}

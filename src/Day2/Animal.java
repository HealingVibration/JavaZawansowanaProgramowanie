package Day2;

public class Animal {

    private String name;
    private int number;
    private String type;

    public Animal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void add(int number){
        this.number += number;
    }


}

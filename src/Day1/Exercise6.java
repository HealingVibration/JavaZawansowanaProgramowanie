package Day1;

public class Exercise6 {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(25, 20, 20, 14, true );
        if(parcel.validate(parcel)){
            System.out.println("przesyłka jest OK");
        }
    }



}

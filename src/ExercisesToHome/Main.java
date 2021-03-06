package ExercisesToHome;

public class Main {
    public static void main(String[] args) {
        Magazynek magazynek = new Magazynek(6);

        magazynek.loadBullet("jeden");
        magazynek.loadBullet("dwa");
        magazynek.loadBullet("trzy");
        magazynek.loadBullet("cztery");
   //     magazynek.loadBullet("pięć");
    //    magazynek.loadBullet("sześć");

        magazynek.isLoaded();


        magazynek.shot();
        magazynek.shot();
    }

}

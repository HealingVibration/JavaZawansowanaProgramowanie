package ExercisesToHome;

public class MainDwaMagazynekVol2 {
    public static void main(String[] args) {

        MagazynekVol2 magazynek = new MagazynekVol2(12);

        magazynek.loadMagazine("strzałka");
        magazynek.loadMagazine("y");
        magazynek.loadMagazine("i");

        magazynek.isLoaded();

        magazynek.shot();
        magazynek.shot();
        magazynek.shot();

        magazynek.isLoaded();

        magazynek.loadMagazine("łubudubu");

        magazynek.loadMagazine("pif");

        magazynek.shot();
    }
}

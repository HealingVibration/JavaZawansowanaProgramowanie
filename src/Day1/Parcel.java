package Day1;

public class Parcel implements Validator {

    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }


    @Override
    public boolean validate(Parcel input) {

        if (sumIsCorrect(input) && singleDimensionIsCorrect(input) && isWeightCorrect(input)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sumIsCorrect(Parcel input) {
        float sum;
        sum = input.getyLength() + input.getxLength() + input.getzLength();
        if (sum < 300) {
            return true;
        } else {
            return false;
        }
    }

    public boolean singleDimensionIsCorrect(Parcel input) {
        if (input.getzLength() < 30 && input.getxLength() < 30 && input.getyLength() < 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWeightCorrect(Parcel input) {
        if (30.0 > input.getWeight() && input.getWeight() > 15.0 ) {
            input.setExpress(false);
            return input.isExpress();
        }else if (input.getWeight()<15.0){
            input.setExpress(true);
            return input.isExpress();
        }else{
            System.out.println("waga jest nieprawidłowa");
            return false;
        }


    }


}

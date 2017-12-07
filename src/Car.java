
public class Car {
    private String color;
    private int horsePower;
    private double engineSize;
    private String make;
    private static int count = 0;

    public Car(){
        this("White", 240, 2.0, "Land Rover");

    }

    public Car(String color, int horsePower, double engineSize, String make){
        this.color = color;
        this.horsePower = horsePower;
        this.engineSize = engineSize;
        this.make = make;
        count++;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public void setEngineSize(double engineSize) {

        this.engineSize = engineSize;
    }

    public void setHorsePower(int horsePower) {

        this.horsePower = horsePower;
    }

    public boolean equals(Car car){
        return this.color.equals(car.color) && this.horsePower == car.horsePower && this.engineSize == car.engineSize && this.make.equals(car.make);

    }


    public static int getCount() {
        return count;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public double getEnginSize() {
        return engineSize;
    }

    public int getHorsePower(){
        return horsePower;
    }



}

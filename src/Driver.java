import javax.swing.JOptionPane;

public class Driver {

    public static void main(String [] args) {

        Car myCar;
        Car hisCar;
        Car herCar;

        myCar = new Car();
        hisCar = new Car("Black", 400, 3.5, "Honda");
        herCar = new Car("Pink", 300, 2.5, "Volks");

        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);

        myCar.setColor("White");
        myCar.setHorsePower(240);
        myCar.setEngineSize(2.0);
        myCar.setMake("Land Rover");

        hisCar.setColor("White");
        hisCar.setHorsePower(240);
        hisCar.setEngineSize(2.0);
        hisCar.setMake("Land Rover");

        herCar.setColor("White");
        herCar.setHorsePower(240);
        herCar.setEngineSize(2.0);
        herCar.setMake("Land Rover");

        JOptionPane.showMessageDialog(null, myCar.getColor() + " " + myCar.getHorsePower() + " " + myCar.getEnginSize() + " " + myCar.getMake());
        JOptionPane.showMessageDialog(null, hisCar.getColor() + " " + hisCar.getHorsePower() + " " + hisCar.getEnginSize() + " " + hisCar.getMake());
        JOptionPane.showMessageDialog(null, herCar.getColor() + " " + herCar.getHorsePower() + " " + herCar.getEnginSize() + " " + herCar.getMake());

        JOptionPane.showMessageDialog(null, "Numbers of car(s): " + Car.getCount());
        JOptionPane.showMessageDialog(null, "Is myCar the same as hisCar?" + myCar.equals(hisCar));
        JOptionPane.showMessageDialog(null, "Is myCar the same as herCar?" + myCar.equals(herCar));
        JOptionPane.showMessageDialog(null, "Is herCar the same as hisCar?" + herCar.equals(hisCar));
    }
}

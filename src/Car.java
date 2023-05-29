public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car --> startEngine");
    }

    public void drive(){

        runEngine();
        System.out.println("Car --> driving, type is " + getClass().getSimpleName());
    }

    protected void runEngine(){

        System.out.println("Car --> runEngine");
    }


}

class GasPoweredCar extends Car {
    private double TopSpeed;
    private int Cylinder = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double topSpeed, int Cylinder) {
        super(description);
        TopSpeed = topSpeed;
        this.Cylinder = Cylinder;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas --> All %d BatterySize are fired up !%n", Cylinder);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas --> The Top speed is %f km/h%n", TopSpeed);
    }
}



class ElectricCar extends Car {
    private double TopSpeed;
    private int BatterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double topSpeed, int BatterySize) {
        super(description);
        TopSpeed = topSpeed;
        this.BatterySize = BatterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEW --> switch %d kWh battery on, Ready!%n", BatterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEW --> The Top speed is %f km/h%n", TopSpeed);
    }
}


class HybridCar extends Car {
    private double TopSpeed;
    private int BatterySize;
    private int Cylinder = 6;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double topSpeed, int Cylinder,int batterySize) {
        super(description);
        TopSpeed = topSpeed;
        this.Cylinder = Cylinder;
        this.BatterySize = BatterySize;
    }

    @Override
    public void startEngine() {
            System.out.printf("Hybrid --> %d Cylinders are fired up!%n", Cylinder);
            System.out.printf("Hybrid --> switch %d kWh battery on, Ready!%n", BatterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid --> The Top speed is %f km/h%n", TopSpeed);
    }
}
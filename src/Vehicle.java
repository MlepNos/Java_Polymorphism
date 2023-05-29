public class Vehicle {
    private boolean engine;
    protected int cylinders;
    private String name;
    private int wheels;


    public Vehicle(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels =4;
    }

    public void startEngine(){
        System.out.println("Vehicle --> Vehicles Engine is Starting");
    }

    public void accelerate(){
        System.out.println("Vehicle --> Vehicle is Accelerating");
    }

    public void brake(){
        System.out.println("Vehicle --> Vehicle is Braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}


class Mitsubishi extends Vehicle{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {

        System.out.printf("Mitsubishi --> Engine is Starting , %d Cylinders are Ready to go %n", getCylinders());
    }

    @Override
    public void accelerate() {
        System.out.printf("Mitsubishi --> Mitsubishi is Accelerating%n");
    }

    @Override
    public void brake() {
        System.out.printf("Mitsubishi --> Mitsubishi is Braking%n");
    }
}


class Holden extends Vehicle{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public void startEngine() {

        System.out.printf("Holden --> Engine is Starting , %d Cylinders are Ready to go %n", getCylinders());
    }

    @Override
    public void accelerate() {
        System.out.printf("Holden --> Holden is Accelerating%n");
    }

    @Override
    public void brake() {
        System.out.printf("Holden --> Holden is Braking%n");
    }
}



class Ford extends Vehicle{


    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {

        System.out.printf("Ford --> Engine is Starting , %d Cylinders are Ready to go %n", getCylinders());
    }

    @Override
    public void accelerate() {
        System.out.printf("Ford --> Ford is Accelerating%n");
    }

    @Override
    public void brake() {
        System.out.printf("Ford --> Ford is Braking%n");
    }
}

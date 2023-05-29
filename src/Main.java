// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
  We've said, that polymorphism really just means many forms.
  What we want to do in this challenge, is have our runtime code execute different behavior,for different objects

  Let's talk about what I want you to do in this challenge.
  This diagram shows a base class, Car, with one field, description, and three methods, startEngine(),
  drive() and runEngine().
  The first two methods should be declared as public.
  The method runEngine however, is protected, and it will only get called from the drive method in Car.

  And here, we've given you three types of subclasses, or three types of cars that you might find on the road.
  We have the GasPoweredCar, the ElectricCar, and the HybridCar.
  You can imagine that these three subclasses, might have different ways to start their engine, or drive,
  depending on their engine type.
  And each of these classes might have different variables or fields, that might be used in those methods.

  It's your job, to create this class structure in Java, and override some, or maybe all, of these methods appropriately.
  And you'll write code in a Main class and main method, that creates an instance of each of these classes,
  and that executes different behavior for each instance.
  At least one method should print the type of the runtime object.

         */

        Car car = new Car("2022 Blue Ferrari");
        runRace(car);

        Car BMW = new GasPoweredCar("2022 Red BMW",344,6);
        runRace(BMW);

        Car Toyota = new HybridCar("2012 Red Toyota",344,6,75);
        runRace(Toyota);

        Car Tesla = new ElectricCar("2012 Red Tesla",344,75);
        runRace(Tesla);
    }


    public static void runRace(Car car){

        car.startEngine();
        car.drive();
    }
}

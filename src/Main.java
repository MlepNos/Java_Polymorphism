// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle(8, "Truck");
        //CreateVehicle(vehicle);

        //Vehicle mitsubishi = new Mitsubishi(10,"Race Car");
        //CreateVehicle(mitsubishi);

        //or
        Vehicle car = new Vehicle(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Holden holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
    }


    public static void runRace(Car car){
        // This is the Function that we are using in Challange 1
        car.startEngine();
        car.drive();
    }


    public static void CreateVehicle(Vehicle vehicle){
        // This is the Function that we are using in Challange 1
        vehicle.startEngine();
        vehicle.accelerate();
        vehicle.brake();
    }
}





 /*
       Challange 1
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

          Example Imput:

        Car car = new Car("2022 Blue Ferrari");
        runRace(car);

        Car BMW = new GasPoweredCar("2022 Red BMW",344,6);
        runRace(BMW);

        Car Toyota = new HybridCar("2012 Red Toyota",344,6,75);
        runRace(Toyota);

        Car Tesla = new ElectricCar("2012 Red Tesla",344,75);
        runRace(Tesla);

        Example Output:
        Car --> startEngine
        Car --> runEngine
        Car --> driving, type is Car
        Gas --> All 6 BatterySize are fired up !
        Gas --> The Top speed is 344.000000 km/h
        Car --> driving, type is GasPoweredCar
        Hybrid --> 6 Cylinders are fired up!
        Hybrid --> switch 0 kWh battery on, Ready!
        Hybrid --> The Top speed is 344.000000 km/h
        Car --> driving, type is HybridCar
        BEW --> switch 75 kWh battery on, Ready!
        BEW --> The Top speed is 344.000000 km/h
        Car --> driving, type is ElectricCar
         */

 /*  Challange 2
For this exercise you will create four classes of vehicles. The first class should be named Vehicle.
This will be the base class for three other classes, Mitsubishi, Holden, and Ford.
The first class contains four member variables, or fields, with these names and conditions:
-engine of type boolean
-cylinders of type int
-name of type String
-wheels of type int

All four member variables should have private access.
The constructor should accept two parameters, cylinders and name. Also, all of these vehicles have an engine and four wheels.
So the other two fields should be set to default values.
In addition, there are five other methods These methods should be defined as described below:
-startEngine accepts no parameters and returns a message which says that the Vehicles's engine is starting.
-accelerate accepts no parameters and returns a message that says the Vehicles is accelerating.
-brake accepts no parameters and returns a message stating the Vehicles is braking.

The messages these methods return should somewhere contain the name of the class, Vehicle.
Two getter methods should also be defined here for the member variables cylinders and name. All methods have public access.
The other three classes mentioned above are sub-classes of Vehicles.
These classes have no member variables and the constructor for each will call the parent constructor for object instantiation.
Each of these classes will override the three parent methods startEngine, accelerate, and brake.
The return messages for these methods should somewhere contain the name of the class to which the methods belong.
  */
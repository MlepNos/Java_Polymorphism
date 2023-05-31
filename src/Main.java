// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {




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


INPUT EXAMPLE:
       Vehicle vehicle = new Vehicle(8, "Truck");
       CreateVehicle(vehicle);
       Vehicle mitsubishi = new Mitsubishi(10,"Race Car");
       CreateVehicle(mitsubishi);

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


       Challange 3

Bill runs a fast food hamburger restaurant, and sells hamburger meals.His meal orders are composed of three items, the hamburger, the drink, and the side item.
Your application lets Bill select the type of burgers, and some of the additional items, or extras, that can be added to the burgers, as well as the actual pricing.

You need a meal order.This should be composed of exactly one burger, one drink, and one side item.
The most common meal order should be created without any arguments, like a regular burger, a small coke, and fries, for example.
You should be able to create other meal orders, by specifying different burgers, drinks, and side items.
You need a drink, and side item.
The drink should have at least a type, size and price, and the price of the drink should change for each size.
The side item needs at least a type and price.

You need burgers.Every hamburger should have a burger type, a base price, and up to a maximum of three extra toppings.
The constructor should include only the burger type and price.
Extra Toppings on a burger need to be added somehow, and priced according to their type.
The deluxe burger bonus.
Create a deluxe burger meal, with a deluxe burger, that has a set price, so that any additional toppings do not change the price.
The deluxe burger should have room for an additional two toppings.

Your main method should have code to do the following:
Create a default meal, that uses the no arguments constructor.
Create a meal with a burger, and the drink and side item of your choice, with up to 3 extra toppings.
Create a meal with a deluxe burger, where all items, drink, side item and toppings up to 5 extra toppings, are included in the burger price.

For each meal order, you'll want to perform these functions:
Add some additional toppings to the burger.
Change the size of the drink.
Print the itemized list. This should include the price of the burger, any extra toppings, the drink price based on size, and the side item price.
Print the total due amount for the meal.

The diagram doesn't include the DeluxeBurger class.  We'll look at that a bit later.
The MealOrder class uses composition in this design. It's composed of a burger, as well as drink and side, which will just be Items.
I've used inheritance for the Item and Burger relationships, which means Burger is an Item.
Every Item has a name, type, price or base price, and a size.

Item has the method getBasePrice, which is really just a getter method for the price, but the name is more descriptive.
Item also has getAdjustedPrice, and the printItem method.
These methods will exhibit different behavior, based on the runtime type, and we know that's polymorphism.

For the burger, the toppings or extras are individual attributes, and also have the type Item.
We're going to use the MealOrder class, to hide some of the implementation details from the calling code.
This means we're going to use encapsulation techniques on MealOrder and Item.

EXAMPLE INPUT:
      MealOrder regularMeal = new MealOrder();
      regularMeal.printItemizedList();
      System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

      regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
      regularMeal.printItemizedList();
      System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

      MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
      secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
      secondMeal.setDrinkSize("SMALL");
      secondMeal.printItemizedList();

 EXAMPLE OUTPUT:
 BASE BURGER:  4.00
------------------------------
      REGULAR BURGER:  4.00
         MEDIUM COKE:  1.00
        MEDIUM FRIES:  1.50
------------------------------
         TOTAL PRICE:  6.50
+++++++++++++++++++++++++++++++++++++++++++++++++++++
         BASE BURGER:  4.00
               BACON:  1.50
              CHEESE:  1.00
                MAYO:  0.00
------------------------------
      REGULAR BURGER:  6.50
         MEDIUM COKE:  1.00
        MEDIUM FRIES:  1.50
------------------------------
         TOTAL PRICE:  9.00
+++++++++++++++++++++++++++++++++++++++++++++++++++++
         BASE BURGER:  4.00
             LETTUCE:  0.00
              CHEESE:  1.00
                MAYO:  0.00
------------------------------
       TURKEY BURGER:  5.00
          SMALL 7-UP:  0.50
        MEDIUM CHILI:  1.50
------------------------------
         TOTAL PRICE:  7.00

  */
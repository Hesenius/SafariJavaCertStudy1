package sealedstuff;

// if using the module system, all types in a sealed hierarchy must be in the same MODULE
// OTHERWISE all types must be in the same PACKAGE

//sealed interface Transporter permits Truck, Car, X {}
sealed interface Transporter /*permits Truck, Car, X*/ {}

final class Truck implements Transporter {}

//non-sealed class Car implements Transporter {}
//class Heinkel extends Car {}

//sealed class Car implements Transporter permits Heinkel {}
//final class Heinkel extends Car {}

record Car(int seats) implements Transporter {}

enum X implements Transporter {
  A, B, C {};
}

// class Bicycle implements Transporter {}

public class Example {
  public static void main(String[] args) {
    Transporter t = null;
    int canCarryLoad = 0;
    if (t instanceof Truck tr) {
      canCarryLoad = 20_000;
    } else if (t instanceof Car c) {
      canCarryLoad = (c.seats() - 1) * 170;
    }

    int loadToCarry = 1000;
    if (canCarryLoad >= loadToCarry) {
      System.out.println("We're good");
    }
  }
}

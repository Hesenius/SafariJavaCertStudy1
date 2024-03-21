package recordstuff;

import java.io.Serializable;

// record is an "unmodifiable" "data carrier"
// the "formal params" are called "components"
// the expression value of the components is stored as a private final field
// access these values using *method* e.g. description() *** no "GET"
// for free we get:
// "Canonical" constructor - simply takes and sets the component values
// component accessor methods (which are public and do not throw checked exceptions)
// equals (based on equals of the components) hashcode
// toString
//
// we can add static fields but NOT instance fields
// can add instance or static methods (both!)
// can "override" the auto-generated stuff (with some constraints--cannot use super)
// cannot use extends clause in a record declaration
// cannot extend a record (it's implicitly final)
// can implement interfaces (this is very relevant to sealed type hierarchies :)
record SalesItem(String description, int price) implements Serializable {
  // line n1
//  private int stockOnHand; // NOPE!!!
//  @Override public int price() { return price; } // OK :)
//  @Override public int price() { return super.price() + 10; } // NOPE
//  @Override int price() { return price; } // NOPE, must be public :)
//  @Override public int price() throws Exception { return price; } // NOPE, no checked exceptions
//  static String ourStore; // YUP :)
  public int getDiscount() { return price / 10; }

  @Override
  public String toString() {
//    return super.toString(); // NO SUPER
    return "I'm a SalesItem with description " + description;
  }
}

//  Which can be added individually at line n1?
//    A) private int stockOnHand;
//    B) @Override public int price() { return price; }
//    C) @Override public int price() { return super.price() + 10; }
//    D) static String ourStore;
//    E) public int getDiscount() { return price / 10; }

public class Ex1 {
  public static void main(String[] args) {
    SalesItem si1 = new SalesItem("Widget", 300);
    SalesItem si2 = new SalesItem("Widget", 300);
    SalesItem si3 = new SalesItem("Dodad", 200);

    System.out.println(si1);
    System.out.println(si1.description());
    System.out.println(si1.equals(si2));
    System.out.println(si1.equals(si3));
  }
}

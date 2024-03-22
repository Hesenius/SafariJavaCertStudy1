package interfacestuff;

interface IntX1 {
  default void doStuff() {
    System.out.println("IntX.doStuff()");
  }
}
interface IntY1 {
//  default void doStuff() {
//    System.out.println("IntY.doStuff()");
//  }

  static void sayHello() {
    System.out.println("Hello from IntY1");
  }
}

class XXX {
  public String toString() {
    return "I'm an XXX";
  }
}

class ClQ extends XXX implements IntX1, IntY1 {
  public void doStuff() {
    IntX1.super.doStuff();
  }

  @Override
  public String toString() {
    return super.toString() + " But really, I'm ClQ";
  }

  public void sayHi() {
//    this.sayHello(); // Interface methods CANNOT be invoked from object references
    IntY1.sayHello();
  }

}

public class Ex3 {
  public static void main(String[] args) {
    ClQ thing = new ClQ();
    System.out.println(thing.toString());
  }
}

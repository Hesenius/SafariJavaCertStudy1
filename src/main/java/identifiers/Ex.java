package identifiers;

class TP {
  static int x = 97;
}

class Thing extends TP {
//  /*static*/ int x = 99;

  /*static*/ void showIt() {
//    int x = 98;
    // instance prefix is allowed for accessing static field in a class (but NOT interface)
    System.out.println("x is " + this.x);
    System.out.println("x is " + x);
//    System.out.println("x is " + Thing.x);
    System.out.println("x is " + TP.x);
  }

  static void doStuff(/*final */Thing something) {
    System.out.println(something.x);
//    this = null; // implicitly final :)
  }
}

public class Ex {
  public static void main(String[] args) {
//    Thing.showIt();
  }
}

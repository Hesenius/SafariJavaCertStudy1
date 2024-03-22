package interfacestuff;

class C1 {
  public void doStuff() {
    System.out.println("C1.doStuff()");
  }
}
class C2 extends C1 {

}
interface IntA {
  default void doStuff() {
    System.out.println("IntA.doStuff()");
  }
}

interface IntB {
  void doStuff();
//  default void doStuff() {
//    System.out.println("IntB.doStuff()");
//  }
}

class ClA extends C2 implements IntA, IntB {
}

public class Ex1 {
  public static void main(String[] args) {
    new ClA().doStuff();

  }
}

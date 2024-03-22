package liskov;

public class Ex1 {
  protected int x = 99;
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
  static void doStat() {}
}

class Sub extends Ex1 {
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }
  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
  static void doStat() {}
}

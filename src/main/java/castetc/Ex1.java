package castetc;

/*final*/ /*sealed*/ class Base/* permits Sub*/ {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

/*final*/ /*non-sealed*/ class Sub extends Base {
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}

//class Sub2 extends Sub implements Runnable {
//
//  @Override
//  public void run() {
//
//  }
//}
public class Ex1 {
  public static void main(String[] args) {
    Base b = new Sub();
//    b.doOther ... nope, Base determines allowed methods etc.
    // Only "overrideable" stuff gets the "late-binding" or "polymorphic" behavior
    // and ONLY instance methods that are not final nor private are overridable
    b.doBaseStuff();
//    Base b = null;
//    ((Runnable) b).run();
  }

}

package nested;


class Outer1 {
  class Inner1 {
    private int y = 100;
    private int x = 200;

    Inner1(Outer1 Outer1.this) {

    }

    void doStuff(Inner1 this) {

    }

    // line n1
    static Inner1 makeOne() { return /*Outer1.this.*/new Outer1().new Inner1(); }
//    static Inner1 makeOne() { return new Inner1(); }
    void showX() {
      System.out.println("x is " + Outer1.this.x); }
  }
  private int x = 99;
  // line n2
//  static Inner1 makeOne() { return /*this.*/new Inner1(); }
//  static Inner1 makeOne() { return /*this.*/new Inner1(); }
}

//  and these method proposals:
//    void showX() { sop("x is " + x); }
//    void showY() { sop("y is " + y); }
//    void showAnotherY(Inner1 another) { sop("y is " + another.y); }
//static Inner1 makeOne() { return new Inner1(); }
public class Ex2 {
}

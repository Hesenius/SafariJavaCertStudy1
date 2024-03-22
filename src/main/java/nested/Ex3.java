package nested;

class OuterP {
  class InnerP1 {
    /*static*/ /*private*/ void doStuff() {
      System.out.println("InnerP1.doStuff()");
    }
  }
  class InnerP2 extends InnerP1 {
    /*static */public void doStuff() {
      System.out.println("InnerP2.doStuff()");
    }
  }
  public static void main(String[] args) {
    OuterP.InnerP1 op = new OuterP().new InnerP2();
    op.doStuff();
  }
}
public class Ex3 {
}

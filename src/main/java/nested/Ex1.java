package nested;

import java.util.function.Predicate;

public class Ex1 {
  public void doStuff() {
    /*final*/ int len = 3;
//    Predicate<String> ps = new Predicate<String>() {
    Predicate<String> ps = new Predicate<>() {
      @Override
      public boolean test(String s) {
        return s.length() > len; // line n1
//        System.out.println("testing lines " + (++len));
      }
    };
    // line n2
//    System.out.println("testing lines " + (++len));
  }
}

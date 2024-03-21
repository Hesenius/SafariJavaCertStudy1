package enumstuff;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

enum Suit { HEARTS, DIAMONDS, CLUBS, SPADES ;
  final boolean isTrumps() { return this == HEARTS; }
}

public class Ex2 {
  public static void main(String[] args) {
    Class<?> cl = Suit.class;
    Method [] methods = cl.getDeclaredMethods();
    for (Method m : methods) {
      System.out.println(m);
    }
    System.out.println(cl.getModifiers() & Modifier.FINAL);
  }
}

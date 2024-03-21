package overrides;

public class Resolution {
  // Ambiguity at a step stops the process, and causes compilation failure.

  // simple widening FIRST
  static void doStuff(int x, int y) {}         // Method A
  static void doStuff(int x, long y) {}        // Method B
  static void doStuff(long x, int y) {}        // Method C

  // Varargs is THIRD
  static void doStuff(int ... x) {}            // Method D
  static void doStuff(int a, int ... x) {}            // Method D

  // autoboxing (and perhaps widening to NUMBER (not from int to LONG) SECOND
  static void doStuff(Integer x, Integer y) {} // Method E
  static void doStuff(Integer x, Number y) {} // Method E
  static void doStuff(Number x, Integer y) {} // Method E

  public static void main(String[] args) {
    doStuff(1, 2);
  }
}

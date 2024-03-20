package initializevars;

public class Ex {
  public static void main(String[] args) {
    // narrowing conversions for INITIALIZING numeric types smaller than int
    // valid with an int "constant expression"
//    char x = 99;
    final int num = 99;
    char x = num; // OK (but not if num were long)

    // Java 1.0
    char c = (char)99; // HAD TO CAST in original Java

//    int var = 99;
    var var = 99; // var is NOT a keyword, it's context sensitive special identifier

//    int goto = 0; // NOPE, goto is a (unused) keyword!
  }
}

//class var {}
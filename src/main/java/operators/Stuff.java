package operators;

public class Stuff {
  /*
  arithmetic operators in Java always produce the larger of the two operand types
  but AT LEAST INT
   */
  public static void main(String[] args) {
    int i1 = 99;
    long i2 = 1;
    var i3 = i1 + i2;

    // division follows this rule!!!

    var d1 = 10 / 3;
    System.out.println(d1);
    var d2 = 10.0 / 3;
    System.out.println(d2);

    short s1 = 9;
    short s2 = 1;
//    short s3 = s1 + s2; // NO ! result is AT LEAST INT

    // short circuit
//    String s = "Hello";
    String s = null;
    boolean isLong = s != null && s.length() > 3;
    System.out.println(isLong);


  }
}

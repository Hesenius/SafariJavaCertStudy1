package constantpool;

import moreconstants.X;

public class Examples {
  public static void main(String[] args) {
    String s1 = "Hello"; // added to a region of the *classfile* for "constants"
    CharSequence s2 = "Hello";
    System.out.println(s1 == s2);
    System.out.println("about to refer to X!");
    System.out.println(s1 == X.msg);

    String c1 = "<customer>";
    String c2 = "<cus";
    c2 += "tomer>";
    System.out.println(c1 == c2);
    c2 = c2.intern();
    System.out.println(c1 == c2);

  }
}

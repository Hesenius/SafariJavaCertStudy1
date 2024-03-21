package instanceofstuff;

public class Ex1 {
  public static void main(String[] args) {
    String s = "Hello";
//    if (s instanceof Integer) {}

    Object obj = "x";
//    Object obj = 9;
//    Object obj = "Hello";
    boolean answered = false;
    if (obj instanceof String) {
//      ((String)obj).length() // expression has type...
      String str = (String)obj;
      if (str.length() > 3) {
        System.out.println(str);
        answered = true;
      }
    }
    if (!answered) System.out.println("Nope");

//    boolean itsALongString = obj instanceof String s1 && s1.length() > 3;
//    if (itsALongString) {
////      System.out.println(s1);
//      System.out.println(obj);
//
//    }
    if (obj instanceof String s1 && s1.length() > 3) {
      System.out.println(s1);
    } else {
//      System.out.println(s1);
    }
//    System.out.println(s1);

/*    do {
// this would "kill" access on the print outside the loop
//      if (Math.random() > 10) break;
    } while (!(obj instanceof String s1 && s1.length() > 3));
    System.out.println(s1);
    */

    System.out.println("-------------------------");
    System.out.println(obj instanceof String str && str.length() > 3 ? str : "Nope");
    System.out.println("-------------------------");
    if (!(obj instanceof String str) || str.length() <= 3)
      System.out.println("Nope");
    else
      System.out.println(str);
  }
}

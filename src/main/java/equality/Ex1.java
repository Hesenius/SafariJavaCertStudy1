package equality;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Ex1 {
  public static void main(String[] args) {
//    String s = "Hello";
//    String t = "He";
//    t += "llo";
//    System.out.println(s == t);

//    String s = "Hello";
//    String t = "He";
//    t += "llo";
//    System.out.println(s.equals(t));

//    StringBuilder s = new StringBuilder("Hello");
//    StringBuilder t = new StringBuilder("He");
//    t.append("llo");
//    System.out.println(s.equals(t));

    List<String> ls = List.of("Fred", "Jim");
    List<String> ls2 = new ArrayList<>(ls);
    System.out.println(ls.equals(ls2));

    LocalDate ld = LocalDate.of(2021, 3, 29);
    LocalDate ld2 = LocalDate.of(2021, 3, 29);
    System.out.println(ld.equals(ld2));
    LocalDate ld3 = ld.withDayOfMonth(20);
    System.out.println(ld);
    System.out.println(ld2);
    System.out.println(ld3);

    String s1 = "Hello";
//    String s2 = s1.toUpperCase();
    s1 = s1.toUpperCase();
    System.out.println(s1);
//    System.out.println(s2);
  }

}

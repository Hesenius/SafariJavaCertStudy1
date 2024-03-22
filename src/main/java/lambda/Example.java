package lambda;

import java.util.List;

@FunctionalInterface
interface StudentCriterion {
  boolean test(Student s);
}

class Student {
  public int getGpa() { return 0; }
  public List<String> getCourses() { return null; }
}

public class Example {
  public static void main(String[] args) {
    // lambda in Java is an OBJECT literal
    // instance of an anonymous class created from just enough info

    StudentCriterion sc = (Student s) -> {
      return s.getGpa() > 3.0;
    };

    // can leave ALL formal param types out
    // OR replace ALL of them with var
    StudentCriterion sc1 = (s) -> {
      return s.getGpa() > 3.0;
    };

    // Exactly ONE formal param, without any placeholder for type
    // can leave off the parens (nothing to "group")
    StudentCriterion sc2 = s -> {
      return s.getGpa() > 3.0;
    };

    // IF method body is simply, "return <expression>" we can replace the entire
    // body with the expression alone
    StudentCriterion sc3 = s -> s.getGpa() > 3.0   ;




  }
}

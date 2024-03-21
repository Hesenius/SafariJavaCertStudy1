package switchstuff;

import java.time.LocalDate;

enum DayOfWeek {
  MONDAY, TUESDAY, WEDNESDAY, SATURDAY, SUNDAY;
}
public class Ex1 {
  public static void main(String[] args) {
    DayOfWeek x = DayOfWeek.SUNDAY;
    switch (x) {
//      case SATURDAY: // alternation was "fall-through"
//      case SUNDAY:
      case SATURDAY, SUNDAY:
        System.out.println("Weekend, party!!!");
        break;
//      case DayOfWeek.MONDAY:
      case MONDAY:
        int someInt = 99;
        System.out.println("Monday");
        break;
      case TUESDAY:
//        System.out.println(someInt);
        someInt = 100;
        System.out.println("Tuesday");
        break;
    }

    System.out.println("---------------------");
    switch (x) {
      // RHS of an arrow is a "single thing"
      case SATURDAY, SUNDAY -> {
        System.out.println("It's a weekend");
        if (Math.random() > 0.5) break;
        System.out.println("let's have a party");
      }
      case MONDAY ->
        // CANNOT have a solitary declaration on RHS of ->
        // int someInt = 99;
        System.out.println("Monday");
      case TUESDAY ->
        System.out.println("Tuesday");
      case WEDNESDAY -> {} // cannot use naked "break", but this works :)
    }
    System.out.println("---------------------");
    System.out.println(x == DayOfWeek.SUNDAY ? "Play golf" : "Get some work done!");
    System.out.println("---------------------");
    System.out.println(
        switch(x) { // switch EXPRESSION must cover all possible values of the switch expression (x here)
          case SATURDAY, SUNDAY -> {
            String msg = "processing weekend";
            System.out.println(msg);
            yield "The weekend, time to enjoy and relax!";
          }
          default -> "Sadness, go to work";
        }
    );
    System.out.println("---------------------");
    System.out.println(
        switch(x) { // switch EXPRESSION must cover all possible values of the switch expression (x here)
          case SATURDAY, SUNDAY:
            System.out.println("processing the weekend");
            yield "The weekend, time to enjoy and relax!";
          default: yield "Sadness, go to work";
        }
    );
    System.out.println("---------------------");
    var stuff = switch (x) {
      case SATURDAY -> 99;
      case SUNDAY -> "A string";
      default -> LocalDate.now();
    };
  }
}

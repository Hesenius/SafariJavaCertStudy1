package enumstuff;

import java.io.Serializable;

interface Strange {
  String getText();
}

enum Day implements Strange {
  MONDAY(1), TUESDAY,
  WEDNESDAY {
    @Override
    public String getText() {
      return "Hump day!";
    }
  };
  /*public*/  Day(int d) {}
  /*public*/  private Day() {}
  static void doStuff() {}
  void showMe() {
    System.out.println("I'm " + this.name()); // final
    System.out.println("I'm " + this.toString()); // not final
  }

  @Override
  public String getText() {
    return "I'm an enum!";
  }

  @Override
  public String toString() {
    return "my name is " + name();
  }
}

//enum Bad extends Day {}

public class Ex1 {
  public static void main(String[] args) {
    System.out.println(Day.MONDAY);

    System.out.println(Day.MONDAY.ordinal());

    for (var d : Day.values()) {
      System.out.println(d);
    }

    System.out.println(Day.MONDAY.getText());
    System.out.println(Day.WEDNESDAY.getText());

  }
}

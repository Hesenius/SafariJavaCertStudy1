package initialization;
class Mere {
  int x = 100;
  int y;
  {
    y = calculate();
    System.out.println("y is " + y);
  }
  public int calculate() {
    return x * 2;
  }
}

class Enfant extends Mere {
  int x = 150;
  public int calculate() {
    return x * 3;
  }
}
public class Ex1 {
  public static void main(String[] args) {
    new Enfant();
  }
}

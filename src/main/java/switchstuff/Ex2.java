package switchstuff;

public class Ex2 {
  public static void main(String[] args) {
    final String s = "Hello";
    var m =
        switch (s) {
          // line n2
          case "Hello" -> "Bonjour";
          // NOT IN JAVA 17 (but would be OK in 21)
//          case String x -> "Salut, ton message est: " + x;
          default -> "Unknown";
        };
    System.out.println(m);
  }
}

package textblocks;

public class Ex1 {
  public static void main(String[] args) {
//    String message = """Hello\
    String message = """        
        Java 17 World!      
        As many lines
           as you like
           
           and ""\"""indentation" can be retained
           and ""\"""indentation" can be retained
        """;
    System.out.println(message + "XXX");

    String single =
        "this is one line\n"
        + "this is \"another\" line";


    String message2 = """
        Hello
            Java 17 World!""";
    System.out.println(message2 + "XXX");
  }
}

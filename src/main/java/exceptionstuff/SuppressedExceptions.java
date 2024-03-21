package exceptionstuff;

import java.io.FileNotFoundException;
import java.sql.SQLException;

class AC4 implements AutoCloseable {
  private static int nextId = 1;
  private int myId = nextId++;
  @Override
  public void close() throws SQLException {
    throw new SQLException("DB busted, id = " + myId);
  }
}

public class SuppressedExceptions {
  public static void main(String[] args) {
    try {
      doStuff();
      System.out.println("Success??");
    } catch (FileNotFoundException f) {
      System.out.println("Got fileNotFound: " + f.getMessage());
      System.out.println("Got suppressed...");
      for (Throwable t : f.getSuppressed()) {
        System.out.println("> " + t.getMessage());
      }
    }  catch (SQLException f) {
      System.out.println("Got SQLException: " + f.getMessage());
      System.out.println("Got suppressed...");
      for (Throwable t : f.getSuppressed()) {
        System.out.println("> " + t.getMessage());
      }
    }
  }
  public static void doStuff() throws SQLException, FileNotFoundException {
    try (
        var one = new AC4();
        var two = new AC4();
    ) {
      throw new FileNotFoundException("Bad.txt");
    } // auto-generated finally blocks will call ALL the close methods
  }
}

package exceptionstuff;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
  public static void main(String[] args) throws Throwable {
/*
    try {
      FileReader input = new FileReader("");
      // do stuff
      input.close();
    } catch (IOException ioe) {

    } finally {
//      input.close(); // OUT OF SCOPE
    }
*/

    // resources must implement AutoCloseable
    final var in = new FileReader("");
    try (
        FileReader input = new FileReader(""); // this closes third
        FileWriter output = new FileWriter(""); // this closes second
        in; // this closes first
    ) {
//      input = null; // nope, must be final/effetively final
      // do stuff
    } catch (IOException ioe) {

    } // finally is auto-generated to close all "resources"

//    in = null;
  }
}

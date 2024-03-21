package exceptionstuff;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Ex1 {
  void doStuff() throws IOException {};
  void doStuff2() throws FileNotFoundException {};
  void tryStuff() {
    try {
      doStuff();
      doStuff2();
      if (Math.random() > 0.5) throw new SQLException();
//    } catch(FileNotFoundException ioe) {
      // handle both exceptions
    } catch(IOException | SQLException ioe) {

    } finally {

    }
  }
}

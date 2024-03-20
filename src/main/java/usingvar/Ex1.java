package usingvar;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Ex1 {
//  var x = 99;

//  void doMoreStuff(var x) {} // NOPE

  void doMoreStuff(int [] ia) {}
//  void doMoreStuff(Object [] ia) {} // this need not exist for the below ambiguity to exist

  void doStuff() {
//    var x = 3_000_000_000L; // just digits and _? then it's an int!!!
    var x = 100; // GOOD
//    x = "Hello"; // NOPE, this is not dynamic typing / not JavaScript!

//    var y; // NOPE initialization must be in the same statement
//    y = 200;

    var z = (String)null;

//    var [] x1 = { 1,2,3 }; // NOPE var must replace the ENTIRETY of the type
//    var x1 = { 1,2,3 }; // NOPE var is TYPE INFERENCING

//    int [] ia = new int[3]; // OK
    int [] ia = { 1,2,3 }; // OK since Java 1.1 -- this is type inference (see above

    doMoreStuff(new int[] {}); // yes
//    doMoreStuff({1,2,3}); // NO!!! what is the intended base type
//    doMoreStuff(new Object[]{1,2,3}); // Would be legal with the Object[] formal param list

//    var x2 = 10, y2 = 100;
    var x2 = 10;
    var y2 = 100;
//    int x2 = 10, y2 = 100;

    var x3 = true ? "99" : 99; // Autoboxing, this is String and Integer...
//    x3.compareTo() // YES!!!
//    Integer.valueOf(99).compareTo(99)

    String [] names = null;
    for (var n : names) {}

    try (var in = new BufferedReader(null);
         var out = new PrintWriter((OutputStream) null)) {

//    } catch (var e) {} // NO VAR HERE
    } catch (Exception e) {}
  }

  void conditionalCompilation() {
    // "compile-time constants" formally called constant expressions
    // are treated special. They are, literals, and final variables
    // of primitive type and String
    final boolean notTrue = false;
//    while (notTrue) {
//      System.out.println("never");
//    }

//    if (false) {
    if (notTrue) {
      // UNREACHABLE, but ALLOWED!!! -- this code will be removed from the binary!!!
      // valuable for debugging
      System.out.println("only for deugging");
    }

  }
}

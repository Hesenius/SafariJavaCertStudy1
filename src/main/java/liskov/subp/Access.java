package liskov.subp;
import liskov.Ex1;
public class Access extends Ex1 {
  public void showX() {
    // access to protected field in parent MUST BE
    // using a REFERENCE of the SUB-type
    System.out.println(x);

    Ex1 anotherOne = null;
//    System.out.println(anotherOne.x); // not allowed!!!
  }
}

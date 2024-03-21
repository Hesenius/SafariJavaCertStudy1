package instanceofstuff;

public final class Person {
  private String name;
  private String address;

  @Override
  public boolean equals(Object other) {
    return other instanceof Person otherP
        && otherP.name.equals(this.name)
        && otherP.address.equals(this.address);
  }
}

import other.A;

class Laptop {
  int price;
  String model;

  @Override
  public String toString() {
    return "Laptop [price=" + price + ", model=" + model + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + price;
    result = prime * result + ((model == null) ? 0 : model.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Laptop other = (Laptop) obj;
    if (price != other.price)
      return false;
    if (model == null) {
      if (other.model != null)
        return false;
    } else if (!model.equals(other.model))
      return false;
    return true;
  }

  // public boolean equals(Laptop other) {
  // // if (this.model.equals(other.model) && this.price == other.price)
  // // return true;
  // // else
  // // return false;
  // return this.model.equals(other.model) && this.price == other.price;

  // }

}

public class Main {
  public static void main(String[] args) {
    Laptop obj = new Laptop();
    obj.model = "Lenovo yoga";
    obj.price = 1000;
    Laptop obj2 = new Laptop();
    obj2.model = "Lenovo yoga";
    obj2.price = 1000;

    boolean result = obj.equals(obj2);
    System.out.println(result);
  }
}

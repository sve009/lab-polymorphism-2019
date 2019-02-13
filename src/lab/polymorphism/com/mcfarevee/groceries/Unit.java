package lab.polymorphism.com.mcfarevee.groceries;

public class Unit {
  private String unit;
  
  public static final Unit OUNCE = new Unit("ounce");
  public static final Unit GRAM = new Unit("gram");
  public static final Unit POUND = new Unit("pound");
  
  private Unit(String unit) { 
    this.unit = unit;
  }
  
  public String toString() {
    return this.unit;
  }
}

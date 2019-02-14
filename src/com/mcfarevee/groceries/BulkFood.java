package com.mcfarevee.groceries;
/**
 * The base food class
 * Used in many other grocery objects
 * Written by Sam Eagen
 */
public class BulkFood {
  //fields---------------------

  private String name;
  private Unit unit;
  private int pricePerUnit;
  public int supply;

  //constructor-------------------

  public BulkFood(String name, Unit unit, int pricePerUnit, int supply) {
    this.name = name;
    this.unit = unit;
    this.pricePerUnit = pricePerUnit;
    this.supply = supply;
  }

  //methods------------------------

  public boolean equals(BulkFood other) {
    return this.name.equals(other.name) && this.unit.equals(other.unit) && 
      this.pricePerUnit == other.pricePerUnit && this.supply == other.supply;
  }

  public String name() {
    return this.name;
  }

  public Unit unit() {
    return this.unit;
  }

  public int pricePerUnit() {
    return this.pricePerUnit;
  }
}



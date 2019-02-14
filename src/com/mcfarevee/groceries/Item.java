package com.mcfarevee.groceries;

/**
 * Small interface used for items in
 * a grocery store.
 * Written by Sam Eagen
 */
public interface Item {
  //returns the Items weight
  public Weight getWeight();

  //returns the price
  public int getPrice();

  //used for printing off items in a cart in a prettier way
  public String toString();

  //Returns how many objects are in the Item
  public int getCount();

  //Returns the name of the Item
  public String getName();

  //Returns information used to check for equality
  public String getType();

  //Used for stacking similar objects
  public Item stack(int count);

}

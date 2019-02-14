package com.mcfarevee.shopping;

import java.util.Vector;
import java.io.PrintWriter;

import com.mcfarevee.groceries.*;

/**
 * A cart object that items can be placed into,
 * and then data can be gathered from.
 * Written by Sam Eagen
 */
public class Cart {
  //fields--------------------------

  private Vector<Item> cart;

  //constructor---------------------

  public Cart() {
    this.cart = new Vector<Item>();
  }

  //methods-------------------------

  public void addItem(Item item) {
    cart.add(item);
  }

  public int numThings() {
    int total = 0;
    for (int i = 0; i < cart.size(); i++) {
      total += cart.get(i).getCount();
    }

    return total;
  }

  public int numEntries() {
    return cart.size();
  }

  public void printContents(PrintWriter pen) {
    for (int i = 0; i < cart.size(); i++) {
      pen.println(cart.get(i));
    }
  }

  public int getPrice() {
    int total = 0;
    for (int i = 0; i < cart.size(); i++) {
      total += cart.get(i).getPrice();
    }

    return total;
  }

  public Weight[] getWeight() {
    int lbamount = 0;
    int ozamount = 0;
    int gamount = 0;
    int kgamount = 0;

    for (int i = 0; i < cart.size(); i++) {
      Weight temp = cart.get(i).getWeight();

      if (temp.unit.equals(Unit.POUND)) {
        lbamount += temp.amount;
      } else if (temp.unit.equals(Unit.OUNCE)) {
        ozamount += temp.amount;
      } else if (temp.unit.equals(Unit.GRAM)) {
        gamount += temp.amount;
      } else {
        kgamount += temp.amount;
      }
    }

    Weight pounds = new Weight(Unit.POUND, lbamount);
    Weight ounces = new Weight(Unit.OUNCE, ozamount);
    Weight grams = new Weight(Unit.GRAM, gamount);
    Weight kilograms = new Weight(Unit.KILOGRAM, kgamount);

    return new Weight[] {pounds, ounces, grams, kilograms};
  }

  public void remove(String name) {
    Vector<Item> newCart = new Vector<Item>();

    for (int i = 0; i < cart.size(); i++) {
      if (cart.get(i).getName().equals(name)) {
        continue;
      }

      newCart.add(cart.get(i));
    }
    this.cart = newCart;
  }

  /**
   * Basic theory behind this method is that
   * it goes through the items in the car and 
   * compares their types. There are a couple different
   * cases, all of which are addressed.
   */
  public void merge() {
    for (int i = 0; i < cart.size(); i++) {
      Item current = cart.get(i);
      String[] parts = current.getType().split(" ");

      for (int j = 0; j < cart.size(); j++) {

        if (i == j) {
          continue;
        }

        Item other = cart.get(j);
        String[] otherParts = other.getType().split(" ");
        if (parts[0].equals("ManyPackages") && otherParts.equals("ManyPackages")) {
          if (parts[1].equals(otherParts[1])) {
            current.stack(other.getCount());
            cart.remove(j);
          }
        } else if (parts[0].equals("BulkItem") && otherParts[0].equals("BulkItem")) {
          if (parts[1].equals(otherParts[1])) {
            current.stack(other.getWeight().amount);
            cart.remove(j);
          }
        } else if (parts[0].equals("ManyPackages")) {
          if (parts[1].equals(otherParts[0])) {
            current.stack(other.getCount());
            cart.remove(j);
          }
        } else if (parts[0].equals(otherParts[0])) {
          Item returned = current.stack(other.getCount());
          cart.remove(j);
          if (j < i) {
            i--;
          }
          if (returned != null) {
            cart.set(i, returned);
          }
        }

      }
    }
  }
}




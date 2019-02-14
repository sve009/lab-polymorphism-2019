package com.mcfarevee.shopping;

import java.io.PrintWriter;

import com.mcfarevee.groceries.*;

public class Testing {
        public static void main(String[] args) {
                PrintWriter pen = new PrintWriter(System.out, true);

                BulkFood bananas = new BulkFood("bananas", Unit.POUND, 50, 20);

                BulkFood saffron = new BulkFood("saffron", Unit.GRAM, 1000, 200);

                Cart cart = new Cart();

                cart.addItem(new BulkItem(bananas, Unit.POUND, 3));
                cart.printContents(pen);
                cart.addItem(new BulkItem(saffron, Unit.GRAM, 1));
                cart.printContents(pen);
                pen.println("Price: " + cart.getPrice());
                cart.addItem(new NonFood("can opener", new Weight(Unit.OUNCE, 2), 349));
                cart.addItem(new com.mcfarevee.groceries.Package("oreos", new Weight(Unit.OUNCE, 12), 399));
                cart.printContents(pen);
                pen.println("Weight " + cart.getWeight()[0] + " " + cart.getWeight()[1] + " "
                                + cart.getWeight()[2] + " " + cart.getWeight()[3]);
                pen.println("Number of things: " + cart.numThings());
                cart.remove("bananas");
                pen.println("Number of things: " + cart.numThings());

                cart.printContents(pen);

                Cart cart2 = new Cart();

                pen.println("Add 1 lb of bananas 3 times.");
                cart2.addItem(new BulkItem(bananas, Unit.POUND, 3));
                cart2.addItem(new BulkItem(bananas, Unit.POUND, 3));
                cart2.addItem(new BulkItem(bananas, Unit.POUND, 3));
                pen.println("Add two packages of oreos");
                cart2.addItem(new com.mcfarevee.groceries.Package("oreos", new Weight(Unit.OUNCE, 12), 399));
                cart2.addItem(new com.mcfarevee.groceries.Package("oreos", new Weight(Unit.OUNCE, 12), 399));
                pen.println("Add many packages of cuties");
                cart2.addItem(new ManyPackages(new com.mcfarevee.groceries.Package("cuties", new Weight(Unit.OUNCE, 12), 250), 3));
                pen.println("Add a package of cuties");
                cart2.addItem(new com.mcfarevee.groceries.Package("cuties", new Weight(Unit.OUNCE, 12), 250));
                pen.println("Contents of cart2");
                cart2.printContents(pen);
                pen.println("Merge cart");
                cart2.merge();
                pen.println("New contents");
                cart2.printContents(pen);
        }
}





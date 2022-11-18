/*
 * Author : Pinky Sodhi
 * Date : 18-11-2022
 * Created Using : IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

import java.util.HashSet;
import java.util.Random;

public class PizzaShop {
    HashSet<Pizza> pizzaMenu;

    public PizzaShop() {
        pizzaMenu = new HashSet<>();
        initializePizzaMenu();
    }

    public boolean addPizzaToMenu(Pizza pizza) {
        return pizzaMenu.add(pizza);
    }

    public boolean removePizzaFromMenu(Pizza pizza) {
        return pizzaMenu.remove(pizza);
    }

    public Pizza generateRandomPizzaObject() {
        Random random = new Random();
        String name = "Pizza" + random.nextInt(100);
        double price = random.nextDouble(300, 1000);
        int sizeInInches = random.nextInt(7, 15);
        Pizza pizza = new Pizza(name, price, sizeInInches);
        return pizza;
    }

    private void initializePizzaMenu() {
        for (int counter = 0; counter < 10; counter++) {
            Pizza pizza = generateRandomPizzaObject();
            addPizzaToMenu(pizza);
        }
    }

}

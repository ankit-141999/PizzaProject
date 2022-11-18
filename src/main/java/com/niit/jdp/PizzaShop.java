/*
 * Author : Pinky Sodhi
 * Date : 18-11-2022
 * Created Using : IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

import java.util.HashSet;

public class PizzaShop {
    HashSet<Pizza> pizzaMenu;

    public PizzaShop() {
        pizzaMenu = new HashSet<>();
    }

    public boolean addPizzaToMenu(Pizza pizza) {
        return pizzaMenu.add(pizza);
    }

    public boolean removePizzaFromMenu(Pizza pizza) {
        return pizzaMenu.remove(pizza);
    }

    private void initializePizzaMenu() {

    }

}

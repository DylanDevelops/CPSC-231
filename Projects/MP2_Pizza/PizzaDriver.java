package Projects.MP2_Pizza;

/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP2: Pizza
**/

/**
 * The class ordering pizzas and printing to the user.
 */
public class PizzaDriver {
    /**
     * The main class meant only for ordering pizzas through the pizza order class.
     */
    public static void main(String[] args) {
        // Creates four pizzas
        Pizza pizza1 = new Pizza("small", 1, 0, 1);
        Pizza pizza2 = new Pizza("large", 2, 2, 0);
        Pizza pizza3 = new Pizza(pizza2);
        Pizza pizza4 = new Pizza(pizza1);

        // Creates a pizza order.
        PizzaOrder order = new PizzaOrder(3);
        
        // add pizza1 to the order
        System.out.println(order.addPizza(pizza1));

        // add pizza2 to the order
        System.out.println(order.addPizza(pizza2));

        // add pizza3 to the order
        System.out.println(order.addPizza(pizza3));

        // add pizza4 to the order
        System.out.println(order.addPizza(pizza4));

        // are pizza1 and pizza2 the same?
        System.out.println(pizza1.equals(pizza3));

        // Should call order's toString method
        System.out.println(order);
    }
}

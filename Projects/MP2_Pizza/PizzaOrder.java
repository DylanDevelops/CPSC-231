package Projects.MP2_Pizza;

/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP2: Pizza
**/

/**
 * The pizza order class for handling pizza orders.
 */
public class PizzaOrder {
    // Member variables for the order and number of pizzas
    private Pizza[] m_order;
    private int m_numPizzas;

    /**
     * A default constructor which makes a medium cheese pizza.
     * No parameters are needed.
     */
    public PizzaOrder() {
        // Creates a medium cheese pizza based on the Pizza.java's default constructor.
        this.m_order[0] = new Pizza();
        this.m_numPizzas = m_order.length;
    }

    /**
     * An overloaded constructor which makes a pizza order with
     * the specified number of pizzas.
     * 
     * @param numPizzas An int representing the number of pizzas
     */
    public PizzaOrder(int numPizzas) {
        // Makes the order array which the number of pizzas.
        this.m_order = new Pizza[numPizzas];
        this.m_numPizzas = 0;
    }

    /**
     * The method which returns a String when needed.
     * 
     * @return The pizza order represented as a String.
     */
    public String toString() {
        // Creates a "receipt"
        String response = "Order Information:\n    Number of Pizza(s): " + m_order.length;
        for(int i = 0; i < m_order.length; i++) {
            // Loops through every pizza and adds it's information the "receipt"
            response += "\n    Pizza #" + (i + 1) + ":\n" + m_order[i].toString();
        }
        response += "\n    Order Total Cost: $" + calcTotal();

        // Returns as a String
        return response;
    }

    /**
     * A method which adds pizzas to the order.
     * 
     * @param pizza A pizza object that will be added to the order
     * @return A 1 when successful and a -1 when unsuccessful
     */
    public int addPizza(Pizza pizza) {
        // Checks if the new pizza will go over the order amount.
        if(m_numPizzas < m_order.length) {
            m_order[m_numPizzas] = pizza;
            m_numPizzas++;

            // If successful return 1
            return 1;
        } else {
            // If unsuccessful return -1
            return -1;
        }
    }

    /**
     * A method which calculates the total cost of the order.
     * 
     * @return The total cost of the order.
     */
    public double calcTotal() {
        double totalCost = 0;
        for(int i = 0; i < m_order.length; i++) {
            // Loops through every pizza and adds its cost to the total cost.
            totalCost += m_order[i].calcCost();
        }

        // Returns the total cost of the order.
        return totalCost;
    }
}

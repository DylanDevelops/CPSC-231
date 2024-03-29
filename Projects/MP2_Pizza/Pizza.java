package Projects.MP2_Pizza;

/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP2: Pizza
**/

/**
 * The pizza class for handling pizzas and toppings.
 */
public class Pizza {
    // Member variables for the size and toppings
    private String m_size;
    private int m_cheese, m_pepperoni, m_veggie;

    /**
     * A default constructor which makes a medium cheese pizza.
     * No parameters are needed.
     */
    public Pizza() {
        this.m_size = "medium";
        this.m_cheese = 1;
        this.m_pepperoni = 0;
        this.m_veggie = 0;
    }

    /**
     * An overloaded constructor that creates an instance using
     * the provided parameters.
     * 
     * @param size A String that represents the size of the pizza. Can be "small", "medium", or "large"
     * @param cheese An int representing the number of cheese toppings
     * @param pepperoni An int representing the number of pepperoni toppings
     * @param veggie An int representing the number of veggie toppings
     */
    public Pizza(String size, int cheese, int pepperoni, int veggie) {
        this.m_size = size;
        this.m_cheese = cheese;
        this.m_pepperoni = pepperoni;
        this.m_veggie = veggie;
    }

    /**
     * An overloaded constructor that creates a copy of the provided
     * pizza as a parameter.
     * 
     * @param pizza A pizza object that will be used to create a duplicate.
     */
    public Pizza(Pizza pizza) {
        // Grabs all values from the original pizza and sets them equal to the copy
        this.m_size = pizza.getSize();
        this.m_cheese = pizza.getCheese();
        this.m_pepperoni = pizza.getPepperoni();
        this.m_veggie = pizza.getVeggie();
    }

    /**
     * The method which returns a String when needed.
     * 
     * @return The pizza information represented as a String.
     */
    public String toString() {
        // Formats a string to look like a "receipt of the pizza"
        String response = "        Pizza Information:";
        response += "\n            Size: " + m_size;
        response += "\n            Topping Information:";
        response += "\n                Cheese: " + m_cheese;
        response += "\n                Pepperoni: " + m_pepperoni;
        response += "\n                Veggie: " + m_veggie;
        response += "\n            Pizza Cost: $" + calcCost();

        // Returns the created String
        return response;
    }

    /**
     * Checks if the pizza is the exact same as another pizza
     * using the parameter.
     * 
     * @param otherPizza The pizza object to compare to.
     * @return True or false depending on the outcome.
     */
    public boolean equals(Pizza otherPizza) {
        // Checks if each value is equal to the other pizza's value
        if(!m_size.equals(otherPizza.getSize())) return false;
        if(m_cheese != otherPizza.getCheese()) return false;
        if(m_pepperoni != otherPizza.getPepperoni()) return false;
        if(m_veggie != otherPizza.getVeggie()) return false;

        // If all values return true, then the pizzas are the same.
        return true;
    }

    /**
     * An accessor of the size variable.
     * 
     * @return The size variable as a String.
     */
    public String getSize() {
        return m_size;
    }

    /**
     * An accessor of the cheese variable.
     * 
     * @return The number of cheese toppings as an int.
     */
    public int getCheese() {
        return m_cheese;
    }

    /**
     * An accessor of the pepperoni variable.
     * 
     * @return The number of pepperoni toppings as an int.
     */
    public int getPepperoni() {
        return m_pepperoni;
    }

    /**
     * An accessor of the veggie variable.
     * 
     * @return The number of veggie toppings as an int.
     */
    public int getVeggie() {
        return m_veggie;
    }

    /**
     * A modifier of the size variable.
     * 
     * @param size A String representing the size of the pizza. Can be "small", "medium", or "large"
     */
    public void setSize(String size) {
        m_size = size;
    }

    /**
     * A modifier of the cheese variable.
     * 
     * @param cheese An int representing the number of cheese toppings.
     */
    public void setCheese(int cheese) {
        m_cheese = cheese;
    }

    /**
     * A modifier of the pepperoni variable.
     * 
     * @param cheese An int representing the number of pepperoni toppings.
     */
    public void setPepperoni(int pepperoni) {
        m_pepperoni = pepperoni;
    }

    /**
     * A modifier of the veggie variable.
     * 
     * @param cheese An int representing the number of veggie toppings.
     */
    public void setVeggie(int veggie) {
        m_veggie = veggie;
    }

    /**
     * A method which calculates the total cost of the pizza.
     * 
     * @return A double representing the total cost of the pizza
     */
    public double calcCost() {
        // $2 per topping
        int totalNumOfToppings = m_cheese + m_pepperoni + m_veggie;
        
        // Adds the cost of the pizza to the number of the toppings * 2.0
        switch(m_size.toLowerCase()) {
            case "small":
                // Small: $10
                return 10.0 + (totalNumOfToppings * 2.0);

            case "medium":
                // Medium: $12
                return 12.0 + (totalNumOfToppings * 2.0);

            case "large":
                // Large: $14
                return 14.0 + (totalNumOfToppings * 2.0);

            default:
                // If the size isn't valid
                return totalNumOfToppings * 2.0;
        }
    }
}

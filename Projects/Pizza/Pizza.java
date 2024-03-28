package Projects.Pizza;

public class Pizza {
    private String m_size;
    private int m_cheese, m_pepperoni, m_veggie;

    public Pizza() {
        this.m_size = "medium";
        this.m_cheese = 1;
        this.m_pepperoni = 0;
        this.m_veggie = 0;
    }

    public Pizza(String size, int cheese, int pepperoni, int veggie) {
        this.m_size = size;
        this.m_cheese = cheese;
        this.m_pepperoni = pepperoni;
        this.m_veggie = veggie;
    }

    public Pizza(Pizza pizza) {
        this.m_size = pizza.getSize();
        this.m_cheese = pizza.getCheese();
        this.m_pepperoni = pizza.getPepperoni();
        this.m_veggie = pizza.getVeggie();
    }

    public String toString() {
        return "Pizza Information:\n    Size: " + m_size + "\n    Topping Information:\n        Cheese: " + m_cheese + "\n        Pepperoni: " + m_pepperoni + "\n        Veggie: " + m_veggie + "\n    Total Cost: $" + calcCost();
    }

    public boolean equals(Pizza otherPizza) {
        // Checks if each value is equal to the other pizza's value
        if(m_size != otherPizza.getSize()) return false;
        if(m_cheese != otherPizza.getCheese()) return false;
        if(m_pepperoni != otherPizza.getPepperoni()) return false;
        if(m_veggie != otherPizza.getVeggie()) return false;

        // If all values return true, then the pizzas are the same.
        return true;
    }

    public String getSize() {
        return m_size;
    }

    public int getCheese() {
        return m_cheese;
    }

    public int getPepperoni() {
        return m_pepperoni;
    }

    public int getVeggie() {
        return m_veggie;
    }

    public void setSize(String size) {
        m_size = size;
    }

    public void setCheese(int cheese) {
        m_cheese = cheese;
    }

    public void setPepperoni(int pepperoni) {
        m_pepperoni = pepperoni;
    }

    public void setVeggie(int veggie) {
        m_veggie = veggie;
    }

    public double calcCost() {
        // $2 per topping
        int totalNumOfToppings = m_cheese + m_pepperoni + m_veggie;
        
        switch(m_size.toLowerCase()) {
            case "small":
                // Small: $10
                return 10.0 + totalNumOfToppings;

            case "medium":
                // Medium: $12
                return 12.0 + totalNumOfToppings;

            case "large":
                // Large: $14
                return 14.0 + totalNumOfToppings;

            default:
                // If the size isn't valid
                return totalNumOfToppings;
        }
    }
}

package Projects.Pizza;

public class PizzaOrder {
    private Pizza[] m_order;
    private int m_numPizzas;

    public PizzaOrder() {
        // TODO: COME BACK TO THIS
        this.m_order = new Pizza[1];
        this.m_order[0] = new Pizza("small", 1, 0, 1);
        this.m_numPizzas = m_order.length;
    }

    public PizzaOrder(int numPizzas) {
        // TODO: COME BACK TO THIS
        this.m_order = new Pizza[numPizzas];
        this.m_numPizzas = 0;
    }

    public String toString() {
        String response = "";
        response += "Order Information:\n    Number of Pizza(s): " + m_order.length;
        for(int i = 0; i < m_order.length; i++) {
            response += "\n    Pizza #" + (i + 1) + ":\n        Size: " + m_order[i].getSize() + "\n        Topping Information:\n            Cheese: " + m_order[i].getCheese() + "\n            Pepperoni: " + m_order[i].getPepperoni() + "\n            Veggie: " + m_order[i].getVeggie() + "\n        Pizza Cost: $" + m_order[i].calcCost();
        }
        response += "\n    Total Cost: " + calcTotal();
        return response;
    }

    public int addPizza(Pizza pizza) {
        if(m_numPizzas < m_order.length) {
            m_order[m_numPizzas] = pizza;
            m_numPizzas++;
            return 1;
        } else {
            return -1;
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for(int i = 0; i < m_order.length; i++) {
            totalCost += m_order[i].calcCost();
        }
        return totalCost;
    }
}

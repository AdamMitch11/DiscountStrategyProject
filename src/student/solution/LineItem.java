package student.solution;

/**
 *
 * @author Adam
 */
public class LineItem {
    private int qty;
    private double lineTotal;
    
    private Product prod = new Product();

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }
    
    public void generateLineItem() {
        
    }       
}

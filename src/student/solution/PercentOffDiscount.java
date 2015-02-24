package student.solution;

/**
 *
 * @author Adam
 */
public class PercentOffDiscount implements DiscountStrategy {
    private double discountRate = 0.10;

    //Constructers
    public PercentOffDiscount() {
    }

    public PercentOffDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    @Override
    public double getDiscountAmt(double price, int qty) {
        return price*qty*discountRate;
    }
    
    @Override
    public double getDiscountedTotal(double price, int qty) {
        return price*qty - getDiscountAmt(price,qty);
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public static void main(String[] args) {
        PercentOffDiscount d = new PercentOffDiscount();
        double totalDiscounted = d.getDiscountedTotal(100.00, 2);
        System.out.println(totalDiscounted);
    }
}

package student.solution;

/**
 *
 * @author Adam
 */
public class PercentOffDiscount implements DiscountStrategy {
    private double discountValue = 0.10;

    //Constructers
    public PercentOffDiscount() {
    }

    public PercentOffDiscount(double discountValue) {
        this.discountValue = discountValue;
    }
    
    @Override
    public double getDiscountAmt(double price, int qty) {
        return price*qty*discountValue;
    }
    
    @Override
    public double getDiscountedTotal(double price, int qty) {
        return price*qty - getDiscountAmt(price,qty);
    }

    @Override
    public double getDiscountValue() {
        return discountValue;
    }

    @Override
    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }
    
    public static void main(String[] args) {
        PercentOffDiscount d = new PercentOffDiscount();
        double totalDiscounted = d.getDiscountedTotal(100.00, 2);
        System.out.println(totalDiscounted);
    }
}

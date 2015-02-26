package student.solution;

/**
 *
 * @author Adam
 */
public class NoDiscount implements DiscountStrategy {
    
    //Constructers
    public NoDiscount() {
    }

    public NoDiscount(double discountValue) {
        //do nothing
    }
    
    @Override
    public final double getDiscountAmt(double price, int qty) {
        return 0.00;
    }
    
    @Override
    public final double getDiscountedTotal(double price, int qty) {
        return price*qty - getDiscountAmt(price,qty);
    }

    @Override
    public final double getDiscountValue() {
        return 0.00;
    }

    @Override
    public final void setDiscountValue(double discountValue) {
        //throw exception, this value may not be changed
    }
    
    public static void main(String[] args) {
        NoDiscount d = new NoDiscount();
        double totalDiscounted = d.getDiscountedTotal(100.00, 2);
        System.out.println(totalDiscounted);
    }
}

package student.solution;

/**
 *
 * @author Adam
 */
public class FlatDiscount implements DiscountStrategy {
    private double discountValue = 5.00;

    //Constructers
    public FlatDiscount() {
    }

    public FlatDiscount(double discountValue) {
        this.discountValue = discountValue;
    }
    
    @Override
    public double getDiscountAmt(double price, int qty) {
        return price*qty-discountValue*qty;
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
        if (discountValue<0){
            //throw exception
            this.discountValue=0.00;
        }
        else {
        this.discountValue = discountValue;
        }
    }
    
    public static void main(String[] args) {
        FlatDiscount d = new FlatDiscount();
        double totalDiscounted = d.getDiscountedTotal(100.00, 2);
        System.out.println(totalDiscounted);
    }
}

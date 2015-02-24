package student.solution;

/**
 *
 * @author Adam
 */
public class Product {
    private String name;
    private double price;
    private String productID;
    //private String description;
    //private String upc;
    //private String category;

    private DiscountStrategy discountStrategy;
    
    public Product() {
    }
    
    public Product(String name, double price, String productID, DiscountStrategy discountStrategy) {
        this.name = name;
        this.price = price;
        this.productID = productID;
        this.discountStrategy = discountStrategy;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <0.00) {
            this.price=0.00;
        }
        else {
            this.price = price;
        }
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        if (productID==null || productID.isEmpty()) {
            //warning message needed
        }
        this.productID = productID;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    public double getDiscountAmount(int qty) {
        return discountStrategy.getDiscountAmt(price,qty);
    }
    
    
    //Test the class
    public static void main(String[] args) {
        Product product = new Product();
        DiscountStrategy d = new PercentOffDiscount();
        product.setName("Nike Air Shoe");
        product.setPrice(69.99);
        product.setProductID("SN1200");
        product.setDiscountStrategy(d);
        
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getProductID());
        System.out.println("You saved " + product.getDiscountAmount(2) );
        
    }
}

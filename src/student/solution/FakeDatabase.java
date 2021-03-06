package student.solution;

/**
 * This class provides a temporary solution to the question of where is the
 * long-time data stored. In a real application, a database would be used, 
 * however we can use other means of storage, such as in-memory or file system.
 * Here, we'll use the in-memory approach. But these variations are just
 * different data access strategies, aren't they? So we'll make this a
 * strategy object.
 * 
 * @author  Jim Lombardo
 * @version 1.00
 */
public class FakeDatabase implements ReceiptDataAccessStrategy {
    private final CustomerStrategy[] customers = {
        new Customer("100", "John Smith"),
        new Customer("200", "Sally Jones"),
        new Customer("300", "Bob Clementi")
    };
    

    
    private final Product[] products = {
        new Product("A101",  19.95, "MLB Brewer's Hat", new PercentOffDiscount(0.15)),
        new Product("B205", 35.50, "Men's Dress Shirt", new FlatDiscount(5.50)),
        new Product("C222", 9.50, "Women's Socks", new NoDiscount())
    };
    
    /**
     * Tries to find a Customer by customer id.
     * @param custId - must not be null or empty
     * @return found Customer or null if not found or bad argument
     */
    @Override
    public final CustomerStrategy findCustomer(final String custId) {
        // validation is needed for method parameter
        if(custId == null || custId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findCustomer method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        CustomerStrategy customer = null;
        for(CustomerStrategy c : customers) {
            if(custId.equals(c.getCustID())) {
                customer = c;
                break;
            }
        }
        
        return customer;
    }
    
    /**
     * Tries to find a Product by product id.
     * @param prodId - must not be null or empty
     * @return found Product or null if not found or bad argument
     */
    @Override
    public final Product findProduct(final String prodId) {
        // validation is needed for method parameter
        if(prodId == null || prodId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProductID())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
}
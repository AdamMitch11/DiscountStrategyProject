package student.solution;

/**
 *
 * @author Adam
 */
public class LineItem {
    private int qty;
    private ReceiptDataAccessStrategy db;
    private String itemID;
    private Product product;
    private double lineTotal;

    public LineItem() {
    }

    public LineItem(int qty, ReceiptDataAccessStrategy db, String itemID) {
        this.qty = qty;
        this.db = db;
        this.itemID = itemID;
    }

    public double getLineTotal() {
        return product.getPrice()*getQty();
    }

    //public void setLineTotal(double lineTotal) {
    //  This method is not necessary  
    //}

    public Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        db.findProduct(itemID);
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }

    public ReceiptDataAccessStrategy getDb() {
        return db;
    }

    public void setDb(ReceiptDataAccessStrategy db) {
        this.db = db;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
    
    
}

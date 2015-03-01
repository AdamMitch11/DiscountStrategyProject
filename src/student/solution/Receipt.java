package student.solution;

/**
 *
 * @author Adam
 */
public class Receipt {
    private LineItem[] lineItems = {};
    private CustomerStrategy customer;
    
    public void addLineItem(String itemID, int qty, ReceiptDataAccessStrategy db) {
        LineItem[] temp1 = new LineItem[lineItems.length+1];
        System.arraycopy(lineItems, 0, temp1, 0, lineItems.length);
        lineItems=temp1;
        lineItems[lineItems.length-1] = new LineItem(qty,db,itemID);
        temp1=null;
    }
    
    public void addCustomer(String custID, ReceiptDataAccessStrategy db) {
        customer=db.findCustomer(custID);
    }
    
    public void printReceipt() {
        
    }
    
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        ReceiptDataAccessStrategy db = new FakeDatabase();
        receipt.addLineItem("A101", 2, db);
        receipt.addLineItem("B205", 3, db);
        
    }
}

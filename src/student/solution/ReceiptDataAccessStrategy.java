/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.solution;

/**
 *
 * @author Adam
 */
public interface ReceiptDataAccessStrategy {
    
    public CustomerStrategy findCustomer(final String custId);
    
    public Product findProduct(final String prodId);
}

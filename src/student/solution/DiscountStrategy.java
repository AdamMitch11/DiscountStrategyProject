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
public interface DiscountStrategy {

    double getDiscountAmt(double price, int qty);

    double getDiscountRate();

    double getDiscountedTotal(double price, int qty);

    void setDiscountRate(double discountRate);
    
}

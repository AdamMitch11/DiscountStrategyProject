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
public class Customer implements CustomerStrategy {
    private String name;
    private String custID;

    public Customer(String custID, String name) {
        this.custID = custID;
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if (name==null || name.isEmpty()) {
            //warning message needed
        } else {
        this.name = name;
        }
    }

    @Override
    public String getCustID() {
        return custID;
    }

    @Override
    public void setCustID(String custID) {
        if (custID==null || custID.isEmpty()) {
            //warning message needed
        } else {
        this.custID = custID;
        }
    }
    public static void main(String[] args) {
        Customer cust1 = new Customer("100", "Bubbles");
        System.out.println(cust1.getCustID());
        
        Customer[] customers = {
        new Customer("100", "John Smith"),
        new Customer("200", "Sally Jones"),
        new Customer("300", "Bob Clementi")
        };
        
        customers[0].setName("Bubba Wallace");
        
        for (Customer c : customers) {
            System.out.println(c.getName() + " " + c.getCustID());
        }
    }
    
    
}

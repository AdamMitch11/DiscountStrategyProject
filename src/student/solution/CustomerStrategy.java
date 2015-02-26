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
public interface CustomerStrategy {

    String getCustID();

    String getName();

    void setCustID(String custID);

    void setName(String name);
    
}

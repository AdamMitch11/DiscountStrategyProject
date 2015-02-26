
package student.solution;

/**
 *
 * @author Adam
 */
public class Startup {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        
        register.startSale("100");
        register.addItem("A101");
        register.addItem("B205");
        register.addItem("C222");
        register.endSale();
    }
}

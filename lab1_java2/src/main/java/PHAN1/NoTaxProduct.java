
package PHAN1;

public class NoTaxProduct extends Product {

    @Override
    public double getImporTax() {
        return 0; 
    }

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }
    
    
}

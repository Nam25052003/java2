package PHAN1;


public class Product implements DAO {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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
        this.price = price;
    }
    
    public double getImporTax(){
        return getPrice()*0.1;
    }

    @Override
    public void insert() {
        System.out.println("them moi thanh cong");
    }

    @Override
    public void update() {
        System.out.println("cap nhat thanh cong");
    }

    @Override
    public void delete() {
        System.out.println("xoa thanh cong");
    }

    @Override
    public void select() {
        System.out.println("chon thanh cong");
    }
    

}

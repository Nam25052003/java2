package PHAN2;

public class ProductManager {

    public static void main(String[] args) {
        Product p1 = new Product("iPhone9", 1000.0);
        Product p2 = new Product("Samsung Start", 3000.0);

        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);

        dao.store("D:\\laptrinh\\java\\java2\\lab8_java2\\prod.dat");
        ProductDAO dao2 = new ProductDAO();
        dao2.load("D:\\laptrinh\\java\\java2\\lab8_java2\\prod.dat");
        Product p = dao2.find("iPhone9");
        System.out.println(">Name: " + p.name);
        System.out.println(">Price: " + p.price);

    }
}

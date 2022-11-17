package PHAN1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Product a[] = new Product[5];
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            Product sp = new Product();
            System.out.println("nhap ten sp: ");
            String name = sc.nextLine();            
            System.out.println("nhap gia sp: ");
            double price = sc.nextDouble();            
            a[i] = new Product(name,price);
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("ten sp: %s - gia sp: %.2f - thue: %.2f \n",a[i].getName(),a[i].getPrice(),a[i].getImporTax());
        }
    }
}

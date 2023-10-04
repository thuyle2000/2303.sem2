/*
mo ta 1 may tinh laptop bao gom :
- thuoc tinh id, don gia, thuong hieu
- phuong thuc: tinh-gia-sau-thue
 */
package model;

import java.util.Scanner;

public class Laptop implements ITaxable{
    public String id, brand;
    public int price;

    public Laptop() {
        id = "L01";
        brand = "Lenovo";
        price = 100;
    }

    public Laptop(String id, String brand, int price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap thong tin laptop");
        System.out.print(" - nhap id: "); 
        id = sc.nextLine().trim();
        System.out.print(" - nhap thuong hieu: ");
        brand = sc.nextLine().trim();
        System.out.print(" - nhap don gia: ");
        price = Integer.parseInt(sc.nextLine().trim());
    }

    @Override
    public float getTax() {
        return price*VAT/100;
    }

    @Override
    public String toString() {
        return String.format(" id:%s, thuong hieu:%s, don gia:%d, VAT: %.2f ", id, brand, price, getTax());
    }
    
    
    //ham test
    public static void main(String[] args) {
        Laptop p1 = new Laptop();
        Laptop p2 = new Laptop("L03", "Asus", 230);
        Laptop p3 = new Laptop();
        p3.input();
        
        System.out.println("laptop 1: " + p1);
        System.out.println("laptop 2: " + p2);
        System.out.println("laptop 3: " + p3);
        
    }
        
    
}

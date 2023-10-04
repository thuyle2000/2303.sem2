/*
Mo ta 1 nhan vien van phong, bao gom 
- cac thuoc tinh: id, ho ten, luong cb, so ngay lam viec
- phuong thuc xu ly: in phieu luong
 */
package model;

import java.util.Scanner;

public class Employee implements ITaxable{

    public String id, name;
    public int salary, wdays;

    public Employee() {
        id = "E01";
        name = "bi an";
        salary = 300;
        wdays = 24;
    }

    public Employee(String id, String name, int salary, int wdays) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.wdays = wdays;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap thong tin nhan vien");
        System.out.print(" - nhap id: ");
        id = sc.nextLine().trim();
        System.out.print(" - nhap ho ten: ");
        name = sc.nextLine().trim();
        System.out.print(" - nhap luong co ban: ");
        salary = Integer.parseInt(sc.nextLine().trim());
        System.out.print(" - so ngay lam viec: ");
        wdays = Integer.parseInt(sc.nextLine().trim());
    }

    @Override
    public float getTax() {
        float amt =0;
        float net = salary * wdays / 24.0F;
        if(net > 450){
            amt = (net - 450) *IT/100;
        }
        return amt;
    }
    
    public void print(){
        float net = (salary*wdays/24.0f);
        System.out.println("\n Phieu Luong");
        System.out.println("id: " + id);
        System.out.println("ho ten: " + name);
        System.out.println("luong cb: " + salary);
        System.out.println("so ngay lam viec: " + wdays);
        System.out.println("=================");
        System.out.printf("tong luong: %.2f \n" , net);
        System.out.printf("thue thu nhap: %.2f\n" , getTax());
        System.out.println("=================");
        System.out.printf("thuc lanh: %.2f\n" , net - getTax());
    }

    //ham test
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("E02", "Ha Doanh", 600, 22);
        
        e1.print();
        e2.print();
    }
}

/*
mo ta doi tuong nhan vien (duoc ke thua tu Person), bo sung them:
- thuoc tinh (instant fields): position, salary
- phuong thuc : lap trinh lai input(), toString();
 */
package model;

import java.util.Scanner;

public class Employee extends Person{
    //khai bao cac thuoc tinh moi (so voi Person)
    public String position;
    public int salary;
    
    //ham dung ko tham so
    public Employee() {
        id="E01";
        position="nhan vien";
        salary=100;
    }

    //ham dung co tham so
    public Employee(String position, int salary, String id, String name, boolean gender, int yob) {
        super(id, name, gender, yob); //goi ham dung lop cha
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("id:%s, ho-ten:%s, gioi-tinh:%s, nam-sinh:%d, chuc-vu:%s, luong-cb:%d ", id, name, gender?"nam":"nu", yob, position,salary);
    }

    //lap trinh lai ham input()

    @Override
    public void input() {
        super.input(); //goi ham input() cua lop cha [Person] de nhap 4 thuoc tinh: id, name, gender va yob
        
        //nhap tiep 2 thuoc tinh moi: position va salaty
        Scanner sc = new Scanner(System.in);
        System.out.print(" - nhap chuc vu: ");
        position = sc.nextLine();
        System.out.print(" - nhap luong CB");
        salary = sc.nextInt();
    }
    
    
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("e1 = " + e1);
        
        Employee e2 = new Employee("shipper", 200, "E02", "Le min Ho", true, 1999);
        System.out.println("e2 = " + e2);
        
        Employee e3 = new Employee();
        e3.input();
        System.out.println("e3 = " + e3);
    }
}

/*
mo ta thong tin profile cua 1 ca nhan, bao gom:
- thuoc tinh: id, name, gender, yob
- phuong thuc: input(), toString()
 */
package model;

import java.util.Scanner;

public class Person {

    //khai bao cac thuoc tinh (instant fields)
    public String id, name;
    public boolean gender;
    public int yob;

    //ham dung (constructor)
    public Person() {
        id = "P01";
        name = "vo danh";
        yob = 2000;
    }

    //ham dung co tham so
    public Person(String id, String name, boolean gender, int yob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", yob=" + yob + '}';
    }

    //ham nhap thong tin ca nhan
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" - nhap id: ");
        id = sc.nextLine().trim();
        System.out.print(" - nhap ho ten: ");
        name = sc.nextLine().trim();
        System.out.print(" - nhap gioi tinh (nam|nu): ");
        gender = sc.nextLine().trim().equalsIgnoreCase("nam");
        System.out.print(" - nhap nam sinh: ");
        yob = sc.nextInt();
    }

    // doan chuong trinh test
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("p1 = " + p1);

        Person p2 = new Person("P02", "Ha the Doanh", true, 1998);
        System.out.println("p2 = " + p2);
        
        Person p3 = new Person();
        p3.input();
        System.out.println("p3 = " + p3);
    }
}

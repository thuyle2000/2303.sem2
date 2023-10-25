/*
chuong trinh quan ly danh sach nhan vien trong ArrayList
 */
package io_text;

import java.util.*;
import java.io.*;
import entity.Employee;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeControls {

    public static void main(String[] args) {
        new EmployeeControls().menu();
    }

    ArrayList<Employee> ds = new ArrayList<>();

    private void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        while (true) {
            System.out.println("\n\n +++ MENU +++");
            System.out.println("1. them nhan vien moi");
            System.out.println("2. xem danh sach");
            System.out.println("3. luu danh sach");
            System.out.println("4. ket thuc");
            System.out.println("======================");
            System.out.print(" >> nhap ma so chuc nang [1-4]: ");
            op = sc.nextLine().trim();
            switch (op) {
                case "1" ->
                    create();
                case "2" ->
                    display();
                case "3" ->
                    save();
                case "4" -> {
                    return;
                }
            }
        }
    }

    private void create() {
        Employee e = new Employee();
        e.input();
        ds.add(e);
        System.out.println(" >> Them nhan vien moi thanh cong !");
    }

    private void display() {
        if (ds.isEmpty()) {
            System.err.println("\n >>> Loi: HT chua co du lieu");
            return;
        }

        System.out.println("\n Danh sach nhan vien: ");
        ds.forEach(System.out::println);
    }

    String fname = "nhanvien.txt";

    private void save() {
        if (ds.isEmpty()) {
            System.err.println("\n >>> Loi: HT chua co du lieu");
            return;
        }

        try (PrintWriter pw = new PrintWriter(fname)) 
        {
            ds.forEach(pw::println);           
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println("Ghi file hoan tat !");
    }

}

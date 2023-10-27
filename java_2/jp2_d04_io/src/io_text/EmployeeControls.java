/*
chuong trinh quan ly danh sach nhan vien trong ArrayList,
            luu danh sach nv vo tap tin van ban 'nhanvien.txt'
 */
package io_text;

import java.util.*;
import java.io.*;
import java.nio.file.*;
import entity.Employee;


public class EmployeeControls {

    public static void main(String[] args) {
        new EmployeeControls().menu();
    }

    ArrayList<Employee> ds = new ArrayList<>();

    private void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        
        //doc du lieu tu file co ten trong bien [fname]
        loadText();
        
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
                    try {
                        save();
                        Runtime r = Runtime.getRuntime();
                        String[] cmdarray = {"notepad",fname};
                        r.exec(cmdarray);
                        
                    } catch (IOException ex) {
                        System.err.println(">> Loi: "+ ex.getMessage());
                    }
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

    //doc du lieu tu file co ten trong bien [fname]
    private void loadText() {
        
        ds = new ArrayList<>();
        
        Path p = Paths.get(fname);
        
        try {
            List<String> lines = Files.readAllLines(p);
            for (String item : lines) {

                var s =item.split(",");
                if(s.length==4){
                    Employee e = new Employee();
                    e.id = s[0].trim();
                    e.name = s[1].trim();
                    e.position = s[2].trim();
                    e.salary = Integer.parseInt(s[3].trim());
                    
                    ds.add(e);
                }
            }
        } catch (IOException ex) {
            System.err.println(" >> Loi: " + ex.getMessage());
        }
    }

}

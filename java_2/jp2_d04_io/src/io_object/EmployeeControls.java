/*
chuong trinh quan ly danh sach nhan vien trong Hashtable, 
             luu danh sach nv vo tap tin nhi phan (object) 'nhanvien.data'
 */
package io_object;

import java.util.*;
import java.io.*;
import entity.Employee;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeControls {

    public static void main(String[] args) {
        new EmployeeControls().menu();
    }

    Hashtable<String, Employee> ds = new Hashtable<>();

    private void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        
        //nap du lieu tu tap tin 'nhanvien.data' vo Hashtable [ds]
        load();     
        
        while (true) {
            System.out.println("\n\n +++ MENU (Hashtable)+++");
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
                    save();
                    return;
                }

            }
        }
    }

    private void create() {
        Employee e = new Employee();
        e.input();
        if (ds.containsKey(e.id)) {
            System.err.println(" >> Loi: id da ton tai. Tu choi thao tac.");
            return;
        }
        ds.put(e.id, e);        // cat thong tin nv  trong bien [e] vo hashtable [ds]
        System.out.println(" >> Them nhan vien moi thanh cong !");
    }

    private void display() {
        if (ds.isEmpty()) {
            System.err.println("\n >>> Loi: HT chua co du lieu");
            return;
        }

        System.out.println("\n Danh sach nhan vien: ");
        ds.values().forEach(System.out::println);
    }

    String fname = "nhanvien.data";

    private void save() {
        if (ds.isEmpty()) {
            System.err.println("\n >>> Loi: HT chua co du lieu");
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname))) {
            oos.writeObject(ds);
        } catch (IOException ex) {
            System.err.println(" >> Loi: " + ex.getMessage());
        }

        System.out.println("Ghi file hoan tat !");
    }

    
    //nap du lieu tu tap tin 'nhanvien.data' vo Hashtable [ds]
    private void load() {
        File f = new File(fname);
        if(f.exists()){
            try (ObjectInputStream iis = new ObjectInputStream(new FileInputStream(f)))
            {
                ds = (Hashtable<String, Employee>) iis.readObject();
            } catch (FileNotFoundException ex) {
                System.err.println(" >> Loi: " + ex.getMessage());
            } catch (IOException | ClassNotFoundException ex) {
                System.err.println(" >> Loi: " + ex.getMessage());
            }
        
        }
    }

}

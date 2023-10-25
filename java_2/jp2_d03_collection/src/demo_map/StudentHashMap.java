/*
CT Quan Ly danh sach sinh vien trong cau truc HashMap. bao gom cac chuc nang
    - them
    - in danh sach/ tim kiem
    - xoa 
 */
package demo_map;

import java.util.*;
import entity.*;

public class StudentHashMap {

    public static void main(String[] args) {
        new StudentHashMap().menu();
    }

    Map<String, Student> ds = new HashMap<>();

    private void menu() {
        String op = "";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n +++ MENU (HASH-MAP) +++");
            System.out.println("1. them sinh vien");
            System.out.println("2. xem danh sach");
            System.out.println("3. tim sv theo ten");
            System.out.println("4. xoa sv theo ma so");
            System.out.println("5. ket thuc chuong trinh");
            System.out.println("=========================");
            System.out.print(" >> nhap ma so chuc nang [1-5]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1" ->
                    create();
                case "2" ->
                    display();
                case "3" -> {
                    System.out.print("\n - nhap ten cua sinh vien: ");
                    display(sc.nextLine().trim());
                }
                case "4" -> {
                    if (ds.isEmpty() == false) {
                        System.out.print("\n - nhap id cua sinh vien: ");
                        remove(sc.nextLine().trim());
                    }
                }
                case "5" -> {
                    return;
                }

            }
        }
    }

    private void create() {
        Student sv = new Student(); //tao doi tuong sv - kieu Student(chua co noi dung)
        sv.input();                 // goi ham input() tren doi tuong [sv] de user nhap thong tin

        //kiem tra ma so sv da ton tai trong danh sach ?
        if (ds.containsKey(sv.id)) {
            System.err.println("\n >> Loi: Ma trung. Tu choi them moi !");
        } else {
            // luu bien sv vo HashMap [ds] 
            ds.put(sv.id, sv);
            System.out.println("\n >> Them sv moi thanh cong !");
        }

    }

    private void display() {
        if (ds.isEmpty()) {
            System.err.println("\n >> Loi: HT chua co du lieu ");
            return;
        }

        System.out.println("\n Danh sach sinh vien");
        for (Student item : ds.values()) {
            System.out.println(item);
        }
    }

    private void display(String tenSV) {
        if (ds.isEmpty()) {
            System.err.println("\n >> Loi: HT chua co du lieu ");
            return;
        }

        int cntTen = 0;
        String regex = "(?i).*" + tenSV + ".*";

        for (Student item : ds.values()) {
            if (item.name.matches(regex)) {
                System.out.println(item);
                cntTen++;
            }
        }

        if (cntTen == 0) {
            System.err.println(" >>> Ko tim thay !!!");
        }
    }

    private void remove(String maSV) {
        //tim sv trong [ds] co id= maSV de xoa
        if (ds.containsKey(maSV)) {
            ds.remove(maSV);
            System.out.println("\n >> Da xoa thanh cong !");
        }
        else{
             System.err.println(" >> Ko tim thay sinh vien muon xoa !");
        }
    }
    
}

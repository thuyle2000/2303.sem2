/*
CT Quan Ly danh sach sinh vien trong cau truc TreeSet. bao gom cac chuc nang
    - them
    - in danh sach/ tim kiem
    - xoa 
 */
package demo_set;

import java.util.*;
import entity.*;

public class StudentTreeSet {

    public static void main(String[] args) {
        new StudentTreeSet().menu();
    }

    Set<Student> ds = new TreeSet<>((o1, o2) -> o1.id.compareTo(o2.id));

    private void menu() {
        String op = "";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n +++ MENU (TREE-SET) +++");
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
        if (ds.add(sv)) {           // luu bien sv vo TreeSet [ds] 
            System.out.println("\n >> Them sv moi thanh cong !");
        }
        else{
            System.err.println("\n >> Loi: Ma trung. Tu choi them moi !");
        }
    }

    private void display() {
        if (ds.isEmpty()) {
            System.err.println("\n >> Loi: HT chua co du lieu ");
            return;
        }

        System.out.println("\n Danh sach sinh vien");
        for (Student item : ds) {
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

        for (Student item : ds) {
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

        for (Student sv : ds) {
            if (sv.id.equals(maSV)) {
                ds.remove(sv);
                System.out.println("\n >> Da xoa thanh cong !");
                return;
            }
        }
        System.err.println(" >> Ko tim thay sinh vien muon xoa !");
    }
}

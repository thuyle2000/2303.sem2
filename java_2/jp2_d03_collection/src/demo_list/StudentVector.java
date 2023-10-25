/*
CT Quan Ly danh sach sinh vien trong cau truc ArrayList. bao gom cac chuc nang
    - them
    - in danh sach/ tim kiem
    - xoa 
 */
package demo_list;

import java.util.*;
import entity.*;

public class StudentVector {

    public static void main(String[] args) {
        new StudentVector().menu();
    }

    List ds = new Vector();

    private void menu() {
        String op = "";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n +++ MENU (Vector) +++");
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
        sv.input();     // goi ham input() tren doi tuong [sv] de user nhap thong tin
        ds.add(sv);     // luu bien sv vo arraylist [ds] 

        System.out.println("\n >> Them sv moi thanh cong !");
    }

    private void display() {
        if (ds.isEmpty()) {
            System.err.println("\n >> Loi: HT chua co du lieu ");
            return;
        }

        System.out.println("\n Danh sach sinh vien");
        for (int i = 0; i < ds.size(); i++) {
            System.out.println(ds.get(i));
        }
    }

    private void display(String tenSV) {
        if (ds.isEmpty()) {
            System.err.println("\n >> Loi: HT chua co du lieu ");
            return;
        }

        int cntTen = 0;
        Student sv = null;
        String regex = "(?i).*" + tenSV + ".*";

        for (Object item : ds) {
            sv = (Student) item;
            if (sv.name.matches(regex)) {
                System.out.println(sv);
                cntTen++;
            }
        }

        if (cntTen == 0) {
            System.err.println(" >>> Ko tim thay !!!");
        }
    }

    private void remove(String maSV) {
        //tim sv trong [ds] co id= maSV de xoa
        Student sv = null;
        Iterator it = ds.iterator();
        
        while (it.hasNext()) {
            sv = (Student) it.next();
            if(sv.id.equals(maSV)){
                it.remove();
                System.out.println("\n >> Da xoa thanh cong !");
                return;
            }
        }
        
//        for (Object item : ds) {
//            sv = (Student) item;
//            if(sv.id.equals(maSV)){
//                ds.remove(item);
//                System.out.println("\n >> Da xoa thanh cong !");
//                return;
//            }
//        }
        System.err.println(" >> Ko tim thay sinh vien muon xoa !");
        
    }

}

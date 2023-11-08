/*
chuong trinh quan ly cac lop hoc, bao gom chuc nang:
- xem danh sach 
- them lop hoc moi
- xoa lop hoc theo ma so

 */
package demo;

import entity.*;
import java.util.*;

public class BatchManagement {

    public static void main(String[] args) {
        new BatchManagement().menu();
    }

    private void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        while (true) {
            System.out.println("\n ++ MENU ++");
            System.out.println("1. xem danh sach cac lop hoc");
            System.out.println("2. them lop hoc moi");
            System.out.println("3. xoa lop hoc theo ma so");
            System.out.println("4. ket thuc chuong trinh");
            System.out.println("---------------------------");
            System.out.print(" vui long nhap ma chuc nang [1-4]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1" -> {
                    System.out.println("danh sach cac lop hoc");
                    BatchDAO.get().forEach(System.out::println);
                }
                case "2" -> create();
                case "3" -> delete();
                case "4" -> {
                    return;
                }
            }
        }
    }

    private void create() {
        Batch b = new Batch();
        b.input();
        if(BatchDAO.create(b)>0){
            System.out.println(" >> Them lop hoc moi thanh cong.");
        }
        else{
            System.err.println(" >> Loi: them lop hoc that bai !");
        }
    }

    private void delete() {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\t nhap ma so lop hoc: ");
        String lop = sc.nextLine().trim();
        if(BatchDAO.delete(lop) > 0){
            System.out.println(" >> Da xoa lop hoc thanh cong");
        }
        else{
            System.err.println(" >> Loi: xoa lop hoc that bai !");
        }
    }

}

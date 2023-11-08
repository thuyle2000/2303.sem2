package entity;

import java.util.*;

public class TestEmployee {

    public static void main(String[] args) {
        new TestEmployee().menu();
    }

    private void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        while (true) {
            System.out.println("\n ++ MENU ++");
            System.out.println("1. tao nhan vien moi");
            System.out.println("2. xem danh sach nhan vien");
            System.out.println("3. danh sach nv muc luong >= 300");
            System.out.println("4. tim nv theo ten");
            System.out.println("5. xoa nv theo ma so");
            System.out.println("6. ket thuc chuong trinh");
            System.out.println("---------------------------");
            System.out.print(" vui long nhap ma chuc nang [1-7]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1" ->
                    create();
                case "2" -> {
                    System.out.println("danh sach nv");
                    EmployeeDAO.get().forEach(System.out::println);
                }
                case "3" -> {
                    System.out.println("danh sach nv co muc luong tren 300");
                    EmployeeDAO.get().stream().filter(x -> x.salary >= 300).forEach(System.out::println);
                }

                case "4" -> {
                    System.out.print("\n\t - nhap ten nhan vien: ");
                    var ten = sc.nextLine().trim();
                    var rten = "(?i).*" + ten + ".*";
                    if (EmployeeDAO.get().stream().filter(x -> x.name.matches(rten)).count() == 0) {
                        System.err.println(" >> Ko tim thay !");
                    } else {
                        EmployeeDAO.get().stream().filter(x -> x.name.matches(rten)).forEach(System.out::println);
                    }
                }

                case "5" ->
                    delete();

                case "6" -> {
                    return;
                }
            }
        }
    }

    private void create() {
        Employee b = new Employee();
        b.input();

        if (EmployeeDAO.create(b) > 0) {
            System.out.println(" >> Them nhan vien moi thanh cong.");
        } else {
            System.err.println(" >> Loi: them nhan vien that bai !");
        }

    }

    private void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t nhap ma so nhan vien: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        
        if (EmployeeDAO.delete(id) > 0) {
            System.out.println(" >> Da xoa nhan vien thanh cong");
        } else {
            System.err.println(" >> Loi: xoa nhan vien that bai !");
        }
    }

}

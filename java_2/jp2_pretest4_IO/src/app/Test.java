/*
Class Test is a main class.
In the main class, an instance of the class MemberCatalog is created.
The application initially displays a menu with the following options.
1. Register a new member
2. Publish the entire list of members
3. Display members by age required.
4. Save list of member
5. Exit
 */
package app;

import java.util.*;
public class Test {

    public static void main(String[] args) {
        new Test().menu();
    }

    MemberCatalog mc = new MemberCatalog();
    private void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        while(true){
            System.out.println("\n +++ MENU +++");
            System.out.println("1. them thanh vien moi");
            System.out.println("2. in toan bo danh sach");
            System.out.println("3. in ds thanh vien theo do tuoi");
            System.out.println("4. luu danh sach vo tap tin van ban");
            System.out.println("5. ket thuc chuong trinh");
            System.out.println("----------------------------");
            System.out.print(" vui long nhap ma so chuc nang [1-5]: ");
            op = sc.nextLine().trim();
            switch (op) {
                case "1" ->                 {
                    Member m = new Member();
                    m.input();
                    mc.put(m);
                }
                case "2" -> mc.get();
                case "3" -> {
                    System.out.print(" - nhap do tuoi : ");
                    int age = Integer.parseInt(sc.nextLine().trim());
                    mc.get(age);
                }
                case "4"-> mc.save();
                case "5"-> {
                    return;
                }
            }
        }
    }
    
}

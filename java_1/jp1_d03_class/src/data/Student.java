/*
class mo ta au truc sinh vien, bao gom:
- cac thuoc tinh du lieu (fields): id, name, email, yob
- cac phuong thuc xu ly (methods): input(), toString()
 */
package data;

import java.util.Scanner;

public class Student {

    //khai bao cac thuoc tinh
    public String id, name;
    protected String email;
    private String password;
    int yob;

    //ham dung ko tham so (constructor)
    public Student() {
        id = "S00";
        name = "Truong";
        email = "truong@gmail.com";
        yob = 2000;
    }

    //ham dung co tham so
    public Student(String id, String name, String email, int yob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.yob = yob;
    }

    //phuong thuc (ham) thuc hien tac vu nhap thong tin cho sv
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" -- nhap du lieu sinh vien --");
        System.out.print(" - id: ");
        id = sc.nextLine().trim();
        System.out.print(" - ho ten: ");
        name = sc.nextLine().trim();
        System.out.print(" - email: ");
        email = sc.nextLine().trim();
        System.out.print(" - nam sinh: ");
        yob = sc.nextInt();
    }

    @Override
    public String toString() {
        return String.format("id=%s, ten=%s, email=%s, nam sinh=%d ", id, name, email, yob);
    }

    /*test thu doi tuong sinh vien dc lap trinh dung ko*/
    public static void main(String[] args) {
        Student sv = new Student();
        Student sv1 = new Student("s20", "Le min", "min@gmail.com", 1998);

        Student sv2 = new Student();
        sv2.input();

        System.out.printf("\n sv hash code: %x \n", sv.hashCode());
        System.out.println("sv: " + sv);

        System.out.printf("\n sv1 hash code: %x \n", sv1.hashCode());
        System.out.println("sv1: " + sv1);

        System.out.printf("\n sv2 hash code: %x \n", sv.hashCode());
        System.out.println("sv2: " + sv2);
    }
}

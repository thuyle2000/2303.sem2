/*
class mo ta cau truc sinh vien, bao gom 
- thuoc tinh: 
    id (SVxxx[xx]) , x: ky so
    name : chi chua ky tu chu hoac ' '. it nhat 3 ky tu, toi da 30 ky tu
    yob : nam sinh tu 1960-2010
    location: dia diem truong hoc [HN, SG, DN, CT, QN]
    
- phuong thuc: input(), toString()
 */
package entity;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    public String id, name, location;
    public int yob;

    public Student() {
        id = "SV000";
        name = "vo danh";
        yob = 2004;
        location = "SG";
    }

    public Student(String id, String name, String location, int yob) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.yob = yob;
    }

    public void input() {
        System.out.println("\t nhap thong tin cua sinh vien");
        Scanner sc = new Scanner(System.in);

        Pattern p = Pattern.compile("SV\\d{3,5}");  //format cua ma so sv
        Matcher m = null;
        while (true) {
            System.out.print("- nhap id (SVxxx[xx]): ");
            id = sc.nextLine().trim();
            m = p.matcher(id);
            if (m.matches()) {
                break;
            }
            System.err.println(">> Loi: id ko hop le !");
        }

//        p = p.compile("[a-z ]{3,30}", Pattern.CASE_INSENSITIVE);
        while (true) {
            System.out.print("- nhap ho ten : ");
            name = sc.nextLine().trim();
            if (Pattern.matches("(?i)[a-z ]{3,30}", name)) {
                break;
            }
            System.err.println(">> Loi: ten ko hop le (tu 3-30 ky tu) !");
        }

        while (true) {
            try {
                System.out.print("- nhap nam sinh [1960-2010] : ");
                yob = Integer.parseInt(sc.nextLine().trim());
                if (yob >= 1960 && yob <= 2010) {
                    break;
                }
            } catch (Exception e) {
                System.err.println(">> Loi: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("- nhap dia diem (CT/DN/QN/SG/HN) : ");
            location = sc.nextLine().trim();
            if (location.matches("(?i)(HN|SG|CT|DN|QN)")) {
                break;
            }
            System.err.println(">> Loi: dia diem ko hop le !");
        }
    }

    @Override
    public String toString() {
        return String.format("%-8s, %-20s, %4d, %s", id, name, yob, location);
    }

    //override 2 phuong thuc equals() va hashCode() de thiet lap dieu kien 2 doi tuong sv giong nhau 
    @Override
    public boolean equals(Object obj) {
        Student sv = (Student) obj;
        return this.id.equals(sv.id);
    }

    @Override
    public int hashCode() {
        return 1000;
    }

    
    
    
    
    //code de test cac phuong thuc xay dung trong class Student
    public static void main(String[] args) {
        Student sv = new Student();
        sv.input();
        System.out.println("Thong tin sinh vien: " + sv);
    }

}

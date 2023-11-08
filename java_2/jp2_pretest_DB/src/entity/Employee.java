/*
cau truc cua 1 lop hop - tuong duong cau truc bang tbBatch
 */
package entity;

import java.util.Scanner;

public class Employee {

    public int id;
    public String name;
    public boolean gender;
    public int salary;

    public Employee() {
    }

    public Employee(int id, String name, boolean gender, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    

    @Override
    public String toString() {
        return String.format("%5d, %-20s, %-4s, %6d", id, name,gender?"nam":"nu", salary);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("- nhap ho ten nhan vien [tu 3-50 ky tu]: ");
            name = sc.nextLine().trim();
            if (name.length()>2 && name.length()<50) {
                break;
            }
        }
        
        var s = "";
        while (true) {
            System.out.print("- nhap gioi tinh [nam/nu]: ");
            s = sc.nextLine().trim().toLowerCase();
            if (s.equals("nam")) {
                gender = true;
                break;
            }
            else if(s.equals("nu")){
                gender = false;
                break;
            }
        }

        while (true) {
            try {
                System.out.print("- nhap luong [0-10000]: ");
                salary = Integer.parseInt(sc.nextLine().trim());
                if (salary>=0 && salary<=10000) {
                    break;
                }
            } catch (Exception e) {
                System.err.println(" >> Loi: "+ e.getMessage());
            }
        }

    }
}

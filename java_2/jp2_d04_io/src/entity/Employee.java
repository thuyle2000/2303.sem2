/*
mo ta cau truc tong quat cua 1 nhan vien
 */
package entity;

import java.util.Scanner;

public class Employee implements java.io.Serializable {

    public String id;
    public String name;
    public String position;
    public int salary;

    public Employee() {
    }

    public Employee(String id, String name, String position, int salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap thong tin nhan vien: ");
        while (true) {
            System.out.print(" - id (Exx[xxx]): ");
            id = sc.nextLine().trim();

            if (id.matches("E\\d{2,5}")) {
                break;
            }
        }

        while (true) {
            System.out.print(" - ho ten : ");
            name = sc.nextLine().trim();

            if (name.length() >= 2 && name.length() <= 30) {
                break;
            }
        }

        System.out.print(" - chuc vu : ");
        position = sc.nextLine().trim();

        while (true) {
            try {
                System.out.print(" - luong cb [0-3000] : ");
                salary = Integer.parseInt(sc.nextLine().trim());
                if(salary >=0 && salary<=3000){
                    break;
                }
            } catch (Exception e) {
                System.err.println(" >> Loi: "+ e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", id, name, position, salary);
    }

}

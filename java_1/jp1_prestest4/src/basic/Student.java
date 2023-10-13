/*
Create abstract class Student in basic package that stores the following details:
- Protected Fields: id, name, yob(year of birth)
- Constructors to initialise the all fields.
- Methods:
public abstract void print()
public void input (): input data for a student with following constraints:
• ID, name is not null
• Age must be between 15 and 60
 */
package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author THUYLM
 */
public abstract class Student {

    protected String id, name;
    protected int yob;

    public Student() {
        id = "SV01";
        name = "vo danh";
        yob = 2005;
    }

    public Student(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public abstract void print();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap thong tin sinh vien");

        while (true) {
            System.out.print(" - nhap id: ");
            id = sc.nextLine().trim();
            if (id.isEmpty()) {
                System.err.println("LOI: id ko hop le !");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print(" - nhap ho ten: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.err.println("LOI: Ho ten ko hop le !");
                continue;
            }
            break;
        }

        int year = java.time.Year.now().getValue(); //lay nam hien tai
        while (true) {
            try {
                System.out.print(" - nhap nam sinh : ");
                yob = Integer.parseInt(sc.nextLine().trim());
                var age = year - yob;
                if (age<15 || age>60){
                    System.err.println("LOI: tuoi ko hop le (15-60)!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("LOI: " + e.getMessage());
            }
        }

    }

}

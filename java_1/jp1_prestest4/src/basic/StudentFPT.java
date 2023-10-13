/*
Create sub class StudentFPT derives from Student, in package basic. Including:
- Fields: theoryMark, practiceMark, project.
- Constructors to initialise the all fields.
- public float getFinal() : return the final mark that calculated by formula :
(theoryMark*2 + practiceMark + project*3)/6
- Override methods :
input(): allow user input more data into data fields theoryMark, practiceMark,
project. Using try-catch exception for data validation: marks must be between 0
and 100
print():display detailed information of a student, including final mark.
 */
package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentFPT extends Student {

    public int theoryMark, practiceMark, project;

    public StudentFPT() {
        theoryMark = practiceMark = project = 39;
    }

    public StudentFPT(int theoryMark, int practiceMark, int project, String id, String name, int yob) {
        super(id, name, yob);
        this.theoryMark = theoryMark;
        this.practiceMark = practiceMark;
        this.project = project;
    }

    public float getFinal() {
        return (theoryMark * 2 + practiceMark + project * 3) / 6.0F;
    }

    @Override
    public void input() {
        super.input();

        //lap trinh de nhap them diem ly thuyet, thuc hanh va do an
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(" - nhap diem LT [0-100] : ");
                theoryMark = Integer.parseInt(sc.nextLine().trim());

                if (theoryMark < 0 || theoryMark > 100) {
                    System.err.println("LOI: diem ko hop le (0-100)!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("LOI: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print(" - nhap diem TH [0-100] : ");
                practiceMark = Integer.parseInt(sc.nextLine().trim());

                if (practiceMark < 0 || practiceMark > 100) {
                    System.err.println("LOI: diem ko hop le (0-100)!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("LOI: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print(" - nhap diem do an [0-100] : ");
                project = Integer.parseInt(sc.nextLine().trim());

                if (project < 0 || project > 100) {
                    System.err.println("LOI: diem ko hop le (0-100)!");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.err.println("LOI: " + e.getMessage());
            }
        }

    }

    @Override
    public void print() {
        System.out.println("\t Thong tin sinh vien");
        System.out.println("- id: " + id);
        System.out.println("- ho ten: " + name);
        System.out.println("- tuoi: " + (java.time.Year.now().getValue() - yob));
        System.out.println("   diem LT: " + theoryMark);
        System.out.println("   diem TH: " + practiceMark);
        System.out.println("   diem do an: " + project);
        System.out.printf("   diem ket qua: %.2f \n" , getFinal());
    }

    @Override
    public String toString() {
        return String.format("ID=%s, Ten=%s, Nam sinh=%d, LT=%d, TH=%d, Project=%d",id, name, yob,theoryMark, practiceMark, project );
    }
    
    
    
}

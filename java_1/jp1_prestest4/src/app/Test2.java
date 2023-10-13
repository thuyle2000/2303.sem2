/*
Create a main class named Test in app package, manage a list of StudentFPT, declares :
Fields:
    - StudentFPT[ ] arr: store array of the students
    - max: the maximum of the number of students in the array.
    - next: the actual number of students in the array.
Methods:
    - add(): create a new studentFPT and then save into the array. However, if the
    array is full, display an error message.
    - displayAll(): list all students
    - displayPass(): display list of the students passed the examinations (each mark
    must be greater than 40 and final mark >=50 )
    - displayTop1(): display list of the students had the highest score.
    - main(): to invoke above functions through a menu system.
        Use the switch-case and loop statements to displays a following menu.
        1. Add new student
        2. Display all students
        3. Display students passed the examinations
        4. Display Top 1 Students
        5. Exit
 */
package app;

import basic.*;
import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        new Test2().menu();
    }

    int max = 5;
    int next = 0;
    StudentFPT[] arr = new StudentFPT[max];

    private void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        while (true) {
            System.out.println("\n +++ MENU +++");
            System.out.println("1. Add new student");
            System.out.println("2. Display all students");
            System.out.println("3. Display students passed the examinations");
            System.out.println("4. Display Top 1 Students");
            System.out.println("5. Exit");
            System.out.println("==============================");
            System.out.print("  >> plz input your choice [1-5]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1" -> {
                    if (next < max) {
                        StudentFPT sv = new StudentFPT();
                        sv.input();
                        add(sv);
                    }
                    else{
                        System.err.println("Error: System Overload !");
                    }
                }
                
                case "2" -> displayAll();
                
                case "3" -> displayPass();
                case "4" -> displayTop1();
                case "5" -> {
                    return;
                }
            }
        }
    }

    private void add(StudentFPT sv) {
        arr[next] = sv;
        next++;
        System.out.println(" >> add new student successfully! ");
    }

    private void displayAll() {
        if(next==0){
            System.err.println("Error: Empty Data !");
            return;
        }
        
        System.out.println("\n Student List");
        for (int i = 0; i < next; i++) {
            System.out.println(arr[i]);
        }
    }

    private void displayPass() {
        if(next==0){
            System.err.println("Error: Empty Data !");
            return;
        }
        
        int cnt =0;
        for (int i = 0; i < next; i++) {
            if(arr[i].practiceMark>=40 && arr[i].theoryMark>=40 && arr[i].project>=40 && arr[i].getFinal()>=50){
                arr[i].print();
                cnt++;
            }
        }
        
        if(cnt == 0){
            System.out.println(" >> NOT FOUND !!!");
        } 
    }

    private void displayTop1() {
        if(next==0){
            System.err.println("Error: Empty Data !");
            return;
        }
        
        float max = 0;
        
        //tim diem cao nhat
        for (int i = 0; i < next; i++) {
            if(arr[i].practiceMark>=40 && arr[i].theoryMark>=40 && arr[i].project>=40 && arr[i].getFinal()>=50){
                max = max < arr[i].getFinal() ? arr[i].getFinal() : max;
            }
        }
        
        //in ra cac sv co diem cao nhat
        for (int i = 0; i < next; i++) {
            
            if(arr[i].practiceMark>=40 && arr[i].theoryMark>=40 && arr[i].project>=40 && arr[i].getFinal()>=50 && arr[i].getFinal() == max){
                arr[i].print();
            }
        }
        
    }

}

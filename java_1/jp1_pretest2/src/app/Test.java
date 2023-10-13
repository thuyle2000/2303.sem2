/*
Create java main class Test in package app for managing a collection of Cylinders:
- Fields: max, next – cList (array of cylinders)
- Methods:
- void add() - add a new cylinder
- void display() - display all cylinders.
- void display( float v ) - display cylinders having volume greater than v.
- void menu() - allows to manage the list of cylinders through the menu system as follows.
1. Add a new cylinder
2. Display all cylinders
3. Display all cylinders having required volume
4. Exit
 */
package app;

import data.*;
import java.util.*;
public class Test {

    public static void main(String[] args) {
        new Test().menu();
    }

    int max = 5;
    int next = 0;
    Cylinder cList[] = new Cylinder[max];
    
    private void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        
        while(true){
            System.out.println("\n +++ MENU +++");
            System.out.println(" ============");
            System.out.println("1. Add a new cylinder");
            System.out.println("2. Display all cylinders");
            System.out.println("3. Display all cylinders having required volume");
            System.out.println("4. Exit");
            System.out.print("\n Plz input your choice [1-4]: ");
            op = sc.nextLine().trim();
            switch (op) {
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    System.out.print(" >> nhap the tich khoi : ");
                    display(sc.nextFloat());
                    break;
                case "4":return;
                
            }
        }
    }

    private void add() {
        if(next==max){
            System.err.println("LOI: He thong het bo nho roi ! Tu choi thao tac.");
            return;
        }
        Cylinder c = new Cylinder();
        System.out.println("Nhap thong tin cua hinh khoi tru");
        c.accept(); 
        cList[next] = c;
        next++;
    }

    private void display() {
        if(next==0){
            System.err.println("LOI: he thong chua co du lieu");
            return;
        }
        
        for (int i = 0; i < next; i++) {
//            cList[i].printInfo();   
           System.out.printf(" %2d. %s \n", i+1, cList[i]);
        }
    }

    private void display(float vol) {
        if(next==0){
            System.err.println("LOI: he thong chua co du lieu");
            return;
        }
        
        int cnt = 0;
        for (int i = 0; i < next; i++) {
            if(cList[i].volume()>=vol){
                  cList[i].printInfo();   
                  cnt++;
            }
        }// ket thuc FOR
        if(cnt==0){
            System.err.println("LOI: ko tim thay !!!");
        }
    }
    
}

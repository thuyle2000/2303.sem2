/*
chuong trinh quan ly cac doi tuong hinh chu nhat va hinh tron.
bao gom cac chuc nang
1. them hinh tron
2. them hinh chu nhat
3. in danh sach cac hinh hoc 
4. in cac hinh tron
5. in ra cac hinh vuong
6. in ra cac hinh co dien tich theo yeu cau
7. ket thuc chuong trinh
 */
package app;

import model.*;
import java.util.Scanner;

public class ShapeControlPanel {

    public static void main(String[] args) {
        new ShapeControlPanel().menu();
    }

    int max = 10;
    int index = 0;
    Shape[] ds = new Shape[max];

    private void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        while (true) {
            System.out.println("\n +++ MENU +++");
            System.out.println(" 1. them hinh tron");
            System.out.println(" 2. them hinh chu nhat");
            System.out.println(" 3. in toan bo ds cac hinh hoc");
            System.out.println(" 4. in ds cac hinh tron");
            System.out.println(" 5. in ds cac hinh vuong");
            System.out.println(" 6. in cac hinh co dien tich theo yc");
            System.out.println(" 7. ket thuc chuong trinh");
            System.out.println("=============================");
            System.out.print(" >> nhap ma chuc nang [1-7]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    if (index < max) {
                        Circle c = new Circle();
                        c.input();
                        create(c);
                    } else {
                        System.err.println("LOI: Het bo nho !");
                    }
                    break;
                case "2":
                    if (index < max) {
                        Rectangle c = new Rectangle();
                        c.input();
                        create(c);
                    } else {
                        System.err.println("LOI: Het bo nho !");
                    }
                    break;
                case "3":
                    display();
                    break;

                case "4":
                    display("circle");
                    break;

                case "5":
                    display("square");
                    break;
                case "6":
                    System.out.print(" - nhap dien tich: ");
                    float dt = Float.parseFloat(sc.nextLine().trim());
                    display(dt);
                    break;

                case "7":
                    return;
                default:
                    System.err.println("LOI: Nhap sai ma so chuc nang! ");
            }
        }
    }

    private void create(Shape c) {
        ds[index] = c;
        index++;
        System.out.println(">> Them hinh moi thanh cong !");
    }

    private void display() {
        if (index == 0) {
            System.err.println("LOI: He thong chua co du lieu !");
            return;
        }

        System.out.println("\n Cac doi tuong hinh hoc");
        for (int i = 0; i < index; i++) {
            System.out.println(ds[i]);
        }
    }

    private void display(String shape) {
        if (index == 0) {
            System.err.println("LOI: He thong chua co du lieu !");
            return;
        }
        int cnt = 0;
        boolean circle = shape.equalsIgnoreCase("circle");

        if (circle) {
            for (int i = 0; i < index; i++) {
                if (ds[i] instanceof Circle) {
                    System.out.println(ds[i]);
                    cnt++;
                }
            }// ket thuc for
        } else {
            for (int i = 0; i < index; i++) {
                if (ds[i] instanceof Rectangle) {
                    Rectangle item = (Rectangle) ds[i];
                    if (item.length == item.width) {
                        System.out.println(item);
                        cnt++;
                    }
                }
            }
        }

        if (cnt == 0) {
            System.err.printf(" >> Ko tim thay hinh %s !\n", circle ? "tron" : "vuong");
        }
    }

    private void display(float dt) {
        if (index == 0) {
            System.err.println("LOI: He thong chua co du lieu !");
            return;
        }
        
        int cnt=0;
        for (int i = 0; i < index; i++) {
            if(ds[i].area()>=dt){
                System.out.println(ds[i]);
                cnt++;
            }
        }//ket thuc fOR
        if(cnt==0){
            System.err.printf(">> Loi: Ko tim thay hinh co dien tich >=%.2f", dt);
        }
    }

}

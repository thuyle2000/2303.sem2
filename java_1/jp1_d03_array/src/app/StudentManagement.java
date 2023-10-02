/*
chuong trinh quan ly danh sach sinh vien trong mang-10 phan tu. 
bao gom cac chuc nang:
    1. them sv moi
    2. in danh sach sv
    3. thoat
 */
package app;

import java.util.Scanner;
import data.Student;
public class StudentManagement {   
    public static void main(String[] args) {
        new StudentManagement().menu();
    }
    
    
    //code khai bao va khoi tao mang ds[] chua toi da 10-sinh vien
    int max=10;
    int index=0;
    Student[] ds = new Student[max];
    
    private void menu(){
        Scanner sc = new Scanner(System.in);
        String op="";
        while(true){
            System.out.println("\n === MENU ===");
            System.out.println(" 1. them sinh vien moi");
            System.out.println(" 2. in danh sach sinh vien");
            System.out.println(" 3. KET THUC CHUONG TRINH");
            System.out.println("==========================");
            System.out.print(" >> vui long nhap ma so chuc nang [1-3]: ");
            op = sc.nextLine().trim();
            
            switch (op) {
                case "1":
                    if(max==index){
                        System.err.println("Loi: het bo nho roi !");  
                    }else{
                        Student sv = new Student();
                        sv.input();
                        create(sv);
                        System.out.println(">> Them sv moi thanh cong !");
                    }
                    break;
                case "2":
                    if(index==0){
                        System.err.println("Loi: he thong chua co du lieu ");
                    }
                    else{
                        display();
                    }
                    break;
                case "3":
                    return;
                default:
                    System.err.println(">> Loi: nhap sai ma so chuc nang ! ");
            }
        }
    }

    private void create(Student sv) {
        // luu doi tuong sv vo ds[]
        ds[index] = sv;
        index++;
    }

    private void display() {
        System.out.println("\n Danh sach sinh vien");
        for (int i = 0; i < index; i++) {
            System.out.println(ds[i]);
        }
    }
    
}

/*
mo ta doi tuong sinh vien (duoc ke thua tu Person), bo sung them:
- thuoc tinh (instant fields): batch_no, final_mark
- phuong thuc : lap trinh lai input(), toString();
 */
package model;

import java.util.Scanner;

public class Student extends Person {

    public String batchNo;
    public float finalMark;

    public Student() {
        id = "S01";
        batchNo = "2302.M0";
        finalMark = 78.89F;
    }

    public Student(String batchNo, float finalMark, String id, String name, boolean gender, int yob) {
        super(id, name, gender, yob);
        this.batchNo = batchNo;
        this.finalMark = finalMark;
    }

    @Override
    public String toString() {
        return String.format("%-5s, %-20s, %-5s, %4d, %7.2f, %s", id, name, gender ? "nam" : "nu", yob, finalMark, batchNo);
    }

    @Override
    public void input() {
        super.input(); //goi ham input() cua lop cha [Person] de nhap 4 thuoc tinh: id, name, gender va yob

        //nhap tiep 2 thuoc tinh moi: batchNo va finalMark
        Scanner sc = new Scanner(System.in);
        System.out.print(" - nhap ma lop hoc: ");
        batchNo = sc.nextLine();
        System.out.print(" - nhap diem cuoi khoa: ");
        finalMark= sc.nextFloat();
    }
    
    public static void main(String[] args) {
        Student sv1 = new Student();
        Student sv2 = new Student("T1.2302.M0", 100F, "SV02", "Nguyen van Luong", true, 1998);
        Student sv3 = new Student();
        sv3.input();
        
        System.out.println("sv1 = "+  sv1);
        System.out.println("sv2 = "+  sv2);
        System.out.println("sv3 = "+  sv3);
    }

}

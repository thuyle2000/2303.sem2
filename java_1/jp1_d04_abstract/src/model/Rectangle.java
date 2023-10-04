/*
lop con hinh chu nhat (lop cha la Shape), bo sung them 
- thuoc tinh: rong width, dai :length
 */
package model;

import java.util.Scanner;
public class Rectangle extends Shape {
    public float width, length;

    @Override
    public float area() {
        return width * length;
    }

    @Override
    public float perimeter() {
        return (width + length) * 2;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(" - nhap chieu rong hinh chu nhat >0 :");
            width = sc.nextFloat();
            if (width < 0) {
                continue;
            }
            break;
        }

        while (true) {
            System.out.print(" - nhap chieu dai hinh chu nhat >0 :");
            length = sc.nextFloat();
            if (length < 0) {
                continue;
            }
            break;
        }
    }

    @Override
    public String toString() {
        return String.format("dt:%8.2f, cv:%8.2f, dai:%7.2f, rong:%7.2f ", area(), perimeter(), length, width) ;
    }
    
    
}

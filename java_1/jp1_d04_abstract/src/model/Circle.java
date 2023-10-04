/*
lop con hinh tron (lop cha la Shape), bo sung them 
- thuoc tinh: ban kinh r
 */
package model;

import java.util.Scanner;
public class Circle extends Shape{
    public float r;
    
    @Override
    public float area() {
        return r*r*PI;
    }

    @Override
    public float perimeter() {
        return 2*PI*r;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        
        while (true) {            
            System.out.print(" - nhap ban kinh hinh tron >0 :");
            r =sc.nextFloat();
            if(r<0) continue;
            break;
        }
    }

    @Override
    public String toString() {
        return String.format("dt:%8.2f, cv:%8.2f, bk:%8.2f", area(), perimeter(),r);
    }
    
}

/*
Create class Cylinder derives from Shape, implements IGeometry in package data, consists of:
- Fields : radius, height
- Constructors to initialize the all fields
- Override methods of Shape and IGeometry:
-accept() :
using try-catch exception for validation: radius, height must be greater than zero.
- printInfo() : display detailed information of a cylinder including radius, height, peripheral,
area, volume
- toString() : return a string presenting all the details of a cylinder
 */
package data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cylinder extends Shape implements IGeometry {

    public float radius, height;

    public Cylinder() {
        radius = height = 1;
    }

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(" nhap ban kinh  : ");
                radius = Float.parseFloat(sc.nextLine().trim());
                if (radius <= 0) {
                    throw new InputMismatchException("Du lieu ko hop le !");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("LOI: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print(" nhap chieu cao : ");
                height = Float.parseFloat(sc.nextLine().trim());
                if (height <= 0) {
                    throw new InputMismatchException("Du lieu ko hop le !");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("LOI: " + e.getMessage());
            }
        }

    }

    @Override
    public void printInfo() {
        System.out.println("\n Hinh tru ");
        System.out.printf(" - Ban kinh  : %.2f \n", radius);
        System.out.printf(" - Chieu cao : %.2f \n", height);
        System.out.printf("  => Chu vi   : %.2f \n", peripheral());
        System.out.printf("  => Dien tich: %.2f \n", area());
        System.out.printf("  => The tich : %.2f \n", volume());
    }

    @Override
    public double area() {
        return 2 * (PI * radius * radius) + (height * (2 * PI * radius));
    }

    @Override
    public double peripheral() {
        return 2 * PI * radius + 2 * PI * height;
    }

    @Override
    public double volume() {
        return PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return String.format("Ban kinh: %.2f, Cao: %.2f, Dien-Tich: %.2f, The-Tich:%.2f", radius, height, area(), volume() );
    }


}

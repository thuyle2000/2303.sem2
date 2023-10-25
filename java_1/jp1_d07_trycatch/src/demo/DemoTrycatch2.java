/*
demo cau truc bat loi try-catch, va cach dung lenh throw
 */
package demo;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoTrycatch2 {

    public static void main(String[] args) {
        DemoTrycatch2 p = new DemoTrycatch2();
        p.testThrow();
    }

    private void testThrow() {
        int mark = -1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(">> vui long nhap ket qua [0-100]: ");
                mark = sc.nextInt();
                if (mark >= 0 && mark <= 100) {
                    break;
                }
                else{
                    throw new Exception("Diem thi ko hop le !");
                }
            } catch (InputMismatchException e) {
                System.err.println("LOI: " + e);
                System.err.println("Vui long nhap lai !");
                sc.nextLine();
            } catch (Exception ex) {
                System.err.println("LOI: " + ex);
                System.err.println("Vui long nhap lai !");
            }
        }

        if (mark >= 40) {
            System.out.println(" => Chuc mwng, ban da tot nghiep !");
        } else {
            System.out.println(" => Hen gap lai o ky thi sau !");
        }
    }

}

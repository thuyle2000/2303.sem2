/*  demo try-catch exception  */
package demo;

import java.util.*;

public class DemoTryCatch {

    public static void main(String[] args) {
        DemoTryCatch p = new DemoTryCatch();
        p.test1();
        p.test2();

    }

    private void test1() {
        int n = -1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(" - vui long nhap 1 so nguyen: ");
                n = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Loi sai: " + e);
                sc.nextLine();
            }
        }// end while
        System.out.printf(" >> so duoc nhap : %d \n", n);

    }

    private float inputNumber() {
        float n = -1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(" - vui long nhap 1 so bat ky: ");
                n = sc.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Loi sai: " + e);
                System.err.println("Vui long nhap lai !");
                sc.nextLine();
            }
        }// end while
        return n;
    }

    private void test2() {
        float a = inputNumber();
        float b = inputNumber();

        System.out.println(">> KET QUA CUA CAC PHEP TOAN SO HOC");
        System.out.printf(" %8.2f  + %8.2f = %9.2f \n", a, b, a + b);
        System.out.printf(" %8.2f  - %8.2f = %9.2f \n", a, b, a - b);
        System.out.printf(" %8.2f  * %8.2f = %9.2f \n", a, b, a * b);
        System.out.printf(" %8.2f  / %8.2f = %9.2f \n", a, b, a / b);
        try {
            System.out.printf(" %8d  / %8d = %8d \n", (int) a, (int) b, (int) a / (int) b);
        } catch (ArithmeticException e) {
            System.err.println(" >> Loi sai: " +e);
        }

        System.out.printf(" %8.2f  %% %8.2f = %9.2f \n", a, b, a % b);
    }

}

/*  demo cau truc try-catch-finally, throw va throws  */
package demo;

import java.util.*;

public class DemoException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        while (true) {
            try {
                System.out.print("- nhap so nguyen a: ");
                a = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Loi: " + e.getMessage());
                sc.nextLine();
            }
        }

        while (true) {
            try {
                System.out.print("- nhap so nguyen b: ");
                b = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Loi: " + e.getMessage());
                sc.nextLine();
            }
        }

        sc = new Scanner(System.in);

        System.out.print("- nhap phep toan [ + - * / ]: ");
        String op = sc.nextLine();

        try {
            new DemoException().casio(a, b, op);

        } catch (ArithmeticException | AssertionError e) {
            System.err.println(">> Loi: " + e.getMessage());
        } catch (Exception e){
            System.err.println(">> Loi: " + e.getMessage());
        } finally {
            System.out.println(">> Neu co su co xay ra, xin loi vi su bat tien nay !");
        }

        System.out.println(">> Cam on ban da su dung chuong trinh ! ");
    }

    private void casio(int a, int b, String operator) throws ArithmeticException {
        switch (operator) {
            case "+" ->
                System.out.printf("%d + %d = %d \n", a, b, a + b);
            case "-" ->
                System.out.printf("%d - %d = %d \n", a, b, a - b);
            case "*" ->
                System.out.printf("%d * %d = %d \n", a, b, a * b);
            case "/" -> {
                if (b == 0) {
                    throw new ArithmeticException("Ko the thuc hien phep chia cho zero !");
                }
                System.out.printf("%d / %d = %d \n", a, b, a / b);
            }
            default ->
                throw new AssertionError();
        }
    }
}

/*  Demo class Runtime   */
package demo_lang;

import java.io.IOException;
import java.util.Scanner;

public class DemoRuntime {

    public static void main(String[] args) {
        try {
            new DemoRuntime().test_runtime();
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    private void test_runtime() throws IOException {
        Scanner sc = new Scanner(System.in);
        String op = "";
        Runtime r = Runtime.getRuntime();

        while (true) {
            System.out.println("\n +++ Menu +++");
            System.out.println("1. open calculator ");
            System.out.println("2. open notepad ");
            System.out.println("3. exit");
            System.out.println("====================");
            System.out.print(" >> enter your choice [1-3]: ");
            op = sc.nextLine();
            switch (op) {
                case "1" ->
                    r.exec("calc"); //mo chuong trinh may tinh calculator
                case "2" ->
                    r.exec("notepad"); //mo chuong trinh soan thao notepad
                case "3" ->
                    System.exit(0);  //ket thuc chuong trinh java
            }

        }
    }

}

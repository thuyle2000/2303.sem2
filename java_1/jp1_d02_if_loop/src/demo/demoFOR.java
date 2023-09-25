/* Demo vong lap FOR, FOR-EACH
 */
package demo;

import java.util.Scanner;

public class demoFOR {
    
    public static void main(String[] args) {
        demoFOR p = new demoFOR();
        p.Factorial();
        p.Stars();
        p.Display();
    }

    //ham tinh giai thua
    private void Factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> nhap so nguyen N [0-20]: ");
        int n = sc.nextInt();
        if (n < 0 || n > 20) {
            System.err.println("Loi: so nhap ko hop le !");
            return;
        }
        
        double r = 1;
        for (int i = 1; i <= n; i++) {
            r *= i;
        }
        System.out.printf(">> %d! = %.0f \n\n", n, r);
    }

    //ham in tam giac ngoi sao co n-dong: su dung NESTED-FOR
    private void Stars() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> nhap so nguyen N [0-20]: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    //ham in ra danh sach ho ten sv trong array : su dung FOR-EACH
    private void Display() {
        String[] ds = {"Le min Ho", "Ha the Doanh", "Le tien Thanh", "Nguyen Xuan Truong", "Tran thi Ngoc Hung", "Nguyen Quang Lin", "Le tat Thien", "Nguyen Anh Tuan", "Loan mat Nhung"};
        
        System.out.println("\n Danh sach ho ten sinh vien");
        for (int i = ds.length - 1; i >= 0; i--) {
            System.out.printf(" %2d. %s\n", i + 1, ds[i]);
        }
        
        System.out.println("\n Danh sach ho ten sinh vien");
        for (String item : ds) {
            System.out.println(item);
        }
        
    }
    
}

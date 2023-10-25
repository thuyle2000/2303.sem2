/*  Demo ve cac phuong thuc trong class Math  */
package demo_lang;


import java.util.Scanner;

public class DemoMath {

    public static void main(String[] args) {
        DemoMath o = new DemoMath();
        o.test_fn();
        o.test_random();
        
    }
    
    private void test_fn(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" - nhap 1 so thuc [d] : ");
        double d = Double.parseDouble(sc.nextLine().trim());
        
        System.out.printf("Math.sqrt(%.2f) = %.2f \n",d, Math.sqrt(d));
        System.out.printf("Math.round(%.2f) = %d \n",d, Math.round(d));
        System.out.printf("Math.floor(%.2f) = %.2f \n",d, Math.floor(d));
        System.out.printf("Math.ceil(%.2f) = %.2f \n",d, Math.ceil(d));
        System.out.printf("Math.pow(%.2f, 3) = %.2f \n",d, Math.pow(d, 3));
        
    }
    
    private void test_random(){
        //tao 5 so ngau nhien bat ky co gia tri tu 10->50 (so bat dau 10, do lech cac cap so tu 0->40)
        int n = 5;
        int a[] = new int[n];
        System.out.printf("\n %d so ngau nhien [10-40]: ", n);
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random()*40 + 10);
            System.out.printf("%3d ", a[i]);
        }
        
    }
}

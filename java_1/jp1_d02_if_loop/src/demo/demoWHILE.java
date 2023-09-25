/*  demo vong lap WHILE  */
package demo;

import java.util.Scanner;

public class demoWHILE {

    public static void main(String[] args) {
        demoWHILE p = new demoWHILE();
        p.testNumber();
        p.testPrimeNumber();
    }

    private void testNumber() {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print(">> nhap so nguyen N [3-10]: ");
            n = sc.nextInt();
            if (n >= 3 && n <= 10) {
                break;
            }
            System.err.println(" LOI: so nhap ko hop le !");
        }

        for (int i = 0, c = 1; i < n; i++) {
            System.out.printf("%2d + %2d = %3d\n", c, i + 2, c = c + i + 2);
        }
    }

    //ham kiem tra so nguyen to : so nt la so ko co uoc so
    private void testPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print(">> nhap so nguyen duong > 1: ");
            n = sc.nextInt();
        } while (n <= 1);

        int i= 3;
        while(i<=Math.sqrt(n)){
            if(n%i==0){
                //i la uoc so cua n => n la HOP SO
                System.out.printf(" %d la hop so ! \n ", n);
                return;
            }
            i++;
        }
        System.out.printf(" %d la so nguyen to ! \n", n);
    }
}

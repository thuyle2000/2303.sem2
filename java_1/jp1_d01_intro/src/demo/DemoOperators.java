/*
Demo cac phep toan
 */
package demo;

public class DemoOperators {

    public static void main(String[] args) {
        DemoOperators p = new DemoOperators();
        p.test1();
        p.test2();
    }

    private void test1() {
        int a = 10, b = 3;

        System.out.println("\n Demo cac phep toan so hoc");
        
        System.out.printf("%d + %d = %d \n", a, b, a + b);
        System.out.printf("%d - %d = %d \n", a, b, a - b);
        System.out.printf("%d * %d = %d \n", a, b, a * b);
        System.out.printf("%d / %d = %f \n", a, b, (float)a / b);
        System.out.printf("%d %% %d = %d \n", a, b, a % b);
    }
    
    private void test2(){
        int a=22, b=11;
        System.out.println("\n Demo cac phep toan luan ly nhi phan (bitwise)");
        
        System.out.printf("%d & %d = %d \n", a, b, a & b);
        System.out.printf("%d | %d = %d \n", a, b, a | b);
        System.out.printf("%d ^ %d = %d \n", a, b, a ^ b);
    }
}

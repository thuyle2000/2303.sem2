/*
demo cac ham overload :
do la cac co cung ten nhung khac danh sach doi so trong 1 class
 */
package app;

public class Test {

    public static void main(String[] args) {
        Test p = new Test();
        
        p.add("Hello", "Mr Tuan");
        p.add(12, 40);
        p.add(3.14F, 67.5678F, 12.9F);
        p.add("PI = ", 3.1415F);
        
        
        p.concat("Hello", "Mr Min");
        p.concat("Lap trinh","Java","de hay kho ?");
    }

    private void add(int a, int b) {
        System.out.printf("%d + %d = %d \n", a, b, a + b);
    }

    private void add(String a, String b) {
        System.out.printf("[%s] + [%s] = [%s]\n", a, b, a + ", " + b);
    }

    public void add(String a, float b) {
        System.out.printf("[%s] + [%f] = [%s]\n", a, b, a + b);
    }

    public void add(float a, float b, float c) {
        System.out.printf("%.2f + %.2f +%.2f = %.2f \n", a, b, c, a + b + c);
    }
    
    public void concat(String...items){
        String s ="";
        for (String x : items) {
            s += (" " + x);
        }
        System.out.printf("\n => s = %s \n", s);
    }
}

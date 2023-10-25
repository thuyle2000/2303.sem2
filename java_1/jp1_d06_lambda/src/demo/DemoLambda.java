/*
demo cach khai bao va su dung bieu thuc lambda
 */
package demo;

public class DemoLambda {

    public static void main(String[] args) {
        new DemoLambda().test();
    }

    private void test() {
        //1.khai bao cac bieu thuc lambda co kieu du lieu ICalc
        ICalc e1 = (x,y) -> x+y;
        ICalc e2 = (x,y) -> {return x-y;};
        ICalc e3 = (x,y) -> {
            if(y==0) 
                throw new ArithmeticException("ko the chia cho zero!");
            else 
                return (float)x/y;
        };
        ICalc e4 = (int x,int y) -> x*y;
        ICalc e5 = (int x,int y) -> x%y;
        ICalc e6 = (int x,int y) -> x|y;
        ICalc e7 = (int x,int y) -> x^y;
        
        
        //thuc hien bieu thuc lambda
        int a=23, b=10;
        System.out.printf("%d + %d =%.0f \n", a,b, e1.calc(a, b));
        System.out.printf("%d - %d =%.0f \n", a,b, e2.calc(a, b));
        System.out.printf("%d / %d =%.2f \n", a,b, e3.calc(a, b));
        System.out.printf("%d * %d =%.0f \n", a,b, e4.calc(a, b));
        System.out.printf("%d %% %d =%.0f \n", a,b, e5.calc(a, b));
        System.out.printf("%d | %d =%.0f \n", a,b, e6.calc(a, b));
        System.out.printf("%d ^ %d =%.0f \n", a,b, e7.calc(a, b));
    }
    
}

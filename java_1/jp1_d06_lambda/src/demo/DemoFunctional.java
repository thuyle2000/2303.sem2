/*
demo cach ap dung cac functional interface co san trong java8:
  Predicate -> boolean test(T)
  Function -> R apply(T)
  Consumer -> accept(T)
  Supplier -> T get()
 */
package demo;

import java.util.Scanner;
import java.util.function.*;
public class DemoFunctional {

    public static void main(String[] args) {
        testPredicate();
        testFunction();
        testConsumer();
        testSupplier();
    }
    
    private static void testPredicate(){
        Predicate isPrime = n -> {
            int x = (int) n;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if(x%i==0){
                    //i la uoc so cua n => n ko phai la so nguyen to
                    return false;
                }
            }
            return true;
        };
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" === Demo PREDICATE Functional Interface");
        System.out.print(" >> nhap so nguyen bat ky: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        if(isPrime.test(n)){
            System.out.printf(" ==> [%d] la so nguyen to ! \n", n);
        }
        else{
            System.out.printf(" ==> [%d] la hop so ! \n", n);
        }
    }

    private static void testFunction() {
        Function<Integer, Long> sum = n->{
            long r = 0;
            for (int i = 1; i <= n; i++) {
                r += i;
            }
            return r;
        };
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n === Demo FUNCTION Functional Interface");
        System.out.print(" >> nhap so nguyen bat ky: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        
        long r = sum.apply(n);
        System.out.printf(" => Tong cua %d so nguyen dau tien : %d \n", n, r);
    }

    private static void testConsumer() {
        Consumer<Integer> show = n -> {
            for (int i = 0; i < n; i++) {
                System.out.println("\t Hello, I'm consumer !");
            }
        };
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n === Demo CONSUMER Functional Interface");
        System.out.print(" >> nhap so nguyen bat ky: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        show.accept(n);
        
    }

    private static void testSupplier() {
        Supplier<String> getTime = ()->{
          return java.time.LocalDateTime.now().toString();
        };
        
        System.out.println("\n === Demo SUPPLIER Functional Interface");
        System.out.println(getTime.get());
    }
}

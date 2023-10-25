/*
demo cach ap dung finally trong cau truc try-catch
 */
package demo;

import java.io.*;
public class DemoFinally {

    public static void main(String[] args) {
        DemoFinally p = new DemoFinally();
        p.testFinally();
    }

    private String fileName = "baihat.txt";

    private void testFinally() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));

//            br.lines().forEach(x->System.out.println(x));
            br.lines().forEach(System.out::println);

        } catch (FileNotFoundException ex) {
            System.err.println("Loi: " + ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.err.println("Loi: " + ex);
            }
        }

    }

}

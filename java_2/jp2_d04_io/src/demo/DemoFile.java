/*
demo File class
 */
package demo;

import java.io.*;

public class DemoFile {

    public static void main(String[] args) {
        new DemoFile().test();
    }

    private void test() {
        String tm = System.getProperty("user.dir");
        System.out.printf("- thu muc lam viec: %s \n", tm);

        File f = new File(tm);
        if (f.isDirectory()) {
            System.out.printf("- thu muc [%s] \n", tm);
           
            for(String names : f.list()){
                System.out.printf("\t\t - %s \n", names);
            }
        }

        String fname = "build.xml";
        File f2 = new File(tm, fname);
        if (f2.exists()) {
            System.out.printf("- file name: %s \n", f2.getName());
            System.out.printf("\t getPath(): %s \n", f2.getPath());
            System.out.printf("\t getParent(): %s \n", f2.getParent());
        }

    }

}

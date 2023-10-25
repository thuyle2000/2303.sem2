/*  Demo IOException: try-catch-finally  */
package demo;

import java.util.*;
import java.io.*;


public class DemoIOException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" - nhap ten file muon luu du lieu : ");
        String fileName = sc.nextLine().trim();

        new DemoIOException().saveFile(fileName);
    }

    private void saveFile(String fname) {
        PrintWriter pw= null;
        try {
            //1. open file co ten trong bien fname de ghi du lieu
            pw = new PrintWriter(fname);

            //2. ghi 1 so dong van ban vo tap tin
            pw.println("=== Hello October ===");
            pw.println("1. Dau thang cau muc");
            pw.println("2. Giua thang ban hang");
            pw.println("3. Cuoi thang doi no");
            pw.println("4. Het nam, len chua giai nghiep ...");

        } catch (FileNotFoundException ex) {
            System.err.println(">> Loi: " + ex.getMessage());
            
        } finally {
            //3. dong file
            pw.close();
        }

        //4. thong bao hoan tat
        System.out.println("Luu file thanh cong");

    }

}

/*
demo cach su dung class Console
 */
package demo;

import java.io.*;

public class DemoConsole {

    public static void main(String[] args) {
        DemoConsole dc = new DemoConsole();
        dc.test();
    }

    private void test() {
        Console con = System.console();
            
        con.printf(" - nhap username: ");
        String uid = con.readLine();
        
        con.printf(" - nhap mat khau: ");
        String pwd = new String(con.readPassword());
        
        con.printf("\n user is [%s], password is [%s] \n", uid, pwd);
    }

}

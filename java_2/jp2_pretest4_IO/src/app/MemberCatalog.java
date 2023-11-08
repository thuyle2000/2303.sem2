/*
Class MemberCatalog is used to manage the member list.
- Define a generic collection Hashtable<K,V> named mList that can store detailed
information of all members. K (Key) is mapped to a String (memberID) and V (Value) is
mapped to an object of Member class.
- Create a constructor to initialize mList field, then invoke method read()
- Define method put(Member m) to add a new member into MemberList.
- Define method get() to display list of members in an appropriate format,
including the total number of members.
- Define method get(int age) to display list of members have age required.
- Define method save() to write list of member into a text file named “member.txt”.
Information of each member shoud be write in a new line.
- Define method read() to read text file named “member.txt”, and put data into the list of
member mList
 */
package app;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MemberCatalog {

    public Hashtable<String, Member> ds = new Hashtable<>();

    public MemberCatalog() {
    }

    public void put(Member m) {
        if (ds.containsKey(m.memberID)) {
            System.err.printf(" >> Loi: ma so [%s] da ton tai. Tu choi them moi ! \n", m.memberID);
            return;
        }

        ds.put(m.memberID, m);
        System.out.println(" >> Them thanh vien moi thanh cong !\n");

    }

    public void get() {
        if (ds.isEmpty()) {
            System.err.println(" >> Loi: he thong chua co du lieu \n");
            return;
        }

        System.out.println("\n Danh sach thanh vien");
        ds.values().forEach(System.out::println);
        System.out.println("=======================");
        System.out.println(" Tong so thanh vien : " + ds.size());
    }

    private String fname = "member.txt";

    public void save() {
        if (ds.isEmpty()) {
            return;
        }

        try (PrintWriter pw = new PrintWriter(fname)) {
            ds.values().forEach(x -> pw.println(x));
            System.out.println(" >> Ghi file hoan tat. \n");
        } catch (FileNotFoundException ex) {
            System.err.println(" >> Loi: " + ex.getMessage());
        }

    }

    void get(int age) {
        if (ds.isEmpty()) {
            System.err.println(" >> Loi: he thong chua co du lieu \n");
            return;
        }

        if (ds.values().stream().filter(x -> x.age >= age).count() == 0) {
            System.err.printf(" >> Loi: Ko tim thay thanh vien do tuoi [%d] ! \n", age);
            return;
        }
        
        System.out.printf("\n Danh sach thanh vien [%d] tuoi \n", age);
        ds.values().stream().filter(x -> x.age >= age).forEach(System.out::println);
    }

}

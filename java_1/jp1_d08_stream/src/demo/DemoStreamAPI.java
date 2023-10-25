/*
demo stream API
 */
package demo;

import java.util.stream.*;
import java.util.*;

public class DemoStreamAPI {

    public static void main(String[] args) {
        DemoStreamAPI p = new DemoStreamAPI();
        p.test1();
    }

    private void test1() {
        System.out.println("1. Generate Stream from LIST:");
        //tao ra 1 stream tu 1 list
        List<String> ds = Arrays.asList(new String[]{"Xuan", "Ha", "Thu","Dong"});
        System.out.println("\t danh sach ");
        ds.stream().forEach(x->System.out.println(x));
        
        System.out.println("\t danh sach theo thu tu A-Z");
        ds.stream().sorted().forEach(System.out::println);
        
        System.out.println("\t danh sach theo thu tu Z-A");
        ds.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
        
        System.out.println("\t Cac chuoi co chua ky tu [a]");
        ds.stream().filter((x) -> x.contains("a")).forEach(System.out::println);
        
    }
    
}

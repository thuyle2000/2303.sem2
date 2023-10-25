/*  Demo generate Collector from stream  */
package demo;

import java.util.*;
import java.util.stream.*;
public class DemoCollector {

    public static void main(String[] args) {
        new DemoCollector().test();
    }

    private void test() {
        Student[] ds = new Student[]{
            new Student("sv1", "Le Anh Minh", 70),
            new Student("sv2", "Ha The Doanh", 60),
            new Student("sv3", "Le Tan Thanh", 50),
            new Student("sv4", "Nguyen Quang Linh", 40),
            new Student("sv5", "Nguyen Anh Hung", 30),
            new Student("sv6", "Le Xuan Truong", 20),
            new Student("sv7", "Le Tat Thien", 10),
            new Student("sv8", "Vu Minh Tuan", 0)
        };
        
        List<Student> s  = Arrays.asList(ds);
        var dsTen = s.stream().map((t) -> t.name).sorted().collect(Collectors.toList());
        System.out.println(" *** Danh sach ho ten sinh vien ***");
        dsTen.forEach(System.out::println);
        
        System.out.println("\n *** Danh sach sinh vien thi dau ***");
        s.stream().filter((t) -> t.mark>=40).forEach(System.out::println);
        
    }

}

class Student {

    public String id, name;
    public int mark;

    public Student() {
        id = "SV01";
        name = "vo danh";
        mark = 39;
    }

    public Student(String id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", id, name, mark);
    }

}

/*
mo ta cau truc tong quat cua 1 nhan vien
 */
package entity;

public class Employee<K, T, N> {
    public K id;
    public String name;
    public String position;
    public T gender;
    public N salary;

    public Employee() {
    }

    public Employee(K id, String name, String position, T gender, N salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.gender = gender;
        this.salary = salary;
    }
    
    

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s", id, name, position, gender, salary);
    }
    
    
    public static void main(String[] args) {
        Employee e = new Employee("e01", "van luong", "giam doc", true, 1);
        System.out.println("nhan vien thu 1: " + e);
        
        Employee e2 = new Employee(100, "le min", "bao ve", "nam", 1499.99);
        System.out.println("nhan vien thu 2: " + e2);
        
        Employee<Integer,Boolean, Integer> e3 = new Employee("e01", "van luong", "giam doc", "female", 1123.456);
        System.out.println("nhan vien thu 3: " + e3);
    }
}

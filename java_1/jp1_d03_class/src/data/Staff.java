/*
mo ta cau truc nhan vien, bao gom 
- cac thuoc tinh: id, name, position, salary
- cac phuong thuc: input(), toString()
 */
package data;

public class Staff {
    
    //demo object initializers
    public String id="E01";
    public String name="no name";
    public String position="staff";
    public int salary = 300;
    
    //demo initialization block
    public String email;
    public int yob;
    {
        email="noname@gmail.com";
        yob=2000;
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + ", email=" + email + ", yob=" + yob + '}';
    }
   
    public static void main(String[] args) {
        Staff st = new Staff();
        System.out.println("staff: " + st);
    }
    
}

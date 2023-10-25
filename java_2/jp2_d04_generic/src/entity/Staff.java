/*
Mo ta cau truc 1 nhan vien van phong, la con cua class nhan vien (Employee)
 */
package entity;

public class Staff<K, T, N, V> extends Employee {

    public V project;

    public Staff() {
    }

    public Staff(K id, String name, String position, T gender, N salary, V project) {
        super(id, name, position, gender, salary);
        this.project = project;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", %s", project);
    }

    public static void main(String[] args) {
        Staff s1 = new Staff("S01", "The doanh", "QL Kho", "female", 500, 0);
        System.out.println("nhan vien 1: " + s1);

        Staff s2 = new Staff("S02", "q'lin", "TP TV", 2, 3456.89, 2);
        System.out.println("nhan vien 2: " + s2);
        
        Staff<String,String, String,Integer> s3 = new Staff<>("S03","Anh Tuan","chu tit","nam","a", 0 );
        
        System.out.println("nhan vien 3: " + s3);
    }

}

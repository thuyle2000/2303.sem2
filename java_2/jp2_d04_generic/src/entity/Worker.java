/*
Mo ta cau truc 1 cong nhan, la con cua class nhan vien (Employee)
 */
package entity;

public class Worker extends Employee<Integer, String, Integer> {

    public int workedDays;

    public Worker() {
    }

    public Worker(Integer id, String name, String position, String gender, Integer salary, int workedDays) {
        super(id, name, position, gender, salary);
        this.workedDays = workedDays;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", %d", workedDays);
    }

    
    public static void main(String[] args) {
        Worker w = new Worker(120, "tan thanh", "chuyen truong", "male", 30,30);
        System.out.println("cong nhan: "+ w);
    }
}

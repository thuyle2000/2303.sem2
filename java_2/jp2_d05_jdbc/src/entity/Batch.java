/*
cau truc cua 1 lop hop - tuong duong cau truc bang tbBatch
 */
package entity;

import java.util.Scanner;

public class Batch {

    public String batchno, description;
    public int fee;

    public Batch() {
    }

    public Batch(String batchno, String description, int fee) {
        this.batchno = batchno;
        this.description = description;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return String.format("%-4s, %-20s, %5d", batchno, description, fee);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("- nhap ma lop hoc (xxxx), x ky so: ");
            batchno = sc.nextLine().trim();
            if (batchno.matches("\\d{4}")) {
                break;
            }
        }

        while (true) {
            System.out.print("- nhap chuong trinh (<=20 ky tu): ");
            description = sc.nextLine().trim();
            if (description.length() < 20) {
                break;
            }
        }

        while (true) {
            try {
                System.out.print("- nhap hoc phi [0-99999]: ");
                fee = Integer.parseInt(sc.nextLine().trim());
                if (fee>=0 && fee<=99999) {
                    break;
                }
            } catch (Exception e) {
                System.err.println(" >> Loi: "+ e.getMessage());
            }
        }

    }
}

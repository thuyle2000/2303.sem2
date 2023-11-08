/*
Class Member used to store all details of a member: memberID, name, age, address.
- Define instance variables to present member details with appropriate data type.
- Create constructor to initialize this instance variables.
- Create method void input() to enter data for a member object
    MemberID must have format ‘Mxxx-xxxx’ , with the last four digits is the current year.
    Age is a numeric from 16 to 61.
    Name is compulsory (contain only letters of alphabeta, space and not null)
- Override method toString() to return a string that present member details.
 */
package app;

import java.util.Scanner;

public class Member {

    public String memberID, name, address;
    public int age;

    public Member() {
    }

    public Member(String memberID, String name, String address, int age) {
        this.memberID = memberID;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    /*
    MemberID must have format ‘Mxxx-xxxx’ , with the last four digits is the current year.
    Age is a numeric from 16 to 61.
    Name is compulsory (contain only letters of alphabeta, space and not null)
     */
    public void input() {
        Scanner sc = new Scanner(System.in);
        int year = java.time.Year.now().getValue();

        //nhap memberID
        while (true) {
            System.out.print(" - nhap id (Mxxx): ");
            memberID = sc.nextLine().trim();
            if (memberID.matches("M\\d{3}")) {
                memberID = memberID + "-" + year;
                break;
            }
        }

        //nhap name
        while (true) {
            System.out.print(" - nhap ho ten (ky tu chu hoac khoang trang): ");
            name = sc.nextLine().trim();
            if (name.matches("(?i)[a-z ]{2,}")) {
                break;
            }
        }

        //nhap address
        System.out.print(" - nhap dia chi: ");
        address = sc.nextLine().trim();
        
        //nhap age
        while(true){
            try {
                System.out.print(" - nhap tuoi [16-60]: ");
                age = Integer.parseInt(sc.nextLine().trim());
                if(age >=16 && age<=60){
                    break;
                }
            } catch (Exception e) {
                System.err.println(">> Loi: " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %d", memberID, name, address, age);
    }
    
    

}

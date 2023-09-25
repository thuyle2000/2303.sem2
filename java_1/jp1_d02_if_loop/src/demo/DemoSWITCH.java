/*  Demo lenh re nhanh SWITCH-CASE  */
package demo;

import java.util.Scanner;
import java.time.Year;

public class DemoSWITCH {

    public static void main(String[] args) {
        DemoSWITCH p = new DemoSWITCH();
        p.testSWITCH_Number();
        p.testSWITCH_String();
    }

    private void testSWITCH_Number() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> Nhap nam: ");
        int year = sc.nextInt();
        System.out.print(">> Nhap thang [1-12]: ");
        int month = sc.nextInt();
        
        //tinh so ngay toi da trong thang cua nam duoc nhap
        int days = 30;
        switch (month) {
            case 1,3,5,7,8,10,12:
                days=31;
                break;
            case 4,6,9,11:
                days=30;
                break;
            case 2:
                if(Year.isLeap(year)){
                    days=29;
                }
                else{
                    days=28;
                }
               break;
            default:
                System.err.println("--> LOI: thang nhap ko hop le !");
                return;
        }
        
        System.out.printf(">> Thang [%d] cua nam [%d] co toi da [%d] ngay. \n\n", month, year, days);

    }
    
    private void testSWITCH_String(){
        Scanner sc= new Scanner(System.in);
        System.out.print(">> nhap 4 mua trong nam [xuan/ha/thu/dong]: ");
        String s = sc.nextLine().trim();
        
        switch (s.toLowerCase()) {
            case "xuan" -> System.out.println(">> Ve Que An Tet !");
            case "ha","he" -> System.out.println(">> Boi ra dao Phu Qui choi !");
            case "thu" -> System.out.println(">> Den Hanoi ngam la vang roi !");
            case "dong" -> System.out.println(">> Bay sang Canada truot tuyet !");
            default -> System.err.println(">> LOI: Ban tu dau den ???");
        }
    }
}

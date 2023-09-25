/* Demo lenh re nhanh co dieu kien :IF, IF-ELSE, IF-ELSE-IF
 */
package demo;

import java.util.Scanner;
public class DemoIF {

    public static void main(String[] args) {
        DemoIF p = new DemoIF();
        p.testIF();
        p.testIF_ELSE();
        p.testIF_ELSE_IF();
    }
    
    private void testIF(){
        Scanner sc = new Scanner(System.in);
        System.out.print(">> nhap 1 chuoi ky tu bat ky: ");
        String s = sc.nextLine().trim();
        if(s.isEmpty()){
            System.err.println("LOI: chuoi nhap ko co noi dung !!!");
        }
        System.out.println("FINISHED 'TestIF'\n");
    }
    
    private void testIF_ELSE(){
        Scanner sc = new Scanner(System.in);
        System.out.print(">> nhap nam sinh cua ban:  ");
        int yob = sc.nextInt();
        
        //lay nam hien tai, vd:2023 va tinh tuoi
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear-yob;
        
        if(age<18){
            System.out.println(">>Oi gioi oi ! Nho con xanh lam !");
        }
        else{
            System.out.println(">>Lua da chin roi !");
        }
        System.out.println("FINISHED 'TestIF_ELSE'\n");
    }
    
    private void testIF_ELSE_IF(){
        Scanner sc = new Scanner(System.in);
        System.out.print(">> nhap diem ket qua thi:  ");
        float mark = sc.nextFloat();
        
        if(mark>100 && mark<0){
            System.err.println("LOI: diem nhap ko hop le !");
        }
        else if(mark >=90){
            System.out.println(">> Xep loai A+");
        }
        else if(mark >=80){
            System.out.println(">> Xep loai A");
        }
        else if(mark >=65){
            System.out.println(">> Xep loai B");
        }else if(mark >=50){
            System.out.println(">> Xep loai C");
        }
        else{
            System.out.println(">> Xep loai F");
        }
        
        System.out.println("FINISHED 'TestIF_ELSE_IF'\n");
    }
    
    
}

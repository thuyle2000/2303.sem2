/*
Demo cac ham xu ly chuoi ky tu pho bien
 */
package demo_lang;

public class DemoString {

    public static void main(String[] args) {
        DemoString ds = new DemoString();
        ds.test_string();
    }

    private void test_string() {
        System.out.println("=== Demo String ===");
        String s1 = "truong pham van truong";
        String s2 = "student fpt-aptech";
        String s3 = "truong";
        System.out.printf("s1=[%s], s2=[%s], s3=[%s]\n\n", s1, s2, s3);

        var s = s1.concat(s2);
        System.out.println("- after [s = s1.concat(s2)] ");
        System.out.printf("s1=[%s], s=[%s]\n", s1, s);

        System.out.println("\n\t contains(): ");
        System.out.printf("- s1.contains(s2): %s\n", s1.contains(s2));
        System.out.printf("- s1.contains(s3): %s\n", s1.contains(s3));

        System.out.println("\n\t endsWith(): ");
        System.out.printf("- s1.endsWith(s2): %s\n", s1.endsWith(s2));
        System.out.printf("- s1.endsWith(s3): %s\n", s1.endsWith(s3));

        System.out.println("\n\t indexOf(): ");
        System.out.printf("- s1.indexOf(s3): %s\n", s1.indexOf(s3));
        System.out.printf("- s1.lastIndexOf(s3): %s\n", s1.lastIndexOf(s3));
        System.out.printf("- s1.indexOf(s2): %s\n", s1.indexOf(s2));

        var s4 = "Truong";
        System.out.printf("\n\t equals(), s4=[%s]: \n", s4);
        System.out.printf("- s3.equals(s4): %s\n", s3.equals(s4));
        System.out.printf("- s3.equalsIgnoreCase(s4): %s\n", s3.equalsIgnoreCase(s4));

        //tim sinh vien co ho la s4=[Truong]
        System.out.printf("\n\t check [%s] start in [%s] \n", s4, s1);

        System.out.printf("- s1.contains(s4): %s\n", s1.contains(s4));
        System.out.printf("- s1.toLowerCase().contains(s4.toLowerCase()): %s\n", s1.toLowerCase().contains(s4.toLowerCase()));

        System.out.printf("- s1.matches(s4): %s\n", s1.matches(s4));
        var r = String.format("(?i)%s.+", s4);
        System.out.printf("- s1.matches(%s): %s\n", r,s1.matches(r));
        
        String[] subs = s1.split(" ");
        System.out.println("\n\t after s1.split()" );
        for (String item : subs) {
            System.out.println(item);
        }
    }
}

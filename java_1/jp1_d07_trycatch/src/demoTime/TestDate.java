/*
demo cac thu vien lop trong java.time.*
 */
package demoTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Locale;


public class TestDate {


    public static void main(String[] args) {
        TestDate p = new TestDate();
        p.testLocalDate();
        p.testOffsetDateTime();
        p.testFormatDate();
        
        
    }

    private void testLocalDate() {
        System.out.println("\n***  Local Date  ***");
        LocalDate d = LocalDate.now();
        System.out.println("Hom nay: " + d);
        System.out.println("\t 20 ngay truoc la: "+ d.minusDays(20));
        System.out.println("\t 100 ngay nua la: "+ d.plusDays(100));
        System.out.println("\t 6 thang nua la: "+ d.plusMonths(6));
        
        LocalDate sn = LocalDate.of(1993, Month.FEBRUARY, 18);
        System.out.println("Ngay sinh cua ban Doanh: "+ sn);
        int age = d.getYear() - sn.getYear();
        System.out.printf("=> nam nay Doanh %d tuoi. \n", age );
    }

    private void testOffsetDateTime() {
        System.out.println("\n***  Offset Date Time  ***");
        OffsetDateTime otd = OffsetDateTime.now();
        System.out.println("Bay gio la: " + otd);
    }

    private void testFormatDate() {
        System.out.println("\n***  SimpleDateFormat  ***");
        Date d = new Date();
        java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println("Hom nay la: "+sdf.format(d));
        
        java.util.Locale loc = new Locale("vi", "VN");
        sdf = new SimpleDateFormat("dd-MMMM-yyyy", loc);
        System.out.println("Hom nay la: "+sdf.format(d));
    }
    
}

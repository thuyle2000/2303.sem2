/*
demo CheckedException
 */
package demo;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DemoCheckedException {

    public static void main(String[] args) {
        DemoCheckedException p = new DemoCheckedException();
        p.writeFile();
    }

    private String fileName = "baihat.txt"; 
    private void writeFile() {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("bai hat thang 10, 2023 \n");
            fw.write("- A Loi !\n");
            fw.write("- Cat doi noi sau ! \n");
            fw.write("- Truy lung bau vat. \n");
            fw.write("...\n");
            fw.close();
            
            System.out.println(">> Da ghi file thanh cong !");
        } catch (IOException ex) {
            Logger.getLogger(DemoCheckedException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

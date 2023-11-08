/*
thuc hien cac thao tac CRUD (Create, Retrieve, Update, Delete) tren bang tbEmployee 
 */
package entity;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeDAO {

    //ham truy van du lieu : lay het ds lop trong tbEmployee
    public static List<Employee> get() {
        List<Employee> ds = new ArrayList<>();

        //1. tao connect voi db 'sem2-demo', neu thanh cong: ket noi luu trong bien [cn]
        Connection cn = mylib.MyConnection.getConnect();
        if (cn != null) {
            try {
                //2. tao doi tuong doi tuong Statment de thuc hien lenh select-sql
                Statement st = cn.createStatement();
                
                //3. thi hanh lenh select-SQL
                String sql = "select * from tbEmployee";
                ResultSet rs = st.executeQuery(sql);

                //4. duyet du lieu trong 'rs' de luu vo 'ds'
                while (rs.next()) {
                    //doc dong hien tai, tao thanh 1 doi tuong Employee
                    Employee b = new Employee();
                    b.id = rs.getInt("id");
                    b.name = rs.getString("name");
                    b.gender = rs.getBoolean("gender");
                    b.salary = rs.getInt("salary");

                    ds.add(b);
                   
                }

                //5. dong tai nguyen
                rs.close();
                st.close();
                cn.close();

            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ds;
    }

    //ham truy van du lieu : tra ve doi tuong Employee co ma so trong bien 'id' 
    public static Employee get(int id) {
        Employee b = null;

        //1. tao connect voi db 'sem2-demo', neu thanh cong: ket noi luu trong bien [cn]
        Connection cn = mylib.MyConnection.getConnect();
        if (cn != null) {
            try {
                //2. tao doi tuong doi tuong PreparedStatment de thuc hien lenh select-where
                var sql = "SELECT * FROM tbEmployee WHERE id = ?";
                PreparedStatement st = cn.prepareStatement(sql);
                st.setInt(1, id);

                //3. thi hanh lenh select-where-SQL
                ResultSet rs = st.executeQuery();

                //4. kiem tra ket qua tra ve co du lieu ko ?
                if (rs.next()) {
                    //doc dong hien tai, tao thanh 1 doi tuong Employee
                    b = new Employee();
                    b.id = rs.getInt("id");
                    b.name = rs.getString("name");
                    b.gender = rs.getBoolean("gender");
                    b.salary = rs.getInt(4);
                }

                //5. dong tai nguyen
                rs.close();
                st.close();
                cn.close();

            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return b;
    }
    
    
    //ham them 1 lop hoc moi vo bang tbEmployee
    public static int create(Employee b) {
        int r = 0;
        //1. tao connect voi db 'sem2-demo', neu thanh cong: ket noi luu trong bien [cn]
        Connection cn = mylib.MyConnection.getConnect();
        if (cn != null) {
            //2. tao doi tuong prepare-statement chu lenh INSERT-SQL
            var sql = "INSERT INTO tbEmployee([name],[gender],[salary]) VALUES(?,?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, b.name);
                pst.setBoolean(2, b.gender);
                pst.setInt(3, b.salary);

                //3. thi hanh lenh INSERT
                r = pst.executeUpdate();

                //4. dong tai nguyen
                pst.close();
                cn.close();

            } catch (SQLException ex) {
                System.err.println("Loi: " + ex.getMessage());
            }

        }
        return r;
    }

    //ham xoa lop hoc theo ma so
    public static int delete(int id) {
        int r = 0;
        //1. tao connect voi db 'sem2-demo', neu thanh cong: ket noi luu trong bien [cn]
        Connection cn = mylib.MyConnection.getConnect();
        if (cn != null) {
            //2. tao doi tuong prepare-statement chu lenh DELETE-SQL
            var sql = "DELETE FROM tbEmployee WHERE id = ?";
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, id);

                //3. thi hanh lenh DELETE
                r = pst.executeUpdate();

                //4. dong tai nguyen
                pst.close();
                cn.close();

            } catch (SQLException ex) {
                System.err.println("Loi: " + ex.getMessage());
            }

        }
        return r;
    }

    public static void main(String[] args) {

        //test ham EmployeeDAO.get()
        System.out.println("danh sach cac nhan vien");
        EmployeeDAO.get().forEach(System.out::println);
        
        
        
        //test ham EmployeeDAO.insert()
        Employee lop_moi = new Employee(1, "luong", true, 200);
        if (EmployeeDAO.create(lop_moi) > 0) {
            System.out.println("\n >> Them nhan vien thanh cong \n");

            System.out.println("danh sach cac nhan vien");
            EmployeeDAO.get().forEach(System.out::println);
        } else {
            System.err.println(">> Loi: ko them nhan vien moi duoc !");
        }

//         test ham EmployeeDAO.delete()
        if (EmployeeDAO.delete(6) > 0) {
            System.out.println("\n >> xoa nv thanh cong \n");

            System.out.println("danh sach nhan vien");
            EmployeeDAO.get().forEach(System.out::println);
        } else {
            System.err.println(">> Loi: ko the xoa nv duoc !");
        }   

    }
}

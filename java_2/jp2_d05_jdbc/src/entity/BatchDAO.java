/*
thuc hien cac thao tac CRUD (Create, Retrieve, Update, Delete) tren bang tbBatch 
 */
package entity;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BatchDAO {

    //ham truy van du lieu : lay het ds lop trong tbBatch
    public static List<Batch> get() {
        List<Batch> ds = new ArrayList<>();

        //1. tao connect voi db 'sem2-demo', neu thanh cong: ket noi luu trong bien [cn]
        Connection cn = mylib.MyConnection.getConnect();
        if (cn != null) {
            try {
                //2. tao doi tuong doi tuong Statment de thuc hien lenh select-sql
                Statement st = cn.createStatement();

                //3. thi hanh lenh select-SQL
                String sql = "select * from tbBatch";
                ResultSet rs = st.executeQuery(sql);

                //4. duyet du lieu trong 'rs' de luu vo 'ds'
                while (rs.next()) {
                    //doc dong hien tai, tao thanh 1 doi tuong Batch
                    Batch b = new Batch();
                    b.batchno = rs.getString("batchno");
                    b.description = rs.getString("description");
                    b.fee = rs.getInt(3);

                    ds.add(b);
                }

                //5. dong tai nguyen
                rs.close();
                st.close();
                cn.close();

            } catch (SQLException ex) {
                Logger.getLogger(BatchDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ds;
    }

    //ham them 1 lop hoc moi vo bang tbBatch
    public static int create(Batch b) {
        int r = 0;
        //1. tao connect voi db 'sem2-demo', neu thanh cong: ket noi luu trong bien [cn]
        Connection cn = mylib.MyConnection.getConnect();
        if (cn != null) {
            //2. tao doi tuong prepare-statement chu lenh INSERT-SQL
            var sql = "INSERT INTO tbBatch([batchno],[description],[fee]) VALUES(?,?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, b.batchno);
                pst.setString(2, b.description);
                pst.setInt(3, b.fee);

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
    public static int delete(String id) {
        int r = 0;
        //1. tao connect voi db 'sem2-demo', neu thanh cong: ket noi luu trong bien [cn]
        Connection cn = mylib.MyConnection.getConnect();
        if (cn != null) {
            //2. tao doi tuong prepare-statement chu lenh DELETE-SQL
            var sql = "DELETE FROM tbBatch WHERE batchno LIKE ?";
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, id);

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

        //test ham BatchDAO.get()
        System.out.println("danh sach cac lop hoc");
        BatchDAO.get().forEach(System.out::println);
        
        
        
        //test ham BatchDAO.insert()
//        Batch lop_moi = new Batch("1234", "test lop choi game", 0);
//        if (BatchDAO.create(lop_moi) > 0) {
//            System.out.println("\n >> Them lop hoc thanh cong \n");
//
//            System.out.println("danh sach cac lop hoc");
//            BatchDAO.get().forEach(System.out::println);
//        } else {
//            System.err.println(">> Loi: ko them lop hoc moi duoc !");
//        }

//         test ham BatchDAO.delete()
        if (BatchDAO.delete("4321") > 0) {
            System.out.println("\n >> xoa lop hoc thanh cong \n");

            System.out.println("danh sach cac lop hoc");
            BatchDAO.get().forEach(System.out::println);
        } else {
            System.err.println(">> Loi: ko the xoa lop hoc duoc !");
        }   

    }
}

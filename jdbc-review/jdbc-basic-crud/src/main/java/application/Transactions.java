package application;

import db.DB;
import db.exceptions.DbException;
import db.exceptions.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class Transactions {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        Statement pst = null;

        try{
            conn = DB.getConnection();
            conn.setAutoCommit(false);

            pst = conn.createStatement();

            int rows1 = pst.executeUpdate("UPDATE seller SET BaseSalary = 2090 Where DepartmentId = 1");

//            if(true){
//                throw new SQLException("Error to force rollback");
//            }

            int rows2 = pst.executeUpdate("UPDATE seller SET BaseSalary = 3090 Where DepartmentId = 2");

            conn.commit();

            System.out.println("Done! Rows1 affected: "+rows1);
            System.out.println("Done! Rows2 affected: "+rows2);

        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by: "+e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("Error trying to rollback: "+ e1.getMessage());
            }
        }
        finally {
            DB.closeStatement(pst);
            DB.closeConnection();
        }
    }
}

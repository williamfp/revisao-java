package application;

import db.DB;
import db.exceptions.DbIntegrityException;

import java.sql.*;
import java.text.SimpleDateFormat;

public class DataRemoval {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement pst = null;

        try{
            conn = DB.getConnection();

            pst = conn.prepareStatement(
                    "DELETE FROM department " +
                       "WHERE Id = ?");

            pst.setInt(1, 2);

            int rowsAffected = pst.executeUpdate();
            System.out.println("Done! Rows affected: "+rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(pst);
            DB.closeConnection();
        }
    }
}

package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataInsertion {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement pst = null;

        try{
            conn = DB.getConnection();

            pst = conn.prepareStatement(
                    "INSERT INTO seller " +
                       "(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
                       "VALUES(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            pst.setString(1, "Carl Purple");
            pst.setString(2, "carl@gmail.com");
            pst.setDate(3, new Date(sdf.parse("22/04/1985").getTime()));
            pst.setDouble(4, 3000.0);
            pst.setInt(5, 4);

            int rowsAffected = pst.executeUpdate();

            if(rowsAffected > 0){
                ResultSet rs = pst.getGeneratedKeys();

                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! ID =  "+ id);
                }
            } else{
                System.out.println("No rows affected!");
            }


        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(pst);
            DB.closeConnection();
        }
    }
}

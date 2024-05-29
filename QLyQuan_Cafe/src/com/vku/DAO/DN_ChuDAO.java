package com.vku.DAO;

import com.vku.MODEL.DN_ChuModel;
import com.vku.common.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DN_ChuDAO {
    public static boolean checkLogin(DN_ChuModel dncm){
        try {
            String sql = "SELECT * FROM taikhoan WHERE Username = ? AND Password = ?";
            PreparedStatement ps = Database.getConnection().prepareCall(sql);

            ps.setString(1, dncm.getUsername());
            ps.setString(2, dncm.getPassword());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                rs.close();
                ps.close();
                return true;
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace(); 
        }
        return false;
    }
  public static boolean settingPassword(DN_ChuModel dncm) {
    try {
        String sql = "UPDATE taikhoan SET Password = ? WHERE Username = ?";
        PreparedStatement ps = Database.getConnection().prepareCall(sql);
        ps.setString(1, dncm.getPassword());
        ps.setString(2, dncm.getUsername());
        
        // Use executeUpdate() for UPDATE statements
        int rowsAffected = ps.executeUpdate();
        
        ps.close();
        
        // If rowsAffected > 0, it means the password was updated successfully
        return rowsAffected > 0;
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return false;
}

}

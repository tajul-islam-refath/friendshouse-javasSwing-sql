
package bd.edu.diu19216447.model;

import bd.edu.diu19216447.helpers.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class OtherShopping  extends Shopping{
    private int otherShoppingId;
    private String description;

    public OtherShopping() {
    }

    public int getOtherShoppingId() {
        return otherShoppingId;
    }

    public void setOtherShoppingId(int otherShoppingId) {
        this.otherShoppingId = otherShoppingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean save() {
        
        Connection con = new DBConnection().connection();
        try {
            
            String otherShoppingInsert = "INSERT INTO `otherShoppings` "
                    + " (`otherShoppingId`, `mId`, `amount`, `date`,`description`) "
                    + " VALUES (NULL, ?, ?, ?, ?) ";
            
            PreparedStatement ps = con.prepareStatement(otherShoppingInsert);
            ps.setInt(1, this.getmId());
            ps.setDouble(2, this.getAmount());
            ps.setString(3, this.getDate());
            ps.setString(4, this.description);
            
            int affectedROws = ps.executeUpdate();
            
            con.close();
            if (affectedROws > 0) {
                return true;
            }
            
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
        return false;
    }
    
    
    public ArrayList<OtherShopping> allOtherShoppings() {
        
        ArrayList<OtherShopping> otherShoppingList = new ArrayList<>();
        
        Connection con = new DBConnection().connection();
        try {
            String selectQuery = "SELECT `otherShoppingId`, otherShoppings.mId, members.name, `amount`, `date`,`description` "
                    + " FROM `otherShoppings`, `members` "
                    + " where otherShoppings.mId = members.mId ";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                OtherShopping os = new OtherShopping();
                os.setOtherShoppingId(rs.getInt("otherShoppingId"));
                os.setName(rs.getString("name"));
                os.setAmount(rs.getDouble("amount"));
                os.setDate(rs.getString("date"));
                os.setDescription(rs.getString("description"));
                otherShoppingList.add(os);
            }
            
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
        
        return otherShoppingList;
    }
    
    
    
}

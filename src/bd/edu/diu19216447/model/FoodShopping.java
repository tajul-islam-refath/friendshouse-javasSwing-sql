package bd.edu.diu19216447.model;

import bd.edu.diu19216447.helpers.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FoodShopping extends Shopping {
    
    private int foodShoppingId;
    
    public FoodShopping() {
    }
    
    public FoodShopping(int foodShoppingId, int mId, double amount, String date) {
        super(mId, amount, date);
        this.foodShoppingId = foodShoppingId;
    }
    
    public int getFoodShoppingId() {
        return foodShoppingId;
    }
    
    public void setFoodShoppingId(int foodShoppingId) {
        this.foodShoppingId = foodShoppingId;
    }
    
    @Override
    public boolean save() {
        
        Connection con = new DBConnection().connection();
        try {
            
            String foodShoppingInsert = "INSERT INTO `foodShoppings` "
                    + " (`foodShoppingId`, `mId`, `amount`, `date`) "
                    + " VALUES (NULL, ?, ?, ?) ";
            
            PreparedStatement ps = con.prepareStatement(foodShoppingInsert);
            ps.setInt(1, this.getmId());
            ps.setDouble(2, this.getAmount());
            ps.setString(3, this.getDate());
            
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
    
    public ArrayList<FoodShopping> allFoodShoppings() {
        
        ArrayList<FoodShopping> foodShoppingList = new ArrayList<>();
        
        Connection con = new DBConnection().connection();
        try {
            String selectQuery = "SELECT `foodShoppingId`, foodShoppings.mId, members.name, `amount`, `date` "
                    + " FROM `foodShoppings`, `members` "
                    + " where foodShoppings.mId = members.mId ";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                FoodShopping fs = new FoodShopping();
                fs.setFoodShoppingId(rs.getInt("foodShoppingId"));
                fs.setName(rs.getString("name"));
                fs.setAmount(rs.getDouble("amount"));
                fs.setDate(rs.getString("date"));
                foodShoppingList.add(fs);
            }
            
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
        
        return foodShoppingList;
    }
    
}

package bd.edu.diu19216447.model;

import bd.edu.diu19216447.helpers.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Meal {

    private int mealId;
    private int mId;
    private int mealNum;
    private String date;


    @SuppressWarnings("deprecation")
    public Meal() {
       
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getMealNum() {
        return mealNum;
    }

    public void setMealNum(int mealNum) {
        this.mealNum = mealNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean save() {

        Connection con = new DBConnection().connection();
        try {

            String mealInsertQuery = "INSERT INTO `meals` "
                    + " (`mealId`, `mId`, `mealNum`, `date`) "
                    + " VALUES (NULL, ?, ?, ?) ";

            PreparedStatement ps = con.prepareStatement(mealInsertQuery);

            ps.setInt(1, this.mId);
            ps.setInt(2, this.mealNum);
            ps.setString(3, this.date);

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

    @SuppressWarnings("deprecation")
    public ArrayList<Meal> allMeals(String month , String year) {
       
        ArrayList<Meal> mealsList = new ArrayList<>();
        Connection con = new DBConnection().connection();
        try {
            String selectQuery = "SELECT DISTINCT(date) FROM `meals` WHERE MONTH(date) = 12 AND YEAR(date) = 2021";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Meal d = new Meal();
                d.setDate(rs.getString("date"));
                mealsList.add(d);
            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

        return mealsList;
    }

    public static ArrayList<Meal> getSingleMeal(String date) {

        ArrayList<Meal> mealsList = new ArrayList<>();
        Connection con = new DBConnection().connection();
        try {
            String selectQuery = "SELECT * FROM `meals` WHERE date=?";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ps.setString(1, date);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Meal d = new Meal();
                d.setMealNum(rs.getInt("mealNum"));
                d.setmId(rs.getInt("mId"));
                mealsList.add(d);
            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

        return mealsList;
    }

}

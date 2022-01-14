package bd.edu.diu19216447.model;

import bd.edu.diu19216447.helpers.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Report {

    private double totalDeposit;
    private double totalFoodExpense;
    private int totalMeals;

    public Report() {
    }

    public double getTotalDeposits() {

        Connection con = new DBConnection().connection();
        try {
            String selectQuery = "SELECT SUM(deposits.amount) as `Total Deposit` FROM `deposits` WHERE forMonth=12";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                totalDeposit = rs.getDouble("Total Deposit");
                return totalDeposit;

            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

        return 0;
    }

    public int getTotalMeals() {

        Connection con = new DBConnection().connection();
        try {
            String selectQuery = "select sum(mealNum) as `Total Meal` from `meals` where month(date) = 12 and year(date) = 2021";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                totalMeals = rs.getInt("Total Meal");

                return totalMeals;

            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

        return 0;
    }

    public double getFoodExpense() {

        Connection con = new DBConnection().connection();
        try {
            String selectQuery = "select sum(amount) as `Food Expense` from  `foodshoppings` where month(date) = 12 and year(date) = 2021";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                totalFoodExpense = rs.getDouble("Food Expense");
                System.out.println(totalFoodExpense);
                return totalFoodExpense;

            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

        return 0;
    }

}


package bd.edu.diu19216447.model;

import bd.edu.diu19216447.helpers.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Deposit {

    private int depositId;
    private int mId;
    private String mName;
    private double amount;
    private String paymentDate;
    private String forMonth;
    private String forYear;

    public Deposit() {
    }

    public Deposit(int depositId, int mId, double amount, String paymentDate, String forMonth, String forYear) {
        this.depositId = depositId;
        this.mId = mId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.forMonth = forMonth;
        this.forYear = forYear;
    }

    public int getDepositId() {
        return depositId;
    }

    public void setDepositId(int depositId) {
        this.depositId = depositId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getForMonth() {
        return forMonth;
    }

    public void setForMonth(String forMonth) {
        this.forMonth = forMonth;
    }

    public String getForYear() {
        return forYear;
    }

    public void setForYear(String forYear) {
        this.forYear = forYear;
    }

    public boolean save() {

        Connection con = new DBConnection().connection();
        try {
            
            String depositInsertQuery = "INSERT INTO `deposits`(`depositId`, `mId`, `amount`, `paymentDate`, `forMonth`, `forYear`) VALUES (NULL,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(depositInsertQuery);

            ps.setInt(1, this.mId);
            ps.setDouble(2, this.amount);
            ps.setString(3, this.paymentDate);
            ps.setString(4, this.forMonth);
            ps.setString(5, this.forYear);

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

    public ArrayList<Deposit> allDeposits() {

        ArrayList<Deposit> depositList = new ArrayList<>();

        Connection con = new DBConnection().connection();
        try {
            String selectQuery = "SELECT `depositId`, deposits.mId, members.name, `amount`, `paymentDate`, `forMonth`, `forYear`"
                    + " FROM `deposits`, `members` "
                    + "where deposits.mId = members.mId";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Deposit d = new Deposit();
                d.setDepositId(rs.getInt("depositId"));
                d.setmName(rs.getString("name"));
                d.setmId(rs.getInt("mId"));
                d.setAmount(rs.getDouble("amount"));
                d.setPaymentDate(rs.getString("paymentDate"));
                d.setForMonth(rs.getString("forMonth"));
                d.setForYear(rs.getString("forYear"));

                depositList.add(d);
            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

        return depositList;
    }

}

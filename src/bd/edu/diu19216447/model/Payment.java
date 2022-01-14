
package bd.edu.diu19216447.model;

import bd.edu.diu19216447.helpers.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Payment {
    private int paymentId;
    private int mId;
    private String name;
    private double amount;
    private String paymentDate;
    private String forMonth;
    private String forYear;

    public Payment() {
    }

    public Payment(int paymentId, int mId, double amount, String paymentDate, String forMonth, String forYear) {
        this.paymentId = paymentId;
        this.mId = mId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.forMonth = forMonth;
        this.forYear = forYear;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getmId() {
        return mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
            
            String paymentInsertQuerie = "INSERT INTO `payments`(`paymentId`, `mId`, `amount`, `paymentDate`, `forMonth`, `forYear`) VALUES (NULL,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(paymentInsertQuerie);

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
       
        public ArrayList<Payment> allPayments() {

        ArrayList<Payment> paymentLists = new ArrayList<>();

        Connection con = new DBConnection().connection();
        try {
            String selectQuery = "SELECT `paymentId`, payments.mId, members.name, `amount`, `paymentDate`, `forMonth`, `forYear`"
                    + " FROM `payments`, `members` "
                    + "where payments.mId = members.mId";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Payment d = new Payment();
                d.setPaymentId(rs.getInt("paymentId"));
                d.setmId(rs.getInt("mId"));
                d.setName(rs.getString("name"));
                d.setAmount(rs.getDouble("amount"));
                d.setPaymentDate(rs.getString("paymentDate"));
                d.setForMonth(rs.getString("forMonth"));
                d.setForYear(rs.getString("forYear"));

                paymentLists.add(d);
            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

        return paymentLists;
    }
    
    
}

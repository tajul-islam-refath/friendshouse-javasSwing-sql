package bd.edu.diu19216447.model;

import bd.edu.diu19216447.helpers.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Member {

    private int mId;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String nid;
    private String address;
    private String role;
    private String status;

    public Member() {
    }

    public Member(int mId, String name, String email, String password, String phone, String nid, String address, String role, String status) {
        this.mId = mId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.nid = nid;
        this.address = address;
        this.role = role;
        this.status = status;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean save() {

        Connection con = new DBConnection().connection();
        try {

            String memberInsertQuery = "INSERT INTO `members` "
                    + "(`mId`, `name`, `phone`, `email`, `password`, `address`, `role`, `status`, `nid`) "
                    + "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(memberInsertQuery);

            ps.setString(1, this.name);
            ps.setString(2, this.phone);
            ps.setString(3, this.email);
            ps.setString(4, this.password);
            ps.setString(5, this.address);
            ps.setString(6, this.role);
            ps.setString(7, this.status);
            ps.setString(8, this.nid);

//            ResultSet rs = ps.executeQuery();
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

    public static ArrayList<Member> allMembers() {

        ArrayList<Member> membersList = new ArrayList<>();

        Connection con = new DBConnection().connection();
        try {
            String selectQuery = "SELECT * FROM `members`";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Member m = new Member();
                m.setmId(rs.getInt("mId"));
                m.setName(rs.getString("name"));
                m.setAddress(rs.getString("address"));
                m.setNid(rs.getString("nid"));
                m.setEmail(rs.getString("email"));
                m.setPhone(rs.getString("phone"));
                m.setRole(rs.getString("role"));
                m.setPassword(rs.getString("password"));
                m.setStatus(rs.getString("status"));
                membersList.add(m);
            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

        return membersList;
    }

    public boolean update() {
        Connection con = new DBConnection().connection();
        String updateQuery = "UPDATE `members` SET name=?, phone=?, email=?, address=?, role=?, status=?, nid=? WHERE mId=?";
        try {
            PreparedStatement pst = con.prepareStatement(updateQuery);

            pst.setString(1, this.name);
            pst.setString(2, this.phone);
            pst.setString(3, this.email);

            pst.setString(4, this.address);
            pst.setString(5, this.role);
            pst.setString(6, this.status);
            pst.setString(7, this.nid);

            pst.setInt(8, this.mId);

            int affectedROws = pst.executeUpdate();

            con.close();
            if (affectedROws > 0) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return false;
    }

    public static Member logIn(String email, String password) {
        Connection con = new DBConnection().connection();
        try {
            String loginQuerie = "SELECT * FROM `members` WHERE email=? and password=?";
            PreparedStatement ps = con.prepareStatement(loginQuerie);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Member m = new Member();
                m.setmId(rs.getInt("mId"));
                m.setName(rs.getString("name"));
                m.setAddress(rs.getString("address"));
                m.setNid(rs.getString("nid"));
                m.setEmail(rs.getString("email"));
                m.setPhone(rs.getString("phone"));
                m.setRole(rs.getString("role"));
                m.setPassword(rs.getString("password"));
                m.setStatus(rs.getString("status"));

                return m;
            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
        return null;
    }
}

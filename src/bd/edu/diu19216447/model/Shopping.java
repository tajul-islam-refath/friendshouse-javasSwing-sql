
package bd.edu.diu19216447.model;


public class Shopping {
    private int mId;
    private String name;
    private double amount;
    private String date;

    public Shopping() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shopping(int mId, double amount, String date) {
        this.mId = mId;
        this.amount = amount;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public boolean save(){
       return false;
    }
    
    
}

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Write a description of class Member here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Member
{
    // instance variables - replace the example below with your own
    private String playerName;
    private String playerAddress;
    private int playerPhoneNumber;
    private Date dOb;

    /**
     * Constructor for objects of class Member
     */
    public Member(String playerName, String playerAddress, int playerPhoneNumber, Date dOb){
      this.playerName = playerName;
      this.playerAddress = playerAddress;
      this.playerPhoneNumber = playerPhoneNumber;
      this.dOb = dOb;
    }
    
    public String getName(){
        return playerName;
    }
    public String getAddress() {
        return playerAddress;
    }
    public int getPhone() {
        return playerPhoneNumber; 
    }
    public Date getDOB() { 
        return dOb; 
    }
    
    public void setName(String playerName){
        this.playerName = playerName;
    }
    public void setAddress(String playerAddress) {
        this.playerAddress = playerAddress;
    }
    public void setPhone(int playerPhoneNumber) {
        this.playerPhoneNumber = playerPhoneNumber; 
    }
    public void setDOB(Date dOb) { 
        this.dOb = dOb; 
    }
    
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        return "Name: " + playerName + ", Address: " + playerAddress +", Phone: " + playerPhoneNumber +", Date of birth: " + sdf.format(dOb);
    }
}

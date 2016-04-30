
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class UserProfile {
    private int _userProfileID;
    private String _userName;
    private Vehicle _vehicleOfInterest;   

    public UserProfile() {
         Random rand = new Random();
       int n =rand.nextInt(100)+1;   
        this._userProfileID = n;
    }

    
    /**
     * @return the _userProfileID
     */
    public int getUserProfileID() {
        return _userProfileID;
    }

    /**
     * @param userProfileID the _userProfileID to set
     */
    public void setUserProfileID(int userProfileID) {
        this._userProfileID = userProfileID;
    }

    /**
     * @return the _userName
     */
    public String getUserName() {
        return _userName;
    }

    /**
     * @param userName the _userName to set
     */
    public void setUserName(String userName) {
        this._userName = userName;
    }

    /**
     * @return the _vehicleOfInterest
     */
    public Vehicle getVehicleOfInterest() {
        return _vehicleOfInterest;
    }

    /**
     * @param vehicleOfInterest the _vehicleOfInterest to set
     */
    public void setVehicleOfInterest(Vehicle vehicleOfInterest) {
        this._vehicleOfInterest = vehicleOfInterest;
    }
    
}


import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class Offer {
    private int _OfferID;
    private UserProfile _userProfile;
    private Vehicle _vehicle;
    private Double _offerAmount;
    private Boolean  _isAccepted;    

    public Offer() {
         Random rand = new Random();
       int n =rand.nextInt(100)+1;   
        this._OfferID = n;
    }

    
    
    /**
     * @return the _OfferID
     */
    public int getOfferID() {
        return _OfferID;
    }

    /**
     * @param OfferID the _OfferID to set
     */
    public void setOfferID(int OfferID) {
        this._OfferID = OfferID;
    }

    /**
     * @return the _userProfile
     */
    public UserProfile getUserProfile() {
        return _userProfile;
    }

    /**
     * @param userProfile the _userProfile to set
     */
    public void setUserProfile(UserProfile userProfile) {
        this._userProfile = userProfile;
    }

    /**
     * @return the _vehicle
     */
    public Vehicle getVehicle() {
        return _vehicle;
    }

    /**
     * @param vehicle the _vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this._vehicle = vehicle;
    }

    /**
     * @return the _offerAmount
     */
    public Double getOfferAmount() {
        return _offerAmount;
    }

    /**
     * @param offerAmount the _offerAmount to set
     */
    public void setOfferAmount(Double offerAmount) {
        this._offerAmount = offerAmount;
    }

    /**
     * @return the _isAccepted
     */
    public Boolean getIsAccepted() {
        return _isAccepted;
    }

    /**
     * @param isAccepted the _isAccepted to set
     */
    public void setIsAccepted(Boolean isAccepted) {
        this._isAccepted = isAccepted;
    }
}


import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class LoanApplication {
    
    private int _loanApplicationID;
    private UserProfile _userProfile;
    private LoanProduct _loanProduct;
    private Boolean _isApproved;

    public LoanApplication() {
         Random rand = new Random();
       int n =rand.nextInt(100)+1;   
        this._loanApplicationID = n;
    }

    
    /**
     * @return the _loanApplicationID
     */
    public int getLoanApplicationID() {
        return _loanApplicationID;
    }

    /**
     * @param loanApplicationID the _loanApplicationID to set
     */
    public void setLoanApplicationID(int loanApplicationID) {
        this._loanApplicationID = loanApplicationID;
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
     * @return the _loanProduct
     */
    public LoanProduct getLoanProduct() {
        return _loanProduct;
    }

    /**
     * @param loanProduct the _loanProduct to set
     */
    public void setLoanProduct(LoanProduct loanProduct) {
        this._loanProduct = loanProduct;
    }

    /**
     * @return the _isApproved
     */
    public Boolean getIsApproved() {
        return _isApproved;
    }

    /**
     * @param isApproved the _isApproved to set
     */
    public void setIsApproved(Boolean isApproved) {
        this._isApproved = isApproved;
    }
    
}

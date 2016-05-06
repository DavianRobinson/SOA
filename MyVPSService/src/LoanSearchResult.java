
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class LoanSearchResult implements java.io.Serializable{
    private int _loanSearchID;
    private LoanProduct[] _loanProductsFound;
    private static final long serialVersionUID = 7804L;

    public LoanSearchResult() {
        Random rand = new Random();
       int n =rand.nextInt(100)+1;        
        this._loanSearchID = n;
    }

    
    /**
     * @return the _loanSearchID
     */
    public int getLoanSearchID() {
        return _loanSearchID;
    }

    

    /**
     * @return the _loanProductsFound
     */
    public LoanProduct[] getLoanProductsFound() {
        return _loanProductsFound;
    }

    /**
     * @param loanProductsFound the _loanProductsFound to set
     */
    public void setLoanProductsFound(LoanProduct[] loanProductsFound) {
        this._loanProductsFound = loanProductsFound;
    }
    
}

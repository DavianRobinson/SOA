
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class VPSSearchResult implements Serializable {
    
    private int _vpsSearchResultID;
    private Vehicle[] searchResult;
    private static final long serialVersionUID = 742L;

    public VPSSearchResult() {
        Random rand = new Random();
       int n =rand.nextInt(50)+1;
        this._vpsSearchResultID =n;
        this.searchResult =new  Vehicle[20];
    }

   

    /**
     * @return the searchResult
     */
    public Vehicle[] getSearchResult() {
        return searchResult;
    }

    /**
     * @param searchResult the searchResult to set
     */
    public void setSearchResult(Vehicle[] searchResult) {
        this.searchResult = searchResult;
    }

    /**
     * @return the _vpsSearchResultID
     */
    public int getVpsSearchResultID() {
        return _vpsSearchResultID;
    }

    /**
     * @param vpsSearchResultID the _vpsSearchResultID to set
     */
    public void setVpsSearchResultID(int vpsSearchResultID) {
        this._vpsSearchResultID = vpsSearchResultID;
    }
    
}

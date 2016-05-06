/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class VPSStorageService {

    VPSSearchResult[] _savedSearchResults;

    public VPSStorageService() {
        this._savedSearchResults = new VPSSearchResult[200];
    }

    public VPSSearchResult[] GetAllSavedSearchResults() {

        return _savedSearchResults;
    }

    public Boolean SaveSearchResult(VPSSearchResult searchResult) {
        for (int i = 0; i < _savedSearchResults.length; i++) {
            if (_savedSearchResults[i] == null) {
                _savedSearchResults[i] = searchResult;
                return true;
            }
        }
        return false;
    }

    public VPSSearchResult GetSavedSearchResultByID(int searchResultID) {
        VPSSearchResult result = new VPSSearchResult();
        for (int i = 0; i < _savedSearchResults.length; i++) {
            if (_savedSearchResults[i] != null) {
                if (_savedSearchResults[i].getVpsSearchResultID() == searchResultID) {
                    return _savedSearchResults[i];
                }
            }
        }
        return result;
    }

    public Boolean writeFile(VPSSearchResult fileToSave) {

        return false;
    }
}

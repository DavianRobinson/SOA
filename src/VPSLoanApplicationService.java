/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class VPSLoanApplicationService {

    LoanSearchResult[] _savedLoanSearchResults;
    LoanApplication[] _savedLoanApplications;

    public VPSLoanApplicationService() {
        LoanApplication lap1=new LoanApplication();
        lap1.setUserProfile(null);
        lap1.setLoanProduct(null);
        lap1.setIsApproved(Boolean.FALSE);
        _savedLoanApplications[0]=lap1;
        
        LoanSearchResult lsr=new LoanSearchResult();
        lsr.setLoanProductsFound(null);
        
    }
    
    

    public LoanSearchResult[] GetAllSavedLoanSearchResults() {

        return _savedLoanSearchResults;
    }

    public Boolean SaveLoanSearchResult(LoanSearchResult searchResult) {
        for (int i = 0; i < _savedLoanSearchResults.length; i++) {
            if (_savedLoanSearchResults[i] != null) {
                _savedLoanSearchResults[i] = searchResult;
                return true;
            }
        }
        return false;
    }

    public Boolean GetSavedLoanSearchResult(LoanSearchResult searchResult) {
        for (int i = 0; i < _savedLoanSearchResults.length; i++) {
            if (_savedLoanSearchResults[i] != null) {
                _savedLoanSearchResults[i] = searchResult;
                return true;
            }
        }
        return false;
    }

    public LoanApplication SubmitLoanApplication(LoanApplication loanApplication) {

        for (int i = 0; i < _savedLoanApplications.length; i++) {
            if (_savedLoanApplications[i] == null) {
                loanApplication.setIsApproved(Boolean.TRUE);
                _savedLoanApplications[i] = loanApplication;
                return loanApplication;
            }
        }
        loanApplication.setIsApproved(Boolean.FALSE);
        return loanApplication;
    }
}

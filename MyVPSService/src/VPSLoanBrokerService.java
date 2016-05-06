/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class VPSLoanBrokerService {

    LoanProduct[] _allLoans = new LoanProduct[100];
    LoanSearchResult[] _searchArr = new LoanSearchResult[200];

    public VPSLoanBrokerService() {
        LoanProduct lp1 = new LoanProduct();
        lp1.setApr(3.4);
        lp1.setLender("Barclays");
        lp1.setMinAount(100);
        lp1.setMaxAmount(20000);
        _allLoans[0]=lp1;
        
        LoanProduct lp2 = new LoanProduct();
        lp2.setApr(3.4);
        lp2.setLender("Natwest");
        lp2.setMinAount(100);
        lp2.setMaxAmount(10000);
        _allLoans[1]=lp2;
        
        LoanProduct lp3 = new LoanProduct();
        lp3.setApr(3.4);
        lp3.setLender("Natwest");
        lp3.setMinAount(100);
        lp3.setMaxAmount(10000);
        _allLoans[2]=lp3;       
        
    }

    public LoanProduct[] GetAllLoans() {
        return _allLoans;
    }

    public LoanSearchResult FindLoansByUserProfile(UserProfile userProfile) {

        LoanProduct[] result = new LoanProduct[100];

        for (int i = 0; i < _allLoans.length; i++) {
            if (_allLoans[i] != null) {
                if (userProfile.getVehicleOfInterest().getPrice() < _allLoans[i].getMinAount()
                        & userProfile.getVehicleOfInterest().getPrice() < _allLoans[i].getMaxAmount()) {
                    result[i] = _allLoans[i];
                }
            }
        }
        LoanSearchResult output = new LoanSearchResult();
        output.setLoanProductsFound(result);

        return output;
    }

    private void addToLoanSearchList(LoanSearchResult loanSearchResult) {
        for (int i = 0; i < _searchArr.length; i++) {
            if (_searchArr[i] != null) {
                _searchArr[i] = loanSearchResult;
            }
        }
    }
}


import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class LoanProduct implements java.io.Serializable{
    
    private int _loanID;
    private String _lender;
    private double _minAount;
    private double _maxAmount;
    private double _apr;
    private int _periodofLoan;
    private double _monthlyRepayment;
    private static final long serialVersionUID = 7802L;

    public LoanProduct() {
         Random rand = new Random();
       int n =rand.nextInt(100)+1;   
        this._loanID = n;
    }
    

    
    /**
     * @return the _loanID
     */
    public int getLoanID() {
        return _loanID;
    }

    /**
     * @param loanID the _loanID to set
     */
   
    /**
     * @return the _lender
     */
    public String getLender() {
        return _lender;
    }

    /**
     * @param lender the _lender to set
     */
    public void setLender(String lender) {
        this._lender = lender;
    }

    /**
     * @return the _minAount
     */
    public double getMinAount() {
        return _minAount;
    }

    /**
     * @param minAount the _minAount to set
     */
    public void setMinAount(double minAount) {
        this._minAount = minAount;
    }

    /**
     * @return the _maxAmount
     */
    public double getMaxAmount() {
        return _maxAmount;
    }

    /**
     * @param maxAmount the _maxAmount to set
     */
    public void setMaxAmount(double maxAmount) {
        this._maxAmount = maxAmount;
    }

    /**
     * @return the _apr
     */
    public double getApr() {
        return _apr;
    }

    /**
     * @param apr the _apr to set
     */
    public void setApr(double apr) {
        this._apr = apr;
    }

    /**
     * @return the _periodofLoan
     */
    public int getPeriodofLoan() {
        return _periodofLoan;
    }

    /**
     * @param periodofLoan the _periodofLoan to set
     */
    public void setPeriodofLoan(int periodofLoan) {
        this._periodofLoan = periodofLoan;
    }

    /**
     * @return the _monthlyRepayment
     */
    public double getMonthlyRepayment() {
        return _monthlyRepayment;
    }

    /**
     * @param monthlyRepayment the _monthlyRepayment to set
     */
    public void setMonthlyRepayment(double monthlyRepayment) {
        this._monthlyRepayment = monthlyRepayment;
    }
    
    
}

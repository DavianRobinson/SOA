/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INM381-User
 */
public class VPSOfferMakingService {
    
   Offer[] _savedOffers;
    
    public Offer[] GetAllSavedLoanSearchResults(){       
        
        return _savedOffers;        
    }
    public Offer SubmitOffer(Offer newOffer) {

        for (int i = 0; i < _savedOffers.length; i++) {
            if (_savedOffers[i] == null) {
                if (newOffer.getOfferAmount()>=newOffer.getVehicle().getPrice()) {
                    newOffer.setIsAccepted(Boolean.TRUE);
                    _savedOffers[i] = newOffer;
                    return newOffer;
                } else {
                    newOffer.setIsAccepted(Boolean.FALSE);
                    _savedOffers[i] = newOffer;
                    return newOffer;
                }
            }
        }
        return newOffer;
    }
    
}

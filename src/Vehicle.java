

public class Vehicle {
    
   private int _vehicleID;
   private String _make;
   private String  _model; 
   private String _regyear;
   private String _mileage;
   private Double  _price;
   private boolean isSold;
    public Vehicle() {
    }
     
   

    public Vehicle(String _make,String _model,String _regyear,String _mileage,Double _price) {
        this._mileage = _mileage;
        this._price = _price;
        this._model = _model;
        this._make = _make;
        this._regyear = _regyear;
        
    }

    public String getMake() {
        return _make;
    }

    public String getModel() {
        return _model;
    }

    public String getRegyear() {
        return _regyear;
    }

    public String getMileage() {
        return _mileage;
    }

    public Double getPrice() {
        return _price;
    }

    /**
     * @param make the _make to set
     */
    public void setMake(String make) {
        this._make = make;
    }

    /**
     * @param model the _model to set
     */
    public void setModel(String model) {
        this._model = model;
    }

    /**
     * @param regyear the _regyear to set
     */
    public void setRegyear(String regyear) {
        this._regyear = regyear;
    }

    /**
     * @param mileage the _mileage to set
     */
    public void setMileage(String mileage) {
        this._mileage = mileage;
    }

    /**
     * @param price the _price to set
     */
    public void setPrice(Double price) {
        this._price = price;
    }

    /**
     * @return the _vehicleID
     */
    public int getVehicleID() {
        return _vehicleID;
    }

    /**
     * @param vehicleID the _vehicleID to set
     */
    public void setVehicleID(int vehicleID) {
        this._vehicleID = vehicleID;
    }

    /**
     * @return the isSold
     */
    public boolean isIsSold() {
        return isSold;
    }

    /**
     * @param isSold the isSold to set
     */
    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }
   
   
   
    
}

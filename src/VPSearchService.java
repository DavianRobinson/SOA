
import inm381.vps.VPSStorageServiceStub;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author INM381-User
 */
public class VPSearchService {

    public VPSearchService() {
        Vehicle ve = new Vehicle();
        ve.setVehicleID(1);
        ve.setMake("Audi");
        ve.setModel("A3");
        ve.setRegyear("02/02/2014");
        ve.setMileage("20000");
        ve.setPrice(3000.00);
        ve.setIsSold(false);
        _vehiclesDB[0] = ve;

        Vehicle v2 = new Vehicle();
        v2.setVehicleID(2);
        v2.setMake("BMW");
        v2.setModel("325");
        v2.setRegyear("02/02/2014");
        v2.setMileage("20000");
        v2.setPrice(6000.00);
        v2.setIsSold(false);
        _vehiclesDB[1] = v2;

        Vehicle v3 = new Vehicle();
        v3.setVehicleID(3);
        v3.setMake("Toyota");
        v3.setModel("yaris");
        v3.setRegyear("02/02/2014");
        v3.setMileage("15000");
        v3.setPrice(10000.00);
        v3.setIsSold(false);
        _vehiclesDB[2] = v3;

    }
    private final int number_of_vehicles=3;
    Vehicle[] _vehiclesDB = new Vehicle[number_of_vehicles];
    VPSSearchResult[] _searchArr = new VPSSearchResult[200];

    public String getVehicles(String searchTerm) {
        return "10";
    }

    public String sayHello(String name) {
        return "Hello" + " " + name;
    }

    public Vehicle[] getAllVehicles(String name) {

        return _vehiclesDB;
    }

    public VPSSearchResult getAllVehiclesByMake(String make) {

        Vehicle[] result = new Vehicle[number_of_vehicles];

        for (int i = 0; i < _vehiclesDB.length; i++) {
            if (_vehiclesDB[i] != null) {
                if (_vehiclesDB[i].getMake().toLowerCase().equals(make.toLowerCase())) {
                    result[i] = _vehiclesDB[i];
                }else {
                    result[i]=new Vehicle();
                }
            }
        }
        VPSSearchResult output = new VPSSearchResult();
        output.setSearchResult(result);
        //add to search list 
        addToSearchList(output);

        return output;
    }

    public VPSSearchResult getAllVehiclesByModel(String model) {

        Vehicle[] result = new Vehicle[number_of_vehicles];

        for (int i = 0; i < _vehiclesDB.length; i++) {
            if (_vehiclesDB[i] != null) {
                if (_vehiclesDB[i].getModel().toLowerCase().equals(model.toLowerCase())) {
                    result[i] = _vehiclesDB[i];
                }
            }
        }
        VPSSearchResult output = new VPSSearchResult();
        output.setSearchResult(result);
        //add to search list 
        addToSearchList(output);

        return output;
    }

    public VPSSearchResult getAllVehiclesByMileage(String mileage) {

        Vehicle[] result = new Vehicle[number_of_vehicles];

        for (int i = 0; i < _vehiclesDB.length; i++) {
            if (_vehiclesDB[i] != null) {
                if (_vehiclesDB[i].getMileage().toLowerCase().equals(mileage.toLowerCase())) {
                    result[i] = _vehiclesDB[i];
                }
            }
        }
        VPSSearchResult output = new VPSSearchResult();
        output.setSearchResult(result);
        //add to search list 
        addToSearchList(output);
        return output;
    }

    public VPSSearchResult getAllVehiclesByRegYear(String regyear) {

        Vehicle[] result = new Vehicle[number_of_vehicles];

        for (int i = 0; i < _vehiclesDB.length; i++) {
            if (_vehiclesDB[i] != null) {
                if (_vehiclesDB[i].getRegyear().toLowerCase().equals(regyear.toLowerCase())) {
                    result[i] = _vehiclesDB[i];
                }
            }
        }
        VPSSearchResult output = new VPSSearchResult();
        output.setSearchResult(result);
        //add to search list 
        addToSearchList(output);
        return output;
    }

    public VPSSearchResult getAllVehiclesByPriceRange(double min, double max) {
        Vehicle[] result = new Vehicle[number_of_vehicles];

        for (int i = 0; i < _vehiclesDB.length; i++) {
            if (_vehiclesDB[i] != null) {
                if ((_vehiclesDB[i].getPrice() > min) && (_vehiclesDB[i].getPrice() < max)) {
                    result[i] = _vehiclesDB[i];
                }
            }
        }
        VPSSearchResult output = new VPSSearchResult();
        output.setSearchResult(result);
        //add to search list 
        addToSearchList(output);
        return output;
    }

    private void addToSearchList(VPSSearchResult vpssearchResult) {
        for (int i = 0; i < _searchArr.length; i++) {
            if (_searchArr[i] != null) {
                _searchArr[i] = vpssearchResult;
            }
        }
    }

    public Boolean SaveSearchResultByID(int searchResultID) {
        try {

           
            for (int i = 0; i < _searchArr.length; i++) {
                if (_searchArr[i] != null) {
                    if (_searchArr[i].getVpsSearchResultID() == searchResultID) { 
                        VPSSearchResult result ;
                        result = _searchArr[i];
                        //call Storage Web service passing result to store.

                        SaveSearchresultInStorageService(result);

                        return true;
                    }
                }

            }

            return false;
        } catch (Exception e) {
            return false;
        }
    }

    private void SaveSearchresultInStorageService(VPSSearchResult result) {
        try {

            VPSStorageServiceStub stub = new VPSStorageServiceStub();
            VPSStorageServiceStub.SaveSearchResult input = new VPSStorageServiceStub.SaveSearchResult();
            VPSStorageServiceStub.VPSSearchResult mycriteria = new VPSStorageServiceStub.VPSSearchResult();
            VPSStorageServiceStub.Vehicle[] v2 = new VPSStorageServiceStub.Vehicle[result.getSearchResult().length];
            Vehicle[] v1 = result.getSearchResult();
            for (int i = 0; i < result.getSearchResult().length; i++) {                              
                v2[i].setVehicleID(v1[i].getVehicleID());
                v2[i].setMake(v1[i].getMake());
                v2[i].setModel(v1[i].getModel());
                v2[i].setMileage(v1[i].getMileage());
                v2[i].setPrice(v1[i].getPrice());
                v2[i].setRegyear(v1[i].getRegyear());
                v2[i].setIsSold(v1[i].getIsSold());                
            }
            
            mycriteria.setSearchResult(v2);
            mycriteria.setVpsSearchResultID(result.getVpsSearchResultID());
            input.setSearchResult(mycriteria);
            stub.saveSearchResult(input);
            VPSStorageServiceStub.SaveSearchResultResponse response = stub.saveSearchResult(input);
            Boolean issaved = response.get_return();

        } catch (Exception exp) {
        }

    }
}

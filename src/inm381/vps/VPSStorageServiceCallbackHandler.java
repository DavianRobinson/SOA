
/**
 * VPSStorageServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package inm381.vps;

    /**
     *  VPSStorageServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class VPSStorageServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public VPSStorageServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public VPSStorageServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for saveSearchResult method
            * override this method for handling normal response from saveSearchResult operation
            */
           public void receiveResultsaveSearchResult(
                    inm381.vps.VPSStorageServiceStub.SaveSearchResultResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveSearchResult operation
           */
            public void receiveErrorsaveSearchResult(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllSavedSearchResults method
            * override this method for handling normal response from getAllSavedSearchResults operation
            */
           public void receiveResultgetAllSavedSearchResults(
                    inm381.vps.VPSStorageServiceStub.GetAllSavedSearchResultsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllSavedSearchResults operation
           */
            public void receiveErrorgetAllSavedSearchResults(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSavedSearchResultByID method
            * override this method for handling normal response from getSavedSearchResultByID operation
            */
           public void receiveResultgetSavedSearchResultByID(
                    inm381.vps.VPSStorageServiceStub.GetSavedSearchResultByIDResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSavedSearchResultByID operation
           */
            public void receiveErrorgetSavedSearchResultByID(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for writeFile method
            * override this method for handling normal response from writeFile operation
            */
           public void receiveResultwriteFile(
                    inm381.vps.VPSStorageServiceStub.WriteFileResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from writeFile operation
           */
            public void receiveErrorwriteFile(java.lang.Exception e) {
            }
                


    }
    
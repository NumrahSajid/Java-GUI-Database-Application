/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Nimra Sajid
 */
public class Bike {
    
    private String BikeID;
    private String ModelVersion;  
    private String Company;
    private int HireRate;
    
    public Bike(String BikeID, String ModelVersion,  String Company, int HireRate) {
        this.BikeID = BikeID;
        this.ModelVersion = ModelVersion;
        
        this.Company = Company;
        this.HireRate = HireRate;
    }
    
    private int noOfRentedOutBikes;
    private int noOfAvailableBikes;


//Setters And Getters
    public String getBikeID() {
        return BikeID;
    }

    public void setBikeID(String BikeID) {
        this.BikeID = BikeID;
    }

    public String getModelVersion() {
        return ModelVersion;
    }

    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public int getHireRate() {
        return HireRate;
    }

    public void setHireRate(int HireRate) {
        this.HireRate = HireRate;
    }

    public int getNoOfRentedOutBikes() {
        return noOfRentedOutBikes;
    }

    public void setNoOfRentedOutBikes(int noOfRentedOutBikes) {
        this.noOfRentedOutBikes = noOfRentedOutBikes;
    }

    public int getNoOfReturnedBikes() {
        return noOfAvailableBikes;
    }

    public void setNoOfReturnedBikes(int noOfReturnedBikes) {
        this.noOfAvailableBikes = noOfReturnedBikes;
    }

}


    


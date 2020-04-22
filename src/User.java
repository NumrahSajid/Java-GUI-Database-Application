/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nimra Sajid
 */
class User {

    User(String NAME, String ID, String PHNO, String EMAIL, String USERNAME, String ADDRESS) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private String name;
    private String idCard;
    private String phNo;
    private String email;
    private String address;

    
    private int noOfRentedBikes;
    private int noOfReturnedBikes;

//Constructor    
    
    public User()
    {
        noOfRentedBikes=0;
        noOfReturnedBikes=0;
    }
    
//Functions    
    
    
    
//Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
       public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getNoOfRentedBikes() {
        return noOfRentedBikes;
    }

    public void setNoOfRentedBikes(int noOfRentedBikes) {
        this.noOfRentedBikes = noOfRentedBikes;
    }

    public int getNoOfReturnedBikes() {
        return noOfReturnedBikes;
    }

    public void setNoOfReturnedBikes(int noOfReturnedBikes) {
        this.noOfReturnedBikes = noOfReturnedBikes;
    }
}

    


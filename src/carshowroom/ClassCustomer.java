/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carshowroom;

public class ClassCustomer 
{
    private String customerID;
    private String firstName;
    private String lastName;
    private int phoneno;
    private String address;
    private String province;
    private String postelcode;
    private String city;
    private String country;
   
    public ClassCustomer(String CustomerID, String FirstName, String LastName,int PhoneNo,String Address,String Province,String PostelCode,String City,String Country)
            
    {
        this.customerID = CustomerID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.phoneno = PhoneNo;
        this.address = Address;
        this.province = Province;
        this.postelcode = PostelCode;
        this.city = City;
        this.country = Country;
        
        
        
    }   

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostelcode() {
        return postelcode;
    }

    public void setPostelcode(String postelcode) {
        this.postelcode = postelcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}

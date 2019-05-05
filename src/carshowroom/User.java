
package carshowroom;

public class User
{
    private String customerID;
    private String firstName;
    private String lastName;
    private int phoneno;
    private String address;
    private String State;
    private String city;
    private String country;
    private String postelcode;
   
    public User(String CustomerID, String FirstName, String LastName,int PhoneNo,String Address,String Province,String PostelCode,String City,String Country)
            
    {
        this.customerID = CustomerID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.phoneno = PhoneNo;
        this.address = Address;
        this.State = Province;
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

    public String getState() {
        return State;
    }

    public void setState(String province) {
        this.State = province;
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


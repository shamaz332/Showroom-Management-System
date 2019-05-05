
package carshowroom;

public class salesperson 


{
    private String salespersonID;
    private String firstName;
    private String lastName;
    
   
    public salesperson(String SalesPersonID, String FirstName, String LastName)
            
    {
        this.salespersonID = SalesPersonID ;
        this.firstName = FirstName;
        this.lastName = LastName;
              
    }   

    public String getSalespersonID() {
        return salespersonID;
    }

    public void setSalespersonID(String salespersonID) {
        this.salespersonID = salespersonID;
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
 
}

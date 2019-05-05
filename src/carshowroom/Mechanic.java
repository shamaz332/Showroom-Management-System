
package carshowroom;

public class Mechanic 
{
    
    private String MechanicID;
    private String Firstname;
    private String lastname;
   
   
    public Mechanic(String MechanicID, String FirstName, String LastName)
            
            
    {
        this.MechanicID = MechanicID;
        this.Firstname = FirstName;
        this.lastname = LastName;
        
        
    }   

    public String getMechanicID() {
        return MechanicID;
    }

    public void setMechanicID(String MechanicID) {
        this.MechanicID = MechanicID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}

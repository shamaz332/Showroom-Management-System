package carshowroom;

public class Cars 
{
    private String CarID;
    private int serialNo;
    private String model;
    private String color;
    
   
    public Cars(String CarID, int Serialnumber, String Model,String Color)
            
            
    {
        this.CarID = CarID;
        this.serialNo = Serialnumber;
        this.model = Model;
        this.color = Color;
       
        
    }   

    public String getCarID() {
        return CarID;
    }

    public void setCarID(String CarID) {
        this.CarID = CarID;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

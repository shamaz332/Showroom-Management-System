/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carshowroom;

public class PartsUsed 
{
  private String partusedid;
  private String partid;
  private String serviceticketid;
  private int numberused;
  private int price;
  
  public PartsUsed (String PartUsedID,String PartID, String ServiceTicketID, int NumberUsed,int Price)
  {
      this.partusedid=PartUsedID;
      this.partid=PartID;
      this.serviceticketid=ServiceTicketID;
      this.numberused=NumberUsed;
      this.price=Price;
  }      

    public String getPartusedid() {
        return partusedid;
    }

    public void setPartusedid(String partusedid) {
        this.partusedid = partusedid;
    }

    public String getPartid() {
        return partid;
    }

    public void setPartid(String partid) {
        this.partid = partid;
    }

    public String getServiceticketid() {
        return serviceticketid;
    }

    public void setServiceticketid(String serviceticketid) {
        this.serviceticketid = serviceticketid;
    }

    public int getNumberused() {
        return numberused;
    }

    public void setNumberused(int numberused) {
        this.numberused = numberused;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

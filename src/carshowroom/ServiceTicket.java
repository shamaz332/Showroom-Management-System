/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carshowroom;

public class ServiceTicket 

{
    
    private String serviceticketid;
    private int serviceticketno;
    private String carid;
    private String customerid;
    private String datereceived;
    private String datereturnedtocustomer;
       
       public ServiceTicket(String ServiceTicketID,int ServiceTicketNumber,String CarID,String CustomerID,String DateReceived,String DateReturnedtoCustomer)
       {
           this.serviceticketid=ServiceTicketID;
           this.serviceticketno=ServiceTicketNumber;
           this.carid=CarID;
           this.customerid=CustomerID;
           this.datereceived=DateReceived;
           this.datereturnedtocustomer=DateReturnedtoCustomer;
       }

    public String getServiceticketid() {
        return serviceticketid;
    }

    public void setServiceticketid(String serviceticketid) {
        this.serviceticketid = serviceticketid;
    }

    public int getServiceticketno() {
        return serviceticketno;
    }

    public void setServiceticketno(int serviceticketno) {
        this.serviceticketno = serviceticketno;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getDatereceived() {
        return datereceived;
    }

    public void setDatereceived(String datereceived) {
        this.datereceived = datereceived;
    }

    public String getDatereturnedtocustomer() {
        return datereturnedtocustomer;
    }

    public void setDatereturnedtocustomer(String datereturnedtocustomer) {
        this.datereturnedtocustomer = datereturnedtocustomer;
    }
    
    
    
    
}

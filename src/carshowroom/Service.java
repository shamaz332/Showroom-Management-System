/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carshowroom;

public class Service


{
    private String serviceid;
    private String servicename;
    private int servicerate;
    
    
    public Service(String ServiceID,String ServiceName,int ServiceRate)
    {
        this.serviceid=ServiceID;
        this. servicename=ServiceName;
        this.servicerate=ServiceRate;
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public int getServicerate() {
        return servicerate;
    }

    public void setServicerate(int servicerate) {
        this.servicerate = servicerate;
    }
}

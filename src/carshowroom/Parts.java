/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carshowroom;

/**
 *
 * @author shamaz
 */
public class Parts 
{
   
    private String Partid;
    private int partsno;
    private String description;
    private int purchaseprice;
    private int retailprice;
   
    
    
    
   
   
    public Parts(String PartID, int PartNumber, String PartDescription,int PurchasePrice,int RetailPrice)
            
            
    {
        this.Partid = PartID;
        this.partsno = PartNumber;
        this.description = PartDescription;
        this.purchaseprice = PurchasePrice;
        this.retailprice = RetailPrice;
        
        
    }   

    public String getPartid() {
        return Partid;
    }

    public void setPartid(String Partid) {
        this.Partid = Partid;
    }

    public int getPartsno() {
        return partsno;
    }

    public void setPartsno(int partsno) {
        this.partsno = partsno;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(int purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public int getRetailprice() {
        return retailprice;
    }

    public void setRetailprice(int retailprice) {
        this.retailprice = retailprice;
    }
 
}

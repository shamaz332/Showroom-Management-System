
package carshowroom;

public class SalesInvoice 


{
    
    private String invoiceid;
    private int invoiceno;
    private String invoicedate;
    private String carid;
    private String customerid;
    private String salespersonid;

    public SalesInvoice(String InvoiceID, int InvoiceNumber, String InvoiceDate, String CarID, String CustomerID, String SalespersonID)
            
            
    {
        this.invoiceid = InvoiceID;
        this.invoiceno =  InvoiceNumber;
        this.invoicedate = InvoiceDate;
        this.carid = CarID;
        this.customerid = CustomerID;
        this.salespersonid = SalespersonID;
        
    }   

    public String getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }

    public int getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(int invoiceno) {
        this.invoiceno = invoiceno;
    }

    public String getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(String invoicedate) {
        this.invoicedate = invoicedate;
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

    public String getSalespersonid() {
        return salespersonid;
    }

    public void setSalespersonid(String salespersonid) {
        this.salespersonid = salespersonid;
    }
}

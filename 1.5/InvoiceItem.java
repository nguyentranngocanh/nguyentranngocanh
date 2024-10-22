public class InvoiceItem {
    public String id;
    public String desc;
    public int qty;
    public double unitPrice;

    public InvoiceItem(String id, String desc,int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }
    public String getId() {
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return unitPrice * qty;
    }
    public String toString(){
        return "InvoiceItem[id ="+id+"desc="+desc+"qty="+qty+"unitPrice="+unitPrice+"]";
    }
}

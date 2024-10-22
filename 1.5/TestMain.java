public class TestMain {
    public static void main(String[] args) {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);

        inv1.setQty(999);
        inv1.setUnitPrice(0.08);
        System.out.println(inv1);
        System.out.println("Id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("Qty is: " + inv1.getQty());
        System.out.println("Unit price is: " + inv1.getUnitPrice());

        System.out.println("The total is: " + inv1.getTotal());
    }
}

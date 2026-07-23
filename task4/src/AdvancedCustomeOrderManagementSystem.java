import java.util.ArrayList;

public class AdvancedCustomeOrderManagementSystem {

    public static void main(String[] args) {

        ArrayList<Integer> orderIds= new ArrayList<>();
        ArrayList<String> customerNames =  new ArrayList<>();
        ArrayList<String> productNames =  new ArrayList<>();
        ArrayList<Double> quantities  =  new ArrayList<>();
        ArrayList<Double>  prices  =  new ArrayList<>();
        ArrayList<String>  orderStatus  =  new ArrayList<>();

        orderIds.add(1001);
        customerNames.add("Ali");
        productNames.add("Laptop");
        quantities.add(2);
        prices.add(750.0);
        orderStatus.add("Pending");


        orderIds.add(1002);
        customerNames.add("Sara");
        productNames.add("Smartphone");
        quantities.add(1);
        prices.add(500.0);
        orderStatus.add("Shipped");


        orderIds.add(1003);
        customerNames.add("Omar");
        productNames.add("Tablet");
        quantities.add(3);
        prices.add(300.0);
        orderStatus.add("Delivered");


        orderIds.add(1004);
        customerNames.add("Fatima");
        productNames.add("Headphones");
        quantities.add(2);
        prices.add(120.0);
        orderStatus.add("Pending");


        orderIds.add(1005);
        customerNames.add("Hassan");
        productNames.add("Smartwatch");
        quantities.add(1);
        prices.add(200.0);
        orderStatus.add("Cancelled");


        orderIds.add(1006);
        customerNames.add("Layla");
        productNames.add("Camera");
        quantities.add(1);
        prices.add(450.0);
        orderStatus.add("Delivered");


        orderIds.add(1007);
        customerNames.add("Yusuf");
        productNames.add("Printer");
        quantities.add(2);
        prices.add(150.0);
        orderStatus.add("Shipped");


        orderIds.add(1008);
        customerNames.add("Aisha");
        productNames.add("Monitor");
        quantities.add(1);
        prices.add(250.0);
        orderStatus.add("Pending");

        orderIds.add(1009);
        customerNames.add("Khalid");
        productNames.add("Keyboard");
        quantities.add(4);
        prices.add(40.0);
        orderStatus.add("Delivered");


        orderIds.add(1010);
        customerNames.add("Mona");
        productNames.add("Mouse");
        quantities.add(2);
        prices.add(25.0);
        orderStatus.add("Shipped");


        orderIds.add(1011);
        customerNames.add("Salim");
        productNames.add("Router");
        quantities.add(1);
        prices.add(100.0);
        orderStatus.add("Pending");

        orderIds.add(1012);
        customerNames.add("Noor");
        productNames.add("External Hard Drive");
        quantities.add(2);
        prices.add(80.0);
        orderStatus.add("Delivered");


        orderIds.add(1013);
        customerNames.add("Zain");
        productNames.add("Gaming Console");
        quantities.add(1);
        prices.add(400.0);
        orderStatus.add("Cancelled");

        orderIds.add(1014);
        customerNames.add("Huda");
        productNames.add("Television");
        quantities.add(1);
        prices.add(600.0);
        orderStatus.add("Pending");

        orderIds.add(1015);
        customerNames.add("Bilal");
        productNames.add("Speaker");
        quantities.add(3);
        prices.add(90.0);
        orderStatus.add("Shipped");

        for (int i = 0; i < customerNames.size(); i++) {
            System.out.println("ID: " + orderIds.get(i));
            System.out.println("Name: " + customerNames.get(i));
            System.out.println("product Names: " +productNames.get(i));
            System.out.println("Quantities: " +quantities.get(i));
            System.out.println("Prices: " +prices.get(i));
            System.out.println(" order Status: " +orderStatus.get(i));
        }

    }
}

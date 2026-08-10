package tash412;

import tash412.SELLABLE;
import task411.LibraryItem;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class shopmain {
    static Scanner input= new Scanner(System.in);
    static List<SELLABLE> stock = new ArrayList<>();
    public static void main(String[] args){
menuDeom();
    }
    public static void menuDeom(){
        Boolean exit = false;
        while (!exit) {

            IO.println("""
                    SHOP MENU:
            1-Add product
            2-Add service
            3-Print stock
            4-Total value
            5- Exit
            """);

            Integer choose = input.nextInt();
            input.nextLine();
            if (choose.equals(1)){
                stock.add(addProduct());
            } else if (choose.equals(2)) {
                stock.add(addService());

            } else if (choose.equals(3)) {
                for(SELLABLE d : stock ) {
                    IO.println("data :");
                    d.printAllInfo();
                }

            }else if (choose.equals(4)) {
                Double total = 0.0;
                for(SELLABLE d : stock ) {

                   total+= d.getPrice();

            }IO.println("TOTAL "+total);


            }else if(choose.equals(5)){
                exit = true;
                IO.println("Goodbye");
            }


        }

}

    public static Product addProduct() {
        Product product = new Product();
        product.setName(IO.readln("Enter name"));
        product.setPrice(Double.valueOf(IO.readln("Enter Price :")));
        IO.println("Enter quantity:");
        product.setQuantity(input.nextInt());
        product.printAllInfo();
        product.getPrice();
        product.getCategory();
        return product;
    }

    public static Service addService(){
        Service Service = new Service();
        Service.setName(IO.readln("Enter name "));
        IO.readln("Enter price ");
        Service.setPrice(input.nextDouble());
        IO.readln("Enter Minute ");
        Service.setMinutes(input.nextInt());
        Service.printAllInfo();
        Service.getCategory();
        Service.getMinutes();
        return Service;


    }

}

package org.Kriguer;

import org.Kriguer.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter Client Data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("BirthDate (ss/mm/yyyy): ");
        Date birthdate = sdf.parse(sc.nextLine());

        Client client = new Client(name,birthdate,email);

        System.out.println("");
        System.out.println("Enter Order data: ");
        System.out.print("Status: PENDING_PAYMENT,PROCESSING,SHIPPED,DELIVERED ? ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(),status,client);

        System.out.print("How many itens to this order? ");
        int qtd = sc.nextInt();
        for(int i = 0; i < qtd; i++){
            System.out.println("Enter "+ (i+1) + "º item");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.print(" Quantity :");
            Integer quantity = sc.nextInt();

            Product product = new Product(productName,price);
            OrderItem orderItem = new OrderItem(quantity,price,product);
            order.addItem(orderItem);
        }
        System.out.println(order);

        sc.close();
    }
}
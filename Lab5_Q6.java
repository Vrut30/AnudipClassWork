/* 6.Write a Java programming to create a e-commerce system with three classes product customer
 *and order, onlineproduct and physicalproduct are implementation of Product interface.
 *procuct intrface has list of product as method for adding them. Product should be the
 *iterface with methods showproduct, addproduct, deleteproduct, and claculateproduct prize
 */
package com.javacore.demo;

import java.util.ArrayList;
import java.util.List;

interface Product {
    void showProduct();
    double calculatePrice();
}

class OnlineProduct implements Product {
    private final int productId;
    private final String name;
    private final double price;
    private final double shippingCost;

    public OnlineProduct(int productId, String name, double price, double shippingCost) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.shippingCost = shippingCost;
    }

    @Override
    public void showProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Shipping Cost: Rs." + shippingCost);
    }

    @Override
    public double calculatePrice() {
        return price + shippingCost;
    }
}

class PhysicalProduct implements Product {
    private final int productId;
    private final String name;
    private final double price;
    private final double weight;

    public PhysicalProduct(int productId, String name, double price, double weight) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void showProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Weight: " + weight + " kg");
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
 class Customer {
    private final int customerId;
    final String name;
    private final String address;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
}
 class Order {
    private final int orderId;
    private final Customer customer;
    private final List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

     void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.calculatePrice();
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.name);
        System.out.println("Products:");
        for (Product product : products) {
            product.showProduct();
            System.out.println();
        }
        System.out.println("Total Price: Rs." + calculateTotal());
    }
}

public class Lab5_Q6 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "vrut", " ");
        Order order1 = new Order(100, customer1);

        order1.addProduct(new OnlineProduct(1, "TShirt", 300, 50));
        order1.addProduct(new PhysicalProduct(2, "Sunglass", 200, 0.1));

        order1.showOrder();
    }
}
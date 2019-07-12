package model;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void getInforProduct () {
        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        this.id = input.nextInt();
        System.out.println("Name: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Price: ");
        this.price = input.nextDouble();
        System.out.println("Description: ");
        this.description = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\nName: " + this.name + "\nPrice: " + this.price + "\nDescription: " + "Phone" ;
    }

}

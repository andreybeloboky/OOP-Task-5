package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your user name.");
        String userName = scanner.next();
        System.out.println("Enter your password");
        String password = scanner.next();
        User user = new User(userName, password);
        System.out.println("You are logged in as:" + " " + user.getLogin());
        Product[] milkProducts = new Product[3];
        Product[] fruitProducts = new Product[2];
        String[] nameProductMilk = {"milk", "curd", "cheese"};
        String[] nameProductFruit = {"apple", "mushrooms"};
        int begin = 1;
        int end = 10;
        System.out.println("Enter number for further action. \n" + "Enter 1 - enter the screen list of products, another number - the end program.");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("List of products");
            for (int i = 0; i < milkProducts.length; i++) {
                milkProducts[i] = new Product(nameProductMilk[i], begin + (int) (Math.random() * end), begin + (int) (Math.random() * end));
            }
            for (int i = 0; i < fruitProducts.length; i++) {
                fruitProducts[i] = new Product(nameProductFruit[i], begin + (int) (Math.random() * end), begin + (int) (Math.random() * end));
            }
            System.out.println("Milk products");
            for (int i = 0; i < milkProducts.length; i++) {
                System.out.println("name: " + milkProducts[i].getName() + " price: " + milkProducts[i].getPrice() + " rating: " + milkProducts[i].getRating());
            }
            System.out.println("Fruit products");
            for (int i = 0; i < fruitProducts.length; i++) {
                System.out.println("name: " + fruitProducts[i].getName() + " price: " + fruitProducts[i].getPrice() + " rating: " + fruitProducts[i].getRating());
            }
    }
}

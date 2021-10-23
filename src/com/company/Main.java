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
    }
}

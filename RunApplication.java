/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yearlysales;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the console device:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");
        System.out.print("Enter your choice (1-3): ");
        int choice = input.nextInt();
        input.nextLine(); // clear the buffer

        String consoleType = "";

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                System.out.println("Invalid choice! Defaulting to PS5.");
                consoleType = "PS5";
        }

        System.out.print("Enter the store name: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = input.nextInt();

        // Create the object
        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);

        // Print the report
        sale.printReport();

        input.close();
    }
}
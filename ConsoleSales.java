/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yearlysales;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Consoles {

    // Constructor that calls the parent constructor
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method to print the report
    public void printReport() {
        System.out.println("\n***************************************");
        System.out.println("         CONSOLE SALES REPORT");
        System.out.println("***************************************");
        System.out.println("CONSOLE TYPE   : " + getConsoleType());
        System.out.println("STORE NAME     : " + getStore());
        System.out.println("TOTAL SALES    : R" + getTotalSales());
        System.out.println("***************************************");
    }
}
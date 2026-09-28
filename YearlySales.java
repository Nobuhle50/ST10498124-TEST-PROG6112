/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yearlysales;

/**
 *
 * @author Student
 */
public class YearlySales {
    public static void main(String[] args) {

        // Single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // Single-dimensional array for gaming consoles
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array for sales
        // rows = cities, columns = consoles
        int[][] sales = {
            {1000, 2000, 3000},   // CAPE TOWN
            {2000, 3000, 4000},   // PORT ELIZABETH
            {1500, 1100, 1200}    // PRETORIA
        };

        // ========== REPORT HEADER ==========
        System.out.println("---------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------");

        // Print column headings
        System.out.printf("%-18s", "");
        for (String console : consoles) {
            System.out.printf("%-10s", console);
        }
        System.out.println();

        // Print each city's sales
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s", cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.println();
        }

        // ========== TOTALS SECTION ==========
        System.out.println("---------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------");

        int maxTotal = 0;
        String cityWithMost = "";

        for (int i = 0; i < cities.length; i++) {
            int total = 0;

            // Calculate total for this city
            for (int j = 0; j < consoles.length; j++) {
                total += sales[i][j];
            }

            System.out.printf("%-18s %d%n", cities[i], total);

            // Keep track of the city with the highest total
            if (total > maxTotal) {
                maxTotal = total;
                cityWithMost = cities[i];
            }
        }

        // ========== CITY WITH MOST SALES ==========
        System.out.println("---------------------------------------");
        System.out.println("CITY WITH THE MOST SALE : " + cityWithMost);
        System.out.println("---------------------------------------");
    }
}



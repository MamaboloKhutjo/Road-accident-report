/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.road_accident_repot_applicationn;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Road_Accident_repot_applicationn {

    private static int[] cars = new int[3];
    private static int[] bikes = new int[3];
    private static int totalCPT;
    private static int totalJHB;
    private static int totalPe;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of car accidents for Cape Town: ");
        cars[0] = scanner.nextInt();

        System.out.print("Enter the number of motor bike accidents for Cape Town: ");
        bikes[0] = scanner.nextInt();

        System.out.print("Enter the number of car accidents for Johannesburg: ");
        cars[1] = scanner.nextInt();

        System.out.print("Enter the number of motor bike accidents for Johannesburg: ");
        bikes[1] = scanner.nextInt();

        System.out.print("Enter the number of car accidents for Port Elizabeth: ");
        cars[2] = scanner.nextInt();

        System.out.print("Enter the number of motor bike accidents for Port Elizabeth: ");
        bikes[2] = scanner.nextInt();

        System.out.println("--------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("--------------------------------------------------------------");

        System.out.printf("%-20s %-15s %-15s%n", "City", "Car Accidents", "Motorbike Accidents");
        System.out.printf("%-20s %-15d %-15d%n", "Cape Town", cars[0], bikes[0]);
        System.out.printf("%-20s %-15d %-15d%n", "Johannesburg", cars[1], bikes[1]);
        System.out.printf("%-20s %-15d %-15d%n", "Port Elizabeth", cars[2], bikes[2]);
        
         System.out.println("--------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------------------");

        totalCPT = cars[0] + bikes[0];
        totalJHB = cars[1] + bikes[1];
        totalPe= cars[2] + bikes[2];
        
        System.out.printf("%-20s %-15d%n", "Cape Town Total:", totalCPT);
        System.out.printf("%-20s %-15d%n", "Johannesburg Total:", totalJHB);
        System.out.printf("%-20s %-15d%n", "Port Elizabeth Total:", totalPe);
        
        
        String cityWithMostAccidents = "Cape Town";
        int maxAccidents = totalCPT;

        if (totalJHB > maxAccidents) {
            maxAccidents = totalJHB;
            cityWithMostAccidents = "Johannesburg";
        }

        if (totalPe > maxAccidents) {
            maxAccidents = totalPe;
            cityWithMostAccidents = "Port Elizabeth";
        }

        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS:  " + cityWithMostAccidents);
        System.out.println("--------------------------------------------------------------");
    }
}

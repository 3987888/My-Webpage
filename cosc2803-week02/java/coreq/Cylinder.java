package coreq;

import java.util.Scanner;

public class Cylinder {
   public static void main(String[] args) {
	   
	   Scanner scnr = new Scanner(System.in);
        double radius;
        double height;

        
        radius = scnr.nextDouble();    height = scnr.nextDouble();

        // Calculate volume and surface area
        double volume = Math.PI * Math.pow(radius, 2) * height;
        double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));

        // Output results with two decimal places
        System.out.printf("Volume (cubic cm): %.2f\n", volume);
        System.out.printf("Surface area (square cm): %.2f\n", surfaceArea);
	   
   }
}

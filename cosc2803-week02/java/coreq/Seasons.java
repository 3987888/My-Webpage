package coreq;
import java.util.Scanner;

public class Seasons {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      
            
            String month = scnr.next(); int day = scnr.nextInt();
      
            
            String season = findSeason(month, day);
      
           
            if (season.equals("Invalid")) {
               System.out.println("Invalid");
            } else {
               System.out.println(season);
            }
      
            
         }
      
         public static String findSeason(String month, int day) {
            if ((month.equalsIgnoreCase("March") && day >= 20) || 
                (month.equalsIgnoreCase("April") || 
                 month.equalsIgnoreCase("May")) || 
                (month.equalsIgnoreCase("June") && day <= 20)) {
               return "Spring";
            } else if ((month.equalsIgnoreCase("June") && day >= 21) || 
                       (month.equalsIgnoreCase("July") || 
                        month.equalsIgnoreCase("August")) || 
                       (month.equalsIgnoreCase("September") && day <= 21)) {
               return "Summer";
            } else if ((month.equalsIgnoreCase("September") && day >= 22) || 
                       (month.equalsIgnoreCase("October") || 
                        month.equalsIgnoreCase("November")) || 
                       (month.equalsIgnoreCase("December") && day <= 20)) {
               return "Autumn";
            } else if ((month.equalsIgnoreCase("December") && day >= 21) || 
                       (month.equalsIgnoreCase("January") || 
                        month.equalsIgnoreCase("February")) || 
                       (month.equalsIgnoreCase("March") && day <= 19)) {
               return "Winter";
            } else {
               return "Invalid";
            }
         }
      }
      
   

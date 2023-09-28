package coreq;
import java.util.Scanner;

public class SmallestNumber {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int num1, num2, num3;
      num1 = scnr.nextInt(); num2 = scnr.nextInt();num3 = scnr.nextInt();
       int smallest;
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }
        System.out.println(smallest);
   }
}

